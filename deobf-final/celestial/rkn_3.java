package celestial;

public class rkn_3 extends rWN {
   public rkn_3(rqO_2 var1) {
      super(var1);
   }

   @Override
   public boolean class_(int var1, int var2) {
      return var1 >= 3 && var2 >= 3;
   }

   public boolean class_(rXk_1 var1, rYB var2) {
      int var3 = 0;
      rdn_3 var4 = rdn_3.break_;

      for (int var5 = 0; var5 < var1.else_(); var5++) {
         rdn_3 var6 = var1.extends_(var5);
         if (!var6.class_()) {
            if (var6.break_() == rdy_3.dr) {
               if (!var4.class_()) {
                  return false;
               }

               var4 = var6;
            } else {
               if (var6.break_() != rdy_3.xi) {
                  return false;
               }

               var3++;
            }
         }
      }

      return !var4.class_() && var4.final_() && var3 > 0;
   }

   public rdn_3 class_(rXk_1 var1) {
      int var2 = 0;
      rdn_3 var3 = rdn_3.break_;

      for (int var4 = 0; var4 < var1.else_(); var4++) {
         rdn_3 var5 = var1.extends_(var4);
         if (!var5.class_()) {
            if (var5.break_() == rdy_3.dr) {
               if (!var3.class_()) {
                  return rdn_3.break_;
               }

               var3 = var5;
            } else {
               if (var5.break_() != rdy_3.xi) {
                  return rdn_3.break_;
               }

               var2++;
            }
         }
      }

      if (!var3.class_() && var3.final_() && var2 >= 1 && rkZ_2.protected_(var3) < 2) {
         rdn_3 var6 = new rdn_3(rdy_3.dr, var2);
         rcd_3 var7 = var3.package_().catch_();
         var7.break_("generation", rkZ_2.protected_(var3) + 1);
         var6.byte_(var7);
         return var6;
      } else {
         return rdn_3.break_;
      }
   }

   public rqs_3<rdn_3> break_(rXk_1 var1) {
      rqs_3 var2 = rqs_3.class_(var1.else_(), rdn_3.break_);

      for (int var3 = 0; var3 < var2.size(); var3++) {
         rdn_3 var4 = var1.extends_(var3);
         if (var4.break_().int_()) {
            var2.set(var3, new rdn_3(var4.break_().package_()));
         } else if (var4.break_() instanceof rkZ_2) {
            rdn_3 var5 = var4.implements_();
            var5.throws_(1);
            var2.set(var3, var5);
            break;
         }
      }

      return var2;
   }

   @Override
   public rkf_3<?> W_() {
      return rkf_3.protected_;
   }
}
