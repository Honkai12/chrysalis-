package com.gray.chrysalis.item;

import com.gray.chrysalis.Chrysalis;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Chrysalis.MODID);

    public static final DeferredItem<Item> DEEP_BLUE_DORMANT_CURIO = ITEMS.register("dormant deep blue",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus){
    ITEMS.register(eventBus);}
}
