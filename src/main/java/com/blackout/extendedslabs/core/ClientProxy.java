package com.blackout.extendedslabs.core;

import com.blackout.extendedslabs.init.ModSlabs;
import com.blackout.extendedslabs.init.ModVerticalSlabs;
import net.minecraft.block.BlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.color.BlockColors;
import net.minecraft.client.renderer.color.ItemColors;
import net.minecraft.item.BlockItem;
import net.minecraft.world.GrassColors;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeColors;

public class ClientProxy extends CommonProxy {

    @Override
    public void init() {
        BlockColors blockcolors = Minecraft.getInstance().getBlockColors();
        ItemColors itemcolors = Minecraft.getInstance().getItemColors();

        blockcolors.register((state, world, pos, tintindex) ->
                        world != null && pos != null ? BiomeColors.getGrassColor(world, pos) : GrassColors.get(0.5D, 1.0D),
                ModSlabs.GRASS_SLAB.get(), ModVerticalSlabs.GRASS_VERTICAL.get());

        itemcolors.register((stack, tintindex) -> {
                    BlockState iblockstate = ((BlockItem) stack.getItem()).getBlock().getDefaultState();
                    return blockcolors.getColor(iblockstate, null, null, 1);
                },
                ModSlabs.GRASS_SLAB.get(), ModVerticalSlabs.GRASS_VERTICAL.get());
    }

    public World getClientWorld() {
        return Minecraft.getInstance().world;
    }
}
