package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;

public class rKa_1 extends rKi_1 {
   public static final Codec<rKa_1> class_ = xc_3.break_.fieldOf("state").xmap(JC::break_, xd_3::continue_).xmap(rKa_1::new, var0 -> var0.byte_).codec();
   private final xd_3 byte_;

   public rKa_1(xd_3 var1) {
      this.byte_ = var1;
   }

   @Override
   protected rDr_1<?> class_() {
      return rDr_1.throws_;
   }

   @Override
   public xc_3 class_(Random var1, rfH_2 var2) {
      rpB_2 var3 = rpB_2.class_(var1);
      return this.byte_.continue_().class_(WL.new_, var3);
   }
}
