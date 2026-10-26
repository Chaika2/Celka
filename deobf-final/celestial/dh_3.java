package celestial;

import java.util.Random;

public class dh_3 extends xd_3 {
   public dh_3(Jq_1 var1) {
      super(var1);
   }

   @Override
   public void class_(xc_3 var1, rYB var2, rfH_2 var3, Random var4) {
      if (var4.nextInt(5) == 0) {
         rpr_3 var5 = rpr_3.class_(var4);
         if (var5 != rpr_3.UP) {
            rfH_2 var6 = var3.break_(var5);
            xc_3 var7 = var2.byte_(var6);
            if (!var1.native_() || !var7.protected_(var2, var6, var5.case_())) {
               double var8 = var5.implements_() == 0 ? var4.nextDouble() : 0.5 + (double)var5.implements_() * 0.6;
               double var10 = var5.finally_() == 0 ? var4.nextDouble() : 0.5 + (double)var5.finally_() * 0.6;
               double var12 = var5.extends_() == 0 ? var4.nextDouble() : 0.5 + (double)var5.extends_() * 0.6;
               var2.class_(rLQ.u, (double)var3.b_() + var8, (double)var3.c_() + var10, (double)var3.d_() + var12, 0.0, 0.0, 0.0);
            }
         }
      }
   }
}
