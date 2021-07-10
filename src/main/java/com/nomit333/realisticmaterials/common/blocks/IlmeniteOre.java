package com.nomit333.realisticmaterials.common.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.client.audio.Sound;
import net.minecraftforge.common.ToolType;

public class IlmeniteOre extends OreBlock {

    public IlmeniteOre() {
        super(AbstractBlock.Properties.create(Material.ROCK)
        .hardnessAndResistance(3.4f,0.4f)
        .sound(SoundType.STONE)
        .harvestLevel(2)
        .harvestTool(ToolType.PICKAXE)
        .setRequiresTool());
    }
}
