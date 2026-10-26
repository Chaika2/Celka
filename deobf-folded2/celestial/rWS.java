package celestial;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class rWS extends rWN {
   public rWS(rqO_2 var1) {
      super(var1);
   }

   public boolean id_class(rXk_1 var1, rYB var2) {
      ArrayList var3 = Lists.newArrayList();

      for (int var4 = 0; var4 < var1.id_else(); var4++) {
         rdn_3 var5 = var1.id_extends(var4);
         if (!var5.id_class()) {
            var3.add(var5);
            if (var3.size() > 1) {
               rdn_3 var6 = (rdn_3)var3.get(0);
               if (var5.id_break() != var6.id_break() || var6.id_char() != 1 || var5.id_char() != 1 || !var6.id_break().id_extends()) {
                  return false;
               }
            }
         }
      }

      return var3.size() == 2;
   }

   public rdn_3 id_class(rXk_1 var1) {
      ArrayList var2 = Lists.newArrayList();

      for (int var3 = 0; var3 < var1.id_else(); var3++) {
         rdn_3 var4 = var1.id_extends(var3);
         if (!var4.id_class()) {
            var2.add(var4);
            if (var2.size() > 1) {
               rdn_3 var5 = (rdn_3)var2.get(0);
               if (var4.id_break() != var5.id_break() || var5.id_char() != 1 || var4.id_char() != 1 || !var5.id_break().id_extends()) {
                  return rdn_3.id_break;
               }
            }
         }
      }

      if (var2.size() == 2) {
         rdn_3 var14 = (rdn_3)var2.get(0);
         rdn_3 var15 = (rdn_3)var2.get(1);
         if (var14.id_break() == var15.id_break() && var14.id_char() == 1 && var15.id_char() == 1 && var14.id_break().id_extends()) {
            rdb_3 var16 = var14.id_break();
            int var6 = var16.id_finally() - var14.id_catch();
            int var7 = var16.id_finally() - var15.id_catch();
            int var8 = var6 + var7 + var16.id_finally() * 5 / 100;
            int var9 = var16.id_finally() - var8;
            if (var9 < 0) {
               var9 = 0;
            }

            rdn_3 var10 = new rdn_3(var14.id_break());
            var10.id_break(var9);
            HashMap var11 = Maps.newHashMap();
            Map var12 = eA_2.id_class(var14);
            Map var13 = eA_2.id_class(var15);
            rVL.id_boolean.id_case().filter(ev_3::id_byte).forEach(var3x -> {
               int var4x = Math.max(var12.getOrDefault(var3x, 0), var13.getOrDefault(var3x, 0));
               if (var4x > 0) {
                  var11.put(var3x, var4x);
               }
            });
            if (!var11.isEmpty()) {
               eA_2.id_class(var11, var10);
            }

            return var10;
         }
      }

      return rdn_3.id_break;
   }

   @Override
   public boolean id_class(int var1, int var2) {
      return var1 * var2 >= 2;
   }

   @Override
   public rkf_3<?> W_() {
      return rkf_3.id_package;
   }
}
