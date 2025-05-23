package me.bristermitten.privatemines.util;

/*
 * Minecraft ID mappings
 * Copyright (C) 2017  Max Lee (https://github.com/Phoenix616)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Source of class: https://github.com/Phoenix616/IDConverter/blob/master/mappings/src/main/java/de/themoep/idconverter/IdMappings.java
 */

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/*
    what a fucking mess this is.... gotta rework sometime 48 fucking errors and 38 typos?! WHAT THE FUCK?!
 */

public class IdMappings {
    public static final Mapping[] MAPPINGS = {
            new Mapping(0, "air"),
            new Mapping(1, "stone"),
            new Mapping(1, 1, "stone", "granite"),
            new Mapping(1, 2, "stone", "polished_granite"),
            new Mapping(1, 3, "stone", "diorite"),
            new Mapping(1, 4, "stone", "polished_diorite"),
            new Mapping(1, 5, "stone", "andesite"),
            new Mapping(1, 6, "stone", "polished_andesite"),
            new Mapping(2, "grass", "grass_block"),
            new Mapping(3, "dirt"),
            new Mapping(3, 1, "dirt", "coarse_dirt"),
            new Mapping(3, 2, "dirt", "podzol"),
            new Mapping(4, "cobblestone"),
            new Mapping(5, "wood", "oak_planks"),
            new Mapping(5, 1, "wood", "spruce_planks"),
            new Mapping(5, 2, "wood", "birch_planks"),
            new Mapping(5, 3, "wood", "jungle_planks"),
            new Mapping(5, 4, "wood", "acacia_planks"),
            new Mapping(5, 5, "wood", "dark_oak_planks"),
            new Mapping(6, "sapling", "oak_sapling"),
            new Mapping(6, 1, "sapling", "spruce_sapling"),
            new Mapping(6, 2, "sapling", "birch_sapling"),
            new Mapping(6, 3, "sapling", "jungle_sapling"),
            new Mapping(6, 4, "sapling", "acacia_sapling"),
            new Mapping(6, 5, "sapling", "dark_oak_sapling"),
            new Mapping(7, "bedrock"),
            new Mapping(8, "water"),
            new Mapping(9, "stationary_water", "water"),
            new Mapping(10, "lava"),
            new Mapping(11, "stationary_lava", "lava"),
            new Mapping(12, "sand"),
            new Mapping(12, 1, "sand", "red_sand"),
            new Mapping(13, "gravel"),
            new Mapping(14, "gold_ore"),
            new Mapping(15, "iron_ore"),
            new Mapping(16, "coal_ore"),
            new Mapping(17, "log", "oak_log"),
            new Mapping(17, 1, "log", "spruce_log"),
            new Mapping(17, 2, "log", "birch_log"),
            new Mapping(17, 3, "log", "jungle_log"),
            new Mapping(17, 12, "log", "oak_wood"),
            new Mapping(17, 13, "log", "spruce_wood"),
            new Mapping(17, 14, "log", "birch_wood"),
            new Mapping(17, 15, "log", "jungle_wood"),
            new Mapping(18, "leaves", "oak_leaves"),
            new Mapping(18, 1, "leaves", "spruce_leaves"),
            new Mapping(18, 2, "leaves", "birch_leaves"),
            new Mapping(18, 3, "leaves", "jungle_leaves"),
            new Mapping(19, "sponge"),
            new Mapping(19, 1, "sponge", "wet_sponge"),
            new Mapping(20, "glass"),
            new Mapping(21, "lapis_ore"),
            new Mapping(22, "lapis_block"),
            new Mapping(23, "dispenser"),
            new Mapping(24, "sandstone"),
            new Mapping(24, 1, "sandstone", "chiseled_sandstone"),
            new Mapping(24, 2, "sandstone", "cut_sandstone"),
            new Mapping(25, "note_block"),
            new Mapping(26, "bed_block", new Note("appears to be removed/merged with the normal bed types?")),
            new Mapping(27, "powered_rail"),
            new Mapping(28, "detector_rail"),
            new Mapping(29, "piston_sticky_base", "sticky_piston"),
            new Mapping(30, "web", "cobweb"),
            new Mapping(31, "long_grass", "dead_bush"),
            new Mapping(31, 1, "long_grass", "grass"),
            new Mapping(31, 2, "long_grass", "fern"),
            new Mapping(32, "dead_bush"),
            new Mapping(33, "piston_base", "piston"),
            new Mapping(34, "piston_extension", "piston_head"),
            new Mapping(35, "wool", "white_wool"),
            new Mapping(35, 1, "wool", "orange_wool"),
            new Mapping(35, 2, "wool", "magenta_wool"),
            new Mapping(35, 3, "wool", "light_blue_wool"),
            new Mapping(35, 4, "wool", "yellow_wool"),
            new Mapping(35, 5, "wool", "lime_wool"),
            new Mapping(35, 6, "wool", "pink_wool"),
            new Mapping(35, 7, "wool", "gray_wool"),
            new Mapping(35, 8, "wool", "light_gray_wool"),
            new Mapping(35, 9, "wool", "cyan_wool"),
            new Mapping(35, 10, "wool", "purple_wool"),
            new Mapping(35, 11, "wool", "blue_wool"),
            new Mapping(35, 12, "wool", "brown_wool"),
            new Mapping(35, 13, "wool", "green_wool"),
            new Mapping(35, 14, "wool", "red_wool"),
            new Mapping(35, 15, "wool", "black_wool"),
            new Mapping(36, "piston_moving_piece", "moving_piston"),
            new Mapping(37, "yellow_flower", "dandelion"),
            new Mapping(38, "red_rose", "poppy"),
            new Mapping(38, 1, "red_rose", "blue_orchid"),
            new Mapping(38, 2, "red_rose", "allium"),
            new Mapping(38, 3, "red_rose", "azure_bluet"),
            new Mapping(38, 4, "red_rose", "red_tulip"),
            new Mapping(38, 5, "red_rose", "orange_tulip"),
            new Mapping(38, 6, "red_rose", "white_tulip"),
            new Mapping(38, 7, "red_rose", "pink_tulip"),
            new Mapping(38, 8, "red_rose", "oxeye_daisy"),
            new Mapping(39, "brown_mushroom"),
            new Mapping(40, "red_mushroom"),
            new Mapping(41, "gold_block"),
            new Mapping(42, "iron_block"),
            new Mapping(43, "double_step", new Note("merged with normal slabs, only available via state")),
            new Mapping(43, 6, "double_step", "smooth_quartz"),
            new Mapping(43, 8, "double_step", "smooth_stone"),
            new Mapping(43, 9, "double_step", "smooth_sandstone"),
            new Mapping(44, "step", "stone_slab"),
            new Mapping(44, 1, "step", "sandstone_slab"),
            new Mapping(44, 2, "step", "petrified_oak_slab"),
            new Mapping(44, 3, "step", "cobblestone_slab"),
            new Mapping(44, 4, "step", "brick_slab"),
            new Mapping(44, 5, "step", "stone_brick_slab"),
            new Mapping(44, 6, "step", "nether_brick_slab"),
            new Mapping(44, 7, "step", "quartz_slab"),
            new Mapping(45, "brick", "bricks"),
            new Mapping(46, "tnt"),
            new Mapping(47, "bookshelf"),
            new Mapping(48, "mossy_cobblestone"),
            new Mapping(49, "obsidian"),
            new Mapping(50, "torch"),
            new Mapping(50, 1, "torch", "wall_torch"),
            new Mapping(50, 2, "torch", "wall_torch"),
            new Mapping(50, 3, "torch", "wall_torch"),
            new Mapping(50, 4, "torch", "wall_torch"),
            new Mapping(50, 5, "torch"),
            new Mapping(51, "fire"),
            new Mapping(52, "mob_spawner"),
            new Mapping(53, "wood_stairs", "oak_stairs"),
            new Mapping(53, 1, "wood_stairs", "spruce_stairs"),
            new Mapping(53, 2, "wood_stairs", "birch_stairs"),
            new Mapping(53, 3, "wood_stairs", "jungle_stairs"),
            new Mapping(54, "chest", "chest"),
            new Mapping(55, "redstone_wire"),
            new Mapping(56, "diamond_ore"),
            new Mapping(57, "diamond_block"),
            new Mapping(58, "workbench", "crafting_table"),
            new Mapping(59, "crops", "wheat"),
            new Mapping(60, "soil", "farmland"),
            new Mapping(61, "furnace"),
            new Mapping(62, "burning_furnace", new Note("merged with furnace, only available via state")),
            new Mapping(63, "sign_post", "sign"),
            new Mapping(64, "wooden_door", "oak_door"),
            new Mapping(65, "ladder"),
            new Mapping(66, "rails", "rail"),
            new Mapping(67, "cobblestone_stairs"),
            new Mapping(68, "wall_sign"),
            new Mapping(69, "lever"),
            new Mapping(70, "stone_plate", "stone_pressure_plate"),
            new Mapping(71, "iron_door_block", "iron_door"),
            new Mapping(72, "wood_plate", "oak_pressure_plate"),
            new Mapping(73, "redstone_ore"),
            new Mapping(74, "glowing_redstone_ore", new Note("merged with redstone ore, only available via state")),
            new Mapping(75, "redstone_torch_off", new Note("merged with redstone torch, only available via state")),
            new Mapping(76, "redstone_torch_on", "redstone_torch"),
            new Mapping(76, 1, "redstone_torch_on", "redstone_wall_torch"),
            new Mapping(76, 2, "redstone_torch_on", "redstone_wall_torch"),
            new Mapping(76, 3, "redstone_torch_on", "redstone_wall_torch"),
            new Mapping(76, 4, "redstone_torch_on", "redstone_wall_torch"),
            new Mapping(76, 5, "redstone_torch_on", "redstone_torch"),
            new Mapping(77, "stone_button"),
            new Mapping(78, "snow"),
            new Mapping(79, "ice"),
            new Mapping(80, "snow_block"),
            new Mapping(81, "cactus"),
            new Mapping(82, "clay"),
            new Mapping(83, "sugar_cane_block", "sugar_cane"),
            new Mapping(84, "jukebox"),
            new Mapping(85, "fence", "oak_fence"),
            new Mapping(86, "pumpkin", "carved_pumpkin"),
            new Mapping(87, "netherrack"),
            new Mapping(88, "soul_sand"),
            new Mapping(89, "glowstone"),
            new Mapping(90, "portal", "nether_portal"),
            new Mapping(91, "jack_o_lantern"),
            new Mapping(92, "cake_block", "cake"),
            new Mapping(93, "diode_block_off", new Note("merged with repeater, only available via state")),
            new Mapping(94, "diode_block_on", "repeater"),
            new Mapping(95, "stained_glass", "white_stained_glass"),
            new Mapping(95, 1, "stained_glass", "orange_stained_glass"),
            new Mapping(95, 2, "stained_glass", "magenta_stained_glass"),
            new Mapping(95, 3, "stained_glass", "light_blue_stained_glass"),
            new Mapping(95, 4, "stained_glass", "yellow_stained_glass"),
            new Mapping(95, 5, "stained_glass", "lime_stained_glass"),
            new Mapping(95, 6, "stained_glass", "pink_stained_glass"),
            new Mapping(95, 7, "stained_glass", "gray_stained_glass"),
            new Mapping(95, 8, "stained_glass", "light_gray_stained_glass"),
            new Mapping(95, 9, "stained_glass", "cyan_stained_glass"),
            new Mapping(95, 10, "stained_glass", "purple_stained_glass"),
            new Mapping(95, 11, "stained_glass", "blue_stained_glass"),
            new Mapping(95, 12, "stained_glass", "brown_stained_glass"),
            new Mapping(95, 13, "stained_glass", "green_stained_glass"),
            new Mapping(95, 14, "stained_glass", "red_stained_glass"),
            new Mapping(95, 15, "stained_glass", "black_stained_glass"),
            new Mapping(96, "trap_door", "oak_trapdoor"),
            new Mapping(97, "monster_eggs", "infested_stone"),
            new Mapping(97, 1, "monster_eggs", "infested_cobblestone"),
            new Mapping(97, 2, "monster_eggs", "infested_stone_bricks"),
            new Mapping(97, 3, "monster_eggs", "infested_mossy_stone_bricks"),
            new Mapping(97, 4, "monster_eggs", "infested_cracked_stone_bricks"),
            new Mapping(97, 5, "monster_eggs", "infested_chiseled_stone_bricks"),
            new Mapping(98, "smooth_brick", "stone_bricks"),
            new Mapping(98, 1, "smooth_brick", "mossy_stone_bricks"),
            new Mapping(98, 2, "smooth_brick", "cracked_stone_bricks"),
            new Mapping(98, 3, "smooth_brick", "chiseled_bricks"),
            new Mapping(99, "huge_mushroom_1", "brown_mushroom_block"),
            new Mapping(99, 1, "huge_mushroom_1", new Note("now a state of the block")),
            new Mapping(99, 2, "huge_mushroom_1", new Note("now a state of the block")),
            new Mapping(99, 3, "huge_mushroom_1", new Note("now a state of the block")),
            new Mapping(99, 4, "huge_mushroom_1", new Note("now a state of the block")),
            new Mapping(99, 5, "huge_mushroom_1", new Note("now a state of the block")),
            new Mapping(99, 6, "huge_mushroom_1", new Note("now a state of the block")),
            new Mapping(99, 7, "huge_mushroom_1", new Note("now a state of the block")),
            new Mapping(99, 8, "huge_mushroom_1", new Note("now a state of the block")),
            new Mapping(99, 9, "huge_mushroom_1", new Note("now a state of the block")),
            new Mapping(99, 10, "huge_mushroom_1", "mushroom_stem"),
            new Mapping(99, 14, "huge_mushroom_1", new Note("now a state of the block")),
            new Mapping(99, 15, "huge_mushroom_1", new Note("now a state of the steam")),
            new Mapping(100, "huge_mushroom_2", "red_mushroom_block"),
            new Mapping(100, 1, "huge_mushroom_2", new Note("now a state of the block")),
            new Mapping(100, 2, "huge_mushroom_2", new Note("now a state of the block")),
            new Mapping(100, 3, "huge_mushroom_2", new Note("now a state of the block")),
            new Mapping(100, 4, "huge_mushroom_2", new Note("now a state of the block")),
            new Mapping(100, 5, "huge_mushroom_2", new Note("now a state of the block")),
            new Mapping(100, 6, "huge_mushroom_2", new Note("now a state of the block")),
            new Mapping(100, 7, "huge_mushroom_2", new Note("now a state of the block")),
            new Mapping(100, 8, "huge_mushroom_2", new Note("now a state of the block")),
            new Mapping(100, 9, "huge_mushroom_2", new Note("now a state of the block")),
            new Mapping(100, 10, "huge_mushroom_2", "mushroom_stem"),
            new Mapping(100, 14, "huge_mushroom_2", new Note("now a state of the block")),
            new Mapping(100, 15, "huge_mushroom_2", new Note("now a state of the steam")),
            new Mapping(101, "iron_fence", "iron_bars"),
            new Mapping(102, "thin_glass", "glass_pane"),
            new Mapping(103, "melon_block"),
            new Mapping(104, "pumpkin_stem"),
            new Mapping(105, "melon_stem"),
            new Mapping(106, "vine"),
            new Mapping(107, "fence_gate", "oak_fence_gate"),
            new Mapping(108, "brick_stairs"),
            new Mapping(109, "smooth_stairs", "stone_brick_stairs"),
            new Mapping(110, "mycel", "mycelium"),
            new Mapping(111, "water_lily", "lily_pad"),
            new Mapping(112, "nether_brick", "nether_bricks"),
            new Mapping(113, "nether_fence", "nether_brick_fence"),
            new Mapping(114, "nether_brick_stairs"),
            new Mapping(115, "nether_warts", "nether_wart"),
            new Mapping(116, "enchantment_table", "enchanting_table"),
            new Mapping(117, "brewing_stand"),
            new Mapping(118, "cauldron"),
            new Mapping(119, "ender_portal", "end_portal"),
            new Mapping(120, "ender_portal_frame", "end_portal_frame"),
            new Mapping(121, "ender_stone", "end_stone"),
            new Mapping(122, "dragon_egg"),
            new Mapping(123, "redstone_lamp_off", new Note("merged with redstone lamp, only available via state")),
            new Mapping(124, "redstone_lamp_on", "redstone_lamp"),
            new Mapping(125, "wood_double_step", new Note("merged with slabs, only available via state")),
            new Mapping(125, 1, "wood_double_step", new Note("merged with slabs, only available via state")),
            new Mapping(125, 2, "wood_double_step", new Note("merged with slabs, only available via state")),
            new Mapping(125, 3, "wood_double_step", new Note("merged with slabs, only available via state")),
            new Mapping(125, 4, "wood_double_step", new Note("merged with slabs, only available via state")),
            new Mapping(125, 5, "wood_double_step", new Note("merged with slabs, only available via state")),
            new Mapping(126, "wood_step", "oak_slab"),
            new Mapping(126, 1, "wood_step", "spruce_slab"),
            new Mapping(126, 2, "wood_step", "birch_slab"),
            new Mapping(126, 3, "wood_step", "jungle_slab"),
            new Mapping(126, 4, "wood_step", "acacia_slab"),
            new Mapping(126, 5, "wood_step", "dark_oak_slab"),
            new Mapping(127, "cocoa"),
            new Mapping(128, "sandstone_stairs"),
            new Mapping(129, "emerald_ore"),
            new Mapping(130, "ender_chest"),
            new Mapping(131, "tripwire_hook"),
            new Mapping(132, "tripwire"),
            new Mapping(133, "emerald_block"),
            new Mapping(134, "spruce_wood_stairs", "spruce_stairs"),
            new Mapping(135, "birch_wood_stairs", "birch_stairs"),
            new Mapping(136, "jungle_wood_stairs", "jungle_stairs"),
            new Mapping(137, "command", "command_block"),
            new Mapping(138, "beacon"),
            new Mapping(139, "cobble_wall", "cobblestone_wall"),
            new Mapping(139, 1, "cobble_wall", "mossy_cobblestone_wall"),
            new Mapping(140, "flower_pot"),
            new Mapping(141, "carrot", "carrots"),
            new Mapping(142, "potato", "potatoes"),
            new Mapping(143, "wood_button", "oak_button"),
            new Mapping(144, "skull", "skeleton_skull"),
            new Mapping(144, 1, "skull", "skeleton_wall_skull"),
            new Mapping(144, 2, "skull", "skeleton_wall_skull"),
            new Mapping(144, 3, "skull", "skeleton_wall_skull"),
            new Mapping(144, 4, "skull", "skeleton_wall_skull"),
            new Mapping(144, 5, "skull", "skeleton_wall_skull"),
            new Mapping(145, "anvil"),
            new Mapping(145, 1, "anvil", "chipped_anvil"),
            new Mapping(145, 2, "anvil", "damaged_anvil"),
            new Mapping(146, "trapped_chest"),
            new Mapping(147, "gold_plate", "light_weighted_pressure_plate"),
            new Mapping(148, "iron_plate", "heavy_weighted_pressure_plate"),
            new Mapping(149, "redstone_comparator_off", new Note("merged with comparator, only available via state")),
            new Mapping(150, "redstone_comparator_on", "comparator"),
            new Mapping(151, "daylight_detector"),
            new Mapping(152, "redstone_block"),
            new Mapping(153, "quartz_ore", "nether_quartz_ore"),
            new Mapping(154, "hopper"),
            new Mapping(155, "quartz_block"),
            new Mapping(155, 1, "quartz_block", "quartz_pillar"),
            new Mapping(155, 2, "quartz_block", "chiseled_quartz_block"),
            new Mapping(156, "quartz_stairs"),
            new Mapping(157, "activator_rail"),
            new Mapping(158, "dropper"),
            new Mapping(159, "stained_clay", "white_terracotta"),
            new Mapping(159, 1, "stained_clay", "orange_terracotta"),
            new Mapping(159, 2, "stained_clay", "magenta_terracotta"),
            new Mapping(159, 3, "stained_clay", "light_blue_terracotta"),
            new Mapping(159, 4, "stained_clay", "yellow_terracotta"),
            new Mapping(159, 5, "stained_clay", "lime_terracotta"),
            new Mapping(159, 6, "stained_clay", "pink_terracotta"),
            new Mapping(159, 7, "stained_clay", "gray_terracotta"),
            new Mapping(159, 8, "stained_clay", "light_gray_terracotta"),
            new Mapping(159, 9, "stained_clay", "cyan_terracotta"),
            new Mapping(159, 10, "stained_clay", "purple_terracotta"),
            new Mapping(159, 11, "stained_clay", "blue_terracotta"),
            new Mapping(159, 12, "stained_clay", "brown_terracotta"),
            new Mapping(159, 13, "stained_clay", "green_terracotta"),
            new Mapping(159, 14, "stained_clay", "red_terracotta"),
            new Mapping(159, 15, "stained_clay", "black_terracotta"),
            new Mapping(160, "stained_glass_pane", "white_stained_glass_pane"),
            new Mapping(160, 1, "stained_glass_pane", "orange_stained_glass_pane"),
            new Mapping(160, 2, "stained_glass_pane", "magenta_stained_glass_pane"),
            new Mapping(160, 3, "stained_glass_pane", "light_blue_stained_glass_pane"),
            new Mapping(160, 4, "stained_glass_pane", "yellow_stained_glass_pane"),
            new Mapping(160, 5, "stained_glass_pane", "lime_stained_glass_pane"),
            new Mapping(160, 6, "stained_glass_pane", "pink_stained_glass_pane"),
            new Mapping(160, 7, "stained_glass_pane", "gray_stained_glass_pane"),
            new Mapping(160, 8, "stained_glass_pane", "light_gray_stained_glass_pane"),
            new Mapping(160, 9, "stained_glass_pane", "cyan_stained_glass_pane"),
            new Mapping(160, 10, "stained_glass_pane", "purple_stained_glass_pane"),
            new Mapping(160, 11, "stained_glass_pane", "blue_stained_glass_pane"),
            new Mapping(160, 12, "stained_glass_pane", "brown_stained_glass_pane"),
            new Mapping(160, 13, "stained_glass_pane", "green_stained_glass_pane"),
            new Mapping(160, 14, "stained_glass_pane", "red_stained_glass_pane"),
            new Mapping(160, 15, "stained_glass_pane", "black_stained_glass_pane"),
            new Mapping(161, "leaves_2", "acacia_leaves"),
            new Mapping(161, 1, "leaves_2", "dark_oak_leaves"),
            new Mapping(162, "log_2", "acacia_log"),
            new Mapping(162, 1, "log_2", "dark_oak_log"),
            new Mapping(162, 12, "log_2", "acacia_wood"),
            new Mapping(162, 13, "log_2", "dark_oak_wood"),
            new Mapping(163, "acacia_stairs", "acacia_stairs"),
            new Mapping(164, "dark_oak_stairs", "dark_oak_stairs"),
            new Mapping(165, "slime_block", "slime_block"),
            new Mapping(166, "barrier", "barrier"),
            new Mapping(167, "iron_trapdoor", "iron_trapdoor"),
            new Mapping(168, "prismarine"),
            new Mapping(168, 1, "prismarine", "prismarine_bricks"),
            new Mapping(168, 2, "prismarine", "dark_prismarine"),
            new Mapping(169, "sea_lantern"),
            new Mapping(170, "hay_block"),
            new Mapping(171, "carpet", "white_carpet"),
            new Mapping(171, 1, "carpet", "orange_carpet"),
            new Mapping(171, 2, "carpet", "magenta_carpet"),
            new Mapping(171, 3, "carpet", "light_blue_carpet"),
            new Mapping(171, 4, "carpet", "yellow_carpet"),
            new Mapping(171, 5, "carpet", "lime_carpet"),
            new Mapping(171, 6, "carpet", "pink_carpet"),
            new Mapping(171, 7, "carpet", "gray_carpet"),
            new Mapping(171, 8, "carpet", "light_gray_carpet"),
            new Mapping(171, 9, "carpet", "cyan_carpet"),
            new Mapping(171, 10, "carpet", "purple_carpet"),
            new Mapping(171, 11, "carpet", "blue_carpet"),
            new Mapping(171, 12, "carpet", "brown_carpet"),
            new Mapping(171, 13, "carpet", "green_carpet"),
            new Mapping(171, 14, "carpet", "red_carpet"),
            new Mapping(171, 15, "carpet", "black_carpet"),
            new Mapping(172, "hard_clay", "terracotta"),
            new Mapping(173, "coal_block"),
            new Mapping(174, "packed_ice"),
            new Mapping(175, "double_plant", "sunflower"),
            new Mapping(175, 1, "double_plant", "lilac"),
            new Mapping(175, 2, "double_plant", "tall_grass"),
            new Mapping(175, 3, "double_plant", "large_fern"),
            new Mapping(175, 4, "double_plant", "rose_bush"),
            new Mapping(175, 5, "double_plant", "peony"),
            new Mapping(176, "standing_banner", new Note("now under their color names")),
            new Mapping(177, "wall_banner", new Note("now under their color names")),
            new Mapping(178, "daylight_detector_inverted", new Note("merged with daylight detector, only available via state")),
            new Mapping(179, "red_sandstone", "red_sandstone"),
            new Mapping(179, 1, "red_sandstone", "chiseled_red_sandstone"),
            new Mapping(179, 2, "red_sandstone", "cut_red_sandstone"),
            new Mapping(180, "red_sandstone_stairs"),
            new Mapping(181, "double_stone_slab2", new Note("now merged with normal red sandstone slab, only available via state")),
            new Mapping(181, 8, "double_stone_slab2", "smooth_red_sandstone"),
            new Mapping(182, "stone_slab2", "red_sandstone_slab"),
            new Mapping(183, "spruce_fence_gate"),
            new Mapping(184, "birch_fence_gate"),
            new Mapping(185, "jungle_fence_gate"),
            new Mapping(186, "dark_oak_fence_gate"),
            new Mapping(187, "acacia_fence_gate"),
            new Mapping(188, "spruce_fence"),
            new Mapping(189, "birch_fence"),
            new Mapping(190, "jungle_fence"),
            new Mapping(191, "dark_oak_fence"),
            new Mapping(192, "acacia_fence"),
            new Mapping(193, "spruce_door"),
            new Mapping(194, "birch_door"),
            new Mapping(195, "jungle_door"),
            new Mapping(196, "acacia_door"),
            new Mapping(197, "dark_oak_door"),
            new Mapping(198, "end_rod"),
            new Mapping(199, "chorus_plant"),
            new Mapping(200, "chorus_flower"),
            new Mapping(201, "purpur_block"),
            new Mapping(202, "purpur_pillar"),
            new Mapping(203, "purpur_stairs"),
            new Mapping(204, "purpur_double_slab", new Note("now merged with normal purpur slab, only available via state")),
            new Mapping(205, "purpur_slab"),
            new Mapping(206, "end_bricks", "end_stone_bricks"),
            new Mapping(207, "beetroot_block", "beetroots"),
            new Mapping(208, "grass_path"),
            new Mapping(209, "end_gateway"),
            new Mapping(210, "command_repeating", "repeating_command_block"),
            new Mapping(211, "command_chain", "chain_command_block"),
            new Mapping(212, "frosted_ice"),
            new Mapping(213, "magma", "magma_block"),
            new Mapping(214, "nether_wart_block"),
            new Mapping(215, "red_nether_brick", "red_nether_bricks"),
            new Mapping(216, "bone_block"),
            new Mapping(217, "structure_void"),
            new Mapping(218, "observer"),
            new Mapping(219, "white_shulker_box"),
            new Mapping(220, "orange_shulker_box"),
            new Mapping(221, "magenta_shulker_box"),
            new Mapping(222, "light_blue_shulker_box"),
            new Mapping(223, "yellow_shulker_box"),
            new Mapping(224, "lime_shulker_box"),
            new Mapping(225, "pink_shulker_box"),
            new Mapping(226, "gray_shulker_box"),
            new Mapping(227, "silver_shulker_box", "light_gray_shulker_box"),
            new Mapping(228, "cyan_shulker_box"),
            new Mapping(229, "purple_shulker_box", "shulker_box"),
            new Mapping(230, "blue_shulker_box"),
            new Mapping(231, "brown_shulker_box"),
            new Mapping(232, "green_shulker_box"),
            new Mapping(233, "red_shulker_box"),
            new Mapping(234, "black_shulker_box"),
            new Mapping(235, "white_glazed_terracotta"),
            new Mapping(236, "orange_glazed_terracotta"),
            new Mapping(237, "magenta_glazed_terracotta"),
            new Mapping(238, "light_blue_glazed_terracotta"),
            new Mapping(239, "yellow_glazed_terracotta"),
            new Mapping(240, "lime_glazed_terracotta"),
            new Mapping(241, "pink_glazed_terracotta"),
            new Mapping(242, "gray_glazed_terracotta"),
            new Mapping(243, "silver_glazed_terracotta", "light_gray_glazed_terracotta"),
            new Mapping(244, "cyan_glazed_terracotta"),
            new Mapping(245, "purple_glazed_terracotta"),
            new Mapping(246, "blue_glazed_terracotta"),
            new Mapping(247, "brown_glazed_terracotta"),
            new Mapping(248, "green_glazed_terracotta"),
            new Mapping(249, "red_glazed_terracotta"),
            new Mapping(250, "black_glazed_terracotta"),
            new Mapping(251, "concrete", "white_concrete"),
            new Mapping(251, 1, "concrete", "orange_concrete"),
            new Mapping(251, 2, "concrete", "magenta_concrete"),
            new Mapping(251, 3, "concrete", "light_blue_concrete"),
            new Mapping(251, 4, "concrete", "yellow_concrete"),
            new Mapping(251, 5, "concrete", "lime_concrete"),
            new Mapping(251, 6, "concrete", "pink_concrete"),
            new Mapping(251, 7, "concrete", "gray_concrete"),
            new Mapping(251, 8, "concrete", "light_gray_concrete"),
            new Mapping(251, 9, "concrete", "cyan_concrete"),
            new Mapping(251, 10, "concrete", "purple_concrete"),
            new Mapping(251, 11, "concrete", "blue_concrete"),
            new Mapping(251, 12, "concrete", "brown_concrete"),
            new Mapping(251, 13, "concrete", "green_concrete"),
            new Mapping(251, 14, "concrete", "red_concrete"),
            new Mapping(251, 15, "concrete", "black_concrete"),
            new Mapping(252, "concrete_powder", "white_concrete_powder"),
            new Mapping(252, 1, "concrete_powder", "orange_concrete_powder"),
            new Mapping(252, 2, "concrete_powder", "magenta_concrete_powder"),
            new Mapping(252, 3, "concrete_powder", "light_blue_concrete_powder"),
            new Mapping(252, 4, "concrete_powder", "yellow_concrete_powder"),
            new Mapping(252, 5, "concrete_powder", "lime_concrete_powder"),
            new Mapping(252, 6, "concrete_powder", "pink_concrete_powder"),
            new Mapping(252, 7, "concrete_powder", "gray_concrete_powder"),
            new Mapping(252, 8, "concrete_powder", "light_gray_concrete_powder"),
            new Mapping(252, 9, "concrete_powder", "cyan_concrete_powder"),
            new Mapping(252, 10, "concrete_powder", "purple_concrete_powder"),
            new Mapping(252, 11, "concrete_powder", "blue_concrete_powder"),
            new Mapping(252, 12, "concrete_powder", "brown_concrete_powder"),
            new Mapping(252, 13, "concrete_powder", "green_concrete_powder"),
            new Mapping(252, 14, "concrete_powder", "red_concrete_powder"),
            new Mapping(252, 15, "concrete_powder", "black_concrete_powder"),
            new Mapping(255, "structure_block"),
            new Mapping(256, "iron_spade", "iron_shovel"),
            new Mapping(257, "iron_pickaxe"),
            new Mapping(258, "iron_axe"),
            new Mapping(259, "flint_and_steel"),
            new Mapping(260, "apple"),
            new Mapping(261, "bow"),
            new Mapping(262, "arrow"),
            new Mapping(263, "coal"),
            new Mapping(263, 1, "coal", "charcoal"),
            new Mapping(264, "diamond"),
            new Mapping(265, "iron_ingot"),
            new Mapping(266, "gold_ingot"),
            new Mapping(267, "iron_sword"),
            new Mapping(268, "wood_sword", "wooden_sword"),
            new Mapping(269, "wood_spade", "wooden_shovel"),
            new Mapping(270, "wood_pickaxe", "wooden_pickaxe"),
            new Mapping(271, "wood_axe", "wooden_axe"),
            new Mapping(272, "stone_sword"),
            new Mapping(273, "stone_spade", "stone_shovel"),
            new Mapping(274, "stone_pickaxe"),
            new Mapping(275, "stone_axe"),
            new Mapping(276, "diamond_sword"),
            new Mapping(277, "diamond_spade", "diamond_shovel"),
            new Mapping(278, "diamond_pickaxe"),
            new Mapping(279, "diamond_axe"),
            new Mapping(280, "stick"),
            new Mapping(281, "bowl"),
            new Mapping(282, "mushroom_soup", "mushroom_stew"),
            new Mapping(283, "gold_sword", "golden_sword"),
            new Mapping(284, "gold_spade", "golden_shovel"),
            new Mapping(285, "gold_pickaxe", "golden_pickaxe"),
            new Mapping(286, "gold_axe", "golden_axe"),
            new Mapping(287, "string"),
            new Mapping(288, "feather"),
            new Mapping(289, "sulphur", "gunpowder"),
            new Mapping(290, "wood_hoe", "wooden_hoe"),
            new Mapping(291, "stone_hoe"),
            new Mapping(292, "iron_hoe"),
            new Mapping(293, "diamond_hoe"),
            new Mapping(294, "gold_hoe", "golden_hoe"),
            new Mapping(295, "seeds", "wheat_seeds"),
            new Mapping(296, "wheat"),
            new Mapping(297, "bread"),
            new Mapping(298, "leather_helmet"),
            new Mapping(299, "leather_chestplate"),
            new Mapping(300, "leather_leggings"),
            new Mapping(301, "leather_boots"),
            new Mapping(302, "chainmail_helmet"),
            new Mapping(303, "chainmail_chestplate"),
            new Mapping(304, "chainmail_leggings"),
            new Mapping(305, "chainmail_boots"),
            new Mapping(306, "iron_helmet"),
            new Mapping(307, "iron_chestplate"),
            new Mapping(308, "iron_leggings"),
            new Mapping(309, "iron_boots"),
            new Mapping(310, "diamond_helmet"),
            new Mapping(311, "diamond_chestplate"),
            new Mapping(312, "diamond_leggings"),
            new Mapping(313, "diamond_boots"),
            new Mapping(314, "gold_helmet", "golden_helmet"),
            new Mapping(315, "gold_chestplate", "golden_chestplate"),
            new Mapping(316, "gold_leggings", "golden_leggings"),
            new Mapping(317, "gold_boots", "golden_boots"),
            new Mapping(318, "flint"),
            new Mapping(319, "pork", "porkchop"),
            new Mapping(320, "grilled_pork", "cooked_porkchop"),
            new Mapping(321, "painting"),
            new Mapping(322, "golden_apple", "golden_apple"),
            new Mapping(322, 1, "golden_apple", "enchanted_golden_apple"),
            new Mapping(323, "sign"),
            new Mapping(324, "wood_door", "oak_door"),
            new Mapping(325, "bucket"),
            new Mapping(326, "water_bucket"),
            new Mapping(327, "lava_bucket"),
            new Mapping(328, "minecart"),
            new Mapping(329, "saddle"),
            new Mapping(330, "iron_door"),
            new Mapping(331, "redstone"),
            new Mapping(332, "snow_ball", "snowball"),
            new Mapping(333, "boat", "oak_boat"),
            new Mapping(334, "leather"),
            new Mapping(335, "milk_bucket"),
            new Mapping(336, "clay_brick", "brick"),
            new Mapping(337, "clay_ball"),
            new Mapping(338, "sugar_cane"),
            new Mapping(339, "paper"),
            new Mapping(340, "book"),
            new Mapping(341, "slime_ball"),
            new Mapping(342, "storage_minecart", "chest_minecart"),
            new Mapping(343, "powered_minecart", "furnace_minecart"),
            new Mapping(344, "egg"),
            new Mapping(345, "compass"),
            new Mapping(346, "fishing_rod"),
            new Mapping(347, "watch", "clock"),
            new Mapping(348, "glowstone_dust"),
            new Mapping(349, "raw_fish", "cod"),
            new Mapping(349, 1, "raw_fish", "salmon"),
            new Mapping(349, 2, "raw_fish", "tropical_fish"),
            new Mapping(349, 3, "raw_fish", "pufferfish"),
            new Mapping(350, "cooked_fish", "cooked_cod"),
            new Mapping(350, 1, "cooked_fish", "cooked_salmon"),
            new Mapping(351, "ink_sack", "ink_sac"),
            new Mapping(351, 1, "ink_sack", "rose_red"),
            new Mapping(351, 2, "ink_sack", "cactus_green"),
            new Mapping(351, 3, "ink_sack", "cocoa_beans"),
            new Mapping(351, 4, "ink_sack", "lapis_lazuli"),
            new Mapping(351, 5, "ink_sack", "purple_dye"),
            new Mapping(351, 6, "ink_sack", "cyan_dye"),
            new Mapping(351, 7, "ink_sack", "light_gray_dye"),
            new Mapping(351, 8, "ink_sack", "gray_dye"),
            new Mapping(351, 9, "ink_sack", "pink_dye"),
            new Mapping(351, 10, "ink_sack", "lime_dye"),
            new Mapping(351, 11, "ink_sack", "dandelion_yellow"),
            new Mapping(351, 12, "ink_sack", "light_blue_dye"),
            new Mapping(351, 13, "ink_sack", "magenta_dye"),
            new Mapping(351, 14, "ink_sack", "orange_dye"),
            new Mapping(351, 15, "ink_sack", "bone_meal"),
            new Mapping(352, "bone"),
            new Mapping(353, "sugar", "sugar"),
            new Mapping(354, "cake", "cake"),
            new Mapping(355, "bed", "white_bed"),
            new Mapping(355, 1, "bed", "orange_bed"),
            new Mapping(355, 2, "bed", "magenta_bed"),
            new Mapping(355, 3, "bed", "light_blue_bed"),
            new Mapping(355, 4, "bed", "yellow_bed"),
            new Mapping(355, 5, "bed", "lime_bed"),
            new Mapping(355, 6, "bed", "pink_bed"),
            new Mapping(355, 7, "bed", "gray_bed"),
            new Mapping(355, 8, "bed", "light_gray_bed"),
            new Mapping(355, 9, "bed", "cyan_bed"),
            new Mapping(355, 10, "bed", "purple_bed"),
            new Mapping(355, 11, "bed", "blue_bed"),
            new Mapping(355, 12, "bed", "brown_bed"),
            new Mapping(355, 13, "bed", "green_bed"),
            new Mapping(355, 14, "bed", "red_bed"),
            new Mapping(355, 15, "bed", "black_bed"),
            new Mapping(356, "diode", "repeater"),
            new Mapping(357, "cookie", "cookie"),
            new Mapping(358, "map", "filled_map"),
            new Mapping(359, "shears"),
            new Mapping(360, "melon", "melon"),
            new Mapping(361, "pumpkin_seeds", "pumpkin_seeds"),
            new Mapping(362, "melon_seeds", "melon_seeds"),
            new Mapping(363, "raw_beef", "beef"),
            new Mapping(364, "cooked_beef"),
            new Mapping(365, "raw_chicken", "chicken"),
            new Mapping(366, "cooked_chicken"),
            new Mapping(367, "rotten_flesh"),
            new Mapping(368, "ender_pearl"),
            new Mapping(369, "blaze_rod"),
            new Mapping(370, "ghast_tear"),
            new Mapping(371, "gold_nugget"),
            new Mapping(372, "nether_stalk", "nether_wart"),
            new Mapping(373, "potion", "potion"),
            new Mapping(374, "glass_bottle"),
            new Mapping(375, "spider_eye"),
            new Mapping(376, "fermented_spider_eye"),
            new Mapping(377, "blaze_powder"),
            new Mapping(378, "magma_cream"),
            new Mapping(379, "brewing_stand_item", "brewing_stand"),
            new Mapping(380, "cauldron_item", "cauldron"),
            new Mapping(381, "eye_of_ender", "ender_eye"),
            new Mapping(382, "speckled_melon", "glistering_melon_slice"),
            new Mapping(383, "monster_egg", new Note("each spawn egg now has it's own id corresponding to the entity id. other data is set via nbt tags/meta")),
            new Mapping(383, 4, "monster_egg", "elder_guardian_spawn_egg"),
            new Mapping(383, 5, "monster_egg", "wither_skeleton_spawn_egg"),
            new Mapping(383, 6, "monster_egg", "stray_spawn_egg"),
            new Mapping(383, 23, "monster_egg", "husk_spawn_egg"),
            new Mapping(383, 27, "monster_egg", "zombie_villager_spawn_egg"),
            new Mapping(383, 28, "monster_egg", "skeleton_horse_spawn_egg"),
            new Mapping(383, 29, "monster_egg", "zombie_horse_spawn_egg"),
            new Mapping(383, 31, "monster_egg", "donkey_spawn_egg"),
            new Mapping(383, 32, "monster_egg", "mule_spawn_egg"),
            new Mapping(383, 34, "monster_egg", "evocation_illager_spawn_egg"),
            new Mapping(383, 35, "monster_egg", "vex_spawn_egg"),
            new Mapping(383, 36, "monster_egg", "vindication_illager_spawn_egg"),
            new Mapping(383, 50, "monster_egg", "creeper_spawn_egg"),
            new Mapping(383, 51, "monster_egg", "skeleton_spawn_egg"),
            new Mapping(383, 52, "monster_egg", "spider_spawn_egg"),
            new Mapping(383, 54, "monster_egg", "zombie_spawn_egg"),
            new Mapping(383, 55, "monster_egg", "slime_spawn_egg"),
            new Mapping(383, 56, "monster_egg", "ghast_spawn_egg"),
            new Mapping(383, 57, "monster_egg", "zombie_pigman_spawn_egg"),
            new Mapping(383, 58, "monster_egg", "enderman_spawn_egg"),
            new Mapping(383, 59, "monster_egg", "cave_spider_spawn_egg"),
            new Mapping(383, 60, "monster_egg", "silverfish_spawn_egg"),
            new Mapping(383, 61, "monster_egg", "blaze_spawn_egg"),
            new Mapping(383, 62, "monster_egg", "magma_cube_spawn_egg"),
            new Mapping(383, 65, "monster_egg", "bat_spawn_egg"),
            new Mapping(383, 66, "monster_egg", "witch_spawn_egg"),
            new Mapping(383, 67, "monster_egg", "endermite_spawn_egg"),
            new Mapping(383, 68, "monster_egg", "guardian_spawn_egg"),
            new Mapping(383, 69, "monster_egg", "shulker_spawn_egg"),
            new Mapping(383, 90, "monster_egg", "pig_spawn_egg"),
            new Mapping(383, 91, "monster_egg", "sheep_spawn_egg"),
            new Mapping(383, 92, "monster_egg", "cow_spawn_egg"),
            new Mapping(383, 93, "monster_egg", "chicken_spawn_egg"),
            new Mapping(383, 94, "monster_egg", "squid_spawn_egg"),
            new Mapping(383, 95, "monster_egg", "wolf_spawn_egg"),
            new Mapping(383, 96, "monster_egg", "mooshroom_spawn_egg"),
            new Mapping(383, 98, "monster_egg", "ocelot_spawn_egg"),
            new Mapping(383, 100, "monster_egg", "horse_spawn_egg"),
            new Mapping(383, 101, "monster_egg", "rabbit_spawn_egg"),
            new Mapping(383, 102, "monster_egg", "polar_bear_spawn_egg"),
            new Mapping(383, 103, "monster_egg", "llama_spawn_egg"),
            new Mapping(383, 120, "monster_egg", "villager_spawn_egg"),
            new Mapping(384, "exp_bottle", "experience_bottle"),
            new Mapping(385, "fireball", "fire_charge"),
            new Mapping(386, "book_and_quill", "writable_book"),
            new Mapping(387, "written_book"),
            new Mapping(388, "emerald"),
            new Mapping(389, "item_frame"),
            new Mapping(390, "flower_pot_item", "flower_pot"),
            new Mapping(391, "carrot_item", "carrot"),
            new Mapping(392, "potato_item", "potato"),
            new Mapping(393, "baked_potato"),
            new Mapping(394, "poisonous_potato"),
            new Mapping(395, "empty_map", "map"),
            new Mapping(396, "golden_carrot"),
            new Mapping(397, "skull_item", "skeleton_skull"),
            new Mapping(397, 1, "skull_item", "wither_skeleton_skull"),
            new Mapping(397, 2, "skull_item", "zombie_head"),
            new Mapping(397, 3, "skull_item", "player_head"),
            new Mapping(397, 4, "skull_item", "creeper_head"),
            new Mapping(397, 5, "skull_item", "dragon_head"),
            new Mapping(398, "carrot_stick"),
            new Mapping(399, "nether_star"),
            new Mapping(400, "pumpkin_pie"),
            new Mapping(401, "firework", "firework_rocket"),
            new Mapping(402, "firework_charge", "firework_star"),
            new Mapping(403, "enchanted_book"),
            new Mapping(404, "redstone_comparator", "comparator"),
            new Mapping(405, "nether_brick_item", "nether_brick"),
            new Mapping(406, "quartz"),
            new Mapping(407, "explosive_minecart", "tnt_minecart"),
            new Mapping(408, "hopper_minecart"),
            new Mapping(409, "prismarine_shard"),
            new Mapping(410, "prismarine_crystals"),
            new Mapping(411, "rabbit"),
            new Mapping(412, "cooked_rabbit"),
            new Mapping(413, "rabbit_stew"),
            new Mapping(414, "rabbit_foot"),
            new Mapping(415, "rabbit_hide"),
            new Mapping(416, "armor_stand"),
            new Mapping(417, "iron_barding", "iron_horse_armor"),
            new Mapping(418, "gold_barding", "gold_horse_armor"),
            new Mapping(419, "diamond_barding", "diamond_horse_armor"),
            new Mapping(420, "leash", "lead"),
            new Mapping(421, "name_tag"),
            new Mapping(422, "command_minecart", "command_block_minecart"),
            new Mapping(423, "mutton"),
            new Mapping(424, "cooked_mutton"),
            new Mapping(425, "banner", "white_banner"),
            new Mapping(425, 1, "banner", "orange_banner"),
            new Mapping(425, 2, "banner", "magenta_banner"),
            new Mapping(425, 3, "banner", "light_blue_banner"),
            new Mapping(425, 4, "banner", "yellow_banner"),
            new Mapping(425, 5, "banner", "lime_banner"),
            new Mapping(425, 6, "banner", "pink_banner"),
            new Mapping(425, 7, "banner", "gray_banner"),
            new Mapping(425, 8, "banner", "light_gray_banner"),
            new Mapping(425, 9, "banner", "cyan_banner"),
            new Mapping(425, 10, "banner", "purple_banner"),
            new Mapping(425, 11, "banner", "blue_banner"),
            new Mapping(425, 12, "banner", "brown_banner"),
            new Mapping(425, 13, "banner", "green_banner"),
            new Mapping(425, 14, "banner", "red_banner"),
            new Mapping(425, 15, "banner", "black_banner"),
            new Mapping(426, "end_crystal"),
            new Mapping(427, "spruce_door_item", "spruce_door"),
            new Mapping(428, "birch_door_item", "birch_door"),
            new Mapping(429, "jungle_door_item", "jungle_door"),
            new Mapping(430, "acacia_door_item", "acacia_door"),
            new Mapping(431, "dark_oak_door_item", "dark_oak_door"),
            new Mapping(432, "chorus_fruit"),
            new Mapping(433, "chorus_fruit_popped"),
            new Mapping(434, "beetroot"),
            new Mapping(435, "beetroot_seeds"),
            new Mapping(436, "beetroot_soup"),
            new Mapping(437, "dragons_breath", "dragon_breath"),
            new Mapping(438, "splash_potion"),
            new Mapping(439, "spectral_arrow"),
            new Mapping(440, "tipped_arrow"),
            new Mapping(441, "lingering_potion"),
            new Mapping(442, "shield"),
            new Mapping(443, "elytra"),
            new Mapping(444, "boat_spruce", "spruce_boat"),
            new Mapping(445, "boat_birch", "birch_boat"),
            new Mapping(446, "boat_jungle", "jungle_boat"),
            new Mapping(447, "boat_acacia", "acacia_boat"),
            new Mapping(448, "boat_dark_oak", "dark_oak_boat"),
            new Mapping(449, "totem", "totem_of_undying"),
            new Mapping(450, "shulker_shell"),
            new Mapping(452, "iron_nugget"),
            new Mapping(453, "knowledge_book"),
            new Mapping(2256, "gold_record", "music_disc_13"),
            new Mapping(2257, "green_record", "music_disc_cat"),
            new Mapping(2258, "record_3", "music_disc_blocks"),
            new Mapping(2259, "record_4", "music_disc_chirp"),
            new Mapping(2260, "record_5", "music_disc_far"),
            new Mapping(2261, "record_6", "music_disc_mall"),
            new Mapping(2262, "record_7", "music_disc_mellohi"),
            new Mapping(2263, "record_8", "music_disc_stal"),
            new Mapping(2264, "record_9", "music_disc_strad"),
            new Mapping(2265, "record_10", "music_disc_ward"),
            new Mapping(2266, "record_11", "music_disc_11"),
            new Mapping(2267, "record_12", "music_disc_wait")
    };

