package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class rYX {
   public static final MapCodec<rYX> class_ = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
               rYJ.CODEC.fieldOf("precipitation").forGetter(var0x -> var0x.break_),
               Codec.FLOAT.fieldOf("temperature").forGetter(var0x -> var0x.byte_),
               rYx_1.CODEC.optionalFieldOf("temperature_modifier", rYx_1.NONE).forGetter(var0x -> var0x.protected_),
               Codec.FLOAT.fieldOf("downfall").forGetter(var0x -> var0x.throws_)
            )
            .apply(var0, rYX::new)
   );
   final rYJ break_;
   final float byte_;
   final rYx_1 protected_;
   final float throws_;

   rYX(rYJ var1, float var2, rYx_1 var3, float var4) {
      this.break_ = var1;
      this.byte_ = var2;
      this.protected_ = var3;
      this.throws_ = var4;
   }
}
