package celestial;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Set;

public class ii_3 extends rrr_3<rsq_3> {
   public ii_3() {
      super(40);
   }

   @Override
   public Set<il_3<?>> class_() {
      return ImmutableSet.of(il_3.case_);
   }

   protected void class_(rrEm_1 var1, rsq_3 var2) {
      rqM_2 var3 = var1.E();
      rfH_2 var4 = var2.Bs();
      ArrayList var5 = Lists.newArrayList();
      byte var6 = 4;

      for (int var7 = -4; var7 <= 4; var7++) {
         for (int var8 = -2; var8 <= 2; var8++) {
            for (int var9 = -4; var9 <= 4; var9++) {
               rfH_2 var10 = var4.break_(var7, var8, var9);
               if (var2.su().break_().byte_().contains(var1.byte_(var10).break_())) {
                  var5.add(rfK_2.class_(var3, var10));
               }
            }
         }
      }

      iZ_2 var11 = var2.SF();
      if (!var5.isEmpty()) {
         var11.class_(il_3.case_, var5);
      } else {
         var11.break_(il_3.case_);
      }
   }
}
