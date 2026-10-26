package celestial;

public class Ih_1 {
   private static final float class_ = 1.0F / (float)Math.cos((float) (Math.PI / 8)) - 1.0F;
   private static final float break_ = 1.0F / (float)Math.cos((float) (Math.PI / 4)) - 1.0F;

   public void class_(rje_3 var1, rjo_3 var2) {
      if (var2 != rjo_3.class_()) {
         this.class_(var1, new rje_3(0.5F, 0.5F, 0.5F), var2.byte_(), new rje_3(1.0F, 1.0F, 1.0F));
      }
   }

   private void class_(rje_3 var1, rje_3 var2, rjV_2 var3, rje_3 var4) {
      rji_3 var5 = new rji_3(var1.class_() - var2.class_(), var1.break_() - var2.break_(), var1.byte_() - var2.byte_(), 1.0F);
      var5.class_(var3);
      var5.class_(var4);
      var1.break_(var5.class_() + var2.class_(), var5.break_() + var2.break_(), var5.byte_() + var2.byte_());
   }

   public static rpr_3 class_(int[] var0) {
      int var1 = var0.length / 4;
      int var2 = var1 * 2;
      rje_3 var3 = new rje_3(Float.intBitsToFloat(var0[0]), Float.intBitsToFloat(var0[1]), Float.intBitsToFloat(var0[2]));
      rje_3 var4 = new rje_3(Float.intBitsToFloat(var0[var1]), Float.intBitsToFloat(var0[var1 + 1]), Float.intBitsToFloat(var0[var1 + 2]));
      rje_3 var5 = new rje_3(Float.intBitsToFloat(var0[var2]), Float.intBitsToFloat(var0[var2 + 1]), Float.intBitsToFloat(var0[var2 + 2]));
      rje_3 var6 = var3.throws_();
      var6.break_(var4);
      rje_3 var7 = var5.throws_();
      var7.break_(var4);
      rje_3 var8 = var7.throws_();
      var8.protected_(var6);
      var8.protected_();
      rpr_3 var9 = null;
      float var10 = 0.0F;

      for (rpr_3 var14 : rpr_3.values()) {
         rja_3 var15 = var14.int_();
         rje_3 var16 = new rje_3((float)var15.b_(), (float)var15.c_(), (float)var15.d_());
         float var17 = var8.byte_(var16);
         if (var17 >= 0.0F && var17 > var10) {
            var10 = var17;
            var9 = var14;
         }
      }

      return var9 == null ? rpr_3.UP : var9;
   }

   private void class_(int[] var1, rpr_3 var2) {
      int[] var3 = new int[var1.length];
      System.arraycopy(var1, 0, var3, 0, var1.length);
      float[] var4 = new float[rpr_3.values().length];
      var4[Hr_1.case_] = 999.0F;
      var4[Hr_1.throws_] = 999.0F;
      var4[Hr_1.protected_] = 999.0F;
      var4[Hr_1.byte_] = -999.0F;
      var4[Hr_1.break_] = -999.0F;
      var4[Hr_1.class_] = -999.0F;
      int var5 = var1.length / 4;

      for (int var6 = 0; var6 < 4; var6++) {
         int var7 = var5 * var6;
         float var8 = Float.intBitsToFloat(var3[var7]);
         float var9 = Float.intBitsToFloat(var3[var7 + 1]);
         float var10 = Float.intBitsToFloat(var3[var7 + 2]);
         if (var8 < var4[Hr_1.case_]) {
            var4[Hr_1.case_] = var8;
         }

         if (var9 < var4[Hr_1.throws_]) {
            var4[Hr_1.throws_] = var9;
         }

         if (var10 < var4[Hr_1.protected_]) {
            var4[Hr_1.protected_] = var10;
         }

         if (var8 > var4[Hr_1.byte_]) {
            var4[Hr_1.byte_] = var8;
         }

         if (var9 > var4[Hr_1.break_]) {
            var4[Hr_1.break_] = var9;
         }

         if (var10 > var4[Hr_1.class_]) {
            var4[Hr_1.class_] = var10;
         }
      }

      li_3 var18 = li_3.class_(var2);

      for (int var19 = 0; var19 < 4; var19++) {
         int var20 = var5 * var19;
         HP var21 = var18.class_(var19);
         float var22 = var4[var21.class_];
         float var11 = var4[var21.break_];
         float var12 = var4[var21.byte_];
         var1[var20] = Float.floatToRawIntBits(var22);
         var1[var20 + 1] = Float.floatToRawIntBits(var11);
         var1[var20 + 2] = Float.floatToRawIntBits(var12);

         for (int var13 = 0; var13 < 4; var13++) {
            int var14 = var5 * var13;
            float var15 = Float.intBitsToFloat(var3[var14]);
            float var16 = Float.intBitsToFloat(var3[var14 + 1]);
            float var17 = Float.intBitsToFloat(var3[var14 + 2]);
            if (rfU_2.class_(var22, var15) && rfU_2.class_(var11, var16) && rfU_2.class_(var12, var17)) {
               var1[var20 + 4] = var3[var14 + 4];
               var1[var20 + 4 + 1] = var3[var14 + 4 + 1];
            }
         }
      }
   }

