package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Random;

public class rKK extends rKY {
   public static final Codec<rKK> break_ = RecordCodecBuilder.create(
      var0 -> var0.group(Codec.INT.fieldOf("min_size").forGetter(var0x -> var0x.byte_), Codec.INT.fieldOf("extra_size").forGetter(var0x -> var0x.protected_))
            .apply(var0, rKK::new)
   );
   private final int byte_;
   private final int protected_;

   public rKK(int var1, int var2) {
      this.byte_ = var1;
      this.protected_ = var2;
   }

   @Override
   protected rKo_1<?> class_() {
      return rKo_1.byte_;
   }

   @Override
   public void class_(rRg_1 var1, rfH_2 var2, xc_3 var3, Random var4) {
      rfw_3 var5 = var2.new_();
      int var6 = this.byte_ + var4.nextInt(var4.nextInt(this.protected_ + 1) + 1);

      for (int var7 = 0; var7 < var6; var7++) {
         var1.class_(var5, var3, 2);
         var5.class_(rpr_3.UP);
      }
   }
}
