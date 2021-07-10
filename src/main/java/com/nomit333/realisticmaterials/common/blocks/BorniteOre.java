package com.nomit333.realisticmaterials.common.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class BorniteOre extends OreBlock {
    public BorniteOre() {
        super(AbstractBlock.Properties.create(Material.ROCK)
        .hardnessAndResistance(3.0f,4.5f)
        .sound(SoundType.STONE)
        .harvestLevel(1)
        .harvestTool(ToolType.PICKAXE)
        .setRequiresTool());
    }
}


