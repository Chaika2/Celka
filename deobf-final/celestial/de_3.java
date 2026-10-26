package celestial;

import java.util.Random;

public class de_3 extends xd_3 {
   protected static final rjC_2 volatile_ = dy_3.final_;

   protected de_3(Jq_1 var1) {
      super(var1);
   }

   @Override
   public boolean class_(xc_3 var1, rRq_1 var2, rfH_2 var3, rLT var4) {
      return false;
   }

   @Override
   public rjC_2 class_(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return volatile_;
   }

   @Override
   public boolean class_(xc_3 var1, rRR var2, rfH_2 var3) {
      xc_3 var4 = var2.byte_(var3.final_());
      return !var4.byte_().break_() || var4.break_() instanceof dq_3;
   }

   @Override
   public xc_3 class_(rxx_3 var1) {
      return !this.continue_().class_((rRR)var1.int_(), var1.class_())
         ? xd_3.class_(this.continue_(), xu_3.finally_.continue_(), var1.int_(), var1.class_())
         : super.class_(var1);
   }

   @Override
   public xc_3 class_(xc_3 var1, rpr_3 var2, xc_3 var3, rRg_1 var4, rfH_2 var5, rfH_2 var6) {
      if (var2 == rpr_3.UP && !var1.class_(var4, var5)) {
         var4.finally_().class_(var5, this, 1);
      }

      return super.class_(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public void break_(xc_3 var1, rrEm_1 var2, rfH_2 var3, Random var4) {
      dy_3.byte_(var1, var2, var3);
   }

   @Override
   public boolean break_(xc_3 var1) {
      return true;
   }
}
