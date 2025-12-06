package com.gray.chrysalis.item;

import com.gray.chrysalis.Chrysalis;
import io.redspace.ironsspellbooks.item.curios.CurioBaseItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Chrysalis.MODID);

    public static final DeferredItem<Item> DEEP_BLUE_DORMANT_CURIO = ITEMS.register("deep_blue_dormant",
            () -> new Item(new Item.Properties()));

    // dormant deep blue
    public static final Supplier<CurioBaseItem> DEEP_BLUE_DORMANT_CURIO = ITEMS.register("deep_blue_dormant",DeepBlueDormantCurio::new);

    public static void register(IEventBus eventBus){
    ITEMS.register(eventBus);}
}
