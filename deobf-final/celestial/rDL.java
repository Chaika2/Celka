package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;

public class rDL extends rDz_1 {
   public rDL(Codec<rDA> var1) {
      super(var1);
   }

   @Override
   protected void class_(rRg_1 var1, Random var2, rfH_2 var3, int var4, rfw_3 var5, rDA var6) {
      int var7 = var6.protected_;

      for (int var8 = -var7; var8 <= var7; var8++) {
         for (int var9 = -var7; var9 <= var7; var9++) {
            boolean var10 = var8 == -var7;
            boolean var11 = var8 == var7;
            boolean var12 = var9 == -var7;
            boolean var13 = var9 == var7;
            boolean var14 = var10 || var11;
            boolean var15 = var12 || var13;
            if (!var14 || !var15) {
               var5.class_(var3, var8, var4, var9);
               if (!var1.byte_(var5).implements_(var1, var5)) {
                  boolean var16 = var10 || var15 && var8 == 1 - var7;
                  boolean var17 = var11 || var15 && var8 == var7 - 1;
                  boolean var18 = var12 || var14 && var9 == 1 - var7;
                  boolean var19 = var13 || var14 && var9 == var7 - 1;
                  this.class_(
                     var1,
                     var5,
                     var6.break_
                        .class_(var2, var3)
                        .class_(kM_2.int_, Boolean.valueOf(var16))
                        .class_(kM_2.final_, Boolean.valueOf(var17))
                        .class_(kM_2.volatile_, Boolean.valueOf(var18))
                        .class_(kM_2.package_, Boolean.valueOf(var19))
                  );
               }
            }
         }
      }
   }

   @Override
   protected int class_(int var1, int var2, int var3, int var4) {
      return var4 <= 3 ? 0 : var3;
   }
}
