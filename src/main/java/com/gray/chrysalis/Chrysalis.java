package com.gray.chrysalis;

import com.gray.chrysalis.item.ModItems;
import net.neoforged.bus.EventBus;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.neoforge.common.NeoForge;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraft.client.Minecraft;
import net.neoforged.neoforge.registries.DeferredRegister;
// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(Chrysalis.MODID)
public class Chrysalis {
    // Define mod id in a common place for everything to reference
    public static final String MODID = "chrysalis";
    // Directly reference a slf4j logger
    public static final Logger LOGGER = LogUtils.getLogger();
        public Chrysalis(IEventBus modEventBus, ModContainer modContainer)
        { // NeoForge.EVENT_BUS.register(this);
          ModItems.register(modEventBus);

        }




    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @EventBusSubscriber(modid = Chrysalis.MODID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    static class ClientModEvents {
        @SubscribeEvent
        static void onClientSetup(FMLClientSetupEvent event) {
            // Some client setup code
            LOGGER.info("HELLO FROM CLIENT SETUP");
            LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance().getUser().getName());
        }
    }
}
