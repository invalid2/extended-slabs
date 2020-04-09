package com.blackout.extendedslabs.render.block;

import com.blackout.extendedslabs.init.ModBlocks;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class BlockRenderLayer {

    public static void renderBlock() {
        RenderTypeLookup.setRenderLayer(ModBlocks.GRASS_SLAB, RenderType.getCutout());

        RenderTypeLookup.setRenderLayer(ModBlocks.GRASS_STAIRS, RenderType.getCutout());

        RenderTypeLookup.setRenderLayer(ModBlocks.VERTICAL_GRASS_SLAB, RenderType.getCutout());
    }
}