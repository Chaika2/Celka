package celestial;

import java.util.Random;

public class WZ extends Wk_1 {
   public static final rCN volatile_ = rCT.super_;
   public static final rCm_1 int_ = rCT.Q;

   protected WZ(Jq_1 var1) {
      super(var1);
      this.extends_(
         this.abstract_
            .break_()
            .class_(p, rpr_3.NORTH)
            .class_(int_, Integer.valueOf(1))
            .class_(volatile_, Boolean.valueOf(false))
            .class_(package_, Boolean.valueOf(false))
      );
   }

   @Override
   public void class_(xc_3 var1, rYB var2, rfH_2 var3, Random var4) {
      if (var1.byte_(package_)) {
         rpr_3 var5 = var1.byte_(p);
         double var6 = (double)var3.b_() + 0.5 + (var4.nextDouble() - 0.5) * 0.2;
         double var8 = (double)var3.c_() + 0.4 + (var4.nextDouble() - 0.5) * 0.2;
         double var10 = (double)var3.d_() + 0.5 + (var4.nextDouble() - 0.5) * 0.2;
         float var12 = -5.0F;
         if (var4.nextBoolean()) {
            var12 = (float)(var1.byte_(int_) * 2 - 1);
         }

         var12 /= 16.0F;
         double var13 = (double)(var12 * (float)var5.implements_());
         double var15 = (double)(var12 * (float)var5.extends_());
         var2.class_(rLc_1.class_, var6 + var13, var8, var10 + var15, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void class_(rCL<xd_3, xc_3> var1) {
      var1.class_(p, int_, volatile_, package_);
   }

   @Override
   public ryZ_2 class_(xc_3 var1, rYB var2, rfH_2 var3, rhd_3 var4, rpm_3 var5, rff_3 var6) {
      if (!((rhx_3)var4.implements_[18]).throws_) {
         return ryZ_2.PASS;
      } else {
         var2.class_(var3, var1.class_(int_), 3);
         return ryZ_2.class_(var2.continue_);
      }
   }

   @Override
   public xc_3 class_(xc_3 var1, rpr_3 var2, xc_3 var3, rRg_1 var4, rfH_2 var5, rfH_2 var6) {
      return !var4.import_() && var2.final_() != var1.byte_(p).final_()
         ? var1.class_(volatile_, Boolean.valueOf(this.class_(var4, var5, var1)))
         : super.class_(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public xc_3 class_(rxx_3 var1) {
      xc_3 var2 = super.class_(var1);
      return var2.class_(volatile_, Boolean.valueOf(this.class_(var1.int_(), var1.class_(), var2)));
   }

   @Override
   public boolean class_(rRR var1, rfH_2 var2, xc_3 var3) {
      return this.break_(var1, var2, var3) > 0;
   }

   @Override
   protected boolean implements_(xc_3 var1) {
      return volatile_(var1);
   }

   @Override
   protected int private_(xc_3 var1) {
      return var1.byte_(int_) * 2;
   }
}
