package net.yoshikojanai.expandedenchanting.Enchantments;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;

import java.util.Map;

public class ExpandedEnchantment extends Enchantment {

    public static enum Tier {
        Vanilla,
        One,
        Two,
        Three
    }

    protected ExpandedEnchantment(Rarity weight, EnchantmentTarget type, EquipmentSlot[] slotTypes) {
        super(weight, type, slotTypes);
    }

    public Tier getEnchantmentTier(){
        
        return Tier.Vanilla;
    }

    public boolean isRelic(){
        return false;
    }

    @Override
    public Map<EquipmentSlot, ItemStack> getEquipment(LivingEntity livingEntity) {
        return super.getEquipment(livingEntity);
    }

    @Override
    public Rarity getRarity() {
        return Rarity.COMMON;
    }

    @Override
    public int getMinLevel() {
        return super.getMinLevel();
    }

    @Override
    public int getMaxLevel() {
        return super.getMaxLevel();
    }

    @Override
    public int getMinPower(int level) {
        return super.getMinPower(level);
    }

    @Override
    public int getMaxPower(int level) {
        return super.getMaxPower(level);
    }

    @Override
    public Text getName(int level) {
        return super.getName(level);
    }

    @Override
    public boolean isAcceptableItem(ItemStack stack) {
        return super.isAcceptableItem(stack);
    }

    @Override
    public boolean isTreasure() {
        return false;
    }

    @Override
    public boolean isCursed() {
        return false;
    }
}
