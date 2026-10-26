package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class rUR implements rUv_1 {
   public static final Codec<rUR> class_ = RecordCodecBuilder.create(
      var0 -> var0.group(xc_3.break_.fieldOf("target").forGetter(var0x -> var0x.break_), xc_3.break_.fieldOf("state").forGetter(var0x -> var0x.byte_))
            .apply(var0, rUR::new)
   );
   public final xc_3 break_;
   public final xc_3 byte_;

   public rUR(xc_3 var1, xc_3 var2) {
      this.break_ = var1;
      this.byte_ = var2;
   }
}
