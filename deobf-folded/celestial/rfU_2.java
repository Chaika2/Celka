package celestial;

import java.util.Random;
import java.util.UUID;
import java.util.function.IntPredicate;
import org.apache.commons.lang3.math.NumberUtils;

public class rfU_2 {
   public static final float id_class = id_byte(2.0F);
   public static final float id_break = rrWD.id_class(Math.PI);
   public static final float id_byte = rrWD.id_class(Math.PI * 2);
   public static final float id_protected = rrWD.id_class(Math.PI / 2);
   private static final float id_extends = rrWD.id_class(651.8986469044033);
   public static final float id_throws = rrWD.id_class(Math.PI / 180.0);
   public static final float id_case = (float) (Math.PI / 180.0);
   public static final float id_catch = (float) (Math.PI / 180.0);
   public static final double id_private = Math.PI / 2;
   public static final double id_implements = 180.0F / (float)Math.PI;
   private static final float[] id_native = new float[4096];
   public static boolean id_finally = false;
   private static final float[] id_volatile = rqR_2.id_class(new float[65536], var0x -> {
      for (int var1x = 0; var1x < var0x.length; var1x++) {
         var0x[var1x] = (float)Math.sin((double)var1x * Math.PI * 2.0 / 65536.0);
      }
   });
   private static final Random id_final = new Random();
   private static final int[] id_package = new int[]{
      0, 1, 28, 2, 29, 14, 24, 3, 30, 22, 20, 15, 25, 17, 4, 8, 31, 27, 13, 23, 21, 19, 16, 7, 26, 12, 18, 6, 11, 5, 10, 9
   };
   private static final double id_int = Double.longBitsToDouble(4805340802404319232L);
   private static final double[] id_new = new double[257];
   private static final double[] id_continue = new double[257];

