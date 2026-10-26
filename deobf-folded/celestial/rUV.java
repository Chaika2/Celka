package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class rUV implements rDX, rUv_1 {
   public static final Codec<rUV> id_class = RecordCodecBuilder.create(
      var0 -> var0.group(Codec.floatRange(0.0F, 1.0F).fieldOf("probability").forGetter(var0x -> var0x.id_break)).apply(var0, rUV::new)
   );
   public final float id_break;

   public rUV(float var1) {
      this.id_break = var1;
   }
}
