package net.masuno;

import net.fabricmc.api.ModInitializer;
import net.masuno.events.ModEvents;
import net.masuno.network.RegisterPayloads;
import net.masuno.spear.ModItems;
import net.minecraft.item.ItemStack;

public class SpearBackport implements ModInitializer {
   public static int maxSpearDismountTime = 30;
   public static int maxSpearKbTime = 45;
   public static int maxSpearTime = 60;

   public void onInitialize() {
      RegisterPayloads.init();
      ModItems.initialize();
      ModItems.itemGroupsEdit();
      ModEvents.init();
   }

   public static float getMultiplier(ItemStack spear) {
      if (spear.isOf(ModItems.NETHERITE_SPEAR)) {
         return 1.0F;
      } else if (spear.isOf(ModItems.DIAMOND_SPEAR)) {
         return 1.2F;
      } else if (spear.isOf(ModItems.IRON_SPEAR)) {
         return 1.4F;
      } else if (spear.isOf(ModItems.STONE_SPEAR)) {
         return 1.6F;
      } else if (spear.isOf(ModItems.GOLDEN_SPEAR)) {
         return 1.8F;
      } else {
         return spear.isOf(ModItems.WOODEN_SPEAR) ? 2.0F : 0.0F;
      }
   }

   public static float getBasePower(ItemStack spear) {
      if (spear.isOf(ModItems.NETHERITE_SPEAR)) {
         return 7.0F;
      } else if (spear.isOf(ModItems.DIAMOND_SPEAR)) {
         return 6.0F;
      } else if (spear.isOf(ModItems.IRON_SPEAR)) {
         return 5.0F;
      } else if (spear.isOf(ModItems.STONE_SPEAR)) {
         return 4.0F;
      } else if (spear.isOf(ModItems.GOLDEN_SPEAR)) {
         return 3.0F;
      } else {
         return spear.isOf(ModItems.WOODEN_SPEAR) ? 3.0F : 0.0F;
      }
   }
}
