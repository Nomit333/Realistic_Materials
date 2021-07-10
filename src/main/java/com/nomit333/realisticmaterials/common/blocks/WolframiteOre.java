package com.nomit333.realisticmaterials.common.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;


public class WolframiteOre extends OreBlock {

    public WolframiteOre() {
        super(AbstractBlock.Properties.create(Material.ROCK)
        .hardnessAndResistance(5.0f, 5.0f)
        .sound(SoundType.STONE)
        .harvestLevel(3)
        .harvestTool(ToolType.PICKAXE)
        .setRequiresTool());
    }
}
