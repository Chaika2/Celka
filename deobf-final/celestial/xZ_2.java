package celestial;

import java.util.Random;

public class xZ_2 extends dB_2 {
   public static final rCN[] volatile_ = new rCN[]{rCT.extends_, rCT.native_, rCT.volatile_};
   protected static final rjC_2 final_ = rjw_3.class_(xd_3.class_(1.0, 0.0, 1.0, 15.0, 2.0, 15.0), xd_3.class_(7.0, 0.0, 7.0, 9.0, 14.0, 9.0));

   public xZ_2(Jq_1 var1) {
      super(var1);
      this.extends_(
         this.abstract_
            .break_()
            .class_(volatile_[0], Boolean.valueOf(false))
            .class_(volatile_[1], Boolean.valueOf(false))
            .class_(volatile_[2], Boolean.valueOf(false))
      );
   }

   @Override
   public xN_2 class_(xc_3 var1) {
      return xN_2.MODEL;
   }

   @Override
   public void class_(xc_3 var1, rYB var2, rfH_2 var3, Random var4) {
      double var5 = (double)var3.b_() + 0.4 + (double)var4.nextFloat() * 0.2;
      double var7 = (double)var3.c_() + 0.7 + (double)var4.nextFloat() * 0.3;
      double var9 = (double)var3.d_() + 0.4 + (double)var4.nextFloat() * 0.2;
      var2.class_(rLQ.double_, var5, var7, var9, 0.0, 0.0, 0.0);
   }

   @Override
   protected void class_(rCL<xd_3, xc_3> var1) {
      var1.class_(volatile_[0], volatile_[1], volatile_[2]);
   }

   @Override
   public boolean class_(xc_3 var1, rRq_1 var2, rfH_2 var3, rLT var4) {
      return false;
   }

   @Override
   public ryO_2 class_(rRq_1 var1) {
      return new rHQ();
   }

   @Override
   public rjC_2 class_(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return final_;
   }

   @Override
   public ryZ_2 class_(xc_3 var1, rYB var2, rfH_2 var3, rhd_3 var4, rpm_3 var5, rff_3 var6) {
      if (var2.continue_) {
         return ryZ_2.SUCCESS;
      } else {
         ryO_2 var7 = var2.class_(var3);
         if (var7 instanceof rHQ) {
            var4.class_((rHQ)var7);
            var4.break_(rlB_2.E);
         }

         return ryZ_2.CONSUME;
      }
   }

   @Override
   public void class_(rYB var1, rfH_2 var2, xc_3 var3, iB_2 var4, rdn_3 var5) {
      if (var5.this_()) {
         ryO_2 var6 = var1.class_(var2);
         if (var6 instanceof rHQ) {
            ((rHQ)var6).class_(var5.continue_());
         }
      }
   }

   @Override
   public void break_(xc_3 var1, rYB var2, rfH_2 var3, xc_3 var4, boolean var5) {
      if (!var1.class_(var4.break_())) {
         ryO_2 var6 = var2.class_(var3);
         if (var6 instanceof rHQ) {
            rXn_1.class_(var2, var3, (rHQ)var6);
         }

         super.break_(var1, var2, var3, var4, var5);
      }
   }

   @Override
   public int break_(xc_3 var1, rYB var2, rfH_2 var3) {
      return rJr_1.class_(var2.class_(var3));
   }

   @Override
   public boolean case_(xc_3 var1) {
      return true;
   }
}
