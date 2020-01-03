package com.aranha.chickscangrown.blocks;

import net.minecraft.inventory.container.ContainerType;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.registries.ObjectHolder;

public class ModBlocks {

    @ObjectHolder("chickscangrown:incubator")
    public static Incubator INCUBATOR;

    @ObjectHolder("chickscangrown:incubator")
    public static TileEntityType<IncubatorTile> INCUBATOR_TILE;

    @ObjectHolder("chickscangrown:incubator")
    public static ContainerType<IncubatorContainer> INCUBATOR_CONTAINER;
}
