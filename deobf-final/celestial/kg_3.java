package celestial;

import java.util.Random;

public class kg_3 extends xd_3 implements kX_2 {
   protected kg_3(Jq_1 var1) {
      super(var1);
   }

   @Override
   public boolean class_(rRq_1 var1, rfH_2 var2, xc_3 var3, boolean var4) {
      return var1.byte_(var2.final_()).catch_();
   }

   @Override
   public boolean class_(rYB var1, Random var2, rfH_2 var3, xc_3 var4) {
      return true;
   }

   @Override
   public void class_(rrEm_1 var1, Random var2, rfH_2 var3, xc_3 var4) {
      xc_3 var5 = var1.byte_(var3);
      rfH_2 var6 = var3.final_();
      if (var5.class_(xu_3.XL)) {
         rUq_1.class_(var1, var2, var6, rUd_1.extends_, 3, 1);
      } else if (var5.class_(xu_3.Xz)) {
         rUq_1.class_(var1, var2, var6, rUd_1.native_, 3, 1);
         rUq_1.class_(var1, var2, var6, rUd_1.volatile_, 3, 1);
         if (var2.nextInt(8) == 0) {
            res_3.class_(var1, var2, var6, 3, 1, 2);
         }
      }
   }

   @Override
   public void class_(xc_3 var1, rrEm_1 var2, rfH_2 var3, Random var4) {
      if (!break_(var1, var2, var3)) {
         var2.break_(var3, xu_3.PR.continue_());
      }
   }

   private static boolean break_(xc_3 var0, rRR var1, rfH_2 var2) {
      rfH_2 var3 = var2.final_();
      xc_3 var4 = var1.byte_(var3);
      int var5 = rrsV_2.class_(var1, var0, var2, var4, var3, rpr_3.UP, var4.break_(var1, var3));
      return var5 < var1.while_();
   }
}
