package celestial;

public class Ih_1 {
   private static final float id_class = 1.0F / (float)Math.cos((float) (Math.PI / 8)) - 1.0F;
   private static final float id_break = 1.0F / (float)Math.cos((float) (Math.PI / 4)) - 1.0F;

   public void id_class(rje_3 var1, rjo_3 var2) {
      if (var2 != rjo_3.id_class()) {
         this.id_class(var1, new rje_3(0.5F, 0.5F, 0.5F), var2.id_byte(), new rje_3(1.0F, 1.0F, 1.0F));
      }
   }

   private void id_class(rje_3 var1, rje_3 var2, rjV_2 var3, rje_3 var4) {
      rji_3 var5 = new rji_3(var1.id_class() - var2.id_class(), var1.id_break() - var2.id_break(), var1.id_byte() - var2.id_byte(), 1.0F);
      var5.id_class(var3);
      var5.id_class(var4);
      var1.id_break(var5.id_class() + var2.id_class(), var5.id_break() + var2.id_break(), var5.id_byte() + var2.id_byte());
   }

   public static rpr_3 id_class(int[] var0) {
      int var1 = var0.length / 4;
      int var2 = var1 * 2;
      rje_3 var3 = new rje_3(Float.intBitsToFloat(var0[0]), Float.intBitsToFloat(var0[1]), Float.intBitsToFloat(var0[2]));
      rje_3 var4 = new rje_3(Float.intBitsToFloat(var0[var1]), Float.intBitsToFloat(var0[var1 + 1]), Float.intBitsToFloat(var0[var1 + 2]));
      rje_3 var5 = new rje_3(Float.intBitsToFloat(var0[var2]), Float.intBitsToFloat(var0[var2 + 1]), Float.intBitsToFloat(var0[var2 + 2]));
      rje_3 var6 = var3.id_throws();
      var6.id_break(var4);
      rje_3 var7 = var5.id_throws();
      var7.id_break(var4);
      rje_3 var8 = var7.id_throws();
      var8.id_protected(var6);
      var8.id_protected();
      rpr_3 var9 = null;
      float var10 = 0.0F;

      for (rpr_3 var14 : rpr_3.values()) {
         rja_3 var15 = var14.id_int();
         rje_3 var16 = new rje_3((float)var15.b_(), (float)var15.c_(), (float)var15.d_());
         float var17 = var8.id_byte(var16);
         if (var17 >= 0.0F && var17 > var10) {
            var10 = var17;
            var9 = var14;
         }
      }

      return var9 == null ? rpr_3.UP : var9;
   }

