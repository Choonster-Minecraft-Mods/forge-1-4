package com.camp.nchant;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.util.ResourceLocation;

public class NchantmentLootBonus extends Enchantment
{
    private static final String __OBFID = "CL_00000119";

    public NchantmentLootBonus(int p_i45767_1_, ResourceLocation p_i45767_2_, int p_i45767_3_, EnumEnchantmentType p_i45767_4_)
    {
        super(p_i45767_1_, p_i45767_2_, p_i45767_3_, p_i45767_4_);

        if (p_i45767_4_ == EnumEnchantmentType.DIGGER)
        {
            this.setName("lootBonusDigger");
        }
        else if (p_i45767_4_ == EnumEnchantmentType.FISHING_ROD)
        {
            this.setName("lootBonusFishing");
        }
        else
        {
            this.setName("lootBonus");
        }
    }

    /**
     * Returns the minimal value of enchantability needed on the enchantment level passed.
     */
    public int getMinEnchantability(int enchantmentLevel)
    {
        return 15 + (enchantmentLevel - 1) * 9;
    }

    /**
     * Returns the maximum value of enchantability nedded on the enchantment level passed.
     */
    public int getMaxEnchantability(int enchantmentLevel)
    {
        return super.getMinEnchantability(enchantmentLevel) + 50;
    }

    /**
     * Returns the maximum level that the enchantment can have.
     */
    public int getMaxLevel()
    {
        return 5;
    }

    /**
     * Determines if the enchantment passed can be applyied together with this enchantment.
     *  
     * @param ench A possible enchantment that may be applied along side this enchantment, depending on the results.
     */
    public boolean canApplyTogether(Enchantment ench)
    {
        return super.canApplyTogether(ench);
    }
}