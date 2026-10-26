package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;

public abstract class rDz_1 extends rUO<rDA> {
   public rDz_1(Codec<rDA> var1) {
      super(var1);
   }

   public boolean class_(rRI var1, rKd_1 var2, Random var3, rfH_2 var4, rDA var5) {
      int var6 = this.class_(var3);
      rfw_3 var7 = new rfw_3();
      if (!this.class_(var1, var4, var6, var7, var5)) {
         return false;
      } else {
         this.class_(var1, var3, var4, var6, var7, var5);
         this.class_(var1, var3, var4, var5, var6, var7);
         return true;
      }
   }

   protected abstract int class_(int var1, int var2, int var3, int var4);

   protected abstract void class_(rRg_1 var1, Random var2, rfH_2 var3, int var4, rfw_3 var5, rDA var6);

   protected boolean class_(rRg_1 var1, rfH_2 var2, int var3, rfw_3 var4, rDA var5) {
      int var6 = var2.c_();
      if (var6 >= 1 && var6 + var3 + 1 < 256) {
         xd_3 var7 = var1.byte_(var2.break_()).break_();
         if (!break_(var7) && !var7.class_(rls_3.T)) {
            return false;
         } else {
            for (int var8 = 0; var8 <= var3; var8++) {
               int var9 = this.class_(-1, -1, var5.protected_, var8);

               for (int var10 = -var9; var10 <= var9; var10++) {
                  for (int var11 = -var9; var11 <= var9; var11++) {
                     xc_3 var12 = var1.byte_(var4.class_(var2, var10, var8, var11));
                     if (!var12.catch_() && !var12.class_(rls_3.void_)) {
                        return false;
                     }
                  }
               }
            }

            return true;
         }
      } else {
         return false;
      }
   }

   protected int class_(Random var1) {
      int var2 = var1.nextInt(3) + 4;
      if (var1.nextInt(12) == 0) {
         var2 *= 2;
      }

      return var2;
   }

   protected void class_(rRg_1 var1, Random var2, rfH_2 var3, rDA var4, int var5, rfw_3 var6) {
      for (int var7 = 0; var7 < var5; var7++) {
         var6.class_(var3).byte_(rpr_3.UP, var7);
         if (!var1.byte_(var6).implements_(var1, var6)) {
            this.class_(var1, var6, var4.byte_.class_(var2, var3));
         }
      }
   }
}
