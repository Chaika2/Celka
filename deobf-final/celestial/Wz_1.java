package celestial;

import java.util.Random;

public class Wz_1 extends xd_3 {
   public static final rCN volatile_ = WQ.volatile_;

   private static void byte_(xc_3 var0, rYB var1, rfH_2 var2) {
      class_(var1, var2);
      if (!var0.byte_(volatile_)) {
         var1.class_(var2, var0.class_(volatile_, Boolean.valueOf(true)), 3);
      }
   }

   public Wz_1(Jq_1 var1) {
      super(var1);
      this.extends_(this.continue_().class_(volatile_, Boolean.valueOf(false)));
   }

   @Override
   public void class_(xc_3 var1, rrEm_1 var2, rfH_2 var3, rdn_3 var4) {
      super.class_(var1, var2, var3, var4);
      if (eA_2.class_(eY_2.else_, var4) == 0) {
         int var5 = 1 + var2.int_.nextInt(5);
         this.class_(var2, var3, var5);
      }
   }

   @Override
   public void class_(xc_3 var1, rYB var2, rfH_2 var3, Random var4) {
      if (var1.byte_(volatile_)) {
         class_(var2, var3);
      }
   }

   private static void class_(rYB var0, rfH_2 var1) {
      double var2 = 0.5625;
      Random var4 = var0.int_;

      for (rpr_3 var8 : rpr_3.values()) {
         rfH_2 var9 = var1.break_(var8);
         if (!var0.byte_(var9).implements_(var0, var9)) {
            rpB_2 var10 = var8.final_();
            double var11 = var10 == rpB_2.X ? 0.5 + 0.5625 * (double)var8.implements_() : (double)var4.nextFloat();
            double var13 = var10 == rpB_2.Y ? 0.5 + 0.5625 * (double)var8.finally_() : (double)var4.nextFloat();
            double var15 = var10 == rpB_2.Z ? 0.5 + 0.5625 * (double)var8.extends_() : (double)var4.nextFloat();
            var0.class_(rLc_1.class_, (double)var1.b_() + var11, (double)var1.c_() + var13, (double)var1.d_() + var15, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void class_(rCL<xd_3, xc_3> var1) {
      var1.class_(volatile_);
   }

   @Override
   public void class_(xc_3 var1, rrEm_1 var2, rfH_2 var3, Random var4) {
      if (var1.byte_(volatile_)) {
         var2.class_(var3, var1.class_(volatile_, Boolean.valueOf(false)), 3);
      }
   }

   @Override
   public ryZ_2 class_(xc_3 var1, rYB var2, rfH_2 var3, rhd_3 var4, rpm_3 var5, rff_3 var6) {
      if (var2.continue_) {
         class_(var2, var3);
      } else {
         byte_(var1, var2, var3);
      }

      rdn_3 var7 = var4.protected_(var5);
      return var7.break_() instanceof rxJ_2 && new rxx_3(var4, var5, var7, var6).break_() ? ryZ_2.PASS : ryZ_2.SUCCESS;
   }

   @Override
   public void class_(rYB var1, rfH_2 var2, an_3 var3) {
      byte_(var1.byte_(var2), var1, var2);
      super.class_(var1, var2, var3);
   }

   @Override
   public void class_(xc_3 var1, rYB var2, rfH_2 var3, rhd_3 var4) {
      byte_(var1, var2, var3);
      super.class_(var1, var2, var3, var4);
   }

   @Override
   public boolean a_(xc_3 var1) {
      return var1.byte_(volatile_);
   }
}
