package com.blackout.extendedslabs.api.block;


import com.blackout.extendedslabs.core.ExtendedSlabs;
import com.blackout.extendedslabs.blocks.BlockCustomStairs;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.LazyValue;

import java.util.Locale;

public enum ModStairs {

    DIRT(Blocks.DIRT),
    CUT_SANDSTONE(Blocks.CUT_SANDSTONE),
    CUT_RED_SANDSTONE(Blocks.CUT_RED_SANDSTONE);

    public static final ModStairs[] VALUES = values();

    private final LazyValue<Block> Stairs;
    private final LazyValue<Item> Item;

    public final Block baseBlock;

    ModStairs(Block baseBlockIn) {
        this.baseBlock = baseBlockIn;

        Stairs = new LazyValue<>(() -> new BlockCustomStairs(getBaseBlock().getDefaultState(), Block.Properties.from(getBaseBlock())));
        Item = new LazyValue<>(() -> new Item(new Item.Properties().group(ExtendedSlabs.GROUP)));
    }

    public Block getStairs() {
        return Stairs.getValue();
    }

    public Item getItem() {
        return Item.getValue();
    }

    public String getName() {
        return name().toLowerCase(Locale.ROOT);
    }

    public Block getBaseBlock() {
        return this.baseBlock;
    }

}
