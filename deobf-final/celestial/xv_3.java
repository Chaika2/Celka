package celestial;

import java.util.Random;

public class xv_3 extends xd_3 implements kh_3 {
   public static final rCN volatile_ = rCT.throws_;

   public xv_3(Jq_1 var1) {
      super(var1);
      this.extends_(this.abstract_.break_().class_(volatile_, Boolean.valueOf(true)));
   }

   @Override
   public rjC_2 class_(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return rjw_3.class_();
   }

   @Override
   public boolean class_(xc_3 var1, rRR var2, rfH_2 var3) {
      xc_3 var4 = var2.byte_(var3.break_());
      return var4.class_(xu_3.hM) || var4.class_(xu_3.bV) || var4.class_(xu_3.PY);
   }

   @Override
   public xc_3 class_(xc_3 var1, rpr_3 var2, xc_3 var3, rRg_1 var4, rfH_2 var5, rfH_2 var6) {
      if (!var1.class_(var4, var5)) {
         return xu_3.try_.continue_();
      } else {
         if (var2 == rpr_3.DOWN) {
            var4.class_(var5, xu_3.hM.continue_().class_(volatile_, Boolean.valueOf(class_((rRq_1)var4, var6))), 2);
         } else if (var2 == rpr_3.UP && !var3.class_(xu_3.hM) && class_(var4, var6)) {
            var4.finally_().class_(var5, this, 5);
         }

         var4.extends_().class_(var5, rXG.byte_, rXG.byte_.class_(var4));
         return super.class_(var1, var2, var3, var4, var5, var6);
      }
   }

   @Override
   public void class_(xc_3 var1, rYB var2, rfH_2 var3, an_3 var4) {
      if (var4 != (cb_3)QY.instanceof_().class_[57]
         || !((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0])
            .finally_()
            .class_(rrAx_1.class_((rrAd_1)rrAd_1.staticFieldseafc2f5d275533c69a39185d3a872ac0[3]))
            .byte_()) {
         xc_3 var5 = var2.byte_(var3.final_());
         if (var5.catch_()) {
            var4.private_(var1.byte_(volatile_));
            if (!var2.continue_) {
               rrEm_1 var6 = (rrEm_1)var2;

               for (int var7 = 0; var7 < 2; var7++) {
                  var6.class_(
                     rLQ.E,
                     (double)var3.b_() + var2.int_.nextDouble(),
                     (double)(var3.c_() + 1),
                     (double)var3.d_() + var2.int_.nextDouble(),
                     1,
                     0.0,
                     0.0,
                     0.0,
                     1.0
                  );
                  var6.class_(
                     rLQ.throws_,
                     (double)var3.b_() + var2.int_.nextDouble(),
                     (double)(var3.c_() + 1),
                     (double)var3.d_() + var2.int_.nextDouble(),
                     1,
                     0.0,
                     0.01,
                     0.0,
                     0.2
                  );
               }
            }
         } else {
            var4.new_(var1.byte_(volatile_));
         }
      }
   }

   @Override
   public xN_2 class_(xc_3 var1) {
      return xN_2.INVISIBLE;
   }

   @Override
   protected void class_(rCL<xd_3, xc_3> var1) {
      var1.class_(volatile_);
   }

   @Override
   public void class_(xc_3 var1, rYB var2, rfH_2 var3, Random var4) {
      double var5 = (double)var3.b_();
      double var7 = (double)var3.c_();
      double var9 = (double)var3.d_();
      if (var1.byte_(volatile_)) {
         var2.break_(rLQ.M, var5 + 0.5, var7 + 0.8, var9, 0.0, 0.0, 0.0);
         if (var4.nextInt(200) == 0) {
            var2.class_(var5, var7, var9, rqn_3.rx, rqL_2.BLOCKS, 0.2F + var4.nextFloat() * 0.2F, 0.9F + var4.nextFloat() * 0.15F, false);
         }
      } else {
         var2.break_(rLQ.O, var5 + 0.5, var7, var9 + 0.5, 0.0, 0.04, 0.0);
         var2.break_(rLQ.O, var5 + (double)var4.nextFloat(), var7 + (double)var4.nextFloat(), var9 + (double)var4.nextFloat(), 0.0, 0.04, 0.0);
         if (var4.nextInt(200) == 0) {
            var2.class_(var5, var7, var9, rqn_3.rX, rqL_2.BLOCKS, 0.2F + var4.nextFloat() * 0.2F, 0.9F + var4.nextFloat() * 0.15F, false);
         }
      }
   }

   @Override
   public void class_(xc_3 var1, rYB var2, rfH_2 var3, xc_3 var4, boolean var5) {
      class_(var2, var3.final_(), class_((rRq_1)var2, var3.break_()));
   }

   public static void class_(rRg_1 var0, rfH_2 var1, boolean var2) {
      if (class_(var0, var1)) {
         var0.class_(var1, xu_3.hM.continue_().class_(volatile_, Boolean.valueOf(var2)), 2);
      }
   }

   public static boolean class_(rRg_1 var0, rfH_2 var1) {
      rXE var2 = var0.break_(var1);
      return var0.byte_(var1).class_(xu_3.try_) && var2.throws_() >= 8 && var2.break_();
   }

   private static boolean class_(rRq_1 var0, rfH_2 var1) {
      xc_3 var2 = var0.byte_(var1);
      return var2.class_(xu_3.hM) ? var2.byte_(volatile_) : !var2.class_(xu_3.PY);
   }

   @Override
   public rXs_1 break_(rRg_1 var1, rfH_2 var2, xc_3 var3) {
      var1.class_(var2, xu_3.class_.continue_(), 11);
      return rXG.byte_;
   }

   @Override
   public void break_(xc_3 var1, rrEm_1 var2, rfH_2 var3, Random var4) {
      class_(var2, var3.final_(), class_((rRq_1)var2, var3));
   }

   @Override
   public rXE throws_(xc_3 var1) {
      return rXG.byte_.class_(false);
   }
}
