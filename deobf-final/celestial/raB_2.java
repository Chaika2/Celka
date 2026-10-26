package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;

public class raB_2 extends rrrZ<rUt_1> {
   public raB_2(Codec<rUt_1> var1) {
      super(var1);
   }

   @Override
   public rrrv_1<rUt_1> class_() {
      return raS_2::new;
   }

   static int class_(int var0, int var1, rKd_1 var2) {
      Random var3 = new Random((long)(var0 + var1 * 10387313));
      rqd_3 var4 = rqd_3.class_(var3);
      byte var5 = 5;
      byte var6 = 5;
      if (var4 == rqd_3.CLOCKWISE_90) {
         var5 = -5;
      } else if (var4 == rqd_3.CLOCKWISE_180) {
         var5 = -5;
         var6 = -5;
      } else if (var4 == rqd_3.COUNTERCLOCKWISE_90) {
         var6 = -5;
      }

      int var7 = (var0 << 4) + 7;
      int var8 = (var1 << 4) + 7;
      int var9 = var2.byte_(var7, var8, rKv_1.WORLD_SURFACE_WG);
      int var10 = var2.byte_(var7, var8 + var6, rKv_1.WORLD_SURFACE_WG);
      int var11 = var2.byte_(var7 + var5, var8, rKv_1.WORLD_SURFACE_WG);
      int var12 = var2.byte_(var7 + var5, var8 + var6, rKv_1.WORLD_SURFACE_WG);
      return Math.min(Math.min(var9, var10), Math.min(var11, var12));
   }

   protected boolean class_(rKd_1 var1, rYY var2, long var3, rqm_3 var5, int var6, int var7, rYG var8, rfj_3 var9, rUt_1 var10) {
      return class_(var6, var7, var1) >= 60;
   }

   @Override
   protected boolean break_() {
      return false;
   }
}
