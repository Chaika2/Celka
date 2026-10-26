package celestial;

import java.util.Random;

public class zD_2 extends xd_3 {
   protected zD_2(Jq_1 var1) {
      super(var1);
   }

   @Override
   public void id_class(xc_3 var1, rYB var2, rfH_2 var3, xc_3 var4, boolean var5) {
      if (var2.id_default().id_protected()) {
         var2.id_class(var3, xu_3.N.id_continue(), 3);
         var2.id_byte(2009, var3, 0);
         var2.id_class((rhd_3)null, var3, rqn_3.Sk, rqL_2.BLOCKS, 1.0F, (1.0F + var2.id_long().nextFloat() * 0.2F) * 0.7F);
      }
   }

   @Override
   public void id_class(xc_3 var1, rYB var2, rfH_2 var3, Random var4) {
      rpr_3 var5 = rpr_3.id_class(var4);
      if (var5 != rpr_3.UP) {
         rfH_2 var6 = var3.id_break(var5);
         xc_3 var7 = var2.id_byte(var6);
         if (!var1.id_native() || !var7.id_protected(var2, var6, var5.id_case())) {
            double var8 = (double)var3.b_();
            double var10 = (double)var3.c_();
            double var12 = (double)var3.d_();
            if (var5 == rpr_3.DOWN) {
               var10 -= 0.05;
               var8 += var4.nextDouble();
               var12 += var4.nextDouble();
            } else {
               var10 += var4.nextDouble() * 0.8;
               if (var5.id_final() == rpB_2.X) {
                  var12 += var4.nextDouble();
                  if (var5 == rpr_3.EAST) {
                     var8++;
                  } else {
                     var8 += 0.05;
                  }
               } else {
                  var8 += var4.nextDouble();
                  if (var5 == rpr_3.SOUTH) {
                     var12++;
                  } else {
                     var12 += 0.05;
                  }
               }
            }

            var2.id_class(rLQ.id_volatile, var8, var10, var12, 0.0, 0.0, 0.0);
         }
      }
   }
}
