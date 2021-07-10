package com.nomit333.realisticmaterials.common.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class MolybdeniteOre extends OreBlock {

    public MolybdeniteOre() {
        super(AbstractBlock.Properties.create(Material.ROCK)
        .hardnessAndResistance(5.0f, 1.2f)
        .sound(SoundType.STONE)
        .harvestLevel(2)
        .harvestTool(ToolType.PICKAXE)
        .setRequiresTool());
    }
}
