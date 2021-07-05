package com.nomit333.realisticmaterials.common.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class PyrolusiteOre extends OreBlock {

    public PyrolusiteOre() {
        super(AbstractBlock.Properties.create(Material.ROCK)
        .hardnessAndResistance(2.0f,0.24f)
        .sound(SoundType.STONE)
        .harvestLevel(0)
        .harvestTool(ToolType.PICKAXE)
        .setRequiresTool());
    }
}
