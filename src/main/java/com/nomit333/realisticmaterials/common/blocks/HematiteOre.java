package com.nomit333.realisticmaterials.common.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class HematiteOre extends OreBlock {

    public HematiteOre() {
        super(AbstractBlock.Properties.create(Material.ROCK)
        .hardnessAndResistance(4.0f,2.0f)
        .sound(SoundType.STONE)
        .harvestLevel(2)
        .harvestTool(ToolType.PICKAXE)
        .setRequiresTool());
    }
}
