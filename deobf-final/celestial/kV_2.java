package celestial;

public class kV_2 extends xd_3 {
   public static final rCu_1<rCV> volatile_ = rCT.j;
   public static final rCN final_ = rCT.return_;
   public static final rCm_1 package_ = rCT.C;

   public kV_2(Jq_1 var1) {
      super(var1);
      this.extends_(this.abstract_.break_().class_(volatile_, rCV.HARP).class_(package_, Integer.valueOf(0)).class_(final_, Boolean.valueOf(false)));
   }

   @Override
   public void class_(xc_3 var1, rYB var2, rfH_2 var3, rhd_3 var4) {
      if (!var2.continue_) {
         this.class_(var2, var3);
         var4.break_(rlB_2.h);
      }
   }

   @Override
   public boolean class_(xc_3 var1, rYB var2, rfH_2 var3, int var4, int var5) {
      int var6 = var1.byte_(package_);
      float var7 = (float)Math.pow(2.0, (double)(var6 - 12) / 12.0);
      var2.class_((rhd_3)null, var3, var1.byte_(volatile_).break_(), rqL_2.RECORDS, 3.0F, var7);
      var2.class_(rLQ.strictfp_, (double)var3.b_() + 0.5, (double)var3.c_() + 1.2, (double)var3.d_() + 0.5, (double)var6 / 24.0, 0.0, 0.0);
      return true;
   }

   @Override
   protected void class_(rCL<xd_3, xc_3> var1) {
      var1.class_(volatile_, final_, package_);
   }

   @Override
   public ryZ_2 class_(xc_3 var1, rYB var2, rfH_2 var3, rhd_3 var4, rpm_3 var5, rff_3 var6) {
      if (var2.continue_) {
         return ryZ_2.SUCCESS;
      } else {
         var1 = var1.class_(package_);
         var2.class_(var3, var1, 3);
         this.class_(var2, var3);
         var4.break_(rlB_2.X);
         return ryZ_2.CONSUME;
      }
   }

   @Override
   public xc_3 class_(xc_3 var1, rpr_3 var2, xc_3 var3, rRg_1 var4, rfH_2 var5, rfH_2 var6) {
      return var2 == rpr_3.DOWN ? var1.class_(volatile_, rCV.class_(var3)) : super.class_(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public void class_(xc_3 var1, rYB var2, rfH_2 var3, xd_3 var4, rfH_2 var5, boolean var6) {
      boolean var7 = var2.public_(var3);
      if (var7 != var1.byte_(final_)) {
         if (var7) {
            this.class_(var2, var3);
         }

         var2.class_(var3, var1.class_(final_, Boolean.valueOf(var7)), 3);
      }
   }

   private void class_(rYB var1, rfH_2 var2) {
      if (var1.byte_(var2.final_()).catch_()) {
         var1.class_(var2, this, 0, 0);
      }
   }

   @Override
   public xc_3 class_(rxx_3 var1) {
      return this.continue_().class_(volatile_, rCV.class_(var1.int_().byte_(var1.class_().break_())));
   }
}
