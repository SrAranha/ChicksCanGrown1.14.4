package com.aranha.chickscangrown.items;

import com.aranha.chickscangrown.ChicksCanGrown;
import net.minecraft.item.Item;

public class Lightbulb extends Item {

    public Lightbulb() {
        super(new Item.Properties()
                .maxStackSize(16)
                .group(ChicksCanGrown.setup.ItemGroup));
        setRegistryName("lightbulb");
    }
}
