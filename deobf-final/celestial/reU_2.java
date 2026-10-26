package celestial;

import java.util.List;
import java.util.Random;

class reU_2 implements raP_2 {
   @Override
   public void class_() {
   }

   @Override
   public boolean class_(rrPt_1 var1, int var2, rar_3 var3, rfH_2 var4, List<rrrn_1> var5, Random var6) {
      if (var2 > 8) {
         return false;
      } else {
         rqd_3 var7 = var3.break_.protected_();
         rar_3 var8 = reD_2.class_(var5, reD_2.class_(var1, var3, var4, "base_floor", var7, true));
         int var9 = var6.nextInt(3);
         if (var9 == 0) {
            reD_2.class_(var5, reD_2.class_(var1, var8, new rfH_2(-1, 4, -1), "base_roof", var7, true));
         } else if (var9 == 1) {
            var8 = reD_2.class_(var5, reD_2.class_(var1, var8, new rfH_2(-1, 0, -1), "second_floor_2", var7, false));
            var8 = reD_2.class_(var5, reD_2.class_(var1, var8, new rfH_2(-1, 8, -1), "second_roof", var7, false));
            reD_2.class_(var1, reD_2.throws_, var2 + 1, var8, (rfH_2)null, var5, var6);
         } else if (var9 == 2) {
            var8 = reD_2.class_(var5, reD_2.class_(var1, var8, new rfH_2(-1, 0, -1), "second_floor_2", var7, false));
            var8 = reD_2.class_(var5, reD_2.class_(var1, var8, new rfH_2(-1, 4, -1), "third_floor_2", var7, false));
            var8 = reD_2.class_(var5, reD_2.class_(var1, var8, new rfH_2(-1, 8, -1), "third_roof", var7, true));
            reD_2.class_(var1, reD_2.throws_, var2 + 1, var8, (rfH_2)null, var5, var6);
         }

         return true;
      }
   }
}
