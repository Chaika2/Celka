package celestial;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public interface Ok_1 extends rrGH {
   Logger id_case = LogManager.getLogger();
   ThreadLocal<rrxF_2> id_catch = ThreadLocal.withInitial(() -> new rrxF_2(xu_3.id_class.id_continue(), new rfH_2(0, 0, 0)));

   Ok_1 id_byte(int var1, int var2);

   default void id_byte(float var1, float var2, float var3) {
   }

   default Ok_1 id_byte(int var1) {
      return this.id_break(var1 & 65535, var1 >> 16 & 65535);
   }

   default int[] id_byte(int var1, int var2, int var3, int var4) {
      return new int[]{var1, var2, var3, var4};
   }

   default HU id_byte() {
      return null;
   }

   default void id_byte(MH var1, wK_2 var2, float[] var3, float var4, float var5, float var6, float var7, int[] var8, int var9, boolean var10) {
      int[] var11 = this.id_break() ? var2.id_catch() : var2.id_class();
      this.id_class(var2.id_case());
      boolean var12 = lT_2.id_protected();
      rja_3 var13 = var2.id_protected().id_int();
      float var14 = (float)var13.b_();
      float var15 = (float)var13.c_();
      float var16 = (float)var13.d_();
      rjV_2 var17 = var1.id_class();
      rjj_3 var18 = var1.id_break();
      float var19 = var18.id_throws(var14, var15, var16);
      float var20 = var18.id_case(var14, var15, var16);
      float var21 = var18.id_catch(var14, var15, var16);
      int var22 = ju_3.id_private.id_class();
      int var23 = var11.length / var22;
      boolean var24 = rrbb_3.rs() && rrdZ.p && rrbb_3.id_final();
      if (var24) {
         rrbD_2 var25 = rrME.id_class();
         if (var25 != null) {
            rrxq_3[] var26 = var2.id_class(var25.id_class());
            this.id_class(var26);
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
         float var46 = var17.id_break(var27, var28, var29, 1.0F);
         float var47 = var17.id_byte(var27, var28, var29, 1.0F);
         float var40 = var17.id_protected(var27, var28, var29, 1.0F);
         if (var12) {
            var30 = var3[var41];
         }

         this.id_class(var46, var47, var40, var32, var33, var34, var30, var44, var45, var9, var43, var19, var20, var21);
      }
   }

   default void id_class(HU var1) {
   }

   default void id_class(MH var1, wK_2 var2, float[] var3, float var4, float var5, float var6, int[] var7, int var8, boolean var9) {
      this.id_byte(var1, var2, var3, var4, var5, var6, 1.0F, var7, var8, var9);
   }

   default void id_class(fj_3 var1) {
   }

   default Ok_1 id_class(rjV_2 var1, float var2, float var3, float var4) {
      float var6 = var1.id_break(var2, var3, var4);
      float var7 = var1.id_byte(var2, var3, var4);
      float var8 = var1.id_protected(var2, var3, var4);
      return this.id_class((double)var6, (double)var7, (double)var8);
   }

   default Ok_1 id_class(rjj_3 var1, float var2, float var3, float var4) {
      float var6 = var1.id_class(var2, var3, var4);
      float var7 = var1.id_break(var2, var3, var4);
      float var8 = var1.id_byte(var2, var3, var4);
      return this.id_class(var6, var7, var8);
   }

   default rrxF_2 id_class(xc_3 var1, rfH_2 var2) {
      rrxF_2 var3 = id_catch.get();
      var3.id_class(var1, var2);
      return var3;
   }

   default rje_3 id_class(int[] var1, int var2, rjj_3 var3) {
      byte var4 = 7;
      int var5 = var1[var2 + var4];
      byte var6 = (byte)(var5 >> 0 & 0xFF);
      byte var7 = (byte)(var5 >> 8 & 0xFF);
      byte var8 = (byte)(var5 >> 16 & 0xFF);
      if (var6 == 0 && var7 == 0 && var8 == 0) {
         return null;
      } else {
         rje_3 var9 = this.id_break((float)var6 / 127.0F, (float)var7 / 127.0F, (float)var8 / 127.0F);
         var9.id_class(var3);
         return var9;
      }
   }

   default int id_class(int var1, int[] var2, int var3) {
      int var4 = id_protected(0);
      int var5 = HQ.id_class(var2[var3 + var4]);
      int var6 = HQ.id_break(var2[var3 + var4]);
      if (var5 == 0 && var6 == 0) {
         return var1;
      } else {
         int var7 = HQ.id_class(var1);
         int var8 = HQ.id_break(var1);
         var7 = Math.max(var7, var5);
         var8 = Math.max(var8, var6);
         return HQ.id_class(var7, var8);
      }
   }

   default void id_class(rrxq_3[] var1) {
   }

   default rje_3 id_class(rje_3 var1) {
      return var1.id_throws();
   }

   default void id_class(boolean var1) {
   }

   Ok_1 id_class(float var1, float var2, float var3);

   void id_class();

   default void id_class(
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
      this.id_class((double)var1, (double)var2, (double)var3);
      this.id_class(var4, var5, var6, var7);
      this.id_class(var8, var9);
      this.id_byte(var10);
      this.id_break(var11);
      this.id_class(var12, var13, var14);
      this.id_class();
   }

   default Ok_1 id_class(float var1, float var2, float var3, float var4) {
      return this.id_break((int)(var1 * 255.0F), (int)(var2 * 255.0F), (int)(var3 * 255.0F), (int)(var4 * 255.0F));
   }

   Ok_1 id_class(int var1);

   Ok_1 id_class(int var1, int var2);

   Ok_1 id_class(float var1, float var2);

   Ok_1 id_class(double var1, double var3, double var5);

   default void id_class(MH var1, wK_2 var2, float var3, float var4, float var5, float var6, int var7, int var8) {
      this.id_byte(var1, var2, this.id_break(1.0F, 1.0F, 1.0F, 1.0F), var3, var4, var5, var6, this.id_byte(var7, var7, var7, var7), var8, false);
   }

   default void id_class(MH var1, wK_2 var2, float[] var3, float var4, float var5, float var6, float var7, int[] var8, int var9, boolean var10) {
      this.id_byte(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
   }

   default void id_class(MH var1, wK_2 var2, float var3, float var4, float var5, int var6, int var7) {
      this.id_class(var1, var2, this.id_break(1.0F, 1.0F, 1.0F, 1.0F), var3, var4, var5, this.id_byte(var6, var6, var6, var6), var7, false);
   }

   default void id_break(MH var1, wK_2 var2, float[] var3, float var4, float var5, float var6, float var7, int[] var8, int var9, boolean var10) {
      this.id_byte(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
   }

   default void id_break(MH var1, wK_2 var2, float var3, float var4, float var5, float var6, int var7, int var8) {
      this.id_byte(var1, var2, this.id_break(1.0F, 1.0F, 1.0F, 1.0F), var3, var4, var5, var6, this.id_byte(var7, var7, var7, var7), var8, false);
   }

   default rje_3 id_break(float var1, float var2, float var3) {
      return new rje_3(var1, var2, var3);
   }

   Ok_1 id_break(int var1, int var2, int var3, int var4);

   default void id_break(fj_3 var1) {
   }

   default boolean id_break() {
      return false;
   }

   default float[] id_break(float var1, float var2, float var3, float var4) {
      return new float[]{var1, var2, var3, var4};
   }

   default Ok_1 id_break(int var1) {
      return this.id_byte(var1 & 65535, var1 >> 16 & 65535);
   }

   Ok_1 id_break(int var1, int var2);

   default Ok_1 id_throws() {
      return null;
   }

   static int id_protected(int var0) {
      return var0 * 8 + 6;
   }

   default Hd_1 id_protected() {
      return null;
   }
}
