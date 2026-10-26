package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class rDV implements rUv_1 {
   public static final Codec<rDV> class_ = RecordCodecBuilder.create(
      var0 -> var0.group(
               rUX.class_(0, 2, 1).fieldOf("reach").forGetter(var0x -> var0x.break_), rUX.class_(1, 5, 5).fieldOf("height").forGetter(var0x -> var0x.byte_)
            )
            .apply(var0, rDV::new)
   );
   private final rUX break_;
   private final rUX byte_;

   public rDV(rUX var1, rUX var2) {
      this.break_ = var1;
      this.byte_ = var2;
   }

   public rUX class_() {
      return this.break_;
   }

   public rUX break_() {
      return this.byte_;
   }
}
