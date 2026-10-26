package celestial;

public class rWJ extends rWN {
   public rWJ(rqO_2 var1) {
      super(var1);
   }

   @Override
   public boolean id_class(int var1, int var2) {
      return var1 * var2 >= 2;
   }

   public rdn_3 id_class(rXk_1 var1) {
      rdn_3 var2 = rdn_3.id_break;
      rxA_2 var3 = (rxA_2)rdy_3.XL;

      for (int var4 = 0; var4 < var1.id_else(); var4++) {
         rdn_3 var5 = var1.id_extends(var4);
         if (!var5.id_class()) {
            rdb_3 var6 = var5.id_break();
            if (xd_3.id_class(var6) instanceof Wp_1) {
               var2 = var5;
            } else if (var6 instanceof rxA_2) {
               var3 = (rxA_2)var6;
            }
         }
      }

      rdn_3 var7 = Wp_1.id_break(var3.id_byte());
      if (var2.id_final()) {
         var7.id_byte(var2.id_package().id_catch());
      }

      return var7;
   }

   public boolean id_class(rXk_1 var1, rYB var2) {
      int var3 = 0;
      int var4 = 0;

      for (int var5 = 0; var5 < var1.id_else(); var5++) {
         rdn_3 var6 = var1.id_extends(var5);
         if (!var6.id_class()) {
            if (xd_3.id_class(var6.id_break()) instanceof Wp_1) {
               var3++;
            } else {
               if (!(var6.id_break() instanceof rxA_2)) {
                  return false;
               }

               var4++;
            }

            if (var4 > 1 || var3 > 1) {
               return false;
            }
         }
      }

      return var3 == 1 && var4 == 1;
   }

   @Override
   public rkf_3<?> W_() {
      return rkf_3.id_volatile;
   }
}
