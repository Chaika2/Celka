package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class rUa_1 implements rUv_1 {
   public static final Codec<rUa_1> class_ = RecordCodecBuilder.create(
      var0 -> var0.group(
               xc_3.break_.fieldOf("state").forGetter(var0x -> var0x.break_),
               rUX.class_(0, 4, 4).fieldOf("radius").forGetter(var0x -> var0x.byte_),
               Codec.intRange(0, 4).fieldOf("half_height").forGetter(var0x -> var0x.protected_),
               xc_3.break_.listOf().fieldOf("targets").forGetter(var0x -> var0x.throws_)
            )
            .apply(var0, rUa_1::new)
   );
   public final xc_3 break_;
   public final rUX byte_;
   public final int protected_;
   public final List<xc_3> throws_;

   public rUa_1(xc_3 var1, rUX var2, int var3, List<xc_3> var4) {
      this.break_ = var1;
      this.byte_ = var2;
      this.protected_ = var3;
      this.throws_ = var4;
   }
}
