package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class rDC implements rUv_1 {
   public static final Codec<rDC> class_ = RecordCodecBuilder.create(
      var0 -> var0.group(
               xc_3.break_.fieldOf("target").forGetter(var0x -> var0x.break_),
               xc_3.break_.fieldOf("state").forGetter(var0x -> var0x.byte_),
               rUX.class_.fieldOf("radius").forGetter(var0x -> var0x.protected_)
            )
            .apply(var0, rDC::new)
   );
   public final xc_3 break_;
   public final xc_3 byte_;
   private final rUX protected_;

   public rDC(xc_3 var1, xc_3 var2, rUX var3) {
      this.break_ = var1;
      this.byte_ = var2;
      this.protected_ = var3;
   }

   public rUX class_() {
      return this.protected_;
   }
}
