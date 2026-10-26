package celestial;

import java.util.List;

public class jX_2 extends jW_2<ryS_2> {
   private final jJ_2 class_ = new jJ_2();
   private static double break_ = 4096.0;

   public jX_2(jz_3 var1) {
      super(var1);
   }

   public static void class_() {
      QY var0 = QY.instanceof_();
      double var1 = rrbb_3.class_(((Qw_1)var0.class_[20]).U, 1.0, 120.0);
      double var3 = Math.max(1.5 * (double)var0.else_().continue_() / var1, 16.0);
      break_ = var3 * var3;
   }

   public void class_(ryS_2 var1, float var2, Ml_1 var3, Hx_1 var4, int var5, int var6) {
      xc_3 var7 = var1.abstract_();
      var3.class_();
      float var8 = 0.6666667F;
      if (var7.break_() instanceof zM_2) {
         var3.class_(0.5, 0.5, 0.5);
         float var9 = -((float)(var7.byte_(zM_2.package_) * 360) / 16.0F);
         var3.class_(rje_3.protected_.byte_(var9));
         this.class_.break_.finally_ = true;
      } else {
         var3.class_(0.5, 0.5, 0.5);
         float var24 = -var7.byte_(zj_3.package_).package_();
         var3.class_(rje_3.protected_.byte_(var24));
         var3.class_(0.0, -0.3125, -0.4375);
         this.class_.break_.finally_ = false;
      }

      var3.class_();
      var3.class_(0.6666667F, -0.6666667F, -0.6666667F);
      Ig_1 var25 = class_(var7.break_());
      Ok_1 var10 = var25.class_(var4, this.class_::class_);
      this.class_.class_.class_(var3, var10, var5, var6);
      this.class_.break_.class_(var3, var10, var5, var6);
      var3.break_();
      if (class_(var1)) {
         cm_3 var11 = this.catch_.class_();
         float var12 = 0.010416667F;
         var3.class_(0.0, 0.33333334F, 0.046666667F);
         var3.class_(0.010416667F, -0.010416667F, 0.010416667F);
         int var13 = var1.private_().catch_();
         if (rrbb_3.K()) {
            var13 = rrbN_2.byte_(var13);
         }

         double var14 = 0.4;
         int var16 = (int)((double)fN_2.break_(var13) * 0.4);
         int var17 = (int)((double)fN_2.byte_(var13) * 0.4);
         int var18 = (int)((double)fN_2.protected_(var13) * 0.4);
         int var19 = fN_2.class_(0, var18, var17, var16);
         byte var20 = 20;

         for (int var21 = 0; var21 < 4; var21++) {
            rpl_3 var22 = var1.class_(var21, var1x -> {
               List var2x = var11.break_(var1x, 90);
               return var2x.isEmpty() ? rpl_3.class_ : (rpl_3)var2x.get(0);
            });
            if (var22 != null) {
               float var23 = (float)(-var11.class_(var22) / 2);
               var11.class_(var22, var23, (float)(var21 * 10 - 20), var19, false, var3.byte_().class_(), var4, false, 0, var5);
            }
         }
      }

      var3.break_();
   }

   private static boolean class_(ryS_2 var0) {
      if (rrdZ.new_) {
         return false;
      } else {
         if (!rrbb_3.package_) {
            rfH_2 var1 = var0.char_();
            an_3 var2 = QY.instanceof_().catch_();
            double var3 = var2.class_((double)var1.b_(), (double)var1.c_(), (double)var1.d_());
            if (var3 > break_) {
               return false;
            }
         }

         return true;
      }
   }

   public static Ig_1 class_(xd_3 var0) {
      Qr_1 var1;
      if (var0 instanceof JD) {
         var1 = ((JD)var0).break_();
      } else {
         var1 = Qr_1.class_;
      }

      return lp_3.implements_.get(var1);
   }
}
