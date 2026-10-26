package celestial;

import java.util.List;
import java.util.Random;

class rea_3 implements raP_2 {
   public boolean id_class;

   @Override
   public void id_class() {
      this.id_class = false;
   }

   @Override
   public boolean id_class(rrPt_1 var1, int var2, rar_3 var3, rfH_2 var4, List<rrrn_1> var5, Random var6) {
      rqd_3 var7 = var3.id_break.id_protected();
      int var8 = var6.nextInt(4) + 1;
      rar_3 var9 = reD_2.id_class(var5, reD_2.id_class(var1, var3, new rfH_2(0, 0, -4), "bridge_piece", var7, true));
      var9.id_package = -1;
      byte var10 = 0;

      for (int var11 = 0; var11 < var8; var11++) {
         if (var6.nextBoolean()) {
            var9 = reD_2.id_class(var5, reD_2.id_class(var1, var9, new rfH_2(0, var10, -4), "bridge_piece", var7, true));
            var10 = 0;
         } else {
            if (var6.nextBoolean()) {
               var9 = reD_2.id_class(var5, reD_2.id_class(var1, var9, new rfH_2(0, var10, -4), "bridge_steep_stairs", var7, true));
            } else {
               var9 = reD_2.id_class(var5, reD_2.id_class(var1, var9, new rfH_2(0, var10, -8), "bridge_gentle_stairs", var7, true));
            }

            var10 = 4;
         }
      }

      if (!this.id_class && var6.nextInt(10 - var2) == 0) {
         reD_2.id_class(var5, reD_2.id_class(var1, var9, new rfH_2(-8 + var6.nextInt(8), var10, -70 + var6.nextInt(10)), "ship", var7, true));
         this.id_class = true;
      } else if (!reD_2.id_class(var1, reD_2.id_byte, var2 + 1, var9, new rfH_2(-3, var10 + 1, -11), var5, var6)) {
         return false;
      }

      var9 = reD_2.id_class(var5, reD_2.id_class(var1, var9, new rfH_2(4, var10, 0), "bridge_end", var7.id_class(rqd_3.CLOCKWISE_180), true));
      var9.id_package = -1;
      return true;
   }
}
