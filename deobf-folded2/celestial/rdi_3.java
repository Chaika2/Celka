package celestial;

public class rdi_3 extends rxJ_2 {
   public rdi_3(xd_3 var1, rdO_2 var2) {
      super(var1, var2);
   }

   @Override
   public rxx_3 id_break(rxx_3 var1) {
      rfH_2 var2 = var1.id_class();
      rYB var3 = var1.id_int();
      xc_3 var4 = var3.id_byte(var2);
      xd_3 var5 = this.id_catch();
      if (!var4.id_class(var5)) {
         return Wl_1.id_class(var3, var2) == 7 ? null : var1;
      } else {
         rpr_3 var6;
         if (var1.id_catch()) {
            var6 = var1.id_native() ? var1.id_finally().id_case() : var1.id_finally();
         } else {
            var6 = var1.id_finally() == rpr_3.UP ? var1.id_case() : rpr_3.UP;
         }

         int var7 = 0;
         rfw_3 var8 = var2.id_new().id_class(var6);

         while (var7 < 7) {
            if (!var3.id_continue && !rYB.id_new(var8)) {
               rhd_3 var9 = var1.id_final();
               int var10 = var3.id_try();
               if (var9 instanceof rhN_2 && var8.c_() >= var10) {
                  rZK var11 = new rZK(new rgn_3("build.tooHigh", var10).id_class(rgF_2.RED), rVU.GAME_INFO, rqR_2.id_break);
                  ((rhN_2)var9).id_class.id_class(var11);
               }
               break;
            }

            var4 = var3.id_byte(var8);
            if (!var4.id_class(this.id_catch())) {
               if (var4.id_class(var1)) {
                  return rxx_3.id_class(var1, var8, var6);
               }
               break;
            }

            var8.id_class(var6);
            if (var6.id_final().id_protected()) {
               var7++;
            }
         }

         return null;
      }
   }

   @Override
   protected boolean id_throws() {
      return false;
   }
}
