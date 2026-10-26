package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;

public class rUq_1 extends rUO<rDT> {
   public rUq_1(Codec<rDT> var1) {
      super(var1);
   }

   public static boolean class_(rRg_1 var0, Random var1, rfH_2 var2, rDT var3, int var4, int var5) {
      xd_3 var6 = var0.byte_(var2.break_()).break_();
      if (!var6.class_(rls_3.c)) {
         return false;
      } else {
         int var7 = var2.c_();
         if (var7 >= 1 && var7 + 1 < 256) {
            int var8 = 0;

            for (int var9 = 0; var9 < var4 * var4; var9++) {
               rfH_2 var10 = var2.break_(
                  var1.nextInt(var4) - var1.nextInt(var4), var1.nextInt(var5) - var1.nextInt(var5), var1.nextInt(var4) - var1.nextInt(var4)
               );
               xc_3 var11 = var3.break_.class_(var1, var10);
               if (var0.finally_(var10) && var10.c_() > 0 && var11.class_(var0, var10)) {
                  var0.class_(var10, var11, 2);
                  var8++;
               }
            }

            return var8 > 0;
         } else {
            return false;
         }
      }
   }

   public boolean class_(rRI var1, rKd_1 var2, Random var3, rfH_2 var4, rDT var5) {
      return class_(var1, var3, var4, var5, 8, 4);
   }
}
