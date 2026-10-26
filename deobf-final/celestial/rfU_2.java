package celestial;

import java.util.Random;
import java.util.UUID;
import java.util.function.IntPredicate;
import org.apache.commons.lang3.math.NumberUtils;

public class rfU_2 {
   public static final float class_ = byte_(2.0F);
   public static final float break_ = rrWD.class_(Math.PI);
   public static final float byte_ = rrWD.class_(Math.PI * 2);
   public static final float protected_ = rrWD.class_(Math.PI / 2);
   private static final float extends_ = rrWD.class_(651.8986469044033);
   public static final float throws_ = rrWD.class_(Math.PI / 180.0);
   public static final float case_ = (float) (Math.PI / 180.0);
   public static final float catch_ = (float) (Math.PI / 180.0);
   public static final double private_ = Math.PI / 2;
   public static final double implements_ = 180.0F / (float)Math.PI;
   private static final float[] native_ = new float[4096];
   public static boolean finally_ = false;
   private static final float[] volatile_ = rqR_2.class_(new float[65536], var0x -> {
      for (int var1x = 0; var1x < var0x.length; var1x++) {
         var0x[var1x] = (float)Math.sin((double)var1x * Math.PI * 2.0 / 65536.0);
      }
   });
   private static final Random final_ = new Random();
   private static final int[] package_ = new int[]{
      0, 1, 28, 2, 29, 14, 24, 3, 30, 22, 20, 15, 25, 17, 4, 8, 31, 27, 13, 23, 21, 19, 16, 7, 26, 12, 18, 6, 11, 5, 10, 9
   };
   private static final double int_ = Double.longBitsToDouble(4805340802404319232L);
   private static final double[] new_ = new double[257];
   private static final double[] continue_ = new double[257];

   public static int byte_(int var0, int var1) {
      if (var1 == 0) {
         return 0;
      } else if (var0 == 0) {
         return var1;
      } else {
         if (var0 < 0) {
            var1 *= -1;
         }

         int var2 = var0 % var1;
         return var2 == 0 ? var0 : var0 + var1 - var2;
      }
   }

   public static double byte_(double var0, double var2) {
      return (var0 % var2 + var2) % var2;
   }

   public static int byte_(double var0) {
      int var2 = (int)var0;
      return var0 < (double)var2 ? var2 - 1 : var2;
   }

   public static float byte_(float var0, float var1, float var2) {
      var2 = throws_(var2);
      return var0 < var1 ? class_(var0 + var2, var0, var1) : class_(var0 - var2, var1, var0);
   }

   public static float byte_(float var0, float var1) {
      return catch_(var1 - var0);
   }

   public static int byte_(int var0) {
      int var1 = var0 - 1;
      var1 |= var1 >> 1;
      var1 |= var1 >> 2;
      var1 |= var1 >> 4;
      var1 |= var1 >> 8;
      var1 |= var1 >> 16;
      return var1 + 1;
   }

   public static double byte_(double var0, double var2, double var4) {
      return (var0 - var2) / (var4 - var2);
   }

   public static long byte_(int var0, int var1, int var2) {
      long var3 = (long)var0 * 3129871L ^ (long)var2 * 116129781L ^ (long)var1;
      var3 = var3 * var3 * 42317861L + var3 * 11L;
      return var3 >> 16;
   }

   public static float byte_(float var0) {
      return (float)Math.sqrt((double)var0);
   }

   static {
      for (int var0 = 0; var0 < 257; var0++) {
         double var1 = (double)var0 / 256.0;
         double var3 = Math.asin(var1);
         continue_[var0] = Math.cos(var3);
         new_[var0] = var3;
      }

      for (int var5 = 0; var5 < native_.length; var5++) {
         native_[var5] = rrWD.class_(Math.sin((double)var5 * Math.PI * 2.0 / 4096.0));
      }
   }

   public static UUID class_(Random var0) {
      long var1 = var0.nextLong() & -61441L | 16384L;
      long var3 = var0.nextLong() & 4611686018427387903L | Long.MIN_VALUE;
      return new UUID(var1, var3);
   }

