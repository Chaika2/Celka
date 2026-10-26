package celestial;

import java.util.Random;

public class xL_2 extends xd_3 {
   public static final rCm_1 volatile_ = rCT.k;
   protected static final rjC_2 final_ = xd_3.class_(1.0, 0.0, 1.0, 15.0, 15.0, 15.0);
   protected static final rjC_2 package_ = xd_3.class_(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   protected xL_2(Jq_1 var1) {
      super(var1);
      this.extends_(this.abstract_.break_().class_(volatile_, Integer.valueOf(0)));
   }

   @Override
   public boolean class_(xc_3 var1, rRR var2, rfH_2 var3) {
      for (rpr_3 var5 : rpb_3.HORIZONTAL) {
         xc_3 var6 = var2.byte_(var3.break_(var5));
         QP var7 = var6.byte_();
         if (var7.break_() || var2.break_(var3.break_(var5)).class_(rlG_2.byte_)) {
            return false;
         }
      }

      xc_3 var8 = var2.byte_(var3.break_());
      return (var8.class_(xu_3.Pw) || var8.class_(xu_3.throw_) || var8.class_(xu_3.interface_)) && !var2.byte_(var3.final_()).byte_().class_();
   }

   @Override
   public void class_(xc_3 var1, rYB var2, rfH_2 var3, an_3 var4) {
      var4.break_(rye_3.finally_, 1.0F);
   }

   @Override
   protected void class_(rCL<xd_3, xc_3> var1) {
      var1.class_(volatile_);
   }

   @Override
   public boolean class_(xc_3 var1, rRq_1 var2, rfH_2 var3, rLT var4) {
      return false;
   }

   @Override
   public xc_3 class_(xc_3 var1, rpr_3 var2, xc_3 var3, rRg_1 var4, rfH_2 var5, rfH_2 var6) {
      if (!var1.class_(var4, var5)) {
         var4.finally_().class_(var5, this, 1);
      }

      return super.class_(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public void class_(xc_3 var1, rrEm_1 var2, rfH_2 var3, Random var4) {
      rfH_2 var5 = var3.final_();
      if (var2.finally_(var5)) {
         int var6 = 1;

         while (var2.byte_(var3.catch_(var6)).class_(this)) {
            var6++;
         }

         if (var6 < 3) {
            int var7 = var1.byte_(volatile_);
            if (var7 == 15) {
               var2.break_(var5, this.continue_());
               xc_3 var8 = var1.class_(volatile_, Integer.valueOf(0));
               var2.class_(var3, var8, 4);
               var8.class_(var2, var5, this, var3, false);
            } else {
               var2.class_(var3, var1.class_(volatile_, Integer.valueOf(var7 + 1)), 4);
            }
         }
      }
   }

   @Override
   public rjC_2 class_(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return package_;
   }

   @Override
   public void break_(xc_3 var1, rrEm_1 var2, rfH_2 var3, Random var4) {
      if (!var1.class_(var2, var3)) {
         var2.break_(var3, true);
      }
   }

   @Override
   public rjC_2 break_(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return final_;
   }
}
