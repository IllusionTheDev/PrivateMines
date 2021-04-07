package me.bristermitten.privatemines.worldedit;

import com.boydti.fawe.FaweAPI;
import com.boydti.fawe.util.EditSessionBuilder;
import com.sk89q.worldedit.EditSession;
import com.sk89q.worldedit.Vector;
import com.sk89q.worldedit.blocks.BaseBlock;
import com.sk89q.worldedit.patterns.BlockChance;
import com.sk89q.worldedit.patterns.RandomFillPattern;
import com.sk89q.worldedit.regions.CuboidRegion;
import com.sk89q.worldedit.regions.Region;
import me.bristermitten.privatemines.PrivateMines;
import me.bristermitten.privatemines.data.MineSchematic;
import org.bukkit.inventory.ItemStack;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class LegacyWEHook implements WorldEditHook {

    public static Region transform(WorldEditRegion region) {
        return new CuboidRegion(
                FaweAPI.getWorld(region.getWorld().getName()),
                transform(region.getMinimumPoint()),
                transform(region.getMaximumPoint())
        );
    }

    public static Vector transform(WorldEditVector vector) {
        return new Vector(vector.getX(), vector.getY(), vector.getZ());
    }

    public static WorldEditVector transform(Vector vector) {
        return new WorldEditVector(vector.getX(), vector.getY(), vector.getZ());
    }

    public void fill(WorldEditRegion region) {
        final EditSession session = new EditSessionBuilder(FaweAPI.getWorld(region.getWorld().getName()))
                .fastmode(true)
                .build();

        List<BlockChance> blockChance = new ArrayList<>();
        BlockChance ironOre = new BlockChance(new BaseBlock(15), 33.33);
        BlockChance coalOre = new BlockChance(new BaseBlock(16), 33.33);
        BlockChance stone = new BlockChance(new BaseBlock(1), 33.33);

        blockChance.add(ironOre);
        blockChance.add(coalOre);
        blockChance.add(stone);

        RandomFillPattern randomFillPattern = new RandomFillPattern(blockChance);

        //noinspection deprecation
            session.setBlocks(transform(region), randomFillPattern);
            session.flushQueue();
        }

    @Override
    public MineFactoryCompat<?> createMineFactoryCompat() {
        return new LegacyWEMineFactoryCompat(PrivateMines.getPlugin().getMineManager()); //Have to use static here because our compat module can't depend on the main plugin module :(
    }

    @Override
    public MineSchematic<?> loadMineSchematic(String name, List<String> description, File file, ItemStack item) {
        return new LegacyWEMineSchematic(name, description, file, item);
    }
}
