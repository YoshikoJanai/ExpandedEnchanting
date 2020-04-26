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
    boolean treasure = false;
    boolean curse = false;
    boolean relic = false;
    Weight weight = Weight.COMMON;
    int minLvl = 1;
    int maxLvl = 1;

    Tier enchantmentTier = Tier.Vanilla;



    protected ExpandedEnchantment(Weight weight, EnchantmentTarget type, EquipmentSlot[] slotTypes) {
        super(weight, type, slotTypes);
    }

    public Tier getEnchantmentTier(){
        
        return enchantmentTier;
    }

    public boolean isRelic(){
        return relic;
    }

    @Override
    public Map<EquipmentSlot, ItemStack> getEquipment(LivingEntity livingEntity) {
        return super.getEquipment(livingEntity);
    }

    @Override
    public Weight getWeight() {
        return weight;
    }

    @Override
    public int getMinimumLevel() {
        return minLvl;
    }

    @Override
    public int getMaximumLevel() {
        return maxLvl;
    }

    @Override
    protected boolean differs(Enchantment other) {
        return super.differs(other);
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
        return treasure;
    }

    @Override
    public boolean isCursed() {
        return curse;
    }
}
