package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;

public class rDI extends rUO<rUt_1> {
   public rDI(Codec<rUt_1> var1) {
      super(var1);
   }

   public boolean id_class(rRI var1, rKd_1 var2, Random var3, rfH_2 var4, rUt_1 var5) {
      if (var4.c_() > var1.id_short() - 1) {
         return false;
      } else if (!var1.id_byte(var4).id_class(xu_3.id_try) && !var1.id_byte(var4.id_break()).id_class(xu_3.id_try)) {
         return false;
      } else {
         boolean var6 = false;

         for (rpr_3 var10 : rpr_3.values()) {
            if (var10 != rpr_3.DOWN && var1.id_byte(var4.id_break(var10)).id_class(xu_3.Ei)) {
               var6 = true;
               break;
            }
         }

         if (!var6) {
            return false;
         } else {
            var1.id_class(var4, xu_3.hP.id_continue(), 2);

            for (int var17 = 0; var17 < 200; var17++) {
               int var18 = var3.nextInt(5) - var3.nextInt(6);
               int var19 = 3;
               if (var18 < 2) {
                  var19 += var18 / 2;
               }

               if (var19 >= 1) {
                  rfH_2 var20 = var4.id_break(var3.nextInt(var19) - var3.nextInt(var19), var18, var3.nextInt(var19) - var3.nextInt(var19));
                  xc_3 var11 = var1.id_byte(var20);
                  if (var11.id_byte() == QP.id_class || var11.id_class(xu_3.id_try) || var11.id_class(xu_3.Ei) || var11.id_class(xu_3.PT)) {
                     for (rpr_3 var15 : rpr_3.values()) {
                        xc_3 var16 = var1.id_byte(var20.id_break(var15));
                        if (var16.id_class(xu_3.hP)) {
                           var1.id_class(var20, xu_3.hP.id_continue(), 2);
                           break;
                        }
                     }
                  }
               }
            }

            return true;
         }
      }
   }
}
