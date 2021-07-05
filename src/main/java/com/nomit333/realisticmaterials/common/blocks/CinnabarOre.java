package com.nomit333.realisticmaterials.common.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class CinnabarOre extends OreBlock {
    public CinnabarOre() {
        super(AbstractBlock.Properties.create(Material.ROCK)
        .hardnessAndResistance(2.0F, 15.0F)
        .sound(SoundType.STONE)
        .harvestLevel(2)
        .harvestTool(ToolType.PICKAXE)
        .setRequiresTool());
    }
}
