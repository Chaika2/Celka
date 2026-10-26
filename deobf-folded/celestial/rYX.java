package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class rYX {
   public static final MapCodec<rYX> id_class = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
               rYJ.CODEC.fieldOf("precipitation").forGetter(var0x -> var0x.id_break),
               Codec.FLOAT.fieldOf("temperature").forGetter(var0x -> var0x.id_byte),
               rYx_1.CODEC.optionalFieldOf("temperature_modifier", rYx_1.NONE).forGetter(var0x -> var0x.id_protected),
               Codec.FLOAT.fieldOf("downfall").forGetter(var0x -> var0x.id_throws)
            )
            .apply(var0, rYX::new)
   );
   final rYJ id_break;
   final float id_byte;
   final rYx_1 id_protected;
   final float id_throws;

   rYX(rYJ var1, float var2, rYx_1 var3, float var4) {
      this.id_break = var1;
      this.id_byte = var2;
      this.id_protected = var3;
      this.id_throws = var4;
   }
}
