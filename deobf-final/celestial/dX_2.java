package celestial;

public class dX_2 extends dB_2 {
   public static final rCm_1 volatile_ = rCT.H;
   public static final rCN final_ = rCT.int_;
   protected static final rjC_2 package_ = xd_3.class_(0.0, 0.0, 0.0, 16.0, 6.0, 16.0);

   public static void byte_(xc_3 var0, rYB var1, rfH_2 var2) {
      if (var1.default_().break_()) {
         int var3 = var1.class_(rRo_1.SKY, var2) - var1.void_();
         float var4 = var1.throws_(1.0F);
         boolean var5 = var0.byte_(final_);
         if (var5) {
            var3 = 15 - var3;
         } else if (var3 > 0) {
            float var6 = var4 < (float) Math.PI ? 0.0F : (float) (Math.PI * 2);
            var4 += (var6 - var4) * 0.2F;
            var3 = Math.round((float)var3 * rfU_2.break_(var4));
         }

         var3 = rfU_2.class_(var3, 0, 15);
         if (var0.byte_(volatile_) != var3) {
            var1.class_(var2, var0.class_(volatile_, Integer.valueOf(var3)), 3);
         }
      }
   }

   @Override
   public boolean byte_(xc_3 var1) {
      return true;
   }

   public dX_2(Jq_1 var1) {
      super(var1);
      this.extends_(this.abstract_.break_().class_(volatile_, Integer.valueOf(0)).class_(final_, Boolean.valueOf(false)));
   }

   @Override
   public rjC_2 class_(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return package_;
   }

   @Override
   public ryO_2 class_(rRq_1 var1) {
      return new rHn_1();
   }

   @Override
   protected void class_(rCL<xd_3, xc_3> var1) {
      var1.class_(volatile_, final_);
   }

   @Override
   public ryZ_2 class_(xc_3 var1, rYB var2, rfH_2 var3, rhd_3 var4, rpm_3 var5, rff_3 var6) {
      if (var4.sD()) {
         if (var2.continue_) {
            return ryZ_2.SUCCESS;
         } else {
            xc_3 var7 = var1.class_(final_);
            var2.class_(var3, var7, 4);
            byte_(var7, var2, var3);
            return ryZ_2.CONSUME;
         }
      } else {
         return super.class_(var1, var2, var3, var4, var5, var6);
      }
   }

   @Override
   public xN_2 class_(xc_3 var1) {
      return xN_2.MODEL;
   }

   @Override
   public int class_(xc_3 var1, rRq_1 var2, rfH_2 var3, rpr_3 var4) {
      return var1.byte_(volatile_);
   }

   @Override
   public boolean break_(xc_3 var1) {
      return true;
   }
}
