package celestial;

public class rkD_2 extends rWb_1 {
   public rkD_2(rqO_2 var1) {
      super(
         var1,
         "",
         3,
         3,
         rqs_3.class_(
            rkg_3.class_,
            rkg_3.class_(rdy_3.Xb),
            rkg_3.class_(rdy_3.Xb),
            rkg_3.class_(rdy_3.Xb),
            rkg_3.class_(rdy_3.Xb),
            rkg_3.class_(rdy_3.JX),
            rkg_3.class_(rdy_3.Xb),
            rkg_3.class_(rdy_3.Xb),
            rkg_3.class_(rdy_3.Xb),
            rkg_3.class_(rdy_3.Xb)
         ),
         new rdn_3(rdy_3.dM)
      );
   }

   @Override
   public rdn_3 class_(rXk_1 var1) {
      rdn_3 var2 = rdn_3.break_;

      for (int var3 = 0; var3 < var1.else_() && var2.class_(); var3++) {
         rdn_3 var4 = var1.extends_(var3);
         if (var4.break_() == rdy_3.JX) {
            var2 = var4;
         }
      }

      var2 = var2.implements_();
      var2.throws_(1);
      var2.int_().break_("map_scale_direction", 1);
      return var2;
   }

   @Override
   public boolean class_(rXk_1 var1, rYB var2) {
      if (!super.class_(var1, var2)) {
         return false;
      } else {
         rdn_3 var3 = rdn_3.break_;

         for (int var4 = 0; var4 < var1.else_() && var3.class_(); var4++) {
            rdn_3 var5 = var1.extends_(var4);
            if (var5.break_() == rdy_3.JX) {
               var3 = var5;
            }
         }

         if (var3.class_()) {
            return false;
         } else {
            rrGb_1 var6 = rxI_2.break_(var3, var2);
            if (var6 == null) {
               return false;
            } else {
               return this.class_(var6) ? false : var6.case_ < 4;
            }
         }
      }
   }

   private boolean class_(rrGb_1 var1) {
      if (var1.finally_ != null) {
         for (rrGO var3 : var1.finally_.values()) {
            if (var3.break_() == rrGh_1.MANSION || var3.break_() == rrGh_1.MONUMENT) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   public boolean implements_() {
      return true;
   }

   @Override
   public rkf_3<?> W_() {
      return rkf_3.case_;
   }
}
