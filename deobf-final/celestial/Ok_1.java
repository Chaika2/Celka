package celestial;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public interface Ok_1 extends rrGH {
   Logger case_ = LogManager.getLogger();
   ThreadLocal<rrxF_2> catch_ = ThreadLocal.withInitial(() -> new rrxF_2(xu_3.class_.continue_(), new rfH_2(0, 0, 0)));

   Ok_1 byte_(int var1, int var2);

   default void byte_(float var1, float var2, float var3) {
   }

   default Ok_1 byte_(int var1) {
      return this.break_(var1 & 65535, var1 >> 16 & 65535);
   }

   default int[] byte_(int var1, int var2, int var3, int var4) {
      return new int[]{var1, var2, var3, var4};
   }

   default HU byte_() {
      return null;
   }

   default void byte_(MH var1, wK_2 var2, float[] var3, float var4, float var5, float var6, float var7, int[] var8, int var9, boolean var10) {
      int[] var11 = this.break_() ? var2.catch_() : var2.class_();
      this.class_(var2.case_());
      boolean var12 = lT_2.protected_();
      rja_3 var13 = var2.protected_().int_();
      float var14 = (float)var13.b_();
      float var15 = (float)var13.c_();
      float var16 = (float)var13.d_();
      rjV_2 var17 = var1.class_();
      rjj_3 var18 = var1.break_();
      float var19 = var18.throws_(var14, var15, var16);
      float var20 = var18.case_(var14, var15, var16);
      float var21 = var18.catch_(var14, var15, var16);
      int var22 = ju_3.private_.class_();
      int var23 = var11.length / var22;
      boolean var24 = rrbb_3.rs() && rrdZ.p && rrbb_3.final_();
      if (var24) {
         rrbD_2 var25 = rrME.class_();
         if (var25 != null) {
            rrxq_3[] var26 = var2.class_(var25.class_());
            this.class_(var26);
         }
      }

      for (int var41 = 0; var41 < var23; var41++) {
         int var42 = var41 * var22;
         float var27 = Float.intBitsToFloat(var11[var42]);
         float var28 = Float.intBitsToFloat(var11[var42 + 1]);
         float var29 = Float.intBitsToFloat(var11[var42 + 2]);
         float var31 = var12 ? 1.0F : var3[var41];
         float var30;
         float var32;
         float var33;
         float var34;
         if (var10) {
            int var35 = var11[var42 + 3];
            float var36 = (float)(var35 & 0xFF) / 255.0F;
            float var37 = (float)(var35 >> 8 & 0xFF) / 255.0F;
            float var38 = (float)(var35 >> 16 & 0xFF) / 255.0F;
            var32 = var36 * var31 * var4;
            var33 = var37 * var31 * var5;
            var34 = var38 * var31 * var6;
            float var39 = (float)(var35 >> 24 & 0xFF) / 255.0F;
            var30 = var39 * var7;
         } else {
            var32 = var31 * var4;
            var33 = var31 * var5;
            var34 = var31 * var6;
            var30 = var7;
         }

         int var43 = var8[var41];
         float var44 = Float.intBitsToFloat(var11[var42 + 4]);
         float var45 = Float.intBitsToFloat(var11[var42 + 5]);
         float var46 = var17.break_(var27, var28, var29, 1.0F);
         float var47 = var17.byte_(var27, var28, var29, 1.0F);
         float var40 = var17.protected_(var27, var28, var29, 1.0F);
         if (var12) {
            var30 = var3[var41];
         }

         this.class_(var46, var47, var40, var32, var33, var34, var30, var44, var45, var9, var43, var19, var20, var21);
      }
   }

   default void class_(HU var1) {
   }

   default void class_(MH var1, wK_2 var2, float[] var3, float var4, float var5, float var6, int[] var7, int var8, boolean var9) {
      this.byte_(var1, var2, var3, var4, var5, var6, 1.0F, var7, var8, var9);
   }

   default void class_(fj_3 var1) {
   }

   default Ok_1 class_(rjV_2 var1, float var2, float var3, float var4) {
      float var6 = var1.break_(var2, var3, var4);
      float var7 = var1.byte_(var2, var3, var4);
      float var8 = var1.protected_(var2, var3, var4);
      return this.class_((double)var6, (double)var7, (double)var8);
   }

   default Ok_1 class_(rjj_3 var1, float var2, float var3, float var4) {
      float var6 = var1.class_(var2, var3, var4);
      float var7 = var1.break_(var2, var3, var4);
      float var8 = var1.byte_(var2, var3, var4);
      return this.class_(var6, var7, var8);
   }

   default rrxF_2 class_(xc_3 var1, rfH_2 var2) {
      rrxF_2 var3 = catch_.get();
      var3.class_(var1, var2);
      return var3;
   }

   default rje_3 class_(int[] var1, int var2, rjj_3 var3) {
      byte var4 = 7;
      int var5 = var1[var2 + var4];
      byte var6 = (byte)(var5 >> 0 & 0xFF);
      byte var7 = (byte)(var5 >> 8 & 0xFF);
      byte var8 = (byte)(var5 >> 16 & 0xFF);
      if (var6 == 0 && var7 == 0 && var8 == 0) {
         return null;
      } else {
         rje_3 var9 = this.break_((float)var6 / 127.0F, (float)var7 / 127.0F, (float)var8 / 127.0F);
         var9.class_(var3);
         return var9;
      }
   }

   default int class_(int var1, int[] var2, int var3) {
      int var4 = protected_(0);
      int var5 = HQ.class_(var2[var3 + var4]);
      int var6 = HQ.break_(var2[var3 + var4]);
      if (var5 == 0 && var6 == 0) {
         return var1;
      } else {
         int var7 = HQ.class_(var1);
         int var8 = HQ.break_(var1);
         var7 = Math.max(var7, var5);
         var8 = Math.max(var8, var6);
         return HQ.class_(var7, var8);
      }
   }

   default void class_(rrxq_3[] var1) {
   }

   default rje_3 class_(rje_3 var1) {
      return var1.throws_();
   }

   default void class_(boolean var1) {
   }

   Ok_1 class_(float var1, float var2, float var3);

   void class_();

   default void class_(
      float var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      int var10,
      int var11,
      float var12,
      float var13,
      float var14
   ) {
      this.class_((double)var1, (double)var2, (double)var3);
      this.class_(var4, var5, var6, var7);
      this.class_(var8, var9);
      this.byte_(var10);
      this.break_(var11);
      this.class_(var12, var13, var14);
      this.class_();
   }

   default Ok_1 class_(float var1, float var2, float var3, float var4) {
      return this.break_((int)(var1 * 255.0F), (int)(var2 * 255.0F), (int)(var3 * 255.0F), (int)(var4 * 255.0F));
   }

   Ok_1 class_(int var1);

   Ok_1 class_(int var1, int var2);

   Ok_1 class_(float var1, float var2);

   Ok_1 class_(double var1, double var3, double var5);

   default void class_(MH var1, wK_2 var2, float var3, float var4, float var5, float var6, int var7, int var8) {
      this.byte_(var1, var2, this.break_(1.0F, 1.0F, 1.0F, 1.0F), var3, var4, var5, var6, this.byte_(var7, var7, var7, var7), var8, false);
   }

   default void class_(MH var1, wK_2 var2, float[] var3, float var4, float var5, float var6, float var7, int[] var8, int var9, boolean var10) {
      this.byte_(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
   }

   default void class_(MH var1, wK_2 var2, float var3, float var4, float var5, int var6, int var7) {
      this.class_(var1, var2, this.break_(1.0F, 1.0F, 1.0F, 1.0F), var3, var4, var5, this.byte_(var6, var6, var6, var6), var7, false);
   }

   default void break_(MH var1, wK_2 var2, float[] var3, float var4, float var5, float var6, float var7, int[] var8, int var9, boolean var10) {
      this.byte_(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
   }

   default void break_(MH var1, wK_2 var2, float var3, float var4, float var5, float var6, int var7, int var8) {
      this.byte_(var1, var2, this.break_(1.0F, 1.0F, 1.0F, 1.0F), var3, var4, var5, var6, this.byte_(var7, var7, var7, var7), var8, false);
   }

   default rje_3 break_(float var1, float var2, float var3) {
      return new rje_3(var1, var2, var3);
   }

   Ok_1 break_(int var1, int var2, int var3, int var4);

   default void break_(fj_3 var1) {
   }

   default boolean break_() {
      return false;
   }

   default float[] break_(float var1, float var2, float var3, float var4) {
      return new float[]{var1, var2, var3, var4};
   }

   default Ok_1 break_(int var1) {
      return this.byte_(var1 & 65535, var1 >> 16 & 65535);
   }

   Ok_1 break_(int var1, int var2);

   default Ok_1 throws_() {
      return null;
   }

   static int protected_(int var0) {
      return var0 * 8 + 6;
   }

   default Hd_1 protected_() {
      return null;
   }
}
