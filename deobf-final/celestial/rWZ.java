package celestial;

public class rWZ extends rWN {
   public rWZ(rqO_2 var1) {
      super(var1);
   }

   @Override
   public boolean class_(int var1, int var2) {
      return var1 >= 2 && var2 >= 2;
   }

   public rdn_3 class_(rXk_1 var1) {
      rdn_3 var2 = var1.extends_(1 + var1.protected_());
      if (var2.break_() != rdy_3.kQ) {
         return rdn_3.break_;
      } else {
         rdn_3 var3 = new rdn_3(rdy_3.kz, 8);
         rAB.class_(var3, rAB.protected_(var2));
         rAB.class_(var3, rAB.break_(var2));
         return var3;
      }
   }

   public boolean class_(rXk_1 var1, rYB var2) {
      if (var1.protected_() == 3 && var1.byte_() == 3) {
         for (int var3 = 0; var3 < var1.protected_(); var3++) {
            for (int var4 = 0; var4 < var1.byte_(); var4++) {
               rdn_3 var5 = var1.extends_(var3 + var4 * var1.protected_());
               if (var5.class_()) {
                  return false;
               }

               rdb_3 var6 = var5.break_();
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
      return rkf_3.finally_;
   }
}
