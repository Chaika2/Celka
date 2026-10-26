package celestial;

import java.util.Random;

public abstract class Wk_1 extends kE_2 {
   protected static final rjC_2 final_ = xd_3.class_(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   public static final rCN package_ = rCT.return_;

   protected void byte_(rYB var1, rfH_2 var2, xc_3 var3) {
      if (!this.class_((rRR)var1, var2, var3)) {
         boolean var4 = var3.byte_(package_);
         boolean var5 = this.class_(var1, var2, var3);
         if (var4 != var5 && !var1.finally_().break_(var2, this)) {
            rYr_1 var6 = rYr_1.HIGH;
            if (this.byte_((rRq_1)var1, var2, var3)) {
               var6 = rYr_1.EXTREMELY_HIGH;
            } else if (var4) {
               var6 = rYr_1.VERY_HIGH;
            }

            var1.finally_().class_(var2, this, this.private_(var3), var6);
         }
      }
   }

   public boolean byte_(rRq_1 var1, rfH_2 var2, xc_3 var3) {
      rpr_3 var4 = var3.byte_(p).case_();
      xc_3 var5 = var1.byte_(var2.break_(var4));
      return volatile_(var5) && var5.byte_(p) != var4;
   }

   @Override
   public boolean byte_(xc_3 var1) {
      return true;
   }

   protected Wk_1(Jq_1 var1) {
      super(var1);
   }

   @Override
   public boolean class_(xc_3 var1, rRR var2, rfH_2 var3) {
      return byte_(var2, var3.break_());
   }

   @Override
   public xc_3 class_(rxx_3 var1) {
      return this.continue_().class_(p, var1.case_().case_());
   }

   @Override
   public void class_(rYB var1, rfH_2 var2, xc_3 var3, iB_2 var4, rdn_3 var5) {
      if (this.class_(var1, var2, var3)) {
         var1.finally_().class_(var2, this, 1);
      }
   }

   @Override
   public void class_(xc_3 var1, rYB var2, rfH_2 var3, xc_3 var4, boolean var5) {
      this.protected_(var2, var3, var1);
   }

   @Override
   public rjC_2 class_(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return final_;
   }

   public boolean class_(rRR var1, rfH_2 var2, xc_3 var3) {
      return false;
   }

   @Override
   public void class_(xc_3 var1, rYB var2, rfH_2 var3, xd_3 var4, rfH_2 var5, boolean var6) {
      if (var1.class_((rRR)var2, var3)) {
         this.byte_(var2, var3, var1);
      } else {
         ryO_2 var7 = this.protected_() ? var2.class_(var3) : null;
         class_(var1, var2, var3, var7);
         var2.class_(var3, false);

         for (rpr_3 var11 : rpr_3.values()) {
            var2.break_(var3.break_(var11), this);
         }
      }
   }

   protected boolean class_(rYB var1, rfH_2 var2, xc_3 var3) {
      return this.break_(var1, var2, var3) > 0;
   }

   @Override
   public int class_(xc_3 var1, rRq_1 var2, rfH_2 var3, rpr_3 var4) {
      if (!var1.byte_(package_)) {
         return 0;
      } else {
         return var1.byte_(p) == var4 ? this.break_(var2, var3, var1) : 0;
      }
   }

   @Override
   public void break_(xc_3 var1, rYB var2, rfH_2 var3, xc_3 var4, boolean var5) {
      if (!var5 && !var1.class_(var4.break_())) {
         super.break_(var1, var2, var3, var4, var5);
         this.protected_(var2, var3, var1);
      }
   }

   protected int break_(rRR var1, rfH_2 var2, rpr_3 var3) {
      xc_3 var4 = var1.byte_(var2);
      if (this.implements_(var4)) {
         if (var4.class_(xu_3.sn)) {
            return 15;
         } else {
            return var4.class_(xu_3.ra) ? var4.byte_(Wu_1.new_) : var1.class_(var2, var3);
         }
      } else {
         return 0;
      }
   }

   protected int break_(rRq_1 var1, rfH_2 var2, xc_3 var3) {
      return 15;
   }

   protected int break_(rRR var1, rfH_2 var2, xc_3 var3) {
      rpr_3 var4 = var3.byte_(p);
      rpr_3 var5 = var4.catch_();
      rpr_3 var6 = var4.private_();
      return Math.max(this.break_(var1, var2.break_(var5), var5), this.break_(var1, var2.break_(var6), var6));
   }

   protected int break_(rYB var1, rfH_2 var2, xc_3 var3) {
      rpr_3 var4 = var3.byte_(p);
      rfH_2 var5 = var2.break_(var4);
      int var6 = var1.byte_(var5, var4);
      if (var6 >= 15) {
         return var6;
      } else {
         xc_3 var7 = var1.byte_(var5);
         return Math.max(var6, var7.class_(xu_3.ra) ? var7.byte_(Wu_1.new_) : 0);
      }
   }

   @Override
   public void break_(xc_3 var1, rrEm_1 var2, rfH_2 var3, Random var4) {
      if (!this.class_((rRR)var2, var3, var1)) {
         boolean var5 = var1.byte_(package_);
         boolean var6 = this.class_((rYB)var2, var3, var1);
         if (var5 && !var6) {
            var2.class_(var3, var1.class_(package_, Boolean.valueOf(false)), 2);
         } else if (!var5) {
            var2.class_(var3, var1.class_(package_, Boolean.valueOf(true)), 2);
            if (!var6) {
               var2.synchronized_().class_(var3, this, this.private_(var1), rYr_1.VERY_HIGH);
            }
         }
      }
   }

   @Override
   public int break_(xc_3 var1, rRq_1 var2, rfH_2 var3, rpr_3 var4) {
      return var1.break_(var2, var3, var4);
   }

   protected boolean implements_(xc_3 var1) {
      return var1.implements_();
   }

   protected void protected_(rYB var1, rfH_2 var2, xc_3 var3) {
      rpr_3 var4 = var3.byte_(p);
      rfH_2 var5 = var2.break_(var4.case_());
      var1.class_(var5, this, var2);
      var1.class_(var5, this, var4);
   }

   protected abstract int private_(xc_3 var1);

   public static boolean volatile_(xc_3 var0) {
      return var0.break_() instanceof Wk_1;
   }
}
