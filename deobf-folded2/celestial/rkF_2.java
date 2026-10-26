package celestial;

import com.google.common.collect.Lists;
import java.util.ArrayList;

public class rkF_2 extends rWN {
   public rkF_2(rqO_2 var1) {
      super(var1);
   }

   @Override
   public boolean id_class(int var1, int var2) {
      return var1 * var2 >= 2;
   }

   public rdn_3 id_class(rXk_1 var1) {
      ArrayList var2 = Lists.newArrayList();
      rdn_3 var3 = rdn_3.id_break;

      for (int var4 = 0; var4 < var1.id_else(); var4++) {
         rdn_3 var5 = var1.id_extends(var4);
         if (!var5.id_class()) {
            rdb_3 var6 = var5.id_break();
            if (var6 instanceof rds_3) {
               if (!var3.id_class()) {
                  return rdn_3.id_break;
               }

               var3 = var5.id_implements();
            } else {
               if (!(var6 instanceof rxA_2)) {
                  return rdn_3.id_break;
               }

               var2.add((rxA_2)var6);
            }
         }
      }

      return !var3.id_class() && !var2.isEmpty() ? rds_3.id_class(var3, var2) : rdn_3.id_break;
   }

   public boolean id_class(rXk_1 var1, rYB var2) {
      rdn_3 var3 = rdn_3.id_break;
      ArrayList var4 = Lists.newArrayList();

      for (int var5 = 0; var5 < var1.id_else(); var5++) {
         rdn_3 var6 = var1.id_extends(var5);
         if (!var6.id_class()) {
            if (var6.id_break() instanceof rds_3) {
               if (!var3.id_class()) {
                  return false;
               }

               var3 = var6;
            } else {
               if (!(var6.id_break() instanceof rxA_2)) {
                  return false;
               }

               var4.add(var6);
            }
         }
      }

      return !var3.id_class() && !var4.isEmpty();
   }

   @Override
   public rkf_3<?> W_() {
      return rkf_3.id_byte;
   }
}
