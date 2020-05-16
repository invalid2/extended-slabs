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
        return new ItemStack(ModVerticalSlabs.OAK.getVerticalSlab());
    }
}
