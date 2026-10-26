package celestial;

import java.util.Random;

public class kj_3 extends xd_3 implements kX_2 {
   public kj_3(Jq_1 var1) {
      super(var1);
   }

   @Override
   public void class_(rrEm_1 var1, Random var2, rfH_2 var3, xc_3 var4) {
      boolean var5 = false;
      boolean var6 = false;

      for (rfH_2 var8 : rfH_2.class_(var3.break_(-1, -1, -1), var3.break_(1, 1, 1))) {
         xc_3 var9 = var1.byte_(var8);
         if (var9.class_(xu_3.Xz)) {
            var6 = true;
         }

         if (var9.class_(xu_3.XL)) {
            var5 = true;
         }

         if (var6 && var5) {
            break;
         }
      }

      if (var6 && var5) {
         var1.class_(var3, var2.nextBoolean() ? xu_3.Xz.continue_() : xu_3.XL.continue_(), 3);
      } else if (var6) {
         var1.class_(var3, xu_3.Xz.continue_(), 3);
      } else if (var5) {
         var1.class_(var3, xu_3.XL.continue_(), 3);
      }
   }

   @Override
   public boolean class_(rYB var1, Random var2, rfH_2 var3, xc_3 var4) {
      return true;
   }

   @Override
   public boolean class_(rRq_1 var1, rfH_2 var2, xc_3 var3, boolean var4) {
      if (!var1.byte_(var2.final_()).class_(var1, var2)) {
         return false;
      } else {
         for (rfH_2 var6 : rfH_2.class_(var2.break_(-1, -1, -1), var2.break_(1, 1, 1))) {
            if (var1.byte_(var6).class_(rls_3.c)) {
               return true;
            }
         }

         return false;
      }
   }
}
