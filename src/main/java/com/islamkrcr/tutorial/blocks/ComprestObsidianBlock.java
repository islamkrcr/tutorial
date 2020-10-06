package com.islamkrcr.tutorial.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;
import org.lwjgl.system.CallbackI;

public class ComprestObsidianBlock extends Block {

    public ComprestObsidianBlock() {
        super(Block.Properties.create(Material.IRON)
                .hardnessAndResistance(-1.0f,6000.0f)
                .sound(SoundType.METAL)
                .harvestLevel(3)
                .harvestTool(ToolType.PICKAXE)



        );
    }
}
