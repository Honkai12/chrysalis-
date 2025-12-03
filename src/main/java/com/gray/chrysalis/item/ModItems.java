package com.gray.chrysalis.item;

import com.gray.chrysalis.Chrysalis;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Chrysalis.MODID);

    public static void register(IEventBus eventBus){
    ITEMS.register(eventBus);}
}
