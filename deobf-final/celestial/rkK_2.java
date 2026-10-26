package celestial;

public class rkK_2 extends rWN {
   public rkK_2(rqO_2 var1) {
      super(var1);
   }

   @Override
   public boolean class_(int var1, int var2) {
      return var1 >= 3 && var2 >= 3;
   }

   public rdn_3 class_(rXk_1 var1) {
      int var2 = 0;
      rdn_3 var3 = rdn_3.break_;

      for (int var4 = 0; var4 < var1.else_(); var4++) {
         rdn_3 var5 = var1.extends_(var4);
         if (!var5.class_()) {
            if (var5.break_() == rdy_3.JX) {
               if (!var3.class_()) {
                  return rdn_3.break_;
               }

               var3 = var5;
            } else {
               if (var5.break_() != rdy_3.dM) {
                  return rdn_3.break_;
               }

               var2++;
            }
         }
      }

      if (!var3.class_() && var2 >= 1) {
         rdn_3 var6 = var3.implements_();
         var6.throws_(var2 + 1);
         return var6;
      } else {
         return rdn_3.break_;
      }
   }

   public boolean class_(rXk_1 var1, rYB var2) {
      int var3 = 0;
      rdn_3 var4 = rdn_3.break_;

      for (int var5 = 0; var5 < var1.else_(); var5++) {
         rdn_3 var6 = var1.extends_(var5);
         if (!var6.class_()) {
            if (var6.break_() == rdy_3.JX) {
               if (!var4.class_()) {
                  return false;
               }

               var4 = var6;
            } else {
               if (var6.break_() != rdy_3.dM) {
                  return false;
               }

               var3++;
            }
         }
      }

      return !var4.class_() && var3 > 0;
   }

   @Override
   public rkf_3<?> W_() {
      return rkf_3.throws_;
   }
}