   private void class_(rje_3 var1, IM var2) {
      if (var2 != null) {
         rje_3 var3;
         rje_3 var4;
         switch (var2.break_) {
            case X:
               var3 = new rje_3(1.0F, 0.0F, 0.0F);
               var4 = new rje_3(0.0F, 1.0F, 1.0F);
               break;
            case Y:
               var3 = new rje_3(0.0F, 1.0F, 0.0F);
               var4 = new rje_3(1.0F, 0.0F, 1.0F);
               break;
            case Z:
               var3 = new rje_3(0.0F, 0.0F, 1.0F);
               var4 = new rje_3(1.0F, 1.0F, 0.0F);
               break;
            default:
               throw new IllegalArgumentException("There are only 3 axes");
         }

         rjY_2 var5 = new rjY_2(var3, var2.byte_, true);
         if (var2.protected_) {
            if (Math.abs(var2.byte_) == 22.5F) {
               var4.class_(class_);
            } else {
               var4.class_(break_);
            }

            var4.byte_(1.0F, 1.0F, 1.0F);
         } else {
            var4.break_(1.0F, 1.0F, 1.0F);
         }

         this.class_(var1, var2.class_.throws_(), new rjV_2(var5), var4);
      }
   }

   public static wD_2 class_(wD_2 var0, rpr_3 var1, rjo_3 var2, rqO_2 var3) {
      rjV_2 var4 = Io_1.class_(var2, var1, () -> "Unable to resolve UVLock for model: " + var3).byte_();
      float var5 = var0.class_(var0.byte_(0));
      float var6 = var0.break_(var0.byte_(0));
      rji_3 var7 = new rji_3(var5 / 16.0F, var6 / 16.0F, 0.0F, 1.0F);
      var7.class_(var4);
      float var8 = 16.0F * var7.class_();
      float var9 = 16.0F * var7.break_();
      float var10 = var0.class_(var0.byte_(2));
      float var11 = var0.break_(var0.byte_(2));
      rji_3 var12 = new rji_3(var10 / 16.0F, var11 / 16.0F, 0.0F, 1.0F);
      var12.class_(var4);
      float var13 = 16.0F * var12.class_();
      float var14 = 16.0F * var12.break_();
      float var15;
      float var16;
      if (Math.signum(var10 - var5) == Math.signum(var13 - var8)) {
         var15 = var8;
         var16 = var13;
      } else {
         var15 = var13;
         var16 = var8;
      }

      float var17;
      float var18;
      if (Math.signum(var11 - var6) == Math.signum(var14 - var9)) {
         var17 = var9;
         var18 = var14;
      } else {
         var17 = var14;
         var18 = var9;
      }

      float var19 = (float)Math.toRadians((double)var0.break_);
      rje_3 var20 = new rje_3(rfU_2.break_(var19), rfU_2.class_(var19), 0.0F);
      rjj_3 var21 = new rjj_3(var4);
      var20.class_(var21);
      int var22 = Math.floorMod(-((int)Math.round(Math.toDegrees(Math.atan2((double)var20.break_(), (double)var20.class_())) / 90.0)) * 90, 360);
      return new wD_2(new float[]{var15, var17, var16, var18}, var22);
   }