   public static int id_byte(int var0, int var1) {
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

   public static double id_byte(double var0, double var2) {
      return (var0 % var2 + var2) % var2;
   }

   public static int id_byte(double var0) {
      int var2 = (int)var0;
      return var0 < (double)var2 ? var2 - 1 : var2;
   }

   public static float id_byte(float var0, float var1, float var2) {
      var2 = id_throws(var2);
      return var0 < var1 ? id_class(var0 + var2, var0, var1) : id_class(var0 - var2, var1, var0);
   }

   public static float id_byte(float var0, float var1) {
      return id_catch(var1 - var0);
   }

   public static int id_byte(int var0) {
      int var1 = var0 - 1;
      var1 |= var1 >> 1;
      var1 |= var1 >> 2;
      var1 |= var1 >> 4;
      var1 |= var1 >> 8;
      var1 |= var1 >> 16;
      return var1 + 1;
   }

   public static double id_byte(double var0, double var2, double var4) {
      return (var0 - var2) / (var4 - var2);
   }

   public static long id_byte(int var0, int var1, int var2) {
      long var3 = (long)var0 * 3129871L ^ (long)var2 * 116129781L ^ (long)var1;
      var3 = var3 * var3 * 42317861L + var3 * 11L;
      return var3 >> 16;
   }

   public static float id_byte(float var0) {
      return (float)Math.sqrt((double)var0);
   }

   static {
      for (int var0 = 0; var0 < 257; var0++) {
         double var1 = (double)var0 / 256.0;
         double var3 = Math.asin(var1);
         id_continue[var0] = Math.cos(var3);
         id_new[var0] = var3;
      }

      for (int var5 = 0; var5 < id_native.length; var5++) {
         id_native[var5] = rrWD.id_class(Math.sin((double)var5 * Math.PI * 2.0 / 4096.0));
      }
   }

   public static UUID id_class(Random var0) {
      long var1 = var0.nextLong() & -61441L | 16384L;
      long var3 = var0.nextLong() & 4611686018427387903L | Long.MIN_VALUE;
      return new UUID(var1, var3);
   }

   public static UUID id_class() {
      return id_class(id_final);
   }

   public static float id_class(float var0) {
      return id_finally ? id_native[(int)(var0 * id_extends) & 4095] : id_volatile[(int)(var0 * 10430.378F) & 65535];
   }

   public static boolean id_class(float var0, float var1) {
      return Math.abs(var1 - var0) < 1.0E-5F;
   }

   public static double id_class(long[] var0) {
      long var1 = 0L;

      for (long var6 : var0) {
         var1 += var6;
      }

      return (double)var1 / (double)var0.length;
   }

   public static double id_class(Random var0, double var1, double var3) {
      return var1 >= var3 ? var1 : var0.nextDouble() * (var3 - var1) + var1;
   }

   public static int id_class(String var0, int var1) {
      return NumberUtils.toInt(var0, var1);
   }

   public static double id_class(
      double var0, double var2, double var4, double var6, double var8, double var10, double var12, double var14, double var16, double var18, double var20
   ) {
      return id_protected(var4, id_class(var0, var2, var6, var8, var10, var12), id_class(var0, var2, var14, var16, var18, var20));
   }

   public static double id_class(double var0, double var2, double var4, double var6, double var8, double var10) {
      return id_protected(var2, id_protected(var0, var4, var6), id_protected(var0, var8, var10));
   }

   public static long id_class(rja_3 var0) {
      return id_byte(var0.b_(), var0.c_(), var0.d_());
   }

   public static int id_class(int var0) {
      return Math.abs(var0);
   }

   public static double id_class(double var0, double var2, double var4) {
      if (var0 < var2) {
         return var2;
      } else {
         return var0 > var4 ? var4 : var0;
      }
   }

   public static float id_class(float var0, float var1, float var2) {
      if (var0 < var1) {
         return var1;
      } else {
         return var0 > var2 ? var2 : var0;
      }
   }

   public static long id_class(long var0, long var2, long var4) {
      if (var0 < var2) {
         return var2;
      } else {
         return var0 > var4 ? var4 : var0;
      }
   }

   public static int id_class(int var0, int var1, int var2) {
      if (var0 < var1) {
         return var1;
      } else {
         return var0 > var2 ? var2 : var0;
      }
   }

   public static int id_class(int var0, int var1, IntPredicate var2) {
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

   public static float id_class(double var0) {
      return (float)Math.sqrt(var0);
   }

   public static float id_class(Random var0, float var1, float var2) {
      return var1 >= var2 ? var1 : var0.nextFloat() * (var2 - var1) + var1;
   }

   public static int id_class(Random var0, int var1, int var2) {
      return var1 >= var2 ? var1 : var0.nextInt(var2 - var1 + 1) + var1;
   }

   public static double id_class(double var0, double var2) {
      if (var0 < 0.0) {
         var0 = -var0;
      }

      if (var2 < 0.0) {
         var2 = -var2;
      }

      return var0 > var2 ? var0 : var2;
   }

   public static double id_class(double var0, double var2, float var4) {
      return var2 + (var0 - var2) * (double)var4;
   }

   public static int id_class(int var0, int var1) {
      return Math.floorDiv(var0, var1);
   }

   public static int id_break(double var0) {
      return (int)(var0 + 1024.0) - 1024;
   }

   public static float id_break(float var0) {
      return id_finally ? id_native[(int)(var0 * id_extends + 1024.0F) & 4095] : id_volatile[(int)(var0 * 10430.378F + 16384.0F) & 65535];
   }

   public static int id_break(int var0, int var1, int var2) {
      int var3 = (var0 << 8) + var1;
      return (var3 << 8) + var2;
   }

   public static int id_break(int var0) {
      int var1 = var0 % 360;
      if (var1 >= 180) {
         var1 -= 360;
      }

      if (var1 < -180) {
         var1 += 360;
      }

      return var1;
   }

   public static float id_break(float var0, float var1, float var2) {
      float var3 = id_byte(var0, var1);
      float var4 = id_class(var3, -var2, var2);
      return var1 - var4;
   }

   public static boolean id_break(double var0, double var2) {
      return Math.abs(var2 - var0) < 1.0E-5F;
   }

   public static double id_break(double var0, double var2, double var4) {
      if (var4 < 0.0) {
         return var0;
      } else {
         return var4 > 1.0 ? var2 : id_protected(var4, var0, var2);
      }
   }

   public static int id_break(int var0, int var1) {
      return Math.floorMod(var0, var1);
   }

   public static float id_break(float var0, float var1) {
      return (var0 % var1 + var1) % var1;
   }

   public static float id_throws(float var0, float var1) {
      return (Math.abs(var0 % var1 - var1 * 0.5F) - var1 * 0.25F) / (var1 * 0.25F);
   }

   public static int id_throws(double var0) {
      int var2 = (int)var0;
      return var0 > (double)var2 ? var2 + 1 : var2;
   }

   public static int id_throws(int var0) {
      var0 = id_protected(var0) ? var0 : id_byte(var0);
      return id_package[(int)((long)var0 * 125613361L >> 27) & 31];
   }

   public static int id_throws(float var0, float var1, float var2) {
      return id_break(id_protected(var0 * 255.0F), id_protected(var1 * 255.0F), id_protected(var2 * 255.0F));
   }

   public static float id_throws(float var0) {
      return Math.abs(var0);
   }

   public static float id_finally(float var0) {
      int var1 = Float.floatToIntBits(var0);
      var1 = 1419967116 - var1 / 3;
      float var2 = Float.intBitsToFloat(var1);
      var2 = 0.6666667F * var2 + 1.0F / (3.0F * var2 * var2 * var0);
      return 0.6666667F * var2 + 1.0F / (3.0F * var2 * var2 * var0);
   }

   public static int id_finally(double var0) {
      if (var0 == 0.0) {
         return 0;
      } else {
         return var0 > 0.0 ? 1 : -1;
      }
   }

   public static int id_catch(int var0) {
      var0 ^= var0 >>> 16;
      var0 *= -2048144789;
      var0 ^= var0 >>> 13;
      var0 *= -1028477387;
      return var0 ^ var0 >>> 16;
   }

   public static float id_catch(float var0, float var1, float var2) {
      return var1 + var0 * (var2 - var1);
   }

   public static double id_catch(double var0) {
      return var0 - (double)id_protected(var0);
   }

   public static float id_catch(float var0) {
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
   public static float id_extends(double var0) {
      while (var0 >= 180.0) {
         var0 -= 360.0;
      }

      while (var0 < -180.0) {
         var0 += 360.0;
      }

      return (float)var0;
   }

   public static float id_extends(float var0) {
      return var0 * var0;
   }

   public static int id_case(float var0, float var1, float var2) {
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

      int var11 = id_class((int)(var8 * 255.0F), 0, 255);
      int var12 = id_class((int)(var9 * 255.0F), 0, 255);
      int var13 = id_class((int)(var10 * 255.0F), 0, 255);
      return var11 << 16 | var12 << 8 | var13;
   }

   public static int id_case(float var0) {
      int var1 = (int)var0;
      return var0 > (float)var1 ? var1 + 1 : var1;
   }

   public static int id_case(int var0) {
      return id_throws(var0) - (id_protected(var0) ? 0 : 1);
   }

   public static double id_case(double var0) {
      double var2 = var0 % 360.0;
      if (var2 >= 180.0) {
         var2 -= 360.0;
      }

      if (var2 < -180.0) {
         var2 += 360.0;
      }

      return var2;
   }

   public static double id_implements(double var0) {
      return var0 * var0 * var0 * (var0 * (var0 * 6.0 - 15.0) + 10.0);
   }

   @Deprecated
   public static float id_implements(float var0, float var1, float var2) {
      float var3 = var1 - var0;

      while (var3 < -180.0F) {
         var3 += 360.0F;
      }

      while (var3 >= 180.0F) {
         var3 -= 360.0F;
      }

      return var0 + var2 * var3;
   }

   public static float id_implements(float var0) {
      float var1 = 0.5F * var0;
      int var2 = Float.floatToIntBits(var0);
      var2 = 1597463007 - (var2 >> 1);
      var0 = Float.intBitsToFloat(var2);
      return var0 * (1.5F - var1 * var0 * var0);
   }

   public static int id_protected(float var0) {
      int var1 = (int)var0;
      return var0 < (float)var1 ? var1 - 1 : var1;
   }

   public static long id_protected(double var0) {
      long var2 = (long)var0;
      return var0 < (double)var2 ? var2 - 1L : var2;
   }

   public static float id_protected(float var0, float var1) {
      return id_throws(id_byte(var0, var1));
   }

   public static boolean id_protected(int var0) {
      return var0 != 0 && (var0 & var0 - 1) == 0;
   }

   public static double id_protected(double var0, double var2) {
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

         double var28 = id_private(var4);
         var2 *= var28;
         var0 *= var28;
         double var11 = id_int + var0;
         int var13 = (int)Double.doubleToRawLongBits(var11);
         double var14 = id_new[var13];
         double var16 = id_continue[var13];
         double var18 = var11 - id_int;
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

   public static float id_protected(float var0, float var1, float var2) {
      float var3 = id_byte(var0, var1);
      return id_byte(var0, var0 + var3, var2);
   }

   public static double id_protected(double var0, double var2, double var4) {
      return var2 + var0 * (var4 - var2);
   }

   public static double id_private(double var0) {
      double var2 = 0.5 * var0;
      long var4 = Double.doubleToRawLongBits(var0);
      var4 = 6910469410427058090L - (var4 >> 1);
      var0 = Double.longBitsToDouble(var4);
      return var0 * (1.5 - var2 * var0 * var0);
   }

   public static float id_private(float var0) {
      return var0 - (float)id_protected(var0);
   }

   public static float id_private(float var0, float var1, float var2) {
      return var1 + var0 * id_catch(var2 - var1);
   }
}
