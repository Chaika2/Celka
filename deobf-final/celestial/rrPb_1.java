package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;

public class rrPb_1 extends rrPL {
   public static final Codec<rrPb_1> class_ = rVL.strictfp_.fieldOf("block").xmap(rrPb_1::new, var0 -> var0.break_).codec();
   private final xd_3 break_;

   public rrPb_1(xd_3 var1) {
      this.break_ = var1;
   }

   @Override
   public boolean class_(xc_3 var1, Random var2) {
      return var1.class_(this.break_);
   }

   @Override
   protected rrPJ<?> class_() {
      return rrPJ.break_;
   }
}
