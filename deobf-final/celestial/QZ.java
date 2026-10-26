package celestial;

import java.util.Random;

public abstract class QZ {
   private boolean class_(rRg_1 var1, rfH_2 var2) {
      for (rfH_2 var4 : rfw_3.class_(var2.break_().native_(2).class_(2), var2.final_().private_(2).volatile_(2))) {
         if (var1.byte_(var4).class_(rls_3.strictfp_)) {
            return true;
         }
      }

      return false;
   }

   public boolean class_(rrEm_1 var1, rKd_1 var2, rfH_2 var3, xc_3 var4, Random var5) {
      rDg_1 var6 = this.class_(var5, this.class_(var1, var3));
      if (var6 == null) {
         return false;
      } else {
         var1.class_(var3, xu_3.class_.continue_(), 4);
         ((rDv_1)var6.case_).class_();
         if (var6.class_(var1, var2, var5, var3)) {
            return true;
         } else {
            var1.class_(var3, var4, 4);
            return false;
         }
      }
   }

   protected abstract rDg_1<rDv_1, ?> class_(Random var1, boolean var2);
}
