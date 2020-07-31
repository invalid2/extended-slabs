package com.blackout.extendedslabs.api.block;

import com.blackout.extendedslabs.blocks.BlockVerticalSlab;
import com.blackout.extendedslabs.core.ExtendedSlabs;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(modid = ExtendedSlabs.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModVerticalSlabsTest {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ExtendedSlabs.MODID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ExtendedSlabs.MODID);

    public static final RegistryObject<Block> OAK_VERTICAL = registerBlock("vertical_oak_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.OAK_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> SPRUCE_VERTICAL = registerBlock("vertical_spruce_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.SPRUCE_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> BIRCH_VERTICAL = registerBlock("vertical_birch_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.BIRCH_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> JUNGLE_VERTICAL = registerBlock("vertical_jungle_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.JUNGLE_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> ACACIA_VERTICAL = registerBlock("vertical_acacia_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.ACACIA_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> DARK_OAK_VERTICAL = registerBlock("vertical_dark_oak_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.DARK_OAK_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> CRIMSON_VERTICAL = registerBlock("vertical_crimson_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.CRIMSON_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> WARPED_VERTICAL = registerBlock("vertical_warped_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.WARPED_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> PETRIFIED_OAK_VERTICAL = registerBlock("vertical_petrified_oak_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.PETRIFIED_OAK_SLAB)), ExtendedSlabs.GROUP);

    public static RegistryObject<Block> CHERRY_VERTICAL = null;
    public static RegistryObject<Block> DEAD_VERTICAL = null;
    public static RegistryObject<Block> FIR_VERTICAL = null;
    public static RegistryObject<Block> HELLBARK_VERTICAL = null;
    public static RegistryObject<Block> JACARANDA_VERTICAL = null;
    public static RegistryObject<Block> MAGIC_VERTICAL = null;
    public static RegistryObject<Block> MAHOGANY_VERTICAL = null;
    public static RegistryObject<Block> PALM_VERTICAL = null;
    public static RegistryObject<Block> REDWOORD_VERTICAL = null;
    public static RegistryObject<Block> UMBRAN_VERTICAL = null;
    public static RegistryObject<Block> WILLOW_VERTICAL = null;

    // compat blocks
    public static final Block CHERRY_SLAB = ForgeRegistries.BLOCKS.getValue(new ResourceLocation("biomesoplenty", "cherry_slab"));
    public static final Block DEAD_SLAB = ForgeRegistries.BLOCKS.getValue(new ResourceLocation("biomesoplenty", "dead_slab"));
    public static final Block FIR_SLAB = ForgeRegistries.BLOCKS.getValue(new ResourceLocation("biomesoplenty", "fir_slab"));
    public static final Block HELLBARK_SLAB = ForgeRegistries.BLOCKS.getValue(new ResourceLocation("biomesoplenty", "hellbark_slab"));
    public static final Block JACARANDA_SLAB = ForgeRegistries.BLOCKS.getValue(new ResourceLocation("biomesoplenty", "jacaranda_slab"));
    public static final Block MAGIC_SLAB = ForgeRegistries.BLOCKS.getValue(new ResourceLocation("biomesoplenty", "magic_slab"));
    public static final Block MAHOGANY_SLAB = ForgeRegistries.BLOCKS.getValue(new ResourceLocation("biomesoplenty", "mahogany_slab"));
    public static final Block PALM_SLAB = ForgeRegistries.BLOCKS.getValue(new ResourceLocation("biomesoplenty", "palm_slab"));
    public static final Block REDWOOD_SLAB = ForgeRegistries.BLOCKS.getValue(new ResourceLocation("biomesoplenty", "redwood_slab"));
    public static final Block UMBRAN_SLAB = ForgeRegistries.BLOCKS.getValue(new ResourceLocation("biomesoplenty", "umbran_slab"));
    public static final Block WILLOW_SLAB = ForgeRegistries.BLOCKS.getValue(new ResourceLocation("biomesoplenty", "willow_slab"));

    public static void registerBOPCompat() {
        if (ModList.get().isLoaded("biomesoplenty")) {
            CHERRY_VERTICAL = registerBlock("vertical_cherry_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.OAK_SLAB)), ExtendedSlabs.GROUP);
            DEAD_VERTICAL = registerBlock("vertical_dead_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.OAK_SLAB)), ExtendedSlabs.GROUP);
            FIR_VERTICAL = registerBlock("vertical_fir_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.OAK_SLAB)), ExtendedSlabs.GROUP);
            HELLBARK_VERTICAL = registerBlock("vertical_hellbark_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.OAK_SLAB)), ExtendedSlabs.GROUP);
            JACARANDA_VERTICAL = registerBlock("vertical_jacaranda_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.OAK_SLAB)), ExtendedSlabs.GROUP);
            MAGIC_VERTICAL = registerBlock("vertical_magic_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.OAK_SLAB)), ExtendedSlabs.GROUP);
            MAHOGANY_VERTICAL = registerBlock("vertical_mahogany_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.OAK_SLAB)), ExtendedSlabs.GROUP);
            PALM_VERTICAL = registerBlock("vertical_palm_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.OAK_SLAB)), ExtendedSlabs.GROUP);
            REDWOORD_VERTICAL = registerBlock("vertical_redwood_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.OAK_SLAB)), ExtendedSlabs.GROUP);
            UMBRAN_VERTICAL = registerBlock("vertical_umbran_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.OAK_SLAB)), ExtendedSlabs.GROUP);
            WILLOW_VERTICAL = registerBlock("vertical_willow_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.OAK_SLAB)), ExtendedSlabs.GROUP);
        }
    }

    public static <B extends Block> RegistryObject<B> registerBlock(String name, Supplier<? extends B> supplier, ItemGroup itemGroup) {
        RegistryObject<B> block = ModVerticalSlabsTest.BLOCKS.register(name, supplier);
        ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().group(itemGroup)));
        return block;
    }
}