   public static UUID class_() {
      return class_(final_);
   }

   public static float class_(float var0) {
      return finally_ ? native_[(int)(var0 * extends_) & 4095] : volatile_[(int)(var0 * 10430.378F) & 65535];
   }

   public static boolean class_(float var0, float var1) {
      return Math.abs(var1 - var0) < 1.0E-5F;
   }

   public static double class_(long[] var0) {
      long var1 = 0L;

      for (long var6 : var0) {
         var1 += var6;
      }

      return (double)var1 / (double)var0.length;
   }

   public static double class_(Random var0, double var1, double var3) {
      return var1 >= var3 ? var1 : var0.nextDouble() * (var3 - var1) + var1;
   }

   public static int class_(String var0, int var1) {
      return NumberUtils.toInt(var0, var1);
   }

   public static double class_(
      double var0, double var2, double var4, double var6, double var8, double var10, double var12, double var14, double var16, double var18, double var20
   ) {
      return protected_(var4, class_(var0, var2, var6, var8, var10, var12), class_(var0, var2, var14, var16, var18, var20));
   }

   public static double class_(double var0, double var2, double var4, double var6, double var8, double var10) {
      return protected_(var2, protected_(var0, var4, var6), protected_(var0, var8, var10));
   }

   public static long class_(rja_3 var0) {
      return byte_(var0.b_(), var0.c_(), var0.d_());
   }

   public static int class_(int var0) {
      return Math.abs(var0);
   }

   public static double class_(double var0, double var2, double var4) {
      if (var0 < var2) {
         return var2;
      } else {
         return var0 > var4 ? var4 : var0;
      }
   }

   public static float class_(float var0, float var1, float var2) {
      if (var0 < var1) {
         return var1;
      } else {
         return var0 > var2 ? var2 : var0;
      }
   }

   public static long class_(long var0, long var2, long var4) {
      if (var0 < var2) {
         return var2;
      } else {
         return var0 > var4 ? var4 : var0;
      }
   }

   public static int class_(int var0, int var1, int var2) {
      if (var0 < var1) {
         return var1;
      } else {
         return var0 > var2 ? var2 : var0;
      }
   }

   public static int class_(int var0, int var1, IntPredicate var2) {
      int var3 = var1 - var0;

      while (var3 > 0) {
         int var4 = var3 / 2;
         int var5 = var0 + var4;
         if (var2.test(var5)) {
            var3 = var4;
         } else {
            var0 = var5 + 1;
            var3 -= var4 + 1;
         }
      }

      return var0;
   }

   public static float class_(double var0) {
      return (float)Math.sqrt(var0);
   }

   public static float class_(Random var0, float var1, float var2) {
      return var1 >= var2 ? var1 : var0.nextFloat() * (var2 - var1) + var1;
   }

   public static int class_(Random var0, int var1, int var2) {
      return var1 >= var2 ? var1 : var0.nextInt(var2 - var1 + 1) + var1;
   }

   public static double class_(double var0, double var2) {
      if (var0 < 0.0) {
         var0 = -var0;
      }

      if (var2 < 0.0) {
         var2 = -var2;
      }

      return var0 > var2 ? var0 : var2;
   }

   public static double class_(double var0, double var2, float var4) {
      return var2 + (var0 - var2) * (double)var4;
   }

   public static int class_(int var0, int var1) {
      return Math.floorDiv(var0, var1);
   }

   public static int break_(double var0) {
      return (int)(var0 + 1024.0) - 1024;
   }

   public static float break_(float var0) {
      return finally_ ? native_[(int)(var0 * extends_ + 1024.0F) & 4095] : volatile_[(int)(var0 * 10430.378F + 16384.0F) & 65535];
   }

   public static int break_(int var0, int var1, int var2) {
      int var3 = (var0 << 8) + var1;
      return (var3 << 8) + var2;
   }

   public static int break_(int var0) {
      int var1 = var0 % 360;
      if (var1 >= 180) {
         var1 -= 360;
      }

      if (var1 < -180) {
         var1 += 360;
      }

      return var1;
   }

