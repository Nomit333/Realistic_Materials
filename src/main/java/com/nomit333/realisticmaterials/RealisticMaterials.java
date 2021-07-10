package com.nomit333.realisticmaterials;

import com.nomit333.realisticmaterials.core.init.OreInit;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.stream.Collectors;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("realisticmaterials")
public class RealisticMaterials {
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "realisticmaterials";
    public static final ItemGroup RML_GROUP = new RealisticMaterialsGroup("Realistic Materials");


    public RealisticMaterials() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        OreInit.BLOCKS.register(bus);

        MinecraftForge.EVENT_BUS.register(this);
    }

    public static class RealisticMaterialsGroup extends ItemGroup {

        public RealisticMaterialsGroup(String label) {
            super(label);
        }
        @Override
        public ItemStack createIcon() {
            return Items.IRON_AXE.getDefaultInstance();
        }
    }
}