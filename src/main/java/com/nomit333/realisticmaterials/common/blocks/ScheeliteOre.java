package com.nomit333.realisticmaterials.common.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class ScheeliteOre extends OreBlock {

    public ScheeliteOre() {
        super(AbstractBlock.Properties.create(Material.ROCK)
        .hardnessAndResistance(6.5f, 2.0f)
        .sound(SoundType.STONE)
        .harvestLevel(3)
        .harvestTool(ToolType.PICKAXE)
        .setRequiresTool());
    }
}
