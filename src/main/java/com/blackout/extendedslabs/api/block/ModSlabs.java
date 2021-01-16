package com.blackout.extendedslabs.api.block;

import com.blackout.extendedslabs.blocks.grass.BlockGrassSlab;
import com.blackout.extendedslabs.blocks.path.BlockPathSlab;
import com.blackout.extendedslabs.core.ExtendedSlabs;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SlabBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(modid = ExtendedSlabs.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModSlabs {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ExtendedSlabs.MODID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ExtendedSlabs.MODID);

    // Dirt
    public static final RegistryObject<Block> GRASS_SLAB = registerBlock("grass_slab",() -> new BlockGrassSlab(Block.Properties.from(Blocks.GRASS_BLOCK)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> DIRT_SLAB = registerBlock("dirt_slab",() -> new SlabBlock(Block.Properties.from(Blocks.DIRT)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> PODZOL_SLAB = registerBlock("podzol_slab",() -> new SlabBlock(Block.Properties.from(Blocks.PODZOL)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> PATH_SLAB = registerBlock("path_slab",() -> new BlockPathSlab(Block.Properties.from(Blocks.GRASS_PATH)), ExtendedSlabs.GROUP);

    // Nether
    public static final RegistryObject<Block> NETHERRACK_SLAB = registerBlock("netherrack_slab",() -> new SlabBlock(Block.Properties.from(Blocks.NETHERRACK)), ExtendedSlabs.GROUP);

    // End
    public static final RegistryObject<Block> END_STONE_SLAB = registerBlock("end_stone_slab",() -> new SlabBlock(Block.Properties.from(Blocks.END_STONE)), ExtendedSlabs.GROUP);


    public static <B extends Block> RegistryObject<B> registerBlock(String name, Supplier<? extends B> supplier, ItemGroup itemGroup) {
        RegistryObject<B> block = ModSlabs.BLOCKS.register(name, supplier);
        ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().group(itemGroup)));
        return block;
    }
}