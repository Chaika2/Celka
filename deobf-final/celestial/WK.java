package celestial;

import java.util.Random;

public class WK extends JV {
   protected WK(Jq_1 var1) {
      super(var1);
   }

   @Override
   public void class_(xc_3 var1, rYB var2, rfH_2 var3, Random var4) {
      if (var1.byte_(final_)) {
         double var5 = (double)var3.b_() + 0.5;
         double var7 = (double)var3.c_();
         double var9 = (double)var3.d_() + 0.5;
         if (var4.nextDouble() < 0.1) {
            var2.class_(var5, var7, var9, rqn_3.xc, rqL_2.BLOCKS, 1.0F, 1.0F, false);
         }

         var2.class_(rLQ.double_, var5, var7 + 1.1, var9, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void class_(rYB var1, rfH_2 var2, rhd_3 var3) {
      ryO_2 var4 = var1.class_(var2);
      if (var4 instanceof ryE_2) {
         var3.class_((rJZ)var4);
         var3.break_(rlB_2.v);
      }
   }

   @Override
   public ryO_2 class_(rRq_1 var1) {
      return new ryE_2();
   }
}
