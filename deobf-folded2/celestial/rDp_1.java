package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;

public class rDp_1 extends rUO<rDT> {
   public rDp_1(Codec<rDT> var1) {
      super(var1);
   }

   private void id_class(rRg_1 var1, rfH_2 var2, Random var3, rDT var4) {
      if (var1.id_finally(var2) && this.id_class(var1, var2, var3)) {
         var1.id_class(var2, var4.id_break.id_class(var3, var2), 4);
      }
   }

   private boolean id_class(rRg_1 var1, rfH_2 var2, Random var3) {
      rfH_2 var4 = var2.id_break();
      xc_3 var5 = var1.id_byte(var4);
      return var5.id_class(xu_3.bt) ? var3.nextBoolean() : var5.id_protected(var1, var4, rpr_3.UP);
   }

   public boolean id_class(rRI var1, rKd_1 var2, Random var3, rfH_2 var4, rDT var5) {
      if (var4.c_() < 5) {
         return false;
      } else {
         int var6 = 2 + var3.nextInt(2);
         int var7 = 2 + var3.nextInt(2);

         for (rfH_2 var9 : rfH_2.id_class(var4.id_break(-var6, 0, -var7), var4.id_break(var6, 1, var7))) {
            int var10 = var4.b_() - var9.b_();
            int var11 = var4.d_() - var9.d_();
            if ((float)(var10 * var10 + var11 * var11) <= var3.nextFloat() * 10.0F - var3.nextFloat() * 6.0F) {
               this.id_class(var1, var9, var3, var5);
            } else if ((double)var3.nextFloat() < 0.031) {
               this.id_class(var1, var9, var3, var5);
            }
         }

         return true;
      }
   }
}
