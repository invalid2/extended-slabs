package com.blackout.extendedslabs.util;

import com.blackout.extendedslabs.api.block.ModVerticalSlabs;
import com.blackout.extendedslabs.core.ExtendedSlabs;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class CreativeTab extends ItemGroup {
    public CreativeTab() {
        super(ExtendedSlabs.MODID);
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(ModVerticalSlabs.PRISMARINE_BRICKS.getVerticalSlab());
    }

    @Override
    public boolean hasSearchBar() {
        return true;
    }

    public int getSearchbarWidth() {
        return 75;
    }

    public net.minecraft.util.ResourceLocation getBackgroundImage() {
        return new net.minecraft.util.ResourceLocation("extendedslabs:textures/gui/container/creative_inventory/tab_extendedslabs.png");
    }

    public net.minecraft.util.ResourceLocation getTabsImage() {
        return new net.minecraft.util.ResourceLocation("extendedslabs:textures/gui/container/creative_inventory/tabs.png");
    }
}