    private final static Map<String, Mapping> BY_NUMERIC_ID = new HashMap<>();
    private final static Map<String, Mapping> BY_LEGACY_NAME = new HashMap<>();
    private final static Map<String, Mapping> BY_FLATTENING_NAME = new HashMap<>();
    private static final String INTERNAL_DELIMITER = ":";

    static {
        for (Mapping mapping : MAPPINGS) {
            if (mapping.getNumericId() >= 0) {
                BY_NUMERIC_ID.put(mapping.getNumericId() + INTERNAL_DELIMITER + mapping.getData(), mapping);
                if (mapping.getData() == 0) {
                    BY_NUMERIC_ID.put(String.valueOf(mapping.getNumericId()), mapping);
                }
            }
            if (mapping.getLegacyType() != null) {
                BY_LEGACY_NAME.put(mapping.getLegacyType() + INTERNAL_DELIMITER + mapping.getData(), mapping);
                if (mapping.getData() == 0) {
                    BY_LEGACY_NAME.put(mapping.getLegacyType(), mapping);
                }
            }
            if (mapping.getFlatteningType() != null) {
                BY_FLATTENING_NAME.put(mapping.getFlatteningType(), mapping);
            }
        }
    }

    public static Mapping get(IdType type, String id, String delimiter) {
        if (delimiter != null) {
            Mapping mapping = get(type, id.replace(delimiter, INTERNAL_DELIMITER));
            if (mapping != null) {
                return mapping;
            }
        }
        return get(type, id);
    }