   private void id_class(int[] var1, rpr_3 var2) {
      int[] var3 = new int[var1.length];
      System.arraycopy(var1, 0, var3, 0, var1.length);
      float[] var4 = new float[rpr_3.values().length];
      var4[Hr_1.id_case] = 999.0F;
      var4[Hr_1.id_throws] = 999.0F;
      var4[Hr_1.id_protected] = 999.0F;
      var4[Hr_1.id_byte] = -999.0F;
      var4[Hr_1.id_break] = -999.0F;
      var4[Hr_1.id_class] = -999.0F;
      int var5 = var1.length / 4;

      for (int var6 = 0; var6 < 4; var6++) {
         int var7 = var5 * var6;
         float var8 = Float.intBitsToFloat(var3[var7]);
         float var9 = Float.intBitsToFloat(var3[var7 + 1]);
         float var10 = Float.intBitsToFloat(var3[var7 + 2]);
         if (var8 < var4[Hr_1.id_case]) {
            var4[Hr_1.id_case] = var8;
         }

         if (var9 < var4[Hr_1.id_throws]) {
            var4[Hr_1.id_throws] = var9;
         }

         if (var10 < var4[Hr_1.id_protected]) {
            var4[Hr_1.id_protected] = var10;
         }

         if (var8 > var4[Hr_1.id_byte]) {
            var4[Hr_1.id_byte] = var8;
         }

         if (var9 > var4[Hr_1.id_break]) {
            var4[Hr_1.id_break] = var9;
         }

         if (var10 > var4[Hr_1.id_class]) {
            var4[Hr_1.id_class] = var10;
         }
      }

      li_3 var18 = li_3.id_class(var2);

      for (int var19 = 0; var19 < 4; var19++) {
         int var20 = var5 * var19;
         HP var21 = var18.id_class(var19);
         float var22 = var4[var21.id_class];
         float var11 = var4[var21.id_break];
         float var12 = var4[var21.id_byte];
         var1[var20] = Float.floatToRawIntBits(var22);
         var1[var20 + 1] = Float.floatToRawIntBits(var11);
         var1[var20 + 2] = Float.floatToRawIntBits(var12);

         for (int var13 = 0; var13 < 4; var13++) {
            int var14 = var5 * var13;
            float var15 = Float.intBitsToFloat(var3[var14]);
            float var16 = Float.intBitsToFloat(var3[var14 + 1]);
            float var17 = Float.intBitsToFloat(var3[var14 + 2]);
            if (rfU_2.id_class(var22, var15) && rfU_2.id_class(var11, var16) && rfU_2.id_class(var12, var17)) {
               var1[var20 + 4] = var3[var14 + 4];
               var1[var20 + 4 + 1] = var3[var14 + 4 + 1];
            }
         }
      }
   }

