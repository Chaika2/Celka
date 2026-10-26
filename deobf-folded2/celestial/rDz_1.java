package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;

public abstract class rDz_1 extends rUO<rDA> {
   public rDz_1(Codec<rDA> var1) {
      super(var1);
   }

   public boolean id_class(rRI var1, rKd_1 var2, Random var3, rfH_2 var4, rDA var5) {
      int var6 = this.id_class(var3);
      rfw_3 var7 = new rfw_3();
      if (!this.id_class(var1, var4, var6, var7, var5)) {
         return false;
      } else {
         this.id_class(var1, var3, var4, var6, var7, var5);
         this.id_class(var1, var3, var4, var5, var6, var7);
         return true;
      }
   }

   protected abstract int id_class(int var1, int var2, int var3, int var4);

   protected abstract void id_class(rRg_1 var1, Random var2, rfH_2 var3, int var4, rfw_3 var5, rDA var6);

   protected boolean id_class(rRg_1 var1, rfH_2 var2, int var3, rfw_3 var4, rDA var5) {
      int var6 = var2.c_();
      if (var6 >= 1 && var6 + var3 + 1 < 256) {
         xd_3 var7 = var1.id_byte(var2.id_break()).id_break();
         if (!id_break(var7) && !var7.id_class(rls_3.T)) {
            return false;
         } else {
            for (int var8 = 0; var8 <= var3; var8++) {
               int var9 = this.id_class(-1, -1, var5.id_protected, var8);

               for (int var10 = -var9; var10 <= var9; var10++) {
                  for (int var11 = -var9; var11 <= var9; var11++) {
                     xc_3 var12 = var1.id_byte(var4.id_class(var2, var10, var8, var11));
                     if (!var12.id_catch() && !var12.id_class(rls_3.id_void)) {
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

   protected int id_class(Random var1) {
      int var2 = var1.nextInt(3) + 4;
      if (var1.nextInt(12) == 0) {
         var2 *= 2;
      }

      return var2;
   }

   protected void id_class(rRg_1 var1, Random var2, rfH_2 var3, rDA var4, int var5, rfw_3 var6) {
      for (int var7 = 0; var7 < var5; var7++) {
         var6.id_class(var3).id_byte(rpr_3.UP, var7);
         if (!var1.id_byte(var6).id_implements(var1, var6)) {
            this.id_class(var1, var6, var4.id_byte.id_class(var2, var3));
         }
      }
   }
}
