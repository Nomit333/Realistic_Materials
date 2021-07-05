package com.nomit333.realisticmaterials.core.init;

import com.nomit333.realisticmaterials.RealisticMaterials;
import com.nomit333.realisticmaterials.common.blocks.*;
import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class OreInit {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, RealisticMaterials.MOD_ID);

    public static final RegistryObject<Block> BAUXIE_ORE = BLOCKS.register("bauxite_ore", BauxiteOre::new);
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
}