   private void id_class(rje_3 var1, IM var2) {
      if (var2 != null) {
         rje_3 var3;
         rje_3 var4;
         switch (var2.id_break) {
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

         rjY_2 var5 = new rjY_2(var3, var2.id_byte, true);
         if (var2.id_protected) {
            if (Math.abs(var2.id_byte) == 22.5F) {
               var4.id_class(id_class);
            } else {
               var4.id_class(id_break);
            }

            var4.id_byte(1.0F, 1.0F, 1.0F);
         } else {
            var4.id_break(1.0F, 1.0F, 1.0F);
         }

         this.id_class(var1, var2.id_class.id_throws(), new rjV_2(var5), var4);
      }
   }

   public static wD_2 id_class(wD_2 var0, rpr_3 var1, rjo_3 var2, rqO_2 var3) {
      rjV_2 var4 = Io_1.id_class(var2, var1, () -> "Unable to resolve UVLock for model: " + var3).id_byte();
      float var5 = var0.id_class(var0.id_byte(0));
      float var6 = var0.id_break(var0.id_byte(0));
      rji_3 var7 = new rji_3(var5 / 16.0F, var6 / 16.0F, 0.0F, 1.0F);
      var7.id_class(var4);
      float var8 = 16.0F * var7.id_class();
      float var9 = 16.0F * var7.id_break();
      float var10 = var0.id_class(var0.id_byte(2));
      float var11 = var0.id_break(var0.id_byte(2));
      rji_3 var12 = new rji_3(var10 / 16.0F, var11 / 16.0F, 0.0F, 1.0F);
      var12.id_class(var4);
      float var13 = 16.0F * var12.id_class();
      float var14 = 16.0F * var12.id_break();
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

      float var19 = (float)Math.toRadians((double)var0.id_break);
      rje_3 var20 = new rje_3(rfU_2.id_break(var19), rfU_2.id_class(var19), 0.0F);
      rjj_3 var21 = new rjj_3(var4);
      var20.id_class(var21);
      int var22 = Math.floorMod(-((int)Math.round(Math.toDegrees(Math.atan2((double)var20.id_break(), (double)var20.id_class())) / 90.0)) * 90, 360);
      return new wD_2(new float[]{var15, var17, var16, var18}, var22);
   }

   private int[] id_class(wD_2 var1, fj_3 var2, rpr_3 var3, float[] var4, rjo_3 var5, IM var6, boolean var7) {
      int var8 = rrbb_3.rs() ? ju_3.id_volatile : ju_3.id_native;
      int[] var9 = new int[var8];

      for (int var10 = 0; var10 < 4; var10++) {
         this.id_class(var9, var10, var3, var1, var4, var2, var5, var6, var7);
      }

      return var9;
   }

   private float[] id_class(rje_3 var1, rje_3 var2) {
      float[] var3 = new float[rpr_3.values().length];
      var3[Hr_1.id_case] = var1.id_class() / 16.0F;
      var3[Hr_1.id_throws] = var1.id_break() / 16.0F;
      var3[Hr_1.id_protected] = var1.id_byte() / 16.0F;
      var3[Hr_1.id_byte] = var2.id_class() / 16.0F;
      var3[Hr_1.id_break] = var2.id_break() / 16.0F;
      var3[Hr_1.id_class] = var2.id_byte() / 16.0F;
      return var3;
   }

   private void id_class(int[] var1, int var2, rpr_3 var3, wD_2 var4, float[] var5, fj_3 var6, rjo_3 var7, IM var8, boolean var9) {
      HP var10 = li_3.id_class(var3).id_class(var2);
      rje_3 var11 = new rje_3(var5[var10.id_class], var5[var10.id_break], var5[var10.id_byte]);
      this.id_class(var11, var8);
      this.id_class(var11, var7);
      rrJy_1.id_class(var11);
      this.id_class(var1, var2, var11, var6, var4);
   }

   private void id_class(int[] var1, int var2, rje_3 var3, fj_3 var4, wD_2 var5) {
      int var6 = var1.length / 4;
      int var7 = var2 * var6;
      var1[var7] = Float.floatToRawIntBits(var3.id_class());
      var1[var7 + 1] = Float.floatToRawIntBits(var3.id_break());
      var1[var7 + 2] = Float.floatToRawIntBits(var3.id_byte());
      var1[var7 + 3] = -1;
      var1[var7 + 4] = Float.floatToRawIntBits(var4.id_class((double)var5.id_class(var2)));
      var1[var7 + 4 + 1] = Float.floatToRawIntBits(var4.id_break((double)var5.id_break(var2)));
   }

   public wK_2 id_class(rje_3 var1, rje_3 var2, IG var3, fj_3 var4, rpr_3 var5, Ix_1 var6, IM var7, boolean var8, rqO_2 var9) {
      wD_2 var10 = var3.id_protected;
      if (var6.id_break()) {
         var10 = id_class(var3.id_protected, var5, var6.id_class(), var9);
      }

      float[] var11 = new float[var10.id_class.length];
      System.arraycopy(var10.id_class, 0, var11, 0, var11.length);
      float var12 = var4.id_final();
      float var13 = (var10.id_class[0] + var10.id_class[0] + var10.id_class[2] + var10.id_class[2]) / 4.0F;
      float var14 = (var10.id_class[1] + var10.id_class[1] + var10.id_class[3] + var10.id_class[3]) / 4.0F;
      var10.id_class[0] = rfU_2.id_catch(var12, var10.id_class[0], var13);
      var10.id_class[2] = rfU_2.id_catch(var12, var10.id_class[2], var13);
      var10.id_class[1] = rfU_2.id_catch(var12, var10.id_class[1], var14);
      var10.id_class[3] = rfU_2.id_catch(var12, var10.id_class[3], var14);
      boolean var15 = rrxr_3.rx.id_byte() ? false : var8;
      int[] var16 = this.id_class(var10, var4, var5, this.id_class(var1, var2), var6.id_class(), var7, var15);
      rpr_3 var17 = id_class(var16);
      System.arraycopy(var11, 0, var10.id_class, 0, var11.length);
      if (var7 == null) {
         this.id_class(var16, var17);
      }

      return new wK_2(var16, var3.id_break, var17, var4, var8);
   }
}
