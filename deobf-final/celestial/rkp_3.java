package celestial;

import com.google.common.collect.Lists;
import java.util.ArrayList;

public class rkp_3 extends rWN {
   private static final rkg_3 class_ = rkg_3.class_(rdy_3.du);

   public rkp_3(rqO_2 var1) {
      super(var1);
   }

   public boolean class_(rXk_1 var1, rYB var2) {
      boolean var3 = false;
      boolean var4 = false;

      for (int var5 = 0; var5 < var1.else_(); var5++) {
         rdn_3 var6 = var1.extends_(var5);
         if (!var6.class_()) {
            if (var6.break_() instanceof rxA_2) {
               var3 = true;
            } else {
               if (!class_.class_(var6)) {
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
   public boolean class_(int var1, int var2) {
      return var1 * var2 >= 2;
   }

   public rdn_3 class_(rXk_1 var1) {
      ArrayList var2 = Lists.newArrayList();
      rdn_3 var3 = null;

      for (int var4 = 0; var4 < var1.else_(); var4++) {
         rdn_3 var5 = var1.extends_(var4);
         rdb_3 var6 = var5.break_();
         if (var6 instanceof rxA_2) {
            var2.add(((rxA_2)var6).byte_().case_());
         } else if (class_.class_(var5)) {
            var3 = var5.implements_();
            var3.throws_(1);
         }
      }

      if (var3 != null && !var2.isEmpty()) {
         var3.class_("Explosion").class_("FadeColors", var2);
         return var3;
      } else {
         return rdn_3.break_;
      }
   }

   @Override
   public rkf_3<?> W_() {
      return rkf_3.implements_;
   }
}
