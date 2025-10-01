package net.masuno.events;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents.StartTick;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.masuno.network.SpearHitPayload;
import net.masuno.network.VelocityPayload;
import net.masuno.spear.ModItems;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.EntityHitResult;

@Environment(EnvType.CLIENT)
public class ModEventsClient {
   private static boolean wasPressed = false;
   public static boolean isHoldingSpear = false;
   public static int ticksHoldingSpear = 0;

   public static void init() {
      ClientTickEvents.START_CLIENT_TICK
         .register(
            (StartTick)client -> {
               if (client.player != null) {
                   SyncVelocity(client);

                   if (client.player.getAttackCooldownProgress(1.25F) < 1.0F) {
                       return;
                   }

                   if (client.player.getItemCooldownManager().isCoolingDown(client.player.getMainHandStack())) {
                       return;
                   }

                   if (client.player.getMainHandStack().isIn(ModItems.SPEARS) && client.options.useKey.isPressed()) {
                       if (!wasPressed) {
                           isHoldingSpear = true;
                       }

                       wasPressed = true;
                   } else {
                       unholdSpear(client);
                       isHoldingSpear = false;
                       wasPressed = false;
                   }

                   if (isHoldingSpear) {
                       ticksHoldingSpear++;
                       if (client.crosshairTarget instanceof EntityHitResult entityHitResult
                               && ticksHoldingSpear >= 3
                               && entityHitResult.getEntity() instanceof LivingEntity le
                               && le.hurtTime <= 0) {
                           SpearAttack(client, le);
                       }
                   }
               }
            }
         );
   }

   public static void unholdSpear(MinecraftClient client) {
      ticksHoldingSpear = 0;
      if (isHoldingSpear) {
          assert client.player != null;
          client.player.attack(client.player);
      }
   }
    public static void SyncVelocity(MinecraftClient client){
        assert client.player != null;
        ClientPlayNetworking.send(new VelocityPayload(client.player.getVelocity()));
    }
   public static void SpearAttack(MinecraftClient client, LivingEntity entity) {
      assert client.player != null;
      client.player.swingHand(Hand.MAIN_HAND);
      ClientPlayNetworking.send(new SpearHitPayload(entity.getId()));
   }
}