   private int[] class_(wD_2 var1, fj_3 var2, rpr_3 var3, float[] var4, rjo_3 var5, IM var6, boolean var7) {
      int var8 = rrbb_3.rs() ? ju_3.volatile_ : ju_3.native_;
      int[] var9 = new int[var8];

      for (int var10 = 0; var10 < 4; var10++) {
         this.class_(var9, var10, var3, var1, var4, var2, var5, var6, var7);
      }

      return var9;
   }

   private float[] class_(rje_3 var1, rje_3 var2) {
      float[] var3 = new float[rpr_3.values().length];
      var3[Hr_1.case_] = var1.class_() / 16.0F;
      var3[Hr_1.throws_] = var1.break_() / 16.0F;
      var3[Hr_1.protected_] = var1.byte_() / 16.0F;
      var3[Hr_1.byte_] = var2.class_() / 16.0F;
      var3[Hr_1.break_] = var2.break_() / 16.0F;
      var3[Hr_1.class_] = var2.byte_() / 16.0F;
      return var3;
   }

   private void class_(int[] var1, int var2, rpr_3 var3, wD_2 var4, float[] var5, fj_3 var6, rjo_3 var7, IM var8, boolean var9) {
      HP var10 = li_3.class_(var3).class_(var2);
      rje_3 var11 = new rje_3(var5[var10.class_], var5[var10.break_], var5[var10.byte_]);
      this.class_(var11, var8);
      this.class_(var11, var7);
      rrJy_1.class_(var11);
      this.class_(var1, var2, var11, var6, var4);
   }

   private void class_(int[] var1, int var2, rje_3 var3, fj_3 var4, wD_2 var5) {
      int var6 = var1.length / 4;
      int var7 = var2 * var6;
      var1[var7] = Float.floatToRawIntBits(var3.class_());
      var1[var7 + 1] = Float.floatToRawIntBits(var3.break_());
      var1[var7 + 2] = Float.floatToRawIntBits(var3.byte_());
      var1[var7 + 3] = -1;
      var1[var7 + 4] = Float.floatToRawIntBits(var4.class_((double)var5.class_(var2)));
      var1[var7 + 4 + 1] = Float.floatToRawIntBits(var4.break_((double)var5.break_(var2)));
   }

   public wK_2 class_(rje_3 var1, rje_3 var2, IG var3, fj_3 var4, rpr_3 var5, Ix_1 var6, IM var7, boolean var8, rqO_2 var9) {
      wD_2 var10 = var3.protected_;
      if (var6.break_()) {
         var10 = class_(var3.protected_, var5, var6.class_(), var9);
      }

      float[] var11 = new float[var10.class_.length];
      System.arraycopy(var10.class_, 0, var11, 0, var11.length);
      float var12 = var4.final_();
      float var13 = (var10.class_[0] + var10.class_[0] + var10.class_[2] + var10.class_[2]) / 4.0F;
      float var14 = (var10.class_[1] + var10.class_[1] + var10.class_[3] + var10.class_[3]) / 4.0F;
      var10.class_[0] = rfU_2.catch_(var12, var10.class_[0], var13);
      var10.class_[2] = rfU_2.catch_(var12, var10.class_[2], var13);
      var10.class_[1] = rfU_2.catch_(var12, var10.class_[1], var14);
      var10.class_[3] = rfU_2.catch_(var12, var10.class_[3], var14);
      boolean var15 = rrxr_3.rx.byte_() ? false : var8;
      int[] var16 = this.class_(var10, var4, var5, this.class_(var1, var2), var6.class_(), var7, var15);
      rpr_3 var17 = class_(var16);
      System.arraycopy(var11, 0, var10.class_, 0, var11.length);
      if (var7 == null) {
         this.class_(var16, var17);
      }

      return new wK_2(var16, var3.break_, var17, var4, var8);
   }
}
