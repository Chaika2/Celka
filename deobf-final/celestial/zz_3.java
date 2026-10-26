package celestial;

import java.util.Random;

public class zz_3 extends xF_2 implements kX_2 {
   public static final rCm_1 volatile_ = rCT.J;
   private static final rjC_2 final_ = xd_3.class_(3.0, 0.0, 3.0, 13.0, 8.0, 13.0);
   private static final rjC_2 package_ = xd_3.class_(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   public zz_3(Jq_1 var1) {
      super(var1);
      this.extends_(this.abstract_.break_().class_(volatile_, Integer.valueOf(0)));
   }

   @Override
   protected void class_(rCL<xd_3, xc_3> var1) {
      var1.class_(volatile_);
   }

   @Override
   public boolean class_(rRq_1 var1, rfH_2 var2, xc_3 var3, boolean var4) {
      return var3.byte_(volatile_) < 3;
   }

   @Override
   public boolean class_(rYB var1, Random var2, rfH_2 var3, xc_3 var4) {
      return true;
   }

   @Override
   public void class_(rrEm_1 var1, Random var2, rfH_2 var3, xc_3 var4) {
      int var5 = Math.min(3, var4.byte_(volatile_) + 1);
      var1.class_(var3, var4.class_(volatile_, Integer.valueOf(var5)), 2);
   }

   @Override
   public ryZ_2 class_(xc_3 var1, rYB var2, rfH_2 var3, rhd_3 var4, rpm_3 var5, rff_3 var6) {
      int var7 = var1.byte_(volatile_);
      boolean var8 = var7 == 3;
      if (!var8 && var4.protected_(var5).break_() == rdy_3.Xg) {
         return ryZ_2.PASS;
      } else if (var7 > 1) {
         int var9 = 1 + var2.int_.nextInt(2);
         class_(var2, var3, new rdn_3(rdy_3.WQ, var9 + (var8 ? 1 : 0)));
         var2.class_(null, var3, rqn_3.dE, rqL_2.BLOCKS, 1.0F, 0.8F + var2.int_.nextFloat() * 0.4F);
         var2.class_(var3, var1.class_(volatile_, Integer.valueOf(1)), 2);
         return ryZ_2.class_(var2.continue_);
      } else {
         return super.class_(var1, var2, var3, var4, var5, var6);
      }
   }

   @Override
   public rjC_2 class_(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      if (var1.byte_(volatile_) == 0) {
         return final_;
      } else {
         return var1.byte_(volatile_) < 3 ? package_ : super.class_(var1, var2, var3, var4);
      }
   }

   @Override
   public void class_(xc_3 var1, rrEm_1 var2, rfH_2 var3, Random var4) {
      int var5 = var1.byte_(volatile_);
      if (var5 < 3 && var4.nextInt(5) == 0 && var2.class_(var3.final_(), 0) >= 9) {
         var2.class_(var3, var1.class_(volatile_, Integer.valueOf(var5 + 1)), 2);
      }
   }

   @Override
   public void class_(xc_3 var1, rYB var2, rfH_2 var3, an_3 var4) {
      if (var4 instanceof iB_2 && var4.BC() != aI_2.throw_ && var4.BC() != aI_2.throws_) {
         if (var4 == (cb_3)QY.instanceof_().class_[57]) {
            rrAb_1 var5 = rrAb_1.class_(this, new rjU_2(0.8F, 0.75, 0.8F));
            if (!((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(var5).byte_()) {
               var4.class_(var1, var5.break_());
            }
         } else {
            var4.class_(var1, new rjU_2(0.8F, 0.75, 0.8F));
         }

         var4.class_((xd_3)this);
         if (!var2.continue_ && var1.byte_(volatile_) > 0 && ((Double)var4.throws_[34] != var4.rx() || (Double)var4.throws_[36] != var4.BO())) {
            double var9 = Math.abs(var4.rx() - (Double)var4.throws_[34]);
            double var7 = Math.abs(var4.BO() - (Double)var4.throws_[36]);
            if (var9 >= 0.003F || var7 >= 0.003F) {
               var4.break_(rye_3.else_, 1.0F);
            }
         }
      }
   }

   @Override
   public rdn_3 class_(rRq_1 var1, rfH_2 var2, xc_3 var3) {
      return new rdn_3(rdy_3.WQ);
   }

   @Override
   public boolean a_(xc_3 var1) {
      return var1.byte_(volatile_) < 3;
   }
}
