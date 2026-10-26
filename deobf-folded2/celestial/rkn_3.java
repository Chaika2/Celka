package celestial;

public class rkn_3 extends rWN {
   public rkn_3(rqO_2 var1) {
      super(var1);
   }

   @Override
   public boolean id_class(int var1, int var2) {
      return var1 >= 3 && var2 >= 3;
   }

   public boolean id_class(rXk_1 var1, rYB var2) {
      int var3 = 0;
      rdn_3 var4 = rdn_3.id_break;

      for (int var5 = 0; var5 < var1.id_else(); var5++) {
         rdn_3 var6 = var1.id_extends(var5);
         if (!var6.id_class()) {
            if (var6.id_break() == rdy_3.dr) {
               if (!var4.id_class()) {
                  return false;
               }

               var4 = var6;
            } else {
               if (var6.id_break() != rdy_3.xi) {
                  return false;
               }

               var3++;
            }
         }
      }

      return !var4.id_class() && var4.id_final() && var3 > 0;
   }

   public rdn_3 id_class(rXk_1 var1) {
      int var2 = 0;
      rdn_3 var3 = rdn_3.id_break;

      for (int var4 = 0; var4 < var1.id_else(); var4++) {
         rdn_3 var5 = var1.id_extends(var4);
         if (!var5.id_class()) {
            if (var5.id_break() == rdy_3.dr) {
               if (!var3.id_class()) {
                  return rdn_3.id_break;
               }

               var3 = var5;
            } else {
               if (var5.id_break() != rdy_3.xi) {
                  return rdn_3.id_break;
               }

               var2++;
            }
         }
      }

      if (!var3.id_class() && var3.id_final() && var2 >= 1 && rkZ_2.id_protected(var3) < 2) {
         rdn_3 var6 = new rdn_3(rdy_3.dr, var2);
         rcd_3 var7 = var3.id_package().id_catch();
         var7.id_break("generation", rkZ_2.id_protected(var3) + 1);
         var6.id_byte(var7);
         return var6;
      } else {
         return rdn_3.id_break;
      }
   }

   public rqs_3<rdn_3> id_break(rXk_1 var1) {
      rqs_3 var2 = rqs_3.id_class(var1.id_else(), rdn_3.id_break);

      for (int var3 = 0; var3 < var2.size(); var3++) {
         rdn_3 var4 = var1.id_extends(var3);
         if (var4.id_break().id_int()) {
            var2.set(var3, new rdn_3(var4.id_break().id_package()));
         } else if (var4.id_break() instanceof rkZ_2) {
            rdn_3 var5 = var4.id_implements();
            var5.id_throws(1);
            var2.set(var3, var5);
            break;
         }
      }

      return var2;
   }

   @Override
   public rkf_3<?> W_() {
      return rkf_3.id_protected;
   }
}
