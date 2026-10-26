package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;

public class rDl_1 extends rUO<rDq_1> {
   public rDl_1(Codec<rDq_1> var1) {
      super(var1);
   }

   public boolean id_class(rRI var1, rKd_1 var2, Random var3, rfH_2 var4, rDq_1 var5) {
      while (true) {
         label47: {
            if (var4.c_() > 3) {
               if (var1.id_finally(var4.id_break())) {
                  break label47;
               }

               xd_3 var6 = var1.id_byte(var4.id_break()).id_break();
               if (!id_break(var6) && !id_class(var6)) {
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

               for (rfH_2 var12 : rfH_2.id_class(var4.id_break(-var7, -var8, -var9), var4.id_break(var7, var8, var9))) {
                  if (var12.id_private(var4) <= (double)(var10 * var10)) {
                     var1.id_class(var12, var5.id_break, 4);
                  }
               }

               var4 = var4.id_break(-1 + var3.nextInt(2), -var3.nextInt(2), -1 + var3.nextInt(2));
            }

            return true;
         }

         var4 = var4.id_break();
      }
   }
}
