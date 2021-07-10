package com.nomit333.realisticmaterials.common.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class ChalcopyriteOre extends OreBlock {
    public ChalcopyriteOre() {
        super(AbstractBlock.Properties.create(Material.ROCK)
        .hardnessAndResistance(5.0f,2.5f)
        .sound(SoundType.STONE)
        .harvestTool(ToolType.PICKAXE)
        .harvestLevel(2)
        .setRequiresTool());
    }
}
