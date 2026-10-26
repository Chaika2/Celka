package celestial;

import java.util.Random;

public class dv_3 extends dB_2 {
   protected static final rjC_2 id_volatile = xd_3.id_class(0.0, 0.0, 0.0, 16.0, 12.0, 16.0);

   protected dv_3(Jq_1 var1) {
      super(var1);
   }

   @Override
   public rJZ id_class(xc_3 var1, rYB var2, rfH_2 var3) {
      ryO_2 var4 = var2.id_class(var3);
      if (var4 instanceof rHH) {
         rgP_2 var5 = ((rpA_2)var4).L_();
         return new rJR((var2x, var3x, var4x) -> new rJE(var2x, var3x, rpq_3.id_class(var2, var3)), var5);
      } else {
         return null;
      }
   }

   @Override
   public void id_class(rYB var1, rfH_2 var2, xc_3 var3, iB_2 var4, rdn_3 var5) {
      if (var5.id_this()) {
         ryO_2 var6 = var1.id_class(var2);
         if (var6 instanceof rHH) {
            ((rHH)var6).id_class(var5.id_continue());
         }
      }
   }

   @Override
   public boolean id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rLT var4) {
      return false;
   }

   @Override
   public ryZ_2 id_class(xc_3 var1, rYB var2, rfH_2 var3, rhd_3 var4, rpm_3 var5, rff_3 var6) {
      if (var2.id_continue) {
         return ryZ_2.SUCCESS;
      } else {
         var4.id_class(var1.id_break(var2, var3));
         return ryZ_2.CONSUME;
      }
   }

   @Override
   public void id_class(xc_3 var1, rYB var2, rfH_2 var3, Random var4) {
      super.id_class(var1, var2, var3, var4);

      for (int var5 = -2; var5 <= 2; var5++) {
         for (int var6 = -2; var6 <= 2; var6++) {
            if (var5 > -2 && var5 < 2 && var6 == -1) {
               var6 = 2;
            }

            if (var4.nextInt(16) == 0) {
               for (int var7 = 0; var7 <= 1; var7++) {
                  rfH_2 var8 = var3.id_break(var5, var7, var6);
                  if (var2.id_byte(var8).id_class(xu_3.rj)) {
                     if (!var2.id_finally(var3.id_break(var5 / 2, 0, var6 / 2))) {
                        break;
                     }

                     var2.id_class(
                        rLQ.id_super,
                        (double)var3.b_() + 0.5,
                        (double)var3.c_() + 2.0,
                        (double)var3.d_() + 0.5,
                        (double)((float)var5 + var4.nextFloat()) - 0.5,
                        (double)((float)var7 - var4.nextFloat() - 1.0F),
                        (double)((float)var6 + var4.nextFloat()) - 0.5
                     );
                  }
               }
            }
         }
      }
   }

   @Override
   public rjC_2 id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return id_volatile;
   }

   @Override
   public ryO_2 id_class(rRq_1 var1) {
      return new rHH();
   }

   @Override
   public xN_2 id_class(xc_3 var1) {
      return xN_2.MODEL;
   }

   @Override
   public boolean id_break(xc_3 var1) {
      return true;
   }
}
