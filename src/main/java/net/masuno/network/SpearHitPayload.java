package net.masuno.network;

import net.minecraft.network.RegistryByteBuf;
import net.minecraft.network.codec.PacketCodec;
import net.minecraft.network.codec.PacketCodecs;
import net.minecraft.network.packet.CustomPayload;
import net.minecraft.util.Identifier;

public record SpearHitPayload(int id) implements CustomPayload {
   public static final Identifier SPEAR_PAYLOAD = Identifier.of("spear", "spear_hit");
   public static final CustomPayload.Id<SpearHitPayload> ID = new CustomPayload.Id<>(SPEAR_PAYLOAD);
   public static final PacketCodec<RegistryByteBuf, SpearHitPayload> CODEC = PacketCodec.tuple(
           PacketCodecs.INTEGER, SpearHitPayload::id, SpearHitPayload::new
   );

   public CustomPayload.Id<? extends CustomPayload> getId() {
      return ID;
   }
}
