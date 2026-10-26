package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class rUz_1 implements rUv_1 {
   public static final Codec<rUz_1> class_ = RecordCodecBuilder.create(
      var0 -> var0.group(
               Codec.intRange(0, 255).fieldOf("height").forGetter(var0x -> var0x.break_), xc_3.break_.fieldOf("state").forGetter(var0x -> var0x.byte_)
            )
            .apply(var0, rUz_1::new)
   );
   public final int break_;
   public final xc_3 byte_;

   public rUz_1(int var1, xc_3 var2) {
      this.break_ = var1;
      this.byte_ = var2;
   }
}
