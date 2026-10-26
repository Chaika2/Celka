package celestial;

public class rkK_2 extends rWN {
   public rkK_2(rqO_2 var1) {
      super(var1);
   }

   @Override
   public boolean id_class(int var1, int var2) {
      return var1 >= 3 && var2 >= 3;
   }

   public rdn_3 id_class(rXk_1 var1) {
      int var2 = 0;
      rdn_3 var3 = rdn_3.id_break;

      for (int var4 = 0; var4 < var1.id_else(); var4++) {
         rdn_3 var5 = var1.id_extends(var4);
         if (!var5.id_class()) {
            if (var5.id_break() == rdy_3.JX) {
               if (!var3.id_class()) {
                  return rdn_3.id_break;
               }

               var3 = var5;
            } else {
               if (var5.id_break() != rdy_3.dM) {
                  return rdn_3.id_break;
               }

               var2++;
            }
         }
      }

      if (!var3.id_class() && var2 >= 1) {
         rdn_3 var6 = var3.id_implements();
         var6.id_throws(var2 + 1);
         return var6;
      } else {
         return rdn_3.id_break;
      }
   }

   public boolean id_class(rXk_1 var1, rYB var2) {
      int var3 = 0;
      rdn_3 var4 = rdn_3.id_break;

      for (int var5 = 0; var5 < var1.id_else(); var5++) {
         rdn_3 var6 = var1.id_extends(var5);
         if (!var6.id_class()) {
            if (var6.id_break() == rdy_3.JX) {
               if (!var4.id_class()) {
                  return false;
               }

               var4 = var6;
            } else {
               if (var6.id_break() != rdy_3.dM) {
                  return false;
               }

               var3++;
            }
         }
      }

      return !var4.id_class() && var3 > 0;
   }

   @Override
   public rkf_3<?> W_() {
      return rkf_3.id_throws;
   }
}
