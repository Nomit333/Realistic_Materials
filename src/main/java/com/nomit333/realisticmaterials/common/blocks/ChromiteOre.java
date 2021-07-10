package com.nomit333.realisticmaterials.common.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class ChromiteOre extends OreBlock {
    public ChromiteOre() {
        super(AbstractBlock.Properties.create(Material.ROCK)
        .hardnessAndResistance(2.5f,5.0f)
        .sound(SoundType.STONE)
        .harvestTool(ToolType.PICKAXE)
        .harvestLevel(1)
        .setRequiresTool());
    }
}