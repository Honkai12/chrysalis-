package com.gray.chrysalis;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.NeoForge;
import org.checkerframework.checker.units.qual.C;
import top.theillusivec4.curios.api.event.DropRulesEvent;

@EventBusSubscriber(modid = Chrysalis.MODID,value = Dist.DEDICATED_SERVER)
public class ModEvents {
    public Chrysalis(IEventBus modBus){
        NeoForge.EVENT_BUS.addListener(Chrysalis:DropRulesEvent);

    }




}
