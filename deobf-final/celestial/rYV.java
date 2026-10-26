package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Random;

public class rYV {
   public static final Codec<rYV> class_ = RecordCodecBuilder.create(
      var0 -> var0.group(rLQ.L.fieldOf("options").forGetter(var0x -> var0x.break_), Codec.FLOAT.fieldOf("probability").forGetter(var0x -> var0x.byte_))
            .apply(var0, rYV::new)
   );
   private final rLx_1 break_;
   private final float byte_;

   public rYV(rLx_1 var1, float var2) {
      this.break_ = var1;
      this.byte_ = var2;
   }

   public rLx_1 class_() {
      return this.break_;
   }

   public boolean class_(Random var1) {
      return var1.nextFloat() <= this.byte_;
   }
}
