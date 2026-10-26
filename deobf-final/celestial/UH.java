package celestial;

public class UH extends eJ_2 {
   private static boolean class_(rrEm_1 var0, rfH_2 var1) {
      xc_3 var2 = var0.byte_(var1);
      if (var2.class_(rls_3.k)) {
         int var3 = var2.byte_(xO_2.final_);
         if (var3 >= 5) {
            var0.class_((rhd_3)null, var1, rqn_3.f, rqL_2.BLOCKS, 1.0F, 1.0F);
            xO_2.class_(var0, var1);
            ((xO_2)var2.break_()).class_(var0, var2, var1, (rhd_3)null, rHk_1.BEE_RELEASED);
            return true;
         }
      }

      return false;
   }

   @Override
   protected rdn_3 class_(Uq_1 var1, rdn_3 var2) {
      rrEm_1 var3 = var1.catch_();
      if (!var3.import_()) {
         rfH_2 var4 = var1.protected_().break_(var1.throws_().byte_(dQ_2.volatile_));
         this.class_(class_(var3, var4) || break_(var3, var4));
         if (this.break_() && var2.class_(1, var3.long_(), (rhN_2)null)) {
            var2.throws_(0);
         }
      }

      return var2;
   }

   private static boolean break_(rrEm_1 var0, rfH_2 var1) {
      for (iB_2 var3 : var0.class_(iB_2.class, new rfl_3(var1), rpJ_2.catch_)) {
         if (var3 instanceof iP_2 var4 && var4.class_()) {
            var4.class_(rqL_2.BLOCKS);
            return true;
         }
      }

      return false;
   }
}
