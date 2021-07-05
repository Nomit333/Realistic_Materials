package com.nomit333.realisticmaterials.common.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class GalenaOre extends OreBlock {

    public GalenaOre() {
        super(AbstractBlock.Properties.create(Material.ROCK)
        .hardnessAndResistance(2.5f,0.5f)
        .sound(SoundType.STONE)
        .harvestTool(ToolType.PICKAXE)
        .harvestLevel(2)
        .setRequiresTool());
    }
}
