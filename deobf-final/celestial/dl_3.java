package celestial;

import java.util.Random;

public class dl_3 extends JI<rHq_1> implements kd_3 {
   public static final rCc_1 final_ = kE_2.p;
   public static final rCN package_ = rCT.throw_;
   protected static final rjC_2 int_ = xd_3.class_(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   private static final rgP_2 new_ = new rgn_3("container.enderchest");

   protected dl_3(Jq_1 var1) {
      super(var1, () -> ryW_2.protected_);
      this.extends_(this.abstract_.break_().class_(final_, rpr_3.NORTH).class_(package_, Boolean.valueOf(false)));
   }

   @Override
   public xc_3 class_(xc_3 var1, rpr_3 var2, xc_3 var3, rRg_1 var4, rfH_2 var5, rfH_2 var6) {
      if (var1.byte_(package_)) {
         var4.extends_().class_(var5, rXG.byte_, rXG.byte_.class_(var4));
      }

      return super.class_(var1, var2, var3, var4, var5, var6);
   }

   @Override
   protected void class_(rCL<xd_3, xc_3> var1) {
      var1.class_(final_, package_);
   }

   @Override
   public xc_3 class_(xc_3 var1, rpa_3 var2) {
      return var1.class_(var2.class_(var1.byte_(final_)));
   }

   @Override
   public ryJ_2<? extends rHu_1> class_(xc_3 var1, rYB var2, rfH_2 var3, boolean var4) {
      return ryX_2::break_;
   }

   @Override
   public boolean class_(xc_3 var1, rRq_1 var2, rfH_2 var3, rLT var4) {
      return false;
   }

   @Override
   public xc_3 class_(xc_3 var1, rqd_3 var2) {
      return var1.class_(final_, var2.class_(var1.byte_(final_)));
   }

   @Override
   public ryZ_2 class_(xc_3 var1, rYB var2, rfH_2 var3, rhd_3 var4, rpm_3 var5, rff_3 var6) {
      rXz_1 var7 = var4.se();
      ryO_2 var8 = var2.class_(var3);
      if (var7 != null && var8 instanceof rHq_1) {
         rfH_2 var9 = var3.final_();
         if (var2.byte_(var9).catch_(var2, var9)) {
            return ryZ_2.class_(var2.continue_);
         } else if (var2.continue_) {
            return ryZ_2.SUCCESS;
         } else {
            rHq_1 var10 = (rHq_1)var8;
            var7.class_(var10);
            var4.class_(new rJR((var1x, var2x, var3x) -> rXe_1.class_(var1x, var2x, var7), new_));
            var4.break_(rlB_2.d);
            rbW_2.class_(var4, true);
            return ryZ_2.CONSUME;
         }
      } else {
         return ryZ_2.class_(var2.continue_);
      }
   }

   @Override
   public xc_3 class_(rxx_3 var1) {
      rXE var2 = var1.int_().break_(var1.class_());
      return this.continue_().class_(final_, var1.case_().case_()).class_(package_, Boolean.valueOf(var2.class_() == rXG.byte_));
   }

   @Override
   public xN_2 class_(xc_3 var1) {
      return xN_2.ENTITYBLOCK_ANIMATED;
   }

   @Override
   public rjC_2 class_(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return int_;
   }

   @Override
   public void class_(xc_3 var1, rYB var2, rfH_2 var3, Random var4) {
      for (int var5 = 0; var5 < 3; var5++) {
         int var6 = var4.nextInt(2) * 2 - 1;
         int var7 = var4.nextInt(2) * 2 - 1;
         double var8 = (double)var3.b_() + 0.5 + 0.25 * (double)var6;
         double var10 = (double)((float)var3.c_() + var4.nextFloat());
         double var12 = (double)var3.d_() + 0.5 + 0.25 * (double)var7;
         double var14 = (double)(var4.nextFloat() * (float)var6);
         double var16 = ((double)var4.nextFloat() - 0.5) * 0.125;
         double var18 = (double)(var4.nextFloat() * (float)var7);
         var2.class_(rLQ.transient_, var8, var10, var12, var14, var16, var18);
      }
   }

   @Override
   public ryO_2 class_(rRq_1 var1) {
      return new rHq_1();
   }

   @Override
   public rXE throws_(xc_3 var1) {
      return var1.byte_(package_) ? rXG.byte_.class_(false) : super.throws_(var1);
   }
}
