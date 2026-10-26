package celestial;

import java.util.Random;

public class dF_2 extends dB_2 {
   protected dF_2(Jq_1 var1) {
      super(var1);
   }

   @Override
   public boolean class_(xc_3 var1, rXs_1 var2) {
      return false;
   }

   @Override
   public rdn_3 class_(rRq_1 var1, rfH_2 var2, xc_3 var3) {
      return rdn_3.break_;
   }

   @Override
   public void class_(xc_3 var1, rYB var2, rfH_2 var3, Random var4) {
      ryO_2 var5 = var2.class_(var3);
      if (var5 instanceof rHy_1) {
         int var6 = ((rHy_1)var5).extends_();

         for (int var7 = 0; var7 < var6; var7++) {
            double var8 = (double)var3.b_() + var4.nextDouble();
            double var10 = (double)var3.c_() + var4.nextDouble();
            double var12 = (double)var3.d_() + var4.nextDouble();
            double var14 = (var4.nextDouble() - 0.5) * 0.5;
            double var16 = (var4.nextDouble() - 0.5) * 0.5;
            double var18 = (var4.nextDouble() - 0.5) * 0.5;
            int var20 = var4.nextInt(2) * 2 - 1;
            if (var4.nextBoolean()) {
               var12 = (double)var3.d_() + 0.5 + 0.25 * (double)var20;
               var18 = (double)(var4.nextFloat() * 2.0F * (float)var20);
            } else {
               var8 = (double)var3.b_() + 0.5 + 0.25 * (double)var20;
               var14 = (double)(var4.nextFloat() * 2.0F * (float)var20);
            }

            var2.class_(rLQ.transient_, var8, var10, var12, var14, var16, var18);
         }
      }
   }

   @Override
   public ryO_2 class_(rRq_1 var1) {
      return new rHy_1();
   }
}
