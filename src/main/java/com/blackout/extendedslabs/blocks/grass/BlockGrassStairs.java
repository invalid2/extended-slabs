package com.blackout.extendedslabs.blocks.grass;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.StairsBlock;
import net.minecraftforge.common.ToolType;

import javax.annotation.Nullable;

public class BlockGrassStairs extends StairsBlock {
    public BlockGrassStairs(BlockState state, Block.Properties builder) {
        super(state, builder);
    }

    @Nullable
    @Override
    public ToolType getHarvestTool(BlockState state) {
        return ToolType.SHOVEL;
    }
}
