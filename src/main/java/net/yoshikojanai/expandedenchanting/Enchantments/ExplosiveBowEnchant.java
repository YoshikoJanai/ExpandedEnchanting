package net.yoshikojanai.expandedenchanting.Enchantments;

import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;

import java.util.Map;

public class ExplosiveBowEnchant extends ExpandedEnchantment {
    protected ExplosiveBowEnchant(Weight weight, EnchantmentTarget type, EquipmentSlot[] slotTypes) {
        super(weight, type, slotTypes);
    }

    @Override
    public Tier getEnchantmentTier() {
        return Tier.One;
    }

    @Override
    public Map<EquipmentSlot, ItemStack> getEquipment(LivingEntity livingEntity) {
        return super.getEquipment(livingEntity);
    }

    @Override
    public int getMinimumLevel() {
        return 1;
    }

    @Override
    public int getMaximumLevel() {
        return 3;
    }
}
