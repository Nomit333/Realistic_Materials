package com.nomit333.realisticmaterials.common.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class BauxiteOre extends OreBlock {
    public BauxiteOre() {
        super(AbstractBlock.Properties.create(Material.ROCK)
        .harvestTool(ToolType.PICKAXE)
        .harvestLevel(1)
        .hardnessAndResistance(3.0f,3.0f)
        .sound(SoundType.STONE)
        .setRequiresTool());
    }
}
