package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class rUV implements rDX, rUv_1 {
   public static final Codec<rUV> class_ = RecordCodecBuilder.create(
      var0 -> var0.group(Codec.floatRange(0.0F, 1.0F).fieldOf("probability").forGetter(var0x -> var0x.break_)).apply(var0, rUV::new)
   );
   public final float break_;

   public rUV(float var1) {
      this.break_ = var1;
   }
}
