package com.nomit333.realisticmaterials.common.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class ChalcociteOre extends OreBlock {
    public ChalcociteOre() {
        super(AbstractBlock.Properties.create(Material.ROCK)
        .hardnessAndResistance(3.0f, 3.0f)
        .harvestTool(ToolType.PICKAXE)
        .harvestLevel(1)
        .sound(SoundType.STONE)
        .setRequiresTool());
    }
}
