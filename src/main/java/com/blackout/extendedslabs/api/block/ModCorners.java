package com.blackout.extendedslabs.api.block;

import com.blackout.extendedslabs.core.ExtendedSlabs;
import com.blackout.extendedslabs.blocks.BlockCorners;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.LazyValue;

import java.util.Locale;

public enum ModCorners {
    ACACIA(Blocks.ACACIA_STAIRS),
    BIRCH(Blocks.BIRCH_STAIRS),
    DARK_OAK(Blocks.DARK_OAK_STAIRS),
    JUNGLE(Blocks.JUNGLE_STAIRS),
    OAK(Blocks.OAK_STAIRS),
    SPRUCE(Blocks.SPRUCE_STAIRS),
    CRIMSON(Blocks.CRIMSON_STAIRS),
    WARPED(Blocks.WARPED_STAIRS),
    STONE(Blocks.STONE_STAIRS),
    ANDESITE(Blocks.ANDESITE),
    GRANITE(Blocks.GRANITE),
    DIORITE(Blocks.DIORITE);

    public static final ModCorners[] VALUES = values();

    private final LazyValue<Block> CornerBlock;
    private final LazyValue<Item> Item;

    public final Block baseBlock;

    ModCorners(Block baseBlockIn) {
        this.baseBlock = baseBlockIn;

        CornerBlock = new LazyValue<>(() -> new BlockCorners(Block.Properties.from(getBaseBlock())));
        Item = new LazyValue<>(() -> new Item(new Item.Properties().group(ExtendedSlabs.GROUP)));
    }

    public Block getCornerBlock() {
        return CornerBlock.getValue();
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
