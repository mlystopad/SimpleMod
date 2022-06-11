package com.mlyvit.simplemod.item;

import com.mlyvit.simplemod.SimpleMod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModItemGroup {
    public static final CreativeModeTab SIMPLE_TAB = new CreativeModeTab(SimpleMod.MOD_ID) {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.AMETHYST.get());
        }
    };
}