   public static float break_(float var0, float var1, float var2) {
      float var3 = byte_(var0, var1);
      float var4 = class_(var3, -var2, var2);
      return var1 - var4;
   }

   public static boolean break_(double var0, double var2) {
      return Math.abs(var2 - var0) < 1.0E-5F;
   }

   public static double break_(double var0, double var2, double var4) {
      if (var4 < 0.0) {
         return var0;
      } else {
         return var4 > 1.0 ? var2 : protected_(var4, var0, var2);
      }
   }

   public static int break_(int var0, int var1) {
      return Math.floorMod(var0, var1);
   }

   public static float break_(float var0, float var1) {
      return (var0 % var1 + var1) % var1;
   }

   public static float throws_(float var0, float var1) {
      return (Math.abs(var0 % var1 - var1 * 0.5F) - var1 * 0.25F) / (var1 * 0.25F);
   }

   public static int throws_(double var0) {
      int var2 = (int)var0;
      return var0 > (double)var2 ? var2 + 1 : var2;
   }

   public static int throws_(int var0) {
      var0 = protected_(var0) ? var0 : byte_(var0);
      return package_[(int)((long)var0 * 125613361L >> 27) & 31];
   }

   public static int throws_(float var0, float var1, float var2) {
      return break_(protected_(var0 * 255.0F), protected_(var1 * 255.0F), protected_(var2 * 255.0F));
   }

   public static float throws_(float var0) {
      return Math.abs(var0);
   }

   public static float finally_(float var0) {
      int var1 = Float.floatToIntBits(var0);
      var1 = 1419967116 - var1 / 3;
      float var2 = Float.intBitsToFloat(var1);
      var2 = 0.6666667F * var2 + 1.0F / (3.0F * var2 * var2 * var0);
      return 0.6666667F * var2 + 1.0F / (3.0F * var2 * var2 * var0);
   }

   public static int finally_(double var0) {
      if (var0 == 0.0) {
         return 0;
      } else {
         return var0 > 0.0 ? 1 : -1;
      }
   }

   public static int catch_(int var0) {
      var0 ^= var0 >>> 16;
      var0 *= -2048144789;
      var0 ^= var0 >>> 13;
      var0 *= -1028477387;
      return var0 ^ var0 >>> 16;
   }

   public static float catch_(float var0, float var1, float var2) {
      return var1 + var0 * (var2 - var1);
   }

   public static double catch_(double var0) {
      return var0 - (double)protected_(var0);
   }

   public static float catch_(float var0) {
      float var1 = var0 % 360.0F;
      if (var1 >= 180.0F) {
         var1 -= 360.0F;
      }

      if (var1 < -180.0F) {
         var1 += 360.0F;
      }

      return var1;
   }

   @Deprecated
   public static float extends_(double var0) {
      while (var0 >= 180.0) {
         var0 -= 360.0;
      }

      while (var0 < -180.0) {
         var0 += 360.0;
      }

      return (float)var0;
   }

   public static float extends_(float var0) {
      return var0 * var0;
   }

   public static int case_(float var0, float var1, float var2) {
      int var3 = (int)(var0 * 6.0F) % 6;
      float var4 = var0 * 6.0F - (float)var3;
      float var5 = var2 * (1.0F - var1);
      float var6 = var2 * (1.0F - var4 * var1);
      float var7 = var2 * (1.0F - (1.0F - var4) * var1);
      float var8;
      float var9;
      float var10;
      switch (var3) {
         case 0:
            var8 = var2;
            var9 = var7;
            var10 = var5;
            break;
         case 1:
            var8 = var6;
            var9 = var2;
            var10 = var5;
            break;
         case 2:
            var8 = var5;
            var9 = var2;
            var10 = var7;
            break;
         case 3:
            var8 = var5;
            var9 = var6;
            var10 = var2;
            break;
         case 4:
            var8 = var7;
            var9 = var5;
            var10 = var2;
            break;
         case 5:
            var8 = var2;
            var9 = var5;
            var10 = var6;
            break;
         default:
            throw new RuntimeException("Something went wrong when converting from HSV to RGB. Input was " + var0 + ", " + var1 + ", " + var2);
      }

      int var11 = class_((int)(var8 * 255.0F), 0, 255);
      int var12 = class_((int)(var9 * 255.0F), 0, 255);
      int var13 = class_((int)(var10 * 255.0F), 0, 255);
      return var11 << 16 | var12 << 8 | var13;
   }

