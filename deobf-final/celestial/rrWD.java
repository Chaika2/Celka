package celestial;

public class rrWD {
   public static final float class_ = (float) Math.PI;
   public static final float break_ = (float) (Math.PI * 2);
   public static final float byte_ = (float) (Math.PI / 2);
   private static final float[] protected_ = new float[65536];

   public static float byte_(float var0) {
      return var0 * 180.0F / rfU_2.break_;
   }

   static {
      for (int var0 = 0; var0 < 65536; var0++) {
         protected_[var0] = (float)Math.asin((double)var0 / 32767.5 - 1.0);
      }

      for (int var1 = -1; var1 < 2; var1++) {
         protected_[(int)(((double)var1 + 1.0) * 32767.5) & 65535] = (float)Math.asin((double)var1);
      }
   }

   public static float class_(double var0) {
      return (float)((double)Math.round(var0 * 1.0E8) / 1.0E8);
   }

   public static double class_(rfH_2 var0, double var1, double var3, double var5) {
      return class_((double)var0.b_(), (double)var0.c_(), (double)var0.d_(), var1, var3, var5);
   }

   public static float class_(rfH_2 var0, float var1, float var2, float var3) {
      return class_((float)var0.b_(), (float)var0.c_(), (float)var0.d_(), var1, var2, var3);
   }

   public static double class_(double var0, double var2, double var4, double var6, double var8, double var10) {
      double var12 = var0 - var6;
      double var14 = var2 - var8;
      double var16 = var4 - var10;
      return var12 * var12 + var14 * var14 + var16 * var16;
   }

   public static float class_(float var0, float var1, float var2, float var3, float var4, float var5) {
      float var6 = var0 - var3;
      float var7 = var1 - var4;
      float var8 = var2 - var5;
      return var6 * var6 + var7 * var7 + var8 * var8;
   }

   public static rjV_2 class_() {
      rjV_2 var0 = new rjV_2();
      var0.class_();
      return var0;
   }

   public static int class_(int[] var0) {
      if (var0.length <= 0) {
         return 0;
      } else {
         int var1 = break_(var0);
         return var1 / var0.length;
      }
   }

   public static int class_(int var0) {
      int var1 = rfU_2.byte_(var0);
      return var0 == var1 ? var1 : var1 / 2;
   }

   public static boolean class_(float var0, float var1, float var2) {
      return Math.abs(var0 - var1) <= var2;
   }

   public static float class_(float var0) {
      return protected_[(int)((double)(var0 + 1.0F) * 32767.5) & 65535];
   }

   public static float break_(float var0) {
      return (float) (Math.PI / 2) - protected_[(int)((double)(var0 + 1.0F) * 32767.5) & 65535];
   }

   public static int break_(int[] var0) {
      if (var0.length <= 0) {
         return 0;
      } else {
         int var1 = 0;

         for (int var2 = 0; var2 < var0.length; var2++) {
            int var3 = var0[var2];
            var1 += var3;
         }

         return var1;
      }
   }

   public static float protected_(float var0) {
      return var0 / 180.0F * rfU_2.break_;
   }
}
