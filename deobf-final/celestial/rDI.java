package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;

public class rDI extends rUO<rUt_1> {
   public rDI(Codec<rUt_1> var1) {
      super(var1);
   }

   public boolean class_(rRI var1, rKd_1 var2, Random var3, rfH_2 var4, rUt_1 var5) {
      if (var4.c_() > var1.short_() - 1) {
         return false;
      } else if (!var1.byte_(var4).class_(xu_3.try_) && !var1.byte_(var4.break_()).class_(xu_3.try_)) {
         return false;
      } else {
         boolean var6 = false;

         for (rpr_3 var10 : rpr_3.values()) {
            if (var10 != rpr_3.DOWN && var1.byte_(var4.break_(var10)).class_(xu_3.Ei)) {
               var6 = true;
               break;
            }
         }

         if (!var6) {
            return false;
         } else {
            var1.class_(var4, xu_3.hP.continue_(), 2);

            for (int var17 = 0; var17 < 200; var17++) {
               int var18 = var3.nextInt(5) - var3.nextInt(6);
               int var19 = 3;
               if (var18 < 2) {
                  var19 += var18 / 2;
               }

               if (var19 >= 1) {
                  rfH_2 var20 = var4.break_(var3.nextInt(var19) - var3.nextInt(var19), var18, var3.nextInt(var19) - var3.nextInt(var19));
                  xc_3 var11 = var1.byte_(var20);
                  if (var11.byte_() == QP.class_ || var11.class_(xu_3.try_) || var11.class_(xu_3.Ei) || var11.class_(xu_3.PT)) {
                     for (rpr_3 var15 : rpr_3.values()) {
                        xc_3 var16 = var1.byte_(var20.break_(var15));
                        if (var16.class_(xu_3.hP)) {
                           var1.class_(var20, xu_3.hP.continue_(), 2);
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
