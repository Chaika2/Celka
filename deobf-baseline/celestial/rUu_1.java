package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;

public class rUu_1 extends rUO<rUt_1> {
   public rUu_1(Codec<rUt_1> var1) {
      super(var1);
   }

   public boolean id_class(rRI var1, rKd_1 var2, Random var3, rfH_2 var4, rUt_1 var5) {
      if (!var1.id_finally(var4)) {
         return false;
      } else {
         xc_3 var6 = var1.id_byte(var4.id_final());
         if (!var6.id_class(xu_3.PR) && !var6.id_class(xu_3.PK) && !var6.id_class(xu_3.Ju)) {
            return false;
         } else {
            var1.id_class(var4, xu_3.Pa.id_continue(), 2);

            for (int var7 = 0; var7 < 1500; var7++) {
               rfH_2 var8 = var4.id_break(var3.nextInt(8) - var3.nextInt(8), -var3.nextInt(12), var3.nextInt(8) - var3.nextInt(8));
               if (var1.id_byte(var8).id_catch()) {
                  int var9 = 0;

                  for (rpr_3 var13 : rpr_3.values()) {
                     if (var1.id_byte(var8.id_break(var13)).id_class(xu_3.Pa)) {
                        var9++;
                     }

                     if (var9 > 1) {
                        break;
                     }
                  }

                  if (var9 == 1) {
                     var1.id_class(var8, xu_3.Pa.id_continue(), 2);
                  }
               }
            }

            return true;
         }
      }
   }
}
