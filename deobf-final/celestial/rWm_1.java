package celestial;

public class rWm_1 extends rWN {
   public rWm_1(rqO_2 var1) {
      super(var1);
   }

   @Override
   public boolean class_(int var1, int var2) {
      return var1 >= 2 && var2 >= 2;
   }

   public rdn_3 class_(rXk_1 var1) {
      rdn_3 var2 = rdn_3.break_;

      for (int var3 = 0; var3 < var1.else_(); var3++) {
         rdn_3 var4 = var1.extends_(var3);
         if (!var4.class_() && var4.break_().class_(rlc_3.void_)) {
            var2 = var4;
            break;
         }
      }

      rdn_3 var6 = new rdn_3(rdy_3.ke, 1);
      if (var2.break_() instanceof rxJ_2 && ((rxJ_2)var2.break_()).catch_() instanceof dI_2) {
         dI_2 var7 = (dI_2)((rxJ_2)var2.break_()).catch_();
         rLR var5 = var7.break_();
         rkJ_2.class_(var6, var5, var7.implements_());
      }

      return var6;
   }

   public boolean class_(rXk_1 var1, rYB var2) {
      boolean var3 = false;
      boolean var4 = false;
      boolean var5 = false;
      boolean var6 = false;

      for (int var7 = 0; var7 < var1.else_(); var7++) {
         rdn_3 var8 = var1.extends_(var7);
         if (!var8.class_()) {
            if (var8.break_() == xu_3.rq.case_() && !var5) {
               var5 = true;
            } else if (var8.break_() == xu_3.rT.case_() && !var4) {
               var4 = true;
            } else if (var8.break_().class_(rlc_3.void_) && !var3) {
               var3 = true;
            } else {
               if (var8.break_() != rdy_3.OU || var6) {
                  return false;
               }

               var6 = true;
            }
         }
      }

      return var3 && var5 && var4 && var6;
   }

   @Override
   public rkf_3<?> W_() {
      return rkf_3.final_;
   }
}
