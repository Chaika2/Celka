package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;

public class rDn_1 extends rDz_1 {
   public rDn_1(Codec<rDA> var1) {
      super(var1);
   }

   @Override
   protected void id_class(rRg_1 var1, Random var2, rfH_2 var3, int var4, rfw_3 var5, rDA var6) {
      for (int var7 = var4 - 3; var7 <= var4; var7++) {
         int var8 = var7 < var4 ? var6.id_protected : var6.id_protected - 1;
         int var9 = var6.id_protected - 2;

         for (int var10 = -var8; var10 <= var8; var10++) {
            for (int var11 = -var8; var11 <= var8; var11++) {
               boolean var12 = var10 == -var8;
               boolean var13 = var10 == var8;
               boolean var14 = var11 == -var8;
               boolean var15 = var11 == var8;
               boolean var16 = var12 || var13;
               boolean var17 = var14 || var15;
               if (var7 >= var4 || var16 != var17) {
                  var5.id_class(var3, var10, var7, var11);
                  if (!var1.id_byte(var5).id_implements(var1, var5)) {
                     this.id_class(
                        var1,
                        var5,
                        var6.id_break
                           .id_class(var2, var3)
                           .id_class(kM_2.id_new, Boolean.valueOf(var7 >= var4 - 1))
                           .id_class(kM_2.id_int, Boolean.valueOf(var10 < -var9))
                           .id_class(kM_2.id_final, Boolean.valueOf(var10 > var9))
                           .id_class(kM_2.id_volatile, Boolean.valueOf(var11 < -var9))
                           .id_class(kM_2.id_package, Boolean.valueOf(var11 > var9))
                     );
                  }
               }
            }
         }
      }
   }

   @Override
   protected int id_class(int var1, int var2, int var3, int var4) {
      int var5 = 0;
      if (var4 < var2 && var4 >= var2 - 3) {
         var5 = var3;
      } else if (var4 == var2) {
         var5 = var3;
      }

      return var5;
   }
}
