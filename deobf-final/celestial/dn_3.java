package celestial;

import java.util.Random;

public class dn_3 extends dz_3 {
   protected static final rjC_2 final_ = xd_3.class_(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
   protected static final rjC_2 package_ = xd_3.class_(6.0, 6.0, 0.0, 10.0, 10.0, 16.0);
   protected static final rjC_2 int_ = xd_3.class_(0.0, 6.0, 6.0, 16.0, 10.0, 10.0);

   protected dn_3(Jq_1 var1) {
      super(var1);
      this.extends_(this.abstract_.break_().class_(volatile_, rpr_3.UP));
   }

   @Override
   public xc_3 class_(xc_3 var1, rqd_3 var2) {
      return var1.class_(volatile_, var2.class_(var1.byte_(volatile_)));
   }

   @Override
   protected void class_(rCL<xd_3, xc_3> var1) {
      var1.class_(volatile_);
   }

   @Override
   public boolean class_(xc_3 var1, rRq_1 var2, rfH_2 var3, rLT var4) {
      return false;
   }

   @Override
   public void class_(xc_3 var1, rYB var2, rfH_2 var3, Random var4) {
      rpr_3 var5 = var1.byte_(volatile_);
      double var6 = (double)var3.b_() + 0.55 - (double)(var4.nextFloat() * 0.1F);
      double var8 = (double)var3.c_() + 0.55 - (double)(var4.nextFloat() * 0.1F);
      double var10 = (double)var3.d_() + 0.55 - (double)(var4.nextFloat() * 0.1F);
      double var12 = (double)(0.4F - (var4.nextFloat() + var4.nextFloat()) * 0.4F);
      if (var4.nextInt(5) == 0) {
         var2.class_(
            rLQ.this_,
            var6 + (double)var5.implements_() * var12,
            var8 + (double)var5.finally_() * var12,
            var10 + (double)var5.extends_() * var12,
            var4.nextGaussian() * 0.005,
            var4.nextGaussian() * 0.005,
            var4.nextGaussian() * 0.005
         );
      }
   }

   @Override
   public xc_3 class_(xc_3 var1, rpa_3 var2) {
      return var1.class_(volatile_, var2.break_(var1.byte_(volatile_)));
   }

   @Override
   public rjC_2 class_(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      switch (var1.byte_(volatile_).final_()) {
         case X:
         default:
            return int_;
         case Z:
            return package_;
         case Y:
            return final_;
      }
   }

   @Override
   public xc_3 class_(rxx_3 var1) {
      rpr_3 var2 = var1.finally_();
      xc_3 var3 = var1.int_().byte_(var1.class_().break_(var2.case_()));
      return var3.class_(this) && var3.byte_(volatile_) == var2 ? this.continue_().class_(volatile_, var2.case_()) : this.continue_().class_(volatile_, var2);
   }

   @Override
   public Qs_1 protected_(xc_3 var1) {
      return Qs_1.NORMAL;
   }
}
