package com.mlyvit.simplemod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties CUCUMBER = (new FoodProperties.Builder()).fast().nutrition(2).saturationMod(0.2F)
            .effect(new MobEffectInstance(MobEffects.INVISIBILITY, 300, 0), 1f).build();

}
