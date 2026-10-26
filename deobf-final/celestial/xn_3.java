package celestial;

import java.util.Optional;
import java.util.Random;

public class xn_3 extends dB_2 implements kd_3 {
   protected static final rjC_2 volatile_ = xd_3.class_(0.0, 0.0, 0.0, 16.0, 7.0, 16.0);
   public static final rCN final_ = rCT.continue_;
   public static final rCN package_ = rCT.goto_;
   public static final rCN int_ = rCT.throw_;
   public static final rCc_1 new_ = rCT.strictfp_;
   private static final rjC_2 continue_ = xd_3.class_(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
   private final boolean super_;
   private final int this_;

   public static void byte_(rRg_1 var0, rfH_2 var1, xc_3 var2) {
      if (var0.import_()) {
         for (int var3 = 0; var3 < 20; var3++) {
            class_((rYB)var0, var1, var2.byte_(package_), true);
         }
      }

      ryO_2 var4 = var0.class_(var1);
      if (var4 instanceof rHc_1) {
         ((rHc_1)var4).catch_();
      }
   }

   public xn_3(boolean var1, int var2, Jq_1 var3) {
      super(var3);
      this.super_ = var1;
      this.this_ = var2;
      this.extends_(
         this.abstract_
            .break_()
            .class_(final_, Boolean.valueOf(true))
            .class_(package_, Boolean.valueOf(false))
            .class_(int_, Boolean.valueOf(false))
            .class_(new_, rpr_3.NORTH)
      );
   }

   @Override
   public xc_3 class_(xc_3 var1, rpa_3 var2) {
      return var1.class_(var2.class_(var1.byte_(new_)));
   }

   @Override
   public xc_3 class_(xc_3 var1, rqd_3 var2) {
      return var1.class_(new_, var2.class_(var1.byte_(new_)));
   }

   @Override
   public void class_(rYB var1, xc_3 var2, rff_3 var3, rhf_3 var4) {
      if (!var1.continue_ && var4.Pz()) {
         an_3 var5 = var4.else_();
         boolean var6 = var5 == null || var5 instanceof rhd_3 || var1.B().break_(rRu_1.break_);
         if (var6 && !var2.byte_(final_) && !var2.byte_(int_)) {
            rfH_2 var7 = var3.class_();
            var1.class_(var7, var2.class_(rCT.continue_, Boolean.valueOf(true)), 11);
         }
      }
   }

   public static void class_(rYB var0, rfH_2 var1, boolean var2, boolean var3) {
      Random var4 = var0.long_();
      rLO var5 = var2 ? rLQ.x : rLQ.J;
      var0.break_(
         var5,
         true,
         (double)var1.b_() + 0.5 + var4.nextDouble() / 3.0 * (double)(var4.nextBoolean() ? 1 : -1),
         (double)var1.c_() + var4.nextDouble() + var4.nextDouble(),
         (double)var1.d_() + 0.5 + var4.nextDouble() / 3.0 * (double)(var4.nextBoolean() ? 1 : -1),
         0.0,
         0.07,
         0.0
      );
      if (var3) {
         var0.class_(
            rLQ.double_,
            (double)var1.b_() + 0.25 + var4.nextDouble() / 2.0 * (double)(var4.nextBoolean() ? 1 : -1),
            (double)var1.c_() + 0.4,
            (double)var1.d_() + 0.25 + var4.nextDouble() / 2.0 * (double)(var4.nextBoolean() ? 1 : -1),
            0.0,
            0.005,
            0.0
         );
      }
   }

   @Override
   public ryZ_2 class_(xc_3 var1, rYB var2, rfH_2 var3, rhd_3 var4, rpm_3 var5, rff_3 var6) {
      if (var2.class_(var3) instanceof rHc_1 var8) {
         rdn_3 var9 = var4.protected_(var5);
         Optional var10 = var8.class_(var9);
         if (var10.isPresent()) {
            if (!var2.continue_ && var8.class_(((rhx_3)var4.implements_[18]).protected_ ? var9.implements_() : var9, ((rkC_2)var10.get()).throws_())) {
               var4.break_(rlB_2.L);
               return ryZ_2.SUCCESS;
            }

            return ryZ_2.CONSUME;
         }
      }

      return ryZ_2.PASS;
   }

   @Override
   public boolean class_(xc_3 var1, rRq_1 var2, rfH_2 var3, rLT var4) {
      return false;
   }

   @Override
   public ryO_2 class_(rRq_1 var1) {
      return new rHc_1();
   }

   @Override
   protected void class_(rCL<xd_3, xc_3> var1) {
      var1.class_(final_, package_, int_, new_);
   }

   @Override
   public xN_2 class_(xc_3 var1) {
      return xN_2.MODEL;
   }

   @Override
   public rjC_2 class_(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return volatile_;
   }

   @Override
   public xc_3 class_(xc_3 var1, rpr_3 var2, xc_3 var3, rRg_1 var4, rfH_2 var5, rfH_2 var6) {
      if (var1.byte_(int_)) {
         var4.extends_().class_(var5, rXG.byte_, rXG.byte_.class_(var4));
      }

      return var2 == rpr_3.DOWN ? var1.class_(package_, Boolean.valueOf(this.volatile_(var3))) : super.class_(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public xc_3 class_(rxx_3 var1) {
      rYB var2 = var1.int_();
      rfH_2 var3 = var1.class_();
      boolean var4 = var2.break_(var3).class_() == rXG.byte_;
      return this.continue_()
         .class_(int_, Boolean.valueOf(var4))
         .class_(package_, Boolean.valueOf(this.volatile_(var2.byte_(var3.break_()))))
         .class_(final_, Boolean.valueOf(!var4))
         .class_(new_, var1.case_());
   }

   public static boolean class_(rYB var0, rfH_2 var1) {
      for (int var2 = 1; var2 <= 5; var2++) {
         rfH_2 var3 = var1.catch_(var2);
         xc_3 var4 = var0.byte_(var3);
         if (private_(var4)) {
            return true;
         }

         boolean var5 = rjw_3.byte_(continue_, var4.break_(var0, var1, rjm_3.break_()), rjN_2.implements_);
         if (var5) {
            xc_3 var6 = var0.byte_(var3.break_());
            return private_(var6);
         }
      }

      return false;
   }

   @Override
   public void class_(xc_3 var1, rYB var2, rfH_2 var3, Random var4) {
      if (var1.byte_(final_)) {
         if (var4.nextInt(10) == 0) {
            var2.class_(
               (double)var3.b_() + 0.5,
               (double)var3.c_() + 0.5,
               (double)var3.d_() + 0.5,
               rqn_3.ru,
               rqL_2.BLOCKS,
               0.5F + var4.nextFloat(),
               var4.nextFloat() * 0.7F + 0.6F,
               false
            );
         }

         if (this.super_ && var4.nextInt(5) == 0) {
            for (int var5 = 0; var5 < var4.nextInt(1) + 1; var5++) {
               var2.class_(
                  rLQ.default_,
                  (double)var3.b_() + 0.5,
                  (double)var3.c_() + 0.5,
                  (double)var3.d_() + 0.5,
                  (double)(var4.nextFloat() / 2.0F),
                  5.0E-5,
                  (double)(var4.nextFloat() / 2.0F)
               );
            }
         }
      }
   }

   @Override
   public boolean class_(rRg_1 var1, rfH_2 var2, xc_3 var3, rXE var4) {
      if (!var3.byte_(rCT.throw_) && var4.class_() == rXG.byte_) {
         boolean var5 = var3.byte_(final_);
         if (var5) {
            if (!var1.import_()) {
               var1.class_((rhd_3)null, var2, rqn_3.SY, rqL_2.BLOCKS, 1.0F, 1.0F);
            }

            byte_(var1, var2, var3);
         }

         var1.class_(var2, var3.class_(int_, Boolean.valueOf(true)).class_(final_, Boolean.valueOf(false)), 3);
         var1.extends_().class_(var2, var4.class_(), var4.class_().class_(var1));
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void class_(xc_3 var1, rYB var2, rfH_2 var3, an_3 var4) {
      if (!var4.q() && var1.byte_(final_) && var4 instanceof iB_2 && !eA_2.implements_((iB_2)var4)) {
         var4.break_(rye_3.class_, (float)this.this_);
      }

      super.class_(var1, var2, var3, var4);
   }

   @Override
   public void break_(xc_3 var1, rYB var2, rfH_2 var3, xc_3 var4, boolean var5) {
      if (!var1.class_(var4.break_())) {
         ryO_2 var6 = var2.class_(var3);
         if (var6 instanceof rHc_1) {
            rXn_1.class_(var2, var3, ((rHc_1)var6).class_());
         }

         super.break_(var1, var2, var3, var4, var5);
      }
   }

   @Override
   public rXE throws_(xc_3 var1) {
      return var1.byte_(int_) ? rXG.byte_.class_(false) : super.throws_(var1);
   }

   public static boolean implements_(xc_3 var0) {
      return var0.class_(rls_3.l, var0x -> var0x.break_(rCT.throw_) && var0x.break_(rCT.continue_)) && !var0.byte_(rCT.throw_) && !var0.byte_(rCT.continue_);
   }

   public static boolean private_(xc_3 var0) {
      return var0.break_(final_) && var0.class_(rls_3.l) && var0.byte_(final_);
   }

   private boolean volatile_(xc_3 var1) {
      return var1.class_(xu_3.Ey);
   }
}
