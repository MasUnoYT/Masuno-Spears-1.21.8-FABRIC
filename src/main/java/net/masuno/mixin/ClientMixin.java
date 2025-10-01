package net.masuno.mixin;

import net.masuno.spear.ModItems;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayerEntity;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({MinecraftClient.class})
public class ClientMixin {
    @Shadow
    @Nullable
    public ClientPlayerEntity player;

    @Inject(
      method = {"doAttack"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void canAttack(CallbackInfoReturnable<Boolean> cir) {
      if (this.player != null
         && this.player.getMainHandStack().isIn(ModItems.SPEARS)
         && this.player.getItemCooldownManager().isCoolingDown(this.player.getMainHandStack())) {
         cir.setReturnValue(false);
      }
   }
}