    public static Mapping get(IdType type, String id) {
        switch (type) {
            case NUMERIC:
                return getById(id);
            case LEGACY:
                return getByLegacyType(id);
            case FLATTENING:
                return getByFlatteningType(id);
            default:
                throw new IllegalArgumentException(type + " is not a valid map type.");
        }
    }

    public static Mapping getById(String id) {
        return BY_NUMERIC_ID.get(id.toUpperCase(Locale.ENGLISH));
    }

    public static Mapping getByLegacyType(String oldType) {
        return BY_LEGACY_NAME.get(oldType.toUpperCase(Locale.ENGLISH));
    }

    public static Mapping getByFlatteningType(String flatteningType) {
        return BY_FLATTENING_NAME.get(flatteningType.toUpperCase(Locale.ENGLISH));
    }

    public static class Mapping {
        private final String flatteningType;
        private final String legacyType;
        private final int numericId;
        private final int data;
        private Note note = null;

        public Mapping(int numericId, int data, String legacyType, String flatteningType) {
            this.flatteningType = flatteningType != null ? flatteningType.toUpperCase(Locale.ENGLISH) : null;
            this.legacyType = legacyType != null ? legacyType.toUpperCase(Locale.ENGLISH) : null;
            this.numericId = numericId;
            this.data = data;
        }

