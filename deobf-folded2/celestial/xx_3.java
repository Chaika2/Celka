package celestial;

import java.util.Random;

public class xx_3 extends JV {
   protected xx_3(Jq_1 var1) {
      super(var1);
   }

   @Override
   public void id_class(xc_3 var1, rYB var2, rfH_2 var3, Random var4) {
      if (var1.id_byte(id_final)) {
         double var5 = (double)var3.b_() + 0.5;
         double var7 = (double)var3.c_();
         double var9 = (double)var3.d_() + 0.5;
         if (var4.nextDouble() < 0.1) {
            var2.id_class(var5, var7, var9, rqn_3.rE, rqL_2.BLOCKS, 1.0F, 1.0F, false);
         }

         rpr_3 var11 = var1.id_byte(id_volatile);
         rpB_2 var12 = var11.id_final();
         double var13 = 0.52;
         double var15 = var4.nextDouble() * 0.6 - 0.3;
         double var17 = var12 == rpB_2.X ? (double)var11.id_implements() * 0.52 : var15;
         double var19 = var4.nextDouble() * 9.0 / 16.0;
         double var21 = var12 == rpB_2.Z ? (double)var11.id_extends() * 0.52 : var15;
         var2.id_class(rLQ.id_double, var5 + var17, var7 + var19, var9 + var21, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void id_class(rYB var1, rfH_2 var2, rhd_3 var3) {
      ryO_2 var4 = var1.id_class(var2);
      if (var4 instanceof rHz_1) {
         var3.id_class((rJZ)var4);
         var3.id_break(rlB_2.Z);
      }
   }

   @Override
   public ryO_2 id_class(rRq_1 var1) {
      return new rHz_1();
   }
}
