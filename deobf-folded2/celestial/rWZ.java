package celestial;

public class rWZ extends rWN {
   public rWZ(rqO_2 var1) {
      super(var1);
   }

   @Override
   public boolean id_class(int var1, int var2) {
      return var1 >= 2 && var2 >= 2;
   }

   public rdn_3 id_class(rXk_1 var1) {
      rdn_3 var2 = var1.id_extends(1 + var1.id_protected());
      if (var2.id_break() != rdy_3.kQ) {
         return rdn_3.id_break;
      } else {
         rdn_3 var3 = new rdn_3(rdy_3.kz, 8);
         rAB.id_class(var3, rAB.id_protected(var2));
         rAB.id_class(var3, rAB.id_break(var2));
         return var3;
      }
   }

   public boolean id_class(rXk_1 var1, rYB var2) {
      if (var1.id_protected() == 3 && var1.id_byte() == 3) {
         for (int var3 = 0; var3 < var1.id_protected(); var3++) {
            for (int var4 = 0; var4 < var1.id_byte(); var4++) {
               rdn_3 var5 = var1.id_extends(var3 + var4 * var1.id_protected());
               if (var5.id_class()) {
                  return false;
               }

               rdb_3 var6 = var5.id_break();
               if (var3 == 1 && var4 == 1) {
                  if (var6 != rdy_3.kQ) {
                     return false;
                  }
               } else if (var6 != rdy_3.OO) {
                  return false;
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public rkf_3<?> W_() {
      return rkf_3.id_finally;
   }
}
