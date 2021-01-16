package com.blackout.extendedslabs.api.block;

import com.blackout.extendedslabs.blocks.BlockVerticalSlab;
import com.blackout.extendedslabs.blocks.grass.BlockVerticalGrassSlab;
import com.blackout.extendedslabs.blocks.path.BlockVerticalPathSlab;
import com.blackout.extendedslabs.core.ExtendedSlabs;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
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
public class ModVerticalSlabs {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ExtendedSlabs.MODID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ExtendedSlabs.MODID);

    // Dirt
    public static final RegistryObject<Block> GRASS_VERTICAL = registerBlock("vertical_grass_slab",() -> new BlockVerticalGrassSlab(Block.Properties.from(Blocks.GRASS_BLOCK)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> DIRT_VERTICAL = registerBlock("vertical_dirt_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.DIRT)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> PODZOL_VERTICAL = registerBlock("vertical_podzol_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.PODZOL)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> PATH_VERTICAL = registerBlock("vertical_path_slab",() -> new BlockVerticalPathSlab(Block.Properties.from(Blocks.GRASS_PATH)), ExtendedSlabs.GROUP);

    // Stone
    public static final RegistryObject<Block> COBBLESTONE_VERTICAL = registerBlock("vertical_cobblestone_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.COBBLESTONE_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> STONE_VERTICAL = registerBlock("vertical_stone_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.STONE_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> STONE_BRICKS_VERTICAL = registerBlock("vertical_stone_bricks_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.STONE_BRICK_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> SMOOTH_STONE_VERTICAL = registerBlock("vertical_smooth_stone_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.SMOOTH_STONE_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> MOSSY_COBBLESTONE_VERTICAL = registerBlock("vertical_mossy_cobblestone_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.MOSSY_COBBLESTONE_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> MOSSY_STONE_BRICKS_VERTICAL = registerBlock("vertical_mossy_stone_bricks_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.MOSSY_STONE_BRICK_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> ANDESITE_VERTICAL = registerBlock("vertical_andesite_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.ANDESITE_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> POLISHED_ANDESITE_VERTICAL = registerBlock("vertical_polished_andesite_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.POLISHED_ANDESITE_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> DIORITE_VERTICAL = registerBlock("vertical_diorite_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.DIORITE_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> POLISHED_DIORITE_VERTICAL = registerBlock("vertical_polished_diorite_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.POLISHED_DIORITE_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> GRANITE_VERTICAL = registerBlock("vertical_granite_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.GRANITE_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> POLISHED_GRANITE_VERTICAL = registerBlock("vertical_polished_granite_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.POLISHED_GRANITE_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> BRICK_VERTICAL = registerBlock("vertical_brick_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.BRICK_SLAB)), ExtendedSlabs.GROUP);

    // Modded Stone
    public static RegistryObject<Block> MUD_BRICK_VERTICAL = null;

    // Modded Stone Compat
    public static final Block MUD_BRICK_SLAB = ForgeRegistries.BLOCKS.getValue(new ResourceLocation("biomesoplenty", "mud_brick_slab"));

    // Sandstone
    public static final RegistryObject<Block> SANDSTONE_VERTICAL = registerBlock("vertical_sandstone_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.SANDSTONE_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> SMOOTH_SANDSTONE_VERTICAL = registerBlock("vertical_smooth_sandstone_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.SMOOTH_SANDSTONE_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> CUT_SANDSTONE_VERTICAL = registerBlock("vertical_cut_sandstone_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.CUT_SANDSTONE_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> RED_SANDSTONE_VERTICAL = registerBlock("vertical_red_sandstone_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.RED_SANDSTONE_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> SMOOTH_RED_SANDSTONE_VERTICAL = registerBlock("vertical_smooth_red_sandstone_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.SMOOTH_RED_SANDSTONE_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> CUT_RED_SANDSTONE_VERTICAL = registerBlock("vertical_cut_red_sandstone_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.CUT_RED_SANDSTONE_SLAB)), ExtendedSlabs.GROUP);

    // Modded Sandstone
    public static RegistryObject<Block> WHITE_SANDSTONE_VERTICAL = null;
    public static RegistryObject<Block> SMOOTH_WHITE_SANDSTONE_VERTICAL = null;
    public static RegistryObject<Block> CUT_WHITE_SANDSTONE_VERTICAL = null;
    public static RegistryObject<Block> ORANGE_SANDSTONE_VERTICAL = null;
    public static RegistryObject<Block> SMOOTH_ORANGE_SANDSTONE_VERTICAL = null;
    public static RegistryObject<Block> CUT_ORANGE_SANDSTONE_VERTICAL = null;
    public static RegistryObject<Block> BLACK_SANDSTONE_VERTICAL = null;
    public static RegistryObject<Block> SMOOTH_BLACK_SANDSTONE_VERTICAL = null;
    public static RegistryObject<Block> CUT_BLACK_SANDSTONE_VERTICAL = null;

    // Modded Sandstone Compat
    public static final Block WHITE_SANDSTONE_SLAB = ForgeRegistries.BLOCKS.getValue(new ResourceLocation("biomesoplenty", "white_sandstone_slab"));
    public static final Block SMOOTH_WHITE_SANDSTONE_SLAB = ForgeRegistries.BLOCKS.getValue(new ResourceLocation("biomesoplenty", "smooth_white_sandstone_slab"));
    public static final Block CUT_WHITE_SANDSTONE_SLAB = ForgeRegistries.BLOCKS.getValue(new ResourceLocation("biomesoplenty", "cut_white_sandstone_slab"));
    public static final Block ORANGE_SANDSTONE_SLAB = ForgeRegistries.BLOCKS.getValue(new ResourceLocation("biomesoplenty", "orange_sandstone_slab"));
    public static final Block SMOOTH_ORANGE_SANDSTONE_SLAB = ForgeRegistries.BLOCKS.getValue(new ResourceLocation("biomesoplenty", "smooth_orange_sandstone_slab"));
    public static final Block CUT_ORANGE_SANDSTONE_SLAB = ForgeRegistries.BLOCKS.getValue(new ResourceLocation("biomesoplenty", "cut_orange_sandstone_slab"));
    public static final Block BLACK_SANDSTONE_SLAB = ForgeRegistries.BLOCKS.getValue(new ResourceLocation("biomesoplenty", "black_sandstone_slab"));
    public static final Block SMOOTH_BLACK_SANDSTONE_SLAB = ForgeRegistries.BLOCKS.getValue(new ResourceLocation("biomesoplenty", "smooth_black_sandstone_slab"));
    public static final Block CUT_BLACK_SANDSTONE_SLAB = ForgeRegistries.BLOCKS.getValue(new ResourceLocation("biomesoplenty", "cut_black_sandstone_slab"));

    // Nether
    public static final RegistryObject<Block> BLACKSTONE_VERTICAL = registerBlock("vertical_blackstone_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.BLACKSTONE_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> POLISHED_BLACKSTONE_VERTICAL = registerBlock("vertical_polished_blackstone_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.POLISHED_BLACKSTONE_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> POLISHED_BLACKSTONE_BRICKS_VERTICAL = registerBlock("vertical_polished_blackstone_bricks_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.POLISHED_BLACKSTONE_BRICK_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> NETHERRACK_VERTICAL = registerBlock("vertical_netherrack_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.NETHERRACK)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> NETHER_BRICKS_VERTICAL = registerBlock("vertical_nether_bricks_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.NETHER_BRICK_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> RED_NETHER_BRICKS_VERTICAL = registerBlock("vertical_red_nether_bricks_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.RED_NETHER_BRICK_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> QUARTZ_VERTICAL = registerBlock("vertical_quartz_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.QUARTZ_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> SMOOTH_QUARTZ_VERTICAL = registerBlock("vertical_smooth_quartz_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.SMOOTH_QUARTZ_SLAB)), ExtendedSlabs.GROUP);

    // End
    public static final RegistryObject<Block> END_STONE_VERTICAL = registerBlock("vertical_end_stone_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.END_STONE)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> END_STONE_BRICKS_VERTICAL = registerBlock("vertical_end_stone_bricks_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.END_STONE_BRICK_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> PURPUR_VERTICAL = registerBlock("vertical_purpur_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.PURPUR_SLAB)), ExtendedSlabs.GROUP);

    // Water
    public static final RegistryObject<Block> PRISMARINE_VERTICAL = registerBlock("vertical_prismarine_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.PRISMARINE_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> PRISMARINE_BRICKS_VERTICAL = registerBlock("vertical_prismarine_bricks_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.PRISMARINE_BRICK_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> DARK_PRISMARINE_VERTICAL = registerBlock("vertical_dark_prismarine_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.DARK_PRISMARINE_SLAB)), ExtendedSlabs.GROUP);

    // Woods
    public static final RegistryObject<Block> OAK_VERTICAL = registerBlock("vertical_oak_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.OAK_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> SPRUCE_VERTICAL = registerBlock("vertical_spruce_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.SPRUCE_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> BIRCH_VERTICAL = registerBlock("vertical_birch_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.BIRCH_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> JUNGLE_VERTICAL = registerBlock("vertical_jungle_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.JUNGLE_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> ACACIA_VERTICAL = registerBlock("vertical_acacia_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.ACACIA_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> DARK_OAK_VERTICAL = registerBlock("vertical_dark_oak_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.DARK_OAK_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> CRIMSON_VERTICAL = registerBlock("vertical_crimson_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.CRIMSON_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> WARPED_VERTICAL = registerBlock("vertical_warped_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.WARPED_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> PETRIFIED_OAK_VERTICAL = registerBlock("vertical_petrified_oak_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.PETRIFIED_OAK_SLAB)), ExtendedSlabs.GROUP);

    // Modded Woods
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
    public static RegistryObject<Block> MICHROSIA_VERTICAL = null;

    // Modded Woods Compat
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
    public static final Block MICHROSIA_SLAB = ForgeRegistries.BLOCKS.getValue(new ResourceLocation("michrosia", "michrosia_slab"));

    public static void registerBOPCompat() {
        if (ModList.get().isLoaded("biomesoplenty")) {
            // Biomes O' Plenty Stone
            MUD_BRICK_VERTICAL = registerBlock("vertical_mud_brick_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.BRICK_SLAB)), ExtendedSlabs.GROUP);

            // Biomes O' Plenty Sandstone
            WHITE_SANDSTONE_VERTICAL = registerBlock("vertical_white_sandstone_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.SANDSTONE_SLAB)), ExtendedSlabs.GROUP);
            SMOOTH_WHITE_SANDSTONE_VERTICAL = registerBlock("vertical_smooth_white_sandstone_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.SMOOTH_SANDSTONE_SLAB)), ExtendedSlabs.GROUP);
            CUT_WHITE_SANDSTONE_VERTICAL = registerBlock("vertical_cut_white_sandstone_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.CUT_SANDSTONE_SLAB)), ExtendedSlabs.GROUP);
            ORANGE_SANDSTONE_VERTICAL = registerBlock("vertical_orange_sandstone_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.SANDSTONE_SLAB)), ExtendedSlabs.GROUP);
            SMOOTH_ORANGE_SANDSTONE_VERTICAL = registerBlock("vertical_smooth_orange_sandstone_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.SMOOTH_SANDSTONE_SLAB)), ExtendedSlabs.GROUP);
            CUT_ORANGE_SANDSTONE_VERTICAL = registerBlock("vertical_cut_orange_sandstone_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.CUT_SANDSTONE_SLAB)), ExtendedSlabs.GROUP);
            BLACK_SANDSTONE_VERTICAL = registerBlock("vertical_black_sandstone_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.SANDSTONE_SLAB)), ExtendedSlabs.GROUP);
            SMOOTH_BLACK_SANDSTONE_VERTICAL = registerBlock("vertical_smooth_black_sandstone_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.SMOOTH_SANDSTONE_SLAB)), ExtendedSlabs.GROUP);
            CUT_BLACK_SANDSTONE_VERTICAL = registerBlock("vertical_cut_black_sandstone_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.CUT_SANDSTONE_SLAB)), ExtendedSlabs.GROUP);

            // Biomes O' Plenty Woods
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

    public static void registerMichrosiaCompat() {
        if (ModList.get().isLoaded("michrosia")) {
            // Michrosia Woods
            MICHROSIA_VERTICAL = registerBlock("vertical_michrosia_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.OAK_SLAB)), ExtendedSlabs.GROUP);
        }
    }

    public static <B extends Block> RegistryObject<B> registerBlock(String name, Supplier<? extends B> supplier, ItemGroup itemGroup) {
        RegistryObject<B> block = ModVerticalSlabs.BLOCKS.register(name, supplier);
        ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().group(itemGroup)));
        return block;
    }
}