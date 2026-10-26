package celestial;

public class rkD_2 extends rWb_1 {
   public rkD_2(rqO_2 var1) {
      super(
         var1,
         "",
         3,
         3,
         rqs_3.id_class(
            rkg_3.id_class,
            rkg_3.id_class(rdy_3.Xb),
            rkg_3.id_class(rdy_3.Xb),
            rkg_3.id_class(rdy_3.Xb),
            rkg_3.id_class(rdy_3.Xb),
            rkg_3.id_class(rdy_3.JX),
            rkg_3.id_class(rdy_3.Xb),
            rkg_3.id_class(rdy_3.Xb),
            rkg_3.id_class(rdy_3.Xb),
            rkg_3.id_class(rdy_3.Xb)
         ),
         new rdn_3(rdy_3.dM)
      );
   }

   @Override
   public rdn_3 id_class(rXk_1 var1) {
      rdn_3 var2 = rdn_3.id_break;

      for (int var3 = 0; var3 < var1.id_else() && var2.id_class(); var3++) {
         rdn_3 var4 = var1.id_extends(var3);
         if (var4.id_break() == rdy_3.JX) {
            var2 = var4;
         }
      }

      var2 = var2.id_implements();
      var2.id_throws(1);
      var2.id_int().id_break("map_scale_direction", 1);
      return var2;
   }

   @Override
   public boolean id_class(rXk_1 var1, rYB var2) {
      if (!super.id_class(var1, var2)) {
         return false;
      } else {
         rdn_3 var3 = rdn_3.id_break;

         for (int var4 = 0; var4 < var1.id_else() && var3.id_class(); var4++) {
            rdn_3 var5 = var1.id_extends(var4);
            if (var5.id_break() == rdy_3.JX) {
               var3 = var5;
            }
         }

         if (var3.id_class()) {
            return false;
         } else {
            rrGb_1 var6 = rxI_2.id_break(var3, var2);
            if (var6 == null) {
               return false;
            } else {
               return this.id_class(var6) ? false : var6.id_case < 4;
            }
         }
      }
   }

   private boolean id_class(rrGb_1 var1) {
      if (var1.id_finally != null) {
         for (rrGO var3 : var1.id_finally.values()) {
            if (var3.id_break() == rrGh_1.MANSION || var3.id_break() == rrGh_1.MONUMENT) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   public boolean id_implements() {
      return true;
   }

   @Override
   public rkf_3<?> W_() {
      return rkf_3.id_case;
   }
}
