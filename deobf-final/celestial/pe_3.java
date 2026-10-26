package celestial;

public class pe_3 extends pV_2<rhp_3> {
   private static final rqO_2 class_ = new rqO_2("textures/entity/fishing_hook.png");
   private static final HU throws_ = HU.byte_(class_);

   public pe_3(pg_3 var1) {
      super(var1);
   }

   public rqO_2 class_(rhp_3 var1) {
      return class_;
   }

   private static void class_(float var0, float var1, float var2, Ok_1 var3, rjV_2 var4, float var5) {
      var3.class_(var4, var0 * var5, var1 * (var5 * var5 + var5) * 0.5F + 0.25F, var2 * var5).break_(0, 0, 0, 255).class_();
   }

   public void class_(rhp_3 var1, float var2, float var3, Ml_1 var4, Hx_1 var5, int var6) {
      rhd_3 var7 = var1.case_();
      if (var7 != null) {
         var4.class_();
         var4.class_();
         var4.class_(0.5F, 0.5F, 0.5F);
         var4.class_(this.break_.byte_());
         var4.class_(rje_3.protected_.byte_(180.0F));
         MH var8 = var4.byte_();
         rjV_2 var9 = var8.class_();
         rjj_3 var10 = var8.break_();
         Ok_1 var11 = var5.getBuffer(throws_);
         class_(var11, var9, var10, var6, 0.0F, 0, 0, 1);
         class_(var11, var9, var10, var6, 1.0F, 0, 1, 1);
         class_(var11, var9, var10, var6, 1.0F, 1, 1, 0);
         class_(var11, var9, var10, var6, 0.0F, 1, 0, 0);
         var4.break_();
         int var12 = var7.Su() == rpZ_2.RIGHT ? 1 : -1;
         rdn_3 var13 = var7.ss();
         if (var13.break_() != rdy_3.Xd) {
            var12 = -var12;
         }

         float var14 = var7.goto_(var3);
         float var15 = rfU_2.class_(rfU_2.byte_(var14) * (float) Math.PI);
         float var16 = rfU_2.catch_(var3, (Float)var7.private_[24], (Float)var7.private_[23]) * (float) (Math.PI / 180.0);
         double var17 = (double)rfU_2.class_(var16);
         double var19 = (double)rfU_2.break_(var16);
         double var21 = (double)var12 * 0.35;
         double var23 = 0.8;
         double var25;
         double var27;
         double var29;
         float var31;
         if ((this.break_.protected_ == null || this.break_.protected_.volatile_().class_()) && var7 == (cb_3)QY.instanceof_().class_[57]) {
            double var32 = this.break_.protected_.U;
            var32 /= 100.0;
            rjU_2 var34 = new rjU_2((double)var12 * -0.36 * var32, -0.045 * var32, 0.4);
            var34 = var34.class_(-rfU_2.catch_(var3, (Float)var7.throws_[18], (Float)var7.throws_[16]) * (float) (Math.PI / 180.0));
            var34 = var34.break_(-rfU_2.catch_(var3, (Float)var7.throws_[17], (Float)var7.throws_[15]) * (float) (Math.PI / 180.0));
            var34 = var34.break_(var15 * 0.5F);
            var34 = var34.class_(-var15 * 0.7F);
            var25 = rfU_2.protected_((double)var3, (Double)var7.throws_[8], var7.rx()) + var34.break_;
            var27 = rfU_2.protected_((double)var3, (Double)var7.throws_[9], var7.re()) + var34.byte_;
            var29 = rfU_2.protected_((double)var3, (Double)var7.throws_[10], var7.BO()) + var34.protected_;
            var31 = var7.Bx();
         } else {
            var25 = rfU_2.protected_((double)var3, (Double)var7.throws_[8], var7.rx()) - var19 * var21 - var17 * 0.8;
            var27 = (Double)var7.throws_[9] + (double)var7.Bx() + (var7.re() - (Double)var7.throws_[9]) * (double)var3 - 0.45;
            var29 = rfU_2.protected_((double)var3, (Double)var7.throws_[10], var7.BO()) - var17 * var21 + var19 * 0.8;
            var31 = var7.x() ? -0.1875F : 0.0F;
         }

         double var46 = rfU_2.protected_((double)var3, (Double)var1.throws_[8], var1.rx());
         double var51 = rfU_2.protected_((double)var3, (Double)var1.throws_[9], var1.re()) + 0.25;
         double var36 = rfU_2.protected_((double)var3, (Double)var1.throws_[10], var1.BO());
         float var38 = (float)(var25 - var46);
         float var39 = (float)(var27 - var51) + var31;
         float var40 = (float)(var29 - var36);
         Ok_1 var41 = var5.getBuffer(HU.return_());
         rjV_2 var42 = var4.byte_().class_();
         byte var43 = 16;

         for (int var44 = 0; var44 < 16; var44++) {
            class_(var38, var39, var40, var41, var42, class_(var44, 16));
            class_(var38, var39, var40, var41, var42, class_(var44 + 1, 16));
         }

         var4.break_();
         super.class_(var1, var2, var3, var4, var5, var6);
      }
   }

   private static void class_(Ok_1 var0, rjV_2 var1, rjj_3 var2, int var3, float var4, int var5, int var6, int var7) {
      var0.class_(var1, var4 - 0.5F, (float)var5 - 0.5F, 0.0F)
         .break_(255, 255, 255, 255)
         .class_((float)var6, (float)var7)
         .byte_(fZ_2.class_)
         .break_(var3)
         .class_(var2, 0.0F, 1.0F, 0.0F)
         .class_();
   }

   private static float class_(int var0, int var1) {
      return (float)var0 / (float)var1;
   }
}
