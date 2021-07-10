package com.nomit333.realisticmaterials.common.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class CobaltiteOre extends OreBlock {
    public CobaltiteOre() {
        super(AbstractBlock.Properties.create(Material.ROCK)
        .hardnessAndResistance(7.0F,30.5F)
        .sound(SoundType.STONE)
        .harvestTool(ToolType.PICKAXE)
        .harvestLevel(2)
        .setRequiresTool());
    }
}
