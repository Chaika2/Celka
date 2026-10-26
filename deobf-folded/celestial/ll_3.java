package celestial;

import java.util.Random;

public class ll_3 implements CX<rLO> {
   private final Ch_1 id_class;

   public ll_3(Ch_1 var1) {
      this.id_class = var1;
   }

   public CH id_class(rLO var1, gm_3 var2, double var3, double var5, double var7, double var9, double var11, double var13) {
      Random var15 = var2.id_int;
      double var16 = (double)var15.nextFloat() * -1.9 * (double)var15.nextFloat() * 0.1;
      double var18 = (double)var15.nextFloat() * -0.5 * (double)var15.nextFloat() * 0.1 * 5.0;
      double var20 = (double)var15.nextFloat() * -1.9 * (double)var15.nextFloat() * 0.1;
      return new lC_2(var2, var3, var5, var7, var16, var18, var20, 1.0F, this.id_class);
   }
}
