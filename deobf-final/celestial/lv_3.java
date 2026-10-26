package celestial;

import java.util.Random;

public class lv_3 implements CX<rLO> {
   private final Ch_1 class_;

   public lv_3(Ch_1 var1) {
      this.class_ = var1;
   }

   public CH class_(rLO var1, gm_3 var2, double var3, double var5, double var7, double var9, double var11, double var13) {
      Random var15 = var2.int_;
      double var16 = var15.nextGaussian() * 1.0E-6F;
      double var18 = var15.nextGaussian() * 1.0E-4F;
      double var20 = var15.nextGaussian() * 1.0E-6F;
      lZ_2 var22 = new lZ_2(var2, var3, var5, var7, var16, var18, var20);
      var22.class_(this.class_);
      var22.class_(0.9F, 0.4F, 0.5F);
      return var22;
   }
}
