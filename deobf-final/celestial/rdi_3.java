package celestial;

public class rdi_3 extends rxJ_2 {
   public rdi_3(xd_3 var1, rdO_2 var2) {
      super(var1, var2);
   }

   @Override
   public rxx_3 break_(rxx_3 var1) {
      rfH_2 var2 = var1.class_();
      rYB var3 = var1.int_();
      xc_3 var4 = var3.byte_(var2);
      xd_3 var5 = this.catch_();
      if (!var4.class_(var5)) {
         return Wl_1.class_(var3, var2) == 7 ? null : var1;
      } else {
         rpr_3 var6;
         if (var1.catch_()) {
            var6 = var1.native_() ? var1.finally_().case_() : var1.finally_();
         } else {
            var6 = var1.finally_() == rpr_3.UP ? var1.case_() : rpr_3.UP;
         }

         int var7 = 0;
         rfw_3 var8 = var2.new_().class_(var6);

         while (var7 < 7) {
            if (!var3.continue_ && !rYB.new_(var8)) {
               rhd_3 var9 = var1.final_();
               int var10 = var3.try_();
               if (var9 instanceof rhN_2 && var8.c_() >= var10) {
                  rZK var11 = new rZK(new rgn_3("build.tooHigh", var10).class_(rgF_2.RED), rVU.GAME_INFO, rqR_2.break_);
                  ((rhN_2)var9).class_.class_(var11);
               }
               break;
            }

            var4 = var3.byte_(var8);
            if (!var4.class_(this.catch_())) {
               if (var4.class_(var1)) {
                  return rxx_3.class_(var1, var8, var6);
               }
               break;
            }

            var8.class_(var6);
            if (var6.final_().protected_()) {
               var7++;
            }
         }

         return null;
      }
   }

   @Override
   protected boolean throws_() {
      return false;
   }
}
