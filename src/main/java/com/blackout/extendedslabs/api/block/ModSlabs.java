package com.blackout.extendedslabs.api.block;

import com.blackout.extendedslabs.core.ExtendedSlabs;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SlabBlock;
import net.minecraft.item.Item;
import net.minecraft.util.LazyValue;

import java.util.Locale;

public enum ModSlabs {

    DIRT(Blocks.DIRT);

    public static final ModSlabs[] VALUES = values();

    private final LazyValue<Block> Slab;
    private final LazyValue<Item> Item;

    public final Block baseBlock;

    ModSlabs(Block baseBlockIn) {
        this.baseBlock = baseBlockIn;

        Slab = new LazyValue<>(() -> new SlabBlock(Block.Properties.from(getBaseBlock())));
        Item = new LazyValue<>(() -> new Item(new Item.Properties().group(ExtendedSlabs.GROUP)));
    }

    public Block getSlab() { return Slab.getValue(); }

    public Item getItem() { return Item.getValue(); }

    public String getName() { return name().toLowerCase(Locale.ROOT); }

    public Block getBaseBlock() { return this.baseBlock; }

}
