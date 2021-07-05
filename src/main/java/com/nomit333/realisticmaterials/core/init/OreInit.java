package com.nomit333.realisticmaterials.core.init;

import com.nomit333.realisticmaterials.RealisticMaterials;
import com.nomit333.realisticmaterials.common.blocks.*;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class OreInit {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, RealisticMaterials.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, RealisticMaterials.MOD_ID);

    // Blocks
    public static final RegistryObject<Block> BAUXITE_ORE = BLOCKS.register("bauxite_ore", BauxiteOre::new);
    public static final RegistryObject<Block> ACANTHITE_ORE = BLOCKS.register("acanthite_ore", AcanthiteOre::new);
    public static final RegistryObject<Block> BORNITE_ORE = BLOCKS.register("bornite_ore", BorniteOre::new);
    public static final RegistryObject<Block> CASSITERITE_ORE = BLOCKS.register("cassiterite_ore", CassiteriteOre::new);
    public static final RegistryObject<Block> CHALCOCITE_ORE = BLOCKS.register("chalcocite_ore", ChalcociteOre::new);
    public static final RegistryObject<Block> CHALCOPYRITE_ORE = BLOCKS.register("chalcopyrite_ore", ChalcopyriteOre::new);
    public static final RegistryObject<Block> CHROMITE_ORE = BLOCKS.register("chromite_ore", ChromiteOre::new);
    public static final RegistryObject<Block> CINNABAR_ORE = BLOCKS.register("cinnabar_ore", CinnabarOre::new);
    public static final RegistryObject<Block> COBALTITE_ORE = BLOCKS.register("cobaltite_ore", CobaltiteOre::new);
    public static final RegistryObject<Block> COLTAN_ORE = BLOCKS.register("coltan_ore", ColtanOre::new);
    public static final RegistryObject<Block> GALENA_ORE = BLOCKS.register("galena_ore", GalenaOre::new);
    public static final RegistryObject<Block> HEMATITE_ORE = BLOCKS.register("hematite_ore", HematiteOre::new);
    public static final RegistryObject<Block> ILMENITE_ORE = BLOCKS.register("ilmenite_ore", IlmeniteOre::new);
    public static final RegistryObject<Block> MAGNETITE_ORE = BLOCKS.register("magnetite_ore", MagnetiteOre::new);
    public static final RegistryObject<Block> MALACHITE_ORE = BLOCKS.register("malachite_ore", MalachiteOre::new);
    public static final RegistryObject<Block> MOLYBDENITE_ORE = BLOCKS.register("molybdenite_ore", MolybdeniteOre::new);
    public static final RegistryObject<Block> PENTLADITE_ORE = BLOCKS.register("pentladite_ore", PentladiteOre::new);
    public static final RegistryObject<Block> PYROLUSITE_ORE = BLOCKS.register("pyrolusite_ore", PyrolusiteOre::new);
    public static final RegistryObject<Block> SCHEELITE_ORE = BLOCKS.register("scheelite_ore", ScheeliteOre::new);
    public static final RegistryObject<Block> SPERRYLITE_ORE = BLOCKS.register("sperrylite_ore", SperryliteOre::new);
    public static final RegistryObject<Block> SPHALERITE_ORE = BLOCKS.register("sphalerite_ore", SphaleriteOre::new);
    public static final RegistryObject<Block> URANINITE_ORE = BLOCKS.register("uraninite_ore", UraniniteOre::new);
    public static final RegistryObject<Block> WOLFRAMITE_ORE = BLOCKS.register("wolframite_ore", WolframiteOre::new);

    // Block Items
   public static final RegistryObject<Item> BAUXITE_ORE_ITEM = ITEMS.register("bauxite_ore", () -> new BlockItemBase(BAUXITE_ORE.get()));
   public static final RegistryObject<Item> ACANTHITE_ORE_ITEM  = ITEMS.register("acanthite_ore", () -> new BlockItemBase(ACANTHITE_ORE.get()));
    public static final RegistryObject<Item> BORNITE_ORE_ITEM  = ITEMS.register("bornite_ore", () -> new BlockItemBase(BORNITE_ORE.get()));
    public static final RegistryObject<Item> CASSITERITE_ORE_ITEM = ITEMS.register("cassiterite_ore", () -> new BlockItemBase(CASSITERITE_ORE.get()));
    public static final RegistryObject<Item> CHALCOCITE_ORE_ITEM = ITEMS.register("chalcocite_ore", () -> new BlockItemBase(CHALCOCITE_ORE.get()));
    public static final RegistryObject<Item> CHALCOPYRITE_ORE_ITEM = ITEMS.register("chalcopyrite_ore", () -> new BlockItemBase(CHALCOPYRITE_ORE.get()));
    public static final RegistryObject<Item> CHROMITE_ORE_ITEM = ITEMS.register("chromite_ore", () -> new BlockItemBase(CHROMITE_ORE.get()));
    public static final RegistryObject<Item> CINNABAR_ORE_ITEM = ITEMS.register("cinnabar_ore", () -> new BlockItemBase(CINNABAR_ORE.get()));
    public static final RegistryObject<Item> COBALTITE_ORE_ITEM = ITEMS.register("cobaltite_ore", () -> new BlockItemBase(COBALTITE_ORE.get()));
    public static final RegistryObject<Item> COLTAN_ORE_ITEM = ITEMS.register("coltan_ore", () -> new BlockItemBase(COLTAN_ORE.get()));
    public static final RegistryObject<Item> GALENA_ORE_ITEM = ITEMS.register("galena_ore", () -> new BlockItemBase(GALENA_ORE.get()));
    public static final RegistryObject<Item> HEMATITE_ORE_ITEM = ITEMS.register("hematite_ore", () -> new BlockItemBase(HEMATITE_ORE.get()));
    public static final RegistryObject<Item> ILMENITE_ORE_ITEM = ITEMS.register("ilmenite_ore", () -> new BlockItemBase(ILMENITE_ORE.get()));
    public static final RegistryObject<Item> MAGNETITE_ORE_ITEM = ITEMS.register("magnetite_ore", () -> new BlockItemBase(MAGNETITE_ORE.get()));
    public static final RegistryObject<Item> MALACHITE_ORE_ITEM = ITEMS.register("malachite_ore", () -> new BlockItemBase(MALACHITE_ORE.get()));
    public static final RegistryObject<Item> MOLYBDENITE_ORE_ITEM = ITEMS.register("molybendite_ore", () -> new BlockItemBase(MOLYBDENITE_ORE.get()));
    public static final RegistryObject<Item> PENTLADITE_ORE_ITEM = ITEMS.register("pentladite_ore", () -> new BlockItemBase(PENTLADITE_ORE.get()));
    public static final RegistryObject<Item> PYROLUSITE_ORE_ITEM = ITEMS.register("pyrolusite_ore", () -> new BlockItemBase(PYROLUSITE_ORE.get()));
    public static final RegistryObject<Item> SCHEELITE_ORE_ITEM = ITEMS.register("scheelite_ore", () -> new BlockItemBase(SCHEELITE_ORE.get()));
    public static final RegistryObject<Item> SPERRYLITE_ORE_ITEM = ITEMS.register("sperrylite_ore", () -> new BlockItemBase(SPERRYLITE_ORE.get()));
    public static final RegistryObject<Item> SPHALERITE_ORE_ITEM = ITEMS.register("sphalerite_ore", () -> new BlockItemBase(SPHALERITE_ORE.get()));
    public static final RegistryObject<Item> URANINITE_ORE_ITEM = ITEMS.register("urannite_ore", () -> new BlockItemBase(URANINITE_ORE.get()));
    public static final RegistryObject<Item> WOLFRAMITE_ORE_ITEM = ITEMS.register("wolframite_ore", () -> new BlockItemBase(WOLFRAMITE_ORE.get()));
_ITEM

}
