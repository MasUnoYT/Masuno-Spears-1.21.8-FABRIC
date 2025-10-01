package net.masuno.network;

import net.minecraft.network.RegistryByteBuf;
import net.minecraft.network.codec.PacketCodec;
import net.minecraft.network.packet.CustomPayload;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Vec3d;

public record VelocityPayload(Vec3d velocity) implements CustomPayload {
   public static final Identifier VELOCITY_PAYLOAD = Identifier.of("spear", "velocity");
   public static final Id<VelocityPayload> ID = new Id<>(VELOCITY_PAYLOAD);
   public static final PacketCodec<RegistryByteBuf, VelocityPayload> CODEC = PacketCodec.tuple(
           Vec3d.PACKET_CODEC, VelocityPayload::velocity, VelocityPayload::new
   );

   public Id<? extends CustomPayload> getId() {
      return ID;
   }
}
