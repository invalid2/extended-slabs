package com.blackout.extendedslabs.render.block;

import com.blackout.extendedslabs.init.ModSlabs;
import com.blackout.extendedslabs.init.ModVerticalSlabs;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;

public class BlockRenderLayer {

    public static void renderBlock() {
        RenderTypeLookup.setRenderLayer(ModSlabs.GRASS_SLAB.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModVerticalSlabs.GRASS_VERTICAL.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModSlabs.PATH_SLAB.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModVerticalSlabs.PATH_VERTICAL.get(), RenderType.getCutoutMipped());
    }
}