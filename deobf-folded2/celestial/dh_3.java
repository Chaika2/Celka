package celestial;

import java.util.Random;

public class dh_3 extends xd_3 {
   public dh_3(Jq_1 var1) {
      super(var1);
   }

   @Override
   public void id_class(xc_3 var1, rYB var2, rfH_2 var3, Random var4) {
      if (var4.nextInt(5) == 0) {
         rpr_3 var5 = rpr_3.id_class(var4);
         if (var5 != rpr_3.UP) {
            rfH_2 var6 = var3.id_break(var5);
            xc_3 var7 = var2.id_byte(var6);
            if (!var1.id_native() || !var7.id_protected(var2, var6, var5.id_case())) {
               double var8 = var5.id_implements() == 0 ? var4.nextDouble() : 0.5 + (double)var5.id_implements() * 0.6;
               double var10 = var5.id_finally() == 0 ? var4.nextDouble() : 0.5 + (double)var5.id_finally() * 0.6;
               double var12 = var5.id_extends() == 0 ? var4.nextDouble() : 0.5 + (double)var5.id_extends() * 0.6;
               var2.id_class(rLQ.u, (double)var3.b_() + var8, (double)var3.c_() + var10, (double)var3.d_() + var12, 0.0, 0.0, 0.0);
            }
         }
      }
   }
}
