package net.masuno.spear;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class SpearItem extends Item {
   public SpearItem(Item.Settings settings) {
      super(settings);
   }

    @Override
    public void postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        if (attacker instanceof PlayerEntity player) {
            player.getItemCooldownManager().set(stack, 20);
        }
        super.postHit(stack, target, attacker);
    }
}
