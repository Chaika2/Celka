package celestial;

public class rWX extends rWN {
   public rWX(rqO_2 var1) {
      super(var1);
   }

   @Override
   public boolean class_(int var1, int var2) {
      return var1 * var2 >= 2;
   }

   public rdn_3 class_(rXk_1 var1) {
      rdn_3 var2 = rdn_3.break_;
      rdn_3 var3 = rdn_3.break_;

      for (int var4 = 0; var4 < var1.else_(); var4++) {
         rdn_3 var5 = var1.extends_(var4);
         if (!var5.class_()) {
            if (var5.break_() instanceof rxO_2) {
               var2 = var5;
            } else if (var5.break_() == rdy_3.kN) {
               var3 = var5.implements_();
            }
         }
      }

      if (var3.class_()) {
         return var3;
      } else {
         rcd_3 var6 = var2.break_("BlockEntityTag");
         rcd_3 var7 = var6 == null ? new rcd_3() : var6.catch_();
         var7.break_("Base", ((rxO_2)var2.break_()).byte_().break_());
         var3.class_("BlockEntityTag", var7);
         return var3;
      }
   }

   public boolean class_(rXk_1 var1, rYB var2) {
      rdn_3 var3 = rdn_3.break_;
      rdn_3 var4 = rdn_3.break_;

      for (int var5 = 0; var5 < var1.else_(); var5++) {
         rdn_3 var6 = var1.extends_(var5);
         if (!var6.class_()) {
            if (var6.break_() instanceof rxO_2) {
               if (!var4.class_()) {
                  return false;
               }

               var4 = var6;
            } else {
               if (var6.break_() != rdy_3.kN) {
                  return false;
               }

               if (!var3.class_()) {
                  return false;
               }

               if (var6.break_("BlockEntityTag") != null) {
                  return false;
               }

               var3 = var6;
            }
         }
      }

      return !var3.class_() && !var4.class_();
   }

   @Override
   public rkf_3<?> W_() {
      return rkf_3.native_;
   }
}
