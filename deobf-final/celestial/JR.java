package celestial;

import java.util.Random;

public abstract class JR extends xd_3 {
   protected final rpr_3 volatile_;
   protected final boolean final_;
   protected final rjC_2 package_;

   protected JR(Jq_1 var1, rpr_3 var2, rjC_2 var3, boolean var4) {
      super(var1);
      this.volatile_ = var2;
      this.package_ = var3;
      this.final_ = var4;
   }

   @Override
   public boolean class_(xc_3 var1, rRR var2, rfH_2 var3) {
      rfH_2 var4 = var3.break_(this.volatile_.case_());
      xc_3 var5 = var2.byte_(var4);
      xd_3 var6 = var5.break_();
      return !this.class_(var6) ? false : var6 == this.implements_() || var6 == this.break_() || var5.protected_(var2, var4, this.volatile_);
   }

   protected boolean class_(xd_3 var1) {
      return true;
   }

   @Override
   public rjC_2 class_(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return this.package_;
   }

   public xc_3 class_(rRg_1 var1) {
      return this.continue_();
   }

   @Override
   public xc_3 class_(rxx_3 var1) {
      xc_3 var2 = var1.int_().byte_(var1.class_().break_(this.volatile_));
      return !var2.class_(this.implements_()) && !var2.class_(this.break_()) ? this.class_(var1.int_()) : this.break_().continue_();
   }

   protected abstract xd_3 break_();

   @Override
   public void break_(xc_3 var1, rrEm_1 var2, rfH_2 var3, Random var4) {
      if (!var1.class_(var2, var3)) {
         var2.break_(var3, true);
      }
   }

   protected abstract Je_1 implements_();
}
