package celestial;

import java.util.Random;

public class C_do extends JV {
   protected C_do(Jq_1 var1) {
      super(var1);
   }

   @Override
   public void class_(xc_3 var1, rYB var2, rfH_2 var3, Random var4) {
      if (var1.byte_(final_)) {
         double var5 = (double)var3.b_() + 0.5;
         double var7 = (double)var3.c_();
         double var9 = (double)var3.d_() + 0.5;
         if (var4.nextDouble() < 0.1) {
            var2.class_(var5, var7, var9, rqn_3.Sw, rqL_2.BLOCKS, 1.0F, 1.0F, false);
         }

         rpr_3 var11 = var1.byte_(volatile_);
         rpB_2 var12 = var11.final_();
         double var13 = 0.52;
         double var15 = var4.nextDouble() * 0.6 - 0.3;
         double var17 = var12 == rpB_2.X ? (double)var11.implements_() * 0.52 : var15;
         double var19 = var4.nextDouble() * 6.0 / 16.0;
         double var21 = var12 == rpB_2.Z ? (double)var11.extends_() * 0.52 : var15;
         var2.class_(rLQ.double_, var5 + var17, var7 + var19, var9 + var21, 0.0, 0.0, 0.0);
         var2.class_(rLQ.try_, var5 + var17, var7 + var19, var9 + var21, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void class_(rYB var1, rfH_2 var2, rhd_3 var3) {
      ryO_2 var4 = var1.class_(var2);
      if (var4 instanceof rHT) {
         var3.class_((rJZ)var4);
         var3.break_(rlB_2.z);
      }
   }

   @Override
   public ryO_2 class_(rRq_1 var1) {
      return new rHT();
   }
}
