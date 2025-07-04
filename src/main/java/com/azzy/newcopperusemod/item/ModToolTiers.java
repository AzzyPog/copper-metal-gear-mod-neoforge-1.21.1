package com.azzy.newcopperusemod.item;


import com.azzy.newcopperusemod.util.ModTags;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;

public class ModToolTiers {
    public static final Tier COPPER = new SimpleTier(BlockTags.INCORRECT_FOR_IRON_TOOL,
            180, 5.0f, 2.0f, 22,
            () -> Ingredient.of(Items.COPPER_INGOT));

}