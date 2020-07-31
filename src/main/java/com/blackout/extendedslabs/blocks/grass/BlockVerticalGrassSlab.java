package com.blackout.extendedslabs.blocks.grass;

import com.blackout.extendedslabs.blocks.BlockVerticalSlab;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.fluid.FluidState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
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

    @Override
    public boolean receiveFluid(IWorld worldIn, BlockPos pos, BlockState state, FluidState fluidStateIn) {
        return false;
    }
}
