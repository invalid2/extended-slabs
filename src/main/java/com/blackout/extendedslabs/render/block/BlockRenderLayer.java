package com.blackout.extendedslabs.render.block;

import com.blackout.extendedslabs.init.ModBlocks;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;

public class BlockRenderLayer {

    public static void renderBlock() {
        RenderTypeLookup.setRenderLayer(ModBlocks.GRASS_SLAB, RenderType.getCutoutMipped());

        RenderTypeLookup.setRenderLayer(ModBlocks.VERTICAL_GRASS_SLAB, RenderType.getCutoutMipped());
    }
}