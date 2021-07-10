package com.nomit333.realisticmaterials.common.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class AcanthiteOre extends OreBlock {
    public AcanthiteOre() {
        super(AbstractBlock.Properties.create(Material.ROCK)
        .hardnessAndResistance(3.0f,2.5f)
        .harvestLevel(2)
        .harvestTool(ToolType.PICKAXE)
        .setRequiresTool());
    }
}
