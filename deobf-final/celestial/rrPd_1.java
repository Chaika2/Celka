package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;

public class rrPd_1 extends rrPA {
   public static final Codec<rrPd_1> class_ = Codec.FLOAT.fieldOf("integrity").orElse(1.0F).xmap(rrPd_1::new, var0 -> var0.break_).codec();
   private final float break_;

   public rrPd_1(float var1) {
      this.break_ = var1;
   }

   @Override
   public rrPp_1 class_(rRR var1, rfH_2 var2, rfH_2 var3, rrPp_1 var4, rrPp_1 var5, rrPN var6) {
      Random var7 = var6.break_(var5.class_);
      return !(this.break_ >= 1.0F) && !(var7.nextFloat() <= this.break_) ? null : var5;
   }

   @Override
   protected rrPx_1<?> class_() {
      return rrPx_1.break_;
   }
}
