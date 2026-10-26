package celestial;

import java.util.Random;

public class zW_2 extends xd_3 {
   public static final rCm_1 volatile_ = rCT.k;
   protected static final rjC_2 final_ = xd_3.class_(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);

   protected zW_2(Jq_1 var1) {
      super(var1);
      this.extends_(this.abstract_.break_().class_(volatile_, Integer.valueOf(0)));
   }

   @Override
   protected void class_(rCL<xd_3, xc_3> var1) {
      var1.class_(volatile_);
   }

   @Override
   public xc_3 class_(xc_3 var1, rpr_3 var2, xc_3 var3, rRg_1 var4, rfH_2 var5, rfH_2 var6) {
      if (!var1.class_(var4, var5)) {
         var4.finally_().class_(var5, this, 1);
      }

      return super.class_(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public rjC_2 class_(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return final_;
   }

   @Override
   public void class_(xc_3 var1, rrEm_1 var2, rfH_2 var3, Random var4) {
      if (var2.finally_(var3.final_())) {
         int var5 = 1;

         while (var2.byte_(var3.catch_(var5)).class_(this)) {
            var5++;
         }

         if (var5 < 3) {
            int var6 = var1.byte_(volatile_);
            if (var6 == 15) {
               var2.break_(var3.final_(), this.continue_());
               var2.class_(var3, var1.class_(volatile_, Integer.valueOf(0)), 4);
            } else {
               var2.class_(var3, var1.class_(volatile_, Integer.valueOf(var6 + 1)), 4);
            }
         }
      }
   }

   @Override
   public boolean class_(xc_3 var1, rRR var2, rfH_2 var3) {
      xc_3 var4 = var2.byte_(var3.break_());
      if (var4.break_() == this) {
         return true;
      } else {
         if (var4.class_(xu_3.implements_)
            || var4.class_(xu_3.finally_)
            || var4.class_(xu_3.extends_)
            || var4.class_(xu_3.native_)
            || var4.class_(xu_3.throw_)
            || var4.class_(xu_3.interface_)) {
            rfH_2 var5 = var3.break_();

            for (rpr_3 var7 : rpb_3.HORIZONTAL) {
               xc_3 var8 = var2.byte_(var5.break_(var7));
               rXE var9 = var2.break_(var5.break_(var7));
               if (var9.class_(rlG_2.break_) || var8.class_(xu_3.bj)) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   @Override
   public void break_(xc_3 var1, rrEm_1 var2, rfH_2 var3, Random var4) {
      if (!var1.class_(var2, var3)) {
         var2.break_(var3, true);
      }
   }
}
