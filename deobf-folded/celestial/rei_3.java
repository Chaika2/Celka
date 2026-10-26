package celestial;

import java.util.List;
import java.util.Random;

class rei_3 implements raP_2 {
   @Override
   public void id_class() {
   }

   @Override
   public boolean id_class(rrPt_1 var1, int var2, rar_3 var3, rfH_2 var4, List<rrrn_1> var5, Random var6) {
      rqd_3 var7 = var3.id_break.id_protected();
      rar_3 var8 = reD_2.id_class(var5, reD_2.id_class(var1, var3, new rfH_2(-3, 4, -3), "fat_tower_base", var7, true));
      var8 = reD_2.id_class(var5, reD_2.id_class(var1, var8, new rfH_2(0, 4, 0), "fat_tower_middle", var7, true));

      for (int var9 = 0; var9 < 2 && var6.nextInt(3) != 0; var9++) {
         var8 = reD_2.id_class(var5, reD_2.id_class(var1, var8, new rfH_2(0, 8, 0), "fat_tower_middle", var7, true));

         for (rqj_3 var11 : reD_2.id_catch) {
            if (var6.nextBoolean()) {
               rar_3 var12 = reD_2.id_class(
                  var5, reD_2.id_class(var1, var8, (rfH_2)var11.id_break(), "bridge_end", var7.id_class((rqd_3)var11.id_class()), true)
               );
               reD_2.id_class(var1, reD_2.id_case, var2 + 1, var12, (rfH_2)null, var5, var6);
            }
         }
      }

      reD_2.id_class(var5, reD_2.id_class(var1, var8, new rfH_2(-2, 8, -2), "fat_tower_top", var7, true));
      return true;
   }
}
