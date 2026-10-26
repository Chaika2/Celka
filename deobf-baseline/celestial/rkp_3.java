package celestial;

import com.google.common.collect.Lists;
import java.util.ArrayList;

public class rkp_3 extends rWN {
   private static final rkg_3 id_class = rkg_3.id_class(rdy_3.du);

   public rkp_3(rqO_2 var1) {
      super(var1);
   }

   public boolean id_class(rXk_1 var1, rYB var2) {
      boolean var3 = false;
      boolean var4 = false;

      for (int var5 = 0; var5 < var1.id_else(); var5++) {
         rdn_3 var6 = var1.id_extends(var5);
         if (!var6.id_class()) {
            if (var6.id_break() instanceof rxA_2) {
               var3 = true;
            } else {
               if (!id_class.id_class(var6)) {
                  return false;
               }

               if (var4) {
                  return false;
               }

               var4 = true;
            }
         }
      }

      return var4 && var3;
   }

   @Override
   public boolean id_class(int var1, int var2) {
      return var1 * var2 >= 2;
   }

   public rdn_3 id_class(rXk_1 var1) {
      ArrayList var2 = Lists.newArrayList();
      rdn_3 var3 = null;

      for (int var4 = 0; var4 < var1.id_else(); var4++) {
         rdn_3 var5 = var1.id_extends(var4);
         rdb_3 var6 = var5.id_break();
         if (var6 instanceof rxA_2) {
            var2.add(((rxA_2)var6).id_byte().id_case());
         } else if (id_class.id_class(var5)) {
            var3 = var5.id_implements();
            var3.id_throws(1);
         }
      }

      if (var3 != null && !var2.isEmpty()) {
         var3.id_class("Explosion").id_class("FadeColors", var2);
         return var3;
      } else {
         return rdn_3.id_break;
      }
   }

   @Override
   public rkf_3<?> W_() {
      return rkf_3.id_implements;
   }
}
