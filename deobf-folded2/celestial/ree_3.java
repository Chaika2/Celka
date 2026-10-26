package celestial;

import java.util.List;
import java.util.Random;

class ree_3 implements raP_2 {
   @Override
   public void id_class() {
   }

   @Override
   public boolean id_class(rrPt_1 var1, int var2, rar_3 var3, rfH_2 var4, List<rrrn_1> var5, Random var6) {
      rqd_3 var7 = var3.id_break.id_protected();
      rar_3 var8 = reD_2.id_class(var5, reD_2.id_class(var1, var3, new rfH_2(3 + var6.nextInt(2), -3, 3 + var6.nextInt(2)), "tower_base", var7, true));
      var8 = reD_2.id_class(var5, reD_2.id_class(var1, var8, new rfH_2(0, 7, 0), "tower_piece", var7, true));
      rar_3 var9 = var6.nextInt(3) == 0 ? var8 : null;
      int var10 = 1 + var6.nextInt(3);

      for (int var11 = 0; var11 < var10; var11++) {
         var8 = reD_2.id_class(var5, reD_2.id_class(var1, var8, new rfH_2(0, 4, 0), "tower_piece", var7, true));
         if (var11 < var10 - 1 && var6.nextBoolean()) {
            var9 = var8;
         }
      }

      if (var9 != null) {
         for (rqj_3 var12 : reD_2.id_protected) {
            if (var6.nextBoolean()) {
               rar_3 var13 = reD_2.id_class(
                  var5, reD_2.id_class(var1, var9, (rfH_2)var12.id_break(), "bridge_end", var7.id_class((rqd_3)var12.id_class()), true)
               );
               reD_2.id_class(var1, reD_2.id_case, var2 + 1, var13, (rfH_2)null, var5, var6);
            }
         }

         reD_2.id_class(var5, reD_2.id_class(var1, var8, new rfH_2(-1, 4, -1), "tower_top", var7, true));
      } else {
         if (var2 != 7) {
            return reD_2.id_class(var1, reD_2.id_private, var2 + 1, var8, (rfH_2)null, var5, var6);
         }

         reD_2.id_class(var5, reD_2.id_class(var1, var8, new rfH_2(-1, 4, -1), "tower_top", var7, true));
      }

      return true;
   }
}
