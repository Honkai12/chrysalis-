package com.gray.chrysalis;

import com.gray.chrysalis.item.ModItems;
import com.gray.chrysalis.item.curios.DeepBlueDormantCurio;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.NeoForge;
import org.checkerframework.checker.units.qual.C;
import top.theillusivec4.curios.api.event.DropRulesEvent;
import top.theillusivec4.curios.api.type.capability.ICurio;

import java.util.function.Predicate;

@EventBusSubscriber(modid = Chrysalis.MODID)
public class ModEvents {
    @SubscribeEvent
    private static void curioDropRules(DropRulesEvent event){
        event.addOverride(itemStack -> {return itemStack.is(ModItems.DEEP_BLUE_DORMANT_CURIO.get());}, ICurio.DropRule.ALWAYS_KEEP
        );
    }
}
