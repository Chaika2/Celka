package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class rDt_1 implements rUv_1 {
   public static final Codec<rDt_1> class_ = RecordCodecBuilder.create(
      var0 -> var0.group(
               xc_3.break_.fieldOf("to_place").forGetter(var0x -> var0x.break_),
               xc_3.break_.listOf().fieldOf("place_on").forGetter(var0x -> var0x.byte_),
               xc_3.break_.listOf().fieldOf("place_in").forGetter(var0x -> var0x.protected_),
               xc_3.break_.listOf().fieldOf("place_under").forGetter(var0x -> var0x.throws_)
            )
            .apply(var0, rDt_1::new)
   );
   public final xc_3 break_;
   public final List<xc_3> byte_;
   public final List<xc_3> protected_;
   public final List<xc_3> throws_;

   public rDt_1(xc_3 var1, List<xc_3> var2, List<xc_3> var3, List<xc_3> var4) {
      this.break_ = var1;
      this.byte_ = var2;
      this.protected_ = var3;
      this.throws_ = var4;
   }
}