        public Mapping(int numericId, String legacyType, String flatteningType) {
            this(numericId, 0, legacyType, flatteningType);
        }

        public Mapping(int numericId, int data, String type) {
            this(numericId, data, type, type);
        }

        public Mapping(int numericId, String type) {
            this(numericId, 0, type);
        }

        public Mapping(int numericId, String oldType, Note note) {
            this(numericId, oldType, (String) null);
            this.note = note;
        }

        public Mapping(int numericId, int data, String oldType, Note note) {
            this(numericId, data, oldType, (String) null);
            this.note = note;
        }

        public String getFlatteningType() {
            return flatteningType;
        }

        public String getLegacyType() {
            return legacyType;
        }

        public int getNumericId() {
            return numericId;
        }

        public int getData() {
            return data;
        }

        public String get(IdType type) {
            return get(type, null);
        }

        public String get(IdType type, String delimiter) {
            switch (type) {
                case NUMERIC:
                    if (delimiter != null && data != 0) {
                        return getNumericId() + delimiter + getData();
                    }
                    if (getNumericId() >= 0) {
                        return String.valueOf(getNumericId());
                    }
                    return null;
                case LEGACY:
                    if (delimiter != null && data != 0) {
                        return getLegacyType() + delimiter + getData();
                    }
                    return getLegacyType();
                case FLATTENING:
                    return getFlatteningType();
                default:
                    throw new IllegalArgumentException(type + " is not a valid value.");
            }
        }

        public Note getNote() {
            return note;
        }
    }

    public enum IdType {
        NUMERIC("(\\W*: )(\\d+(:\\d+|))(\\W*)"),
        LEGACY("(\\W*: )(\\w+(:\\d+|))(\\W*)"),
        FLATTENING("(\\W*: )(\\w+)(\\W*)");

        private final String regex;

        IdType(String regex) {
            this.regex = regex;
        }

        public String getRegex() {
            return regex;
        }
    }

    public static class Note {
        private final String text;

        public Note(String text) {
            this.text = text;
        }

        public String getText() {
            return text;
        }
    }
}