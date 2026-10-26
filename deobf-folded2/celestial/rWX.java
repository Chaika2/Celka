package celestial;

public class rWX extends rWN {
   public rWX(rqO_2 var1) {
      super(var1);
   }

   @Override
   public boolean id_class(int var1, int var2) {
      return var1 * var2 >= 2;
   }

   public rdn_3 id_class(rXk_1 var1) {
      rdn_3 var2 = rdn_3.id_break;
      rdn_3 var3 = rdn_3.id_break;

      for (int var4 = 0; var4 < var1.id_else(); var4++) {
         rdn_3 var5 = var1.id_extends(var4);
         if (!var5.id_class()) {
            if (var5.id_break() instanceof rxO_2) {
               var2 = var5;
            } else if (var5.id_break() == rdy_3.kN) {
               var3 = var5.id_implements();
            }
         }
      }

      if (var3.id_class()) {
         return var3;
      } else {
         rcd_3 var6 = var2.id_break("BlockEntityTag");
         rcd_3 var7 = var6 == null ? new rcd_3() : var6.id_catch();
         var7.id_break("Base", ((rxO_2)var2.id_break()).id_byte().id_break());
         var3.id_class("BlockEntityTag", var7);
         return var3;
      }
   }

   public boolean id_class(rXk_1 var1, rYB var2) {
      rdn_3 var3 = rdn_3.id_break;
      rdn_3 var4 = rdn_3.id_break;

      for (int var5 = 0; var5 < var1.id_else(); var5++) {
         rdn_3 var6 = var1.id_extends(var5);
         if (!var6.id_class()) {
            if (var6.id_break() instanceof rxO_2) {
               if (!var4.id_class()) {
                  return false;
               }

               var4 = var6;
            } else {
               if (var6.id_break() != rdy_3.kN) {
                  return false;
               }

               if (!var3.id_class()) {
                  return false;
               }

               if (var6.id_break("BlockEntityTag") != null) {
                  return false;
               }

               var3 = var6;
            }
         }
      }

      return !var3.id_class() && !var4.id_class();
   }

   @Override
   public rkf_3<?> W_() {
      return rkf_3.id_native;
   }
}