   public static int case_(float var0) {
      int var1 = (int)var0;
      return var0 > (float)var1 ? var1 + 1 : var1;
   }

   public static int case_(int var0) {
      return throws_(var0) - (protected_(var0) ? 0 : 1);
   }

   public static double case_(double var0) {
      double var2 = var0 % 360.0;
      if (var2 >= 180.0) {
         var2 -= 360.0;
      }

      if (var2 < -180.0) {
         var2 += 360.0;
      }

      return var2;
   }

   public static double implements_(double var0) {
      return var0 * var0 * var0 * (var0 * (var0 * 6.0 - 15.0) + 10.0);
   }

   @Deprecated
   public static float implements_(float var0, float var1, float var2) {
      float var3 = var1 - var0;

      while (var3 < -180.0F) {
         var3 += 360.0F;
      }

      while (var3 >= 180.0F) {
         var3 -= 360.0F;
      }

      return var0 + var2 * var3;
   }

   public static float implements_(float var0) {
      float var1 = 0.5F * var0;
      int var2 = Float.floatToIntBits(var0);
      var2 = 1597463007 - (var2 >> 1);
      var0 = Float.intBitsToFloat(var2);
      return var0 * (1.5F - var1 * var0 * var0);
   }

   public static int protected_(float var0) {
      int var1 = (int)var0;
      return var0 < (float)var1 ? var1 - 1 : var1;
   }

   public static long protected_(double var0) {
      long var2 = (long)var0;
      return var0 < (double)var2 ? var2 - 1L : var2;
   }

   public static float protected_(float var0, float var1) {
      return throws_(byte_(var0, var1));
   }

   public static boolean protected_(int var0) {
      return var0 != 0 && (var0 & var0 - 1) == 0;
   }

   public static double protected_(double var0, double var2) {
      double var4 = var2 * var2 + var0 * var0;
      if (Double.isNaN(var4)) {
         return Double.NaN;
      } else {
         boolean var6 = var0 < 0.0;
         if (var6) {
            var0 = -var0;
         }

         boolean var7 = var2 < 0.0;
         if (var7) {
            var2 = -var2;
         }

         boolean var8 = var0 > var2;
         if (var8) {
            double var9 = var2;
            var2 = var0;
            var0 = var9;
         }

         double var28 = private_(var4);
         var2 *= var28;
         var0 *= var28;
         double var11 = int_ + var0;
         int var13 = (int)Double.doubleToRawLongBits(var11);
         double var14 = new_[var13];
         double var16 = continue_[var13];
         double var18 = var11 - int_;
         double var20 = var0 * var16 - var2 * var18;
         double var22 = (6.0 + var20 * var20) * var20 * 0.16666666666666666;
         double var24 = var14 + var22;
         if (var8) {
            var24 = (Math.PI / 2) - var24;
         }

         if (var7) {
            var24 = Math.PI - var24;
         }

         if (var6) {
            var24 = -var24;
         }

         return var24;
      }
   }

   public static float protected_(float var0, float var1, float var2) {
      float var3 = byte_(var0, var1);
      return byte_(var0, var0 + var3, var2);
   }

   public static double protected_(double var0, double var2, double var4) {
      return var2 + var0 * (var4 - var2);
   }

   public static double private_(double var0) {
      double var2 = 0.5 * var0;
      long var4 = Double.doubleToRawLongBits(var0);
      var4 = 6910469410427058090L - (var4 >> 1);
      var0 = Double.longBitsToDouble(var4);
      return var0 * (1.5 - var2 * var0 * var0);
   }

   public static float private_(float var0) {
      return var0 - (float)protected_(var0);
   }

   public static float private_(float var0, float var1, float var2) {
      return var1 + var0 * catch_(var2 - var1);
   }
}
