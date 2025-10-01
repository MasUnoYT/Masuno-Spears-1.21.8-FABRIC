package net.masuno.network;

import net.fabricmc.fabric.api.networking.v1.PayloadTypeRegistry;

public class RegisterPayloads {
   public static void init() {
       PayloadTypeRegistry.playC2S().register(SpearHitPayload.ID, SpearHitPayload.CODEC);
       PayloadTypeRegistry.playC2S().register(VelocityPayload.ID, VelocityPayload.CODEC);
   }
}
