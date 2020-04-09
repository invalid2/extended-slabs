package com.blackout.extendedslabs.blocks.grass;

import com.blackout.extendedslabs.blocks.BlockVerticalSlab;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraftforge.common.ToolType;

import javax.annotation.Nullable;

public class BlockVerticalGrassSlab extends BlockVerticalSlab {
    public BlockVerticalGrassSlab(Block.Properties builder) {
        super(builder);
    }

    @Nullable
    @Override
    public ToolType getHarvestTool(BlockState state) {
        return ToolType.SHOVEL;
    }
}
