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

   public boolean class_(rXk_1 var1, rYB var2) {
      ArrayList var3 = Lists.newArrayList();

      for (int var4 = 0; var4 < var1.else_(); var4++) {
         rdn_3 var5 = var1.extends_(var4);
         if (!var5.class_()) {
            var3.add(var5);
            if (var3.size() > 1) {
               rdn_3 var6 = (rdn_3)var3.get(0);
               if (var5.break_() != var6.break_() || var6.char_() != 1 || var5.char_() != 1 || !var6.break_().extends_()) {
                  return false;
               }
            }
         }
      }

      return var3.size() == 2;
   }

   public rdn_3 class_(rXk_1 var1) {
      ArrayList var2 = Lists.newArrayList();

      for (int var3 = 0; var3 < var1.else_(); var3++) {
         rdn_3 var4 = var1.extends_(var3);
         if (!var4.class_()) {
            var2.add(var4);
            if (var2.size() > 1) {
               rdn_3 var5 = (rdn_3)var2.get(0);
               if (var4.break_() != var5.break_() || var5.char_() != 1 || var4.char_() != 1 || !var5.break_().extends_()) {
                  return rdn_3.break_;
               }
            }
         }
      }

      if (var2.size() == 2) {
         rdn_3 var14 = (rdn_3)var2.get(0);
         rdn_3 var15 = (rdn_3)var2.get(1);
         if (var14.break_() == var15.break_() && var14.char_() == 1 && var15.char_() == 1 && var14.break_().extends_()) {
            rdb_3 var16 = var14.break_();
            int var6 = var16.finally_() - var14.catch_();
            int var7 = var16.finally_() - var15.catch_();
            int var8 = var6 + var7 + var16.finally_() * 5 / 100;
            int var9 = var16.finally_() - var8;
            if (var9 < 0) {
               var9 = 0;
            }

            rdn_3 var10 = new rdn_3(var14.break_());
            var10.break_(var9);
            HashMap var11 = Maps.newHashMap();
            Map var12 = eA_2.class_(var14);
            Map var13 = eA_2.class_(var15);
            rVL.boolean_.case_().filter(ev_3::byte_).forEach(var3x -> {
               int var4x = Math.max(var12.getOrDefault(var3x, 0), var13.getOrDefault(var3x, 0));
               if (var4x > 0) {
                  var11.put(var3x, var4x);
               }
            });
            if (!var11.isEmpty()) {
               eA_2.class_(var11, var10);
            }

            return var10;
         }
      }

      return rdn_3.break_;
   }

   @Override
   public boolean class_(int var1, int var2) {
      return var1 * var2 >= 2;
   }

   @Override
   public rkf_3<?> W_() {
      return rkf_3.package_;
   }
}
