package celestial;

import com.google.common.collect.Lists;
import java.util.ArrayList;

public class rkF_2 extends rWN {
   public rkF_2(rqO_2 var1) {
      super(var1);
   }

   @Override
   public boolean class_(int var1, int var2) {
      return var1 * var2 >= 2;
   }

   public rdn_3 class_(rXk_1 var1) {
      ArrayList var2 = Lists.newArrayList();
      rdn_3 var3 = rdn_3.break_;

      for (int var4 = 0; var4 < var1.else_(); var4++) {
         rdn_3 var5 = var1.extends_(var4);
         if (!var5.class_()) {
            rdb_3 var6 = var5.break_();
            if (var6 instanceof rds_3) {
               if (!var3.class_()) {
                  return rdn_3.break_;
               }

               var3 = var5.implements_();
            } else {
               if (!(var6 instanceof rxA_2)) {
                  return rdn_3.break_;
               }

               var2.add((rxA_2)var6);
            }
         }
      }

      return !var3.class_() && !var2.isEmpty() ? rds_3.class_(var3, var2) : rdn_3.break_;
   }

   public boolean class_(rXk_1 var1, rYB var2) {
      rdn_3 var3 = rdn_3.break_;
      ArrayList var4 = Lists.newArrayList();

      for (int var5 = 0; var5 < var1.else_(); var5++) {
         rdn_3 var6 = var1.extends_(var5);
         if (!var6.class_()) {
            if (var6.break_() instanceof rds_3) {
               if (!var3.class_()) {
                  return false;
               }

               var3 = var6;
            } else {
               if (!(var6.break_() instanceof rxA_2)) {
                  return false;
               }

               var4.add(var6);
            }
         }
      }

      return !var3.class_() && !var4.isEmpty();
   }

   @Override
   public rkf_3<?> W_() {
      return rkf_3.byte_;
   }
}
