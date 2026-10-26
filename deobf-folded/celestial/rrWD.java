package celestial;

public class rrWD {
   public static final float id_class = (float) Math.PI;
   public static final float id_break = (float) (Math.PI * 2);
   public static final float id_byte = (float) (Math.PI / 2);
   private static final float[] id_protected = new float[65536];

   public static float id_byte(float var0) {
      return var0 * 180.0F / rfU_2.id_break;
   }

   static {
      for (int var0 = 0; var0 < 65536; var0++) {
         id_protected[var0] = (float)Math.asin((double)var0 / 32767.5 - 1.0);
      }

      for (int var1 = -1; var1 < 2; var1++) {
         id_protected[(int)(((double)var1 + 1.0) * 32767.5) & 65535] = (float)Math.asin((double)var1);
      }
   }

   public static float id_class(double var0) {
      return (float)((double)Math.round(var0 * 1.0E8) / 1.0E8);
   }

   public static double id_class(rfH_2 var0, double var1, double var3, double var5) {
      return id_class((double)var0.b_(), (double)var0.c_(), (double)var0.d_(), var1, var3, var5);
   }

   public static float id_class(rfH_2 var0, float var1, float var2, float var3) {
      return id_class((float)var0.b_(), (float)var0.c_(), (float)var0.d_(), var1, var2, var3);
   }

   public static double id_class(double var0, double var2, double var4, double var6, double var8, double var10) {
      double var12 = var0 - var6;
      double var14 = var2 - var8;
      double var16 = var4 - var10;
      return var12 * var12 + var14 * var14 + var16 * var16;
   }

   public static float id_class(float var0, float var1, float var2, float var3, float var4, float var5) {
      float var6 = var0 - var3;
      float var7 = var1 - var4;
      float var8 = var2 - var5;
      return var6 * var6 + var7 * var7 + var8 * var8;
   }

   public static rjV_2 id_class() {
      rjV_2 var0 = new rjV_2();
      var0.id_class();
      return var0;
   }

   public static int id_class(int[] var0) {
      if (var0.length <= 0) {
         return 0;
      } else {
         int var1 = id_break(var0);
         return var1 / var0.length;
      }
   }

   public static int id_class(int var0) {
      int var1 = rfU_2.id_byte(var0);
      return var0 == var1 ? var1 : var1 / 2;
   }

   public static boolean id_class(float var0, float var1, float var2) {
      return Math.abs(var0 - var1) <= var2;
   }

   public static float id_class(float var0) {
      return id_protected[(int)((double)(var0 + 1.0F) * 32767.5) & 65535];
   }

   public static float id_break(float var0) {
      return (float) (Math.PI / 2) - id_protected[(int)((double)(var0 + 1.0F) * 32767.5) & 65535];
   }

   public static int id_break(int[] var0) {
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

   public static float id_protected(float var0) {
      return var0 / 180.0F * rfU_2.id_break;
   }
}
