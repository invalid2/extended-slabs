package com.blackout.extendedslabs.api.block;

import com.blackout.extendedslabs.core.ExtendedSlabs;
import com.blackout.extendedslabs.blocks.BlockCorners;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.LazyValue;

import java.util.Locale;

public enum ModCorners {
    OAK(Blocks.OAK_STAIRS);

    public static final ModCorners[] VALUES = values();

    private final LazyValue<Block> CornerBlock;
    private final LazyValue<Item> Item;

    public final Block baseBlock;

    ModCorners(Block baseBlockIn) {
        this.baseBlock = baseBlockIn;

        CornerBlock = new LazyValue<>(() -> new BlockCorners(Block.Properties.from(getBaseBlock())));
        Item = new LazyValue<>(() -> new Item(new Item.Properties().group(ExtendedSlabs.GROUP)));
    }

    public Block getCornerBlock() { return CornerBlock.getValue(); }

    public Item getItem() { return Item.getValue(); }

    public String getName() { return name().toLowerCase(Locale.ROOT); }

    public Block getBaseBlock() { return this.baseBlock; }
}
