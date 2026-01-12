package com.gray.chrysalis.item;

import com.gray.chrysalis.Chrysalis;
import com.gray.chrysalis.item.curios.DeepBlueDormantCurio;
import com.gray.chrysalis.item.curios.OvergrownJadeDormantCurio;
import com.gray.chrysalis.item.curios.ThunderingDrakeDormantCurio;
import io.redspace.ironsspellbooks.item.curios.CurioBaseItem;
import net.neoforged.bus.api.IEventBus;
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

    public static void register(IEventBus eventBus){
    ITEMS.register(eventBus);}
}
