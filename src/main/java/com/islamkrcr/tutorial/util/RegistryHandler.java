package com.islamkrcr.tutorial.util;

import com.islamkrcr.tutorial.Tutorial;
import com.islamkrcr.tutorial.blocks.BlockItemBase;
import com.islamkrcr.tutorial.blocks.ComprestObsidianBlock;
import com.islamkrcr.tutorial.items.ItemBase;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler<RegisteryObject> {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Tutorial.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Tutorial.MOD_ID);



    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());

    }

    //Items
    public static final RegistryObject<Item> OBSIDIAN_SWORD = ITEMS.register("obsidian_sword", ItemBase::new);

    //Blocks
    public static final RegistryObject<Block> COMPREST_OBSIDIAN_BLOCK = BLOCKS.register("comprest_obsidian_block", ComprestObsidianBlock::new);


    //Block Items
    public static final RegistryObject<Item> COMPREST_OBSIDIAN_BLOCK_ITEM = ITEMS.register("comprest_obsidian_block", () -> new BlockItemBase(COMPREST_OBSIDIAN_BLOCK.get()));


}
