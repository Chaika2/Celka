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
   public Set<il_3<?>> id_class() {
      return ImmutableSet.of(il_3.id_case);
   }

   protected void id_class(rrEm_1 var1, rsq_3 var2) {
      rqM_2 var3 = var1.E();
      rfH_2 var4 = var2.Bs();
      ArrayList var5 = Lists.newArrayList();
      byte var6 = 4;

      for (int var7 = -4; var7 <= 4; var7++) {
         for (int var8 = -2; var8 <= 2; var8++) {
            for (int var9 = -4; var9 <= 4; var9++) {
               rfH_2 var10 = var4.id_break(var7, var8, var9);
               if (var2.su().id_break().id_byte().contains(var1.id_byte(var10).id_break())) {
                  var5.add(rfK_2.id_class(var3, var10));
               }
            }
         }
      }

      iZ_2 var11 = var2.SF();
      if (!var5.isEmpty()) {
         var11.id_class(il_3.id_case, var5);
      } else {
         var11.id_break(il_3.id_case);
      }
   }
}
