package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;

public class rDl_1 extends rUO<rDq_1> {
   public rDl_1(Codec<rDq_1> var1) {
      super(var1);
   }

   public boolean class_(rRI var1, rKd_1 var2, Random var3, rfH_2 var4, rDq_1 var5) {
      while (true) {
         label47: {
            if (var4.c_() > 3) {
               if (var1.finally_(var4.break_())) {
                  break label47;
               }

               xd_3 var6 = var1.byte_(var4.break_()).break_();
               if (!break_(var6) && !class_(var6)) {
                  break label47;
               }
            }

            if (var4.c_() <= 3) {
               return false;
            }

            for (int var13 = 0; var13 < 3; var13++) {
               int var7 = var3.nextInt(2);
               int var8 = var3.nextInt(2);
               int var9 = var3.nextInt(2);
               float var10 = (float)(var7 + var8 + var9) * 0.333F + 0.5F;

               for (rfH_2 var12 : rfH_2.class_(var4.break_(-var7, -var8, -var9), var4.break_(var7, var8, var9))) {
                  if (var12.private_(var4) <= (double)(var10 * var10)) {
                     var1.class_(var12, var5.break_, 4);
                  }
               }

               var4 = var4.break_(-1 + var3.nextInt(2), -var3.nextInt(2), -1 + var3.nextInt(2));
            }

            return true;
         }

         var4 = var4.break_();
      }
   }
}
