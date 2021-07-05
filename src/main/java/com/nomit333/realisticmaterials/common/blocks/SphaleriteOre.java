package com.nomit333.realisticmaterials.common.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class SphaleriteOre extends OreBlock {

    public SphaleriteOre() {
    super(AbstractBlock.Properties.create(Material.ROCK)
    .hardnessAndResistance(2.5f, 1.0f)
    .sound(SoundType.STONE)
    .harvestLevel(1)
    .harvestTool(ToolType.PICKAXE)
    .setRequiresTool());
    }
}
