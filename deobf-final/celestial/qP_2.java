package celestial;

public class qP_2 extends qc_3<rEI, tf_3> {
   private static final rqO_2 class_ = new rqO_2("textures/entity/guardian.png");
   private static final rqO_2 package_ = new rqO_2("textures/entity/guardian_beam.png");
   private static final HU int_ = HU.protected_(package_);

   public qP_2(pg_3 var1) {
      this(var1, 0.5F);
   }

   protected qP_2(pg_3 var1, float var2) {
      super(var1, new tf_3(), var2);
   }

   private rjU_2 class_(iB_2 var1, double var2, float var4) {
      double var5 = rfU_2.protected_((double)var4, (Double)var1.throws_[34], var1.rx());
      double var7 = rfU_2.protected_((double)var4, (Double)var1.throws_[35], var1.re()) + var2;
      double var9 = rfU_2.protected_((double)var4, (Double)var1.throws_[36], var1.BO());
      return new rjU_2(var5, var7, var9);
   }

   public void class_(rEI var1, float var2, float var3, Ml_1 var4, Hx_1 var5, int var6) {
      super.class_((rEI)var1, var2, var3, var4, var5, var6);
      iB_2 var7 = var1.sW();
      if (var7 != null) {
         float var8 = var1.char_(var3);
         float var9 = (float)((rYB)var1.throws_[7]).r() + var3;
         float var10 = var9 * 0.5F % 1.0F;
         float var11 = var1.Bx();
         var4.class_();
         var4.class_(0.0, (double)var11, 0.0);
         rjU_2 var12 = this.class_(var7, (double)var7.Bm() * 0.5, var3);
         rjU_2 var13 = this.class_(var1, (double)var11, var3);
         rjU_2 var14 = var12.protected_(var13);
         float var15 = (float)(var14.case_() + 1.0);
         var14 = var14.protected_();
         float var16 = (float)Math.acos(var14.byte_);
         float var17 = (float)Math.atan2(var14.protected_, var14.break_);
         var4.class_(rje_3.protected_.byte_(((float) (Math.PI / 2) - var17) * (180.0F / (float)Math.PI)));
         var4.class_(rje_3.break_.byte_(var16 * (180.0F / (float)Math.PI)));
         boolean var18 = true;
         float var19 = var9 * 0.05F * -1.5F;
         float var20 = var8 * var8;
         int var21 = 64 + (int)(var20 * 191.0F);
         int var22 = 32 + (int)(var20 * 191.0F);
         int var23 = 128 - (int)(var20 * 64.0F);
         float var24 = 0.2F;
         float var25 = 0.282F;
         float var26 = rfU_2.break_(var19 + (float) (Math.PI * 3.0 / 4.0)) * 0.282F;
         float var27 = rfU_2.class_(var19 + (float) (Math.PI * 3.0 / 4.0)) * 0.282F;
         float var28 = rfU_2.break_(var19 + (float) (Math.PI / 4)) * 0.282F;
         float var29 = rfU_2.class_(var19 + (float) (Math.PI / 4)) * 0.282F;
         float var30 = rfU_2.break_(var19 + ((float) Math.PI * 5.0F / 4.0F)) * 0.282F;
         float var31 = rfU_2.class_(var19 + ((float) Math.PI * 5.0F / 4.0F)) * 0.282F;
         float var32 = rfU_2.break_(var19 + ((float) Math.PI * 7.0F / 4.0F)) * 0.282F;
         float var33 = rfU_2.class_(var19 + ((float) Math.PI * 7.0F / 4.0F)) * 0.282F;
         float var34 = rfU_2.break_(var19 + (float) Math.PI) * 0.2F;
         float var35 = rfU_2.class_(var19 + (float) Math.PI) * 0.2F;
         float var36 = rfU_2.break_(var19 + 0.0F) * 0.2F;
         float var37 = rfU_2.class_(var19 + 0.0F) * 0.2F;
         float var38 = rfU_2.break_(var19 + (float) (Math.PI / 2)) * 0.2F;
         float var39 = rfU_2.class_(var19 + (float) (Math.PI / 2)) * 0.2F;
         float var40 = rfU_2.break_(var19 + (float) (Math.PI * 3.0 / 2.0)) * 0.2F;
         float var41 = rfU_2.class_(var19 + (float) (Math.PI * 3.0 / 2.0)) * 0.2F;
         float var42 = 0.0F;
         float var43 = 0.4999F;
         float var44 = -1.0F + var10;
         float var45 = var15 * 2.5F + var44;
         Ok_1 var46 = var5.getBuffer(int_);
         MH var47 = var4.byte_();
         rjV_2 var48 = var47.class_();
         rjj_3 var49 = var47.break_();
         class_(var46, var48, var49, var34, var15, var35, var21, var22, var23, 0.4999F, var45);
         class_(var46, var48, var49, var34, 0.0F, var35, var21, var22, var23, 0.4999F, var44);
         class_(var46, var48, var49, var36, 0.0F, var37, var21, var22, var23, 0.0F, var44);
         class_(var46, var48, var49, var36, var15, var37, var21, var22, var23, 0.0F, var45);
         class_(var46, var48, var49, var38, var15, var39, var21, var22, var23, 0.4999F, var45);
         class_(var46, var48, var49, var38, 0.0F, var39, var21, var22, var23, 0.4999F, var44);
         class_(var46, var48, var49, var40, 0.0F, var41, var21, var22, var23, 0.0F, var44);
         class_(var46, var48, var49, var40, var15, var41, var21, var22, var23, 0.0F, var45);
         float var50 = 0.0F;
         if ((Integer)var1.throws_[41] % 2 == 0) {
            var50 = 0.5F;
         }

         class_(var46, var48, var49, var26, var15, var27, var21, var22, var23, 0.5F, var50 + 0.5F);
         class_(var46, var48, var49, var28, var15, var29, var21, var22, var23, 1.0F, var50 + 0.5F);
         class_(var46, var48, var49, var32, var15, var33, var21, var22, var23, 1.0F, var50);
         class_(var46, var48, var49, var30, var15, var31, var21, var22, var23, 0.5F, var50);
         var4.break_();
      }
   }

   private static void class_(Ok_1 var0, rjV_2 var1, rjj_3 var2, float var3, float var4, float var5, int var6, int var7, int var8, float var9, float var10) {
      var0.class_(var1, var3, var4, var5)
         .break_(var6, var7, var8, 255)
         .class_(var9, var10)
         .byte_(fZ_2.class_)
         .break_(15728880)
         .class_(var2, 0.0F, 1.0F, 0.0F)
         .class_();
   }

   public rqO_2 class_(rEI var1) {
      return class_;
   }

   public boolean class_(rEI var1, yt_3 var2, double var3, double var5, double var7) {
      if (super.class_((rEI)var1, var2, var3, var5, var7)) {
         return true;
      } else {
         if (var1.sk()) {
            iB_2 var9 = var1.sW();
            if (var9 != null) {
               rjU_2 var10 = this.class_(var9, (double)var9.Bm() * 0.5, 1.0F);
               rjU_2 var11 = this.class_(var1, (double)var1.Bx(), 1.0F);
               return var2.class_(new rfl_3(var11.break_, var11.byte_, var11.protected_, var10.break_, var10.byte_, var10.protected_));
            }
         }

         return false;
      }
   }
}
