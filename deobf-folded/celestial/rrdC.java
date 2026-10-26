package celestial;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class rrdC {
   public static Iterator<yQ_2> id_class(gm_3 var0, double var1, an_3 var3, int var4, yO_2 var5) {
      float var6 = rrdZ.V();
      if (!(var6 <= 0.0F) && !(var6 >= (float)((var4 - 1) * 16))) {
         int var17 = rfU_2.id_case(var6 / 16.0F) + 1;
         float var8 = var0.id_throws((float)var1);
         float var9 = rrdZ.sw * rfU_2.id_throws;
         float var10 = var8 > rfU_2.id_protected && var8 < 3.0F * rfU_2.id_protected ? var8 + rfU_2.id_break : var8;
         float var11 = -rfU_2.id_class(var10);
         float var12 = rfU_2.id_break(var10) * rfU_2.id_break(var9);
         float var13 = -rfU_2.id_break(var10) * rfU_2.id_class(var9);
         rfH_2 var14 = new rfH_2(rfU_2.id_byte(var3.rx()) >> 4, rfU_2.id_byte(var3.re()) >> 4, rfU_2.id_byte(var3.BO()) >> 4);
         rfH_2 var15 = var14.id_byte((double)(-var11 * (float)var17), (double)(-var12 * (float)var17), (double)(-var13 * (float)var17));
         rfH_2 var16 = var14.id_byte((double)(var11 * (float)var4), (double)(var12 * (float)var4), (double)(var13 * (float)var4));
         return new rrds_1(var5, var15, var16, var17, var17);
      } else {
         List var7 = Arrays.asList(var5.id_case);
         return var7.iterator();
      }
   }
}
