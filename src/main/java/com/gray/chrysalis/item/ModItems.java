package com.gray.chrysalis.item;

import com.gray.chrysalis.Chrysalis;
import com.gray.chrysalis.item.curios.*;
import io.redspace.ironsspellbooks.item.curios.CurioBaseItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Chrysalis.MODID);

    // dormant deep blue
    public static final Supplier<CurioBaseItem> DEEP_BLUE_DORMANT_CURIO = ITEMS.register("deep_blue_dormant", DeepBlueDormantCurio::new);
   // dormant overgrown jade
    public static final Supplier<CurioBaseItem> OVERGROWN_JADE_DORMANT_CURIO = ITEMS.register("overgrown_jade_dormant", OvergrownJadeDormantCurio::new);
   // dormant thundering drake
   public static final Supplier<CurioBaseItem> THUNDERING_DRAKE_DORMANT_CURIO = ITEMS.register("thundering_drake_dormant", ThunderingDrakeDormantCurio::new);
// dormant shattered Sanguine
public static final Supplier<CurioBaseItem> SHATTERED_SANGUINE_DORMANT_CURIO = ITEMS.register("shattered_sanguine_dormant", ShatteredSanguineDormantCurio::new);
// dormant astral friend
public static final Supplier<CurioBaseItem> ASTRAL_FRIEND_DORMANT_CURIO = ITEMS.register("astral_friend_dormant", AstralFriendDormantCurio::new);
// dormant hellbound muse
public static final Supplier<CurioBaseItem> HELLBOUND_MUSE_DORMANT_CURIO = ITEMS.register("hellbound_muse_dormant", HellboundMuseDormantCurio::new);
//darkest prism
public static final DeferredItem<Item> DARKEST_PRISM = ITEMS.register("darkest_prism",
        ()-> new Item(new Item.Properties()));
public static void register(IEventBus eventBus){
    ITEMS.register(eventBus);}
}
