package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;

public class rrsb_3 extends rrsE_2<rrsG_2> {
   public rrsb_3(Codec<rrsG_2> var1) {
      super(var1);
   }

   public void id_class(
      Random var1, roC_2 var2, rYG var3, int var4, int var5, int var6, double var7, xc_3 var9, xc_3 var10, int var11, long var12, rrsG_2 var14
   ) {
      double var15 = rYG.id_case.id_class((double)var4 * 0.25, (double)var5 * 0.25, false);
      if (var15 > 0.0) {
         int var17 = var4 & 15;
         int var18 = var5 & 15;
         rfw_3 var19 = new rfw_3();

         for (int var20 = var6; var20 >= 0; var20--) {
            var19.id_class(var17, var20, var18);
            if (!var2.id_byte(var19).id_catch()) {
               if (var20 == 62 && !var2.id_byte(var19).id_class(var10.id_break())) {
                  var2.id_class(var19, var10, false);
               }
               break;
            }
         }
      }

      rrsE_2.id_synchronized.id_class(var1, var2, var3, var4, var5, var6, var7, var9, var10, var11, var12, var14);
   }
}
