package celestial;

import java.util.Random;

public class dS_2 extends xd_3 {
   private final xd_3 volatile_;

   public dS_2(xd_3 var1, Jq_1 var2) {
      super(var2);
      this.volatile_ = var1;
   }

   @Override
   public xc_3 class_(rxx_3 var1) {
      if (!this.class_(var1.int_(), var1.class_())) {
         var1.int_().finally_().class_(var1.class_(), this, 60 + var1.int_().long_().nextInt(40));
      }

      return this.continue_();
   }

   protected boolean class_(rRq_1 var1, rfH_2 var2) {
      for (rpr_3 var6 : rpr_3.values()) {
         rXE var7 = var1.break_(var2.break_(var6));
         if (var7.class_(rlG_2.break_)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public xc_3 class_(xc_3 var1, rpr_3 var2, xc_3 var3, rRg_1 var4, rfH_2 var5, rfH_2 var6) {
      if (!this.class_(var4, var5)) {
         var4.finally_().class_(var5, this, 60 + var4.long_().nextInt(40));
      }

      return super.class_(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public void break_(xc_3 var1, rrEm_1 var2, rfH_2 var3, Random var4) {
      if (!this.class_(var2, var3)) {
         var2.class_(var3, this.volatile_.continue_(), 2);
      }
   }
}
