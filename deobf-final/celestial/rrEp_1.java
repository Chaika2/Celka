package celestial;

import java.util.List;
import java.util.Random;

public class rrEp_1 implements rrEq_1 {
   private int class_;

   private int class_(rfH_2 var1, rrEm_1 var2) {
      rbf_3 var3 = aI_2.private_.class_(var2);
      if (var3 == null) {
         return 0;
      } else {
         var3.class_(var2, var2.throws_(var1), iO_2.NATURAL, (aU_2)null, (rcd_3)null);
         var3.class_(var1, 0.0F, 0.0F);
         var2.class_(var3);
         return 1;
      }
   }

   private int class_(rrEm_1 var1, rfH_2 var2) {
      byte var3 = 48;
      if (var1.d().class_(rRP.continue_.break_(), var2, 48, rRr_1.IS_OCCUPIED) > 4L) {
         List var4 = var1.class_(rbf_3.class, new rfl_3(var2).byte_(48.0, 8.0, 48.0));
         if (var4.size() < 5) {
            return this.class_(var2, var1);
         }
      }

      return 0;
   }

   @Override
   public int class_(rrEm_1 var1, boolean var2, boolean var3) {
      if (var3 && var1.B().break_(rRu_1.protected_)) {
         this.class_--;
         if (this.class_ > 0) {
            return 0;
         } else {
            this.class_ = 1200;
            rhN_2 var4 = var1.this_();
            if (var4 == null) {
               return 0;
            } else {
               Random var5 = var1.int_;
               int var6 = (8 + var5.nextInt(24)) * (var5.nextBoolean() ? -1 : 1);
               int var7 = (8 + var5.nextInt(24)) * (var5.nextBoolean() ? -1 : 1);
               rfH_2 var8 = var4.Bs().break_(var6, 0, var7);
               if (!var1.class_(var8.b_() - 10, var8.c_() - 10, var8.d_() - 10, var8.b_() + 10, var8.c_() + 10, var8.d_() + 10)) {
                  return 0;
               } else {
                  if (rrEj_1.class_(aw_3.ON_GROUND, var1, var8, aI_2.private_)) {
                     if (var1.byte_(var8, 2)) {
                        return this.class_(var1, var8);
                     }

                     if (var1.protected_().class_(var8, true, rrrZ.finally_).throws_()) {
                        return this.break_(var1, var8);
                     }
                  }

                  return 0;
               }
            }
         }
      } else {
         return 0;
      }
   }

   private int break_(rrEm_1 var1, rfH_2 var2) {
      byte var3 = 16;
      List var4 = var1.class_(rbf_3.class, new rfl_3(var2).byte_(16.0, 8.0, 16.0));
      return var4.size() < 1 ? this.class_(var2, var1) : 0;
   }
}
