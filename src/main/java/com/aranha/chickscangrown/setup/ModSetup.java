package com.aranha.chickscangrown.setup;

import com.aranha.chickscangrown.blocks.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModSetup {

    public ItemGroup ItemGroup = new ItemGroup("chickscangrown") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModBlocks.INCUBATOR);
        }
    };

    public void init() {

    }
}
