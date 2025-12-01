package com.gray.chrysalis.item.curios;
import io.redspace.ironsspellbooks.api.registry.AttributeRegistry;
import io.redspace.ironsspellbooks.item.curios.CurioBaseItem;
import io.redspace.ironsspellbooks.util.ItemPropertiesHelper;
import net.minecraft.core.Holder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.item.ItemStack;
import top.theillusivec4.curios.api.SlotContext;
public class DeepBlueDormantCurio extends CurioBaseItem {
public class DeepBlueDormantCurio(){super(ItemPropertiesHelper.equipment().stackTo(1).fireResistant().rarity(RARE));}
}
