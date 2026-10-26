package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;

public class rDK extends rDo_1 {
   public rDK(Codec<rUt_1> var1) {
      super(var1);
   }

   @Override
   protected boolean id_class(rRg_1 var1, Random var2, rfH_2 var3, xc_3 var4) {
      int var5 = var2.nextInt(3) + 3;
      int var6 = var2.nextInt(3) + 3;
      int var7 = var2.nextInt(3) + 3;
      int var8 = var2.nextInt(3) + 1;
      rfw_3 var9 = var3.id_new();

      for (int var10 = 0; var10 <= var6; var10++) {
         for (int var11 = 0; var11 <= var5; var11++) {
            for (int var12 = 0; var12 <= var7; var12++) {
               var9.id_class(var10 + var3.b_(), var11 + var3.c_(), var12 + var3.d_());
               var9.id_byte(rpr_3.DOWN, var8);
               if ((var10 != 0 && var10 != var6 || var11 != 0 && var11 != var5)
                  && (var12 != 0 && var12 != var7 || var11 != 0 && var11 != var5)
                  && (var10 != 0 && var10 != var6 || var12 != 0 && var12 != var7)
                  && (var10 == 0 || var10 == var6 || var11 == 0 || var11 == var5 || var12 == 0 || var12 == var7)
                  && !(var2.nextFloat() < 0.1F)
                  && !this.id_break(var1, var2, var9, var4)) {
               }
            }
         }
      }

      return true;
   }
}
