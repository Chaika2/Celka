package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class rUf_1 implements rUv_1 {
   public static final Codec<rUf_1> class_ = RecordCodecBuilder.create(
      var0 -> var0.group(
               rrPL.byte_.fieldOf("target").forGetter(var0x -> var0x.break_),
               xc_3.break_.fieldOf("state").forGetter(var0x -> var0x.protected_),
               Codec.intRange(0, 64).fieldOf("size").forGetter(var0x -> var0x.byte_)
            )
            .apply(var0, rUf_1::new)
   );
   public final rrPL break_;
   public final int byte_;
   public final xc_3 protected_;

   public rUf_1(rrPL var1, xc_3 var2, int var3) {
      this.byte_ = var3;
      this.protected_ = var2;
      this.break_ = var1;
   }
}
