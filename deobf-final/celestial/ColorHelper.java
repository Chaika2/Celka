package celestial;

import java.awt.Color;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class ColorHelper implements MinecraftAccessor {
   private static byte[] class_;
   private static float[] break_;
   private static double[] byte_;
   private static short[] protected_;
   private static int[] throws_;
   private static boolean[] case_;

   private static void byte_() {
      case_ = new boolean[]{
         false, false, true, false, false, false, false, false, false, false, false, false, false, false, true, true, false, true, false, false, false
      };
   }

   public static int byte_(int var0) {
      return var0 >> 16 & 0xFF;
   }

   private static int byte_(int var0, int var1) {
      return (int)(rqR_2.break_() / (long)var0 + (long)var1) % 360;
   }

   public static int byte_(int var0, int var1, float var2) {
      var2 = rfU_2.class_(var2, 0.0F, 1.0F);
      int var3 = byte_(var0);
      int var4 = protected_(var0);
      int var5 = break_(var0);
      int var6 = byte_(var1);
      int var7 = protected_(var1);
      int var8 = break_(var1);
      float[] var9 = class_(var3, var4, var5, null);
      float[] var10 = class_(var6, var7, var8, null);
      int var11 = class_(rrfQ_2.break_(var9[0], var10[0], var2), rrfQ_2.break_(var9[1], var10[1], var2), rrfQ_2.break_(var9[2], var10[2], var2));
      return class_(byte_(var11), protected_(var11), break_(var11), (int)rrfQ_2.break_((float)throws_(var0), (float)throws_(var1), var2));
   }

   static {
      ntfClinit();
   }

   public static int class_(int var0, int var1, int var2, int var3, float var4) {
      return class_(
         (int)Math.max((float)var0 * var4, 0.0F), (int)Math.max((float)var1 * var4, 0.0F), (int)Math.max((float)var2 * var4, 0.0F), rfU_2.class_(var3, 0, 255)
      );
   }

   public static int class_(int var0, int var1) {
      return rfU_2.class_(var1, 0, 255) << 24 | var0 << 16 | var0 << 8 | var0;
   }

   public static int class_(int var0, float var1) {
      return class_(
         (int)Math.max((float)byte_(var0) * var1, 0.0F),
         (int)Math.max((float)protected_(var0) * var1, 0.0F),
         (int)Math.max((float)break_(var0) * var1, 0.0F),
         rfU_2.class_(throws_(var0), 0, 255)
      );
   }

   public static int class_(float var0, float var1, float var2) {
      int var3 = 0;
      int var4 = 0;
      int var5 = 0;
      if (var1 == 0.0F) {
         var3 = var4 = var5 = Math.round(var2 * 255.0F);
      } else {
         float var6 = (var0 - (float)Math.floor((double)var0)) * 6.0F;
         int var7 = (int)Math.floor((double)var6);
         float var8 = var6 - (float)var7;
         float var9 = var2 * (1.0F - var1);
         float var10 = var2 * (1.0F - var1 * var8);
         float var11 = var2 * (1.0F - var1 * (1.0F - var8));
         switch (var7) {
            case 0:
               var3 = Math.round(var2 * 255.0F);
               var4 = Math.round(var11 * 255.0F);
               var5 = Math.round(var9 * 255.0F);
               break;
            case 1:
               var3 = Math.round(var10 * 255.0F);
               var4 = Math.round(var2 * 255.0F);
               var5 = Math.round(var9 * 255.0F);
               break;
            case 2:
               var3 = Math.round(var9 * 255.0F);
               var4 = Math.round(var2 * 255.0F);
               var5 = Math.round(var11 * 255.0F);
               break;
            case 3:
               var3 = Math.round(var9 * 255.0F);
               var4 = Math.round(var10 * 255.0F);
               var5 = Math.round(var2 * 255.0F);
               break;
            case 4:
               var3 = Math.round(var11 * 255.0F);
               var4 = Math.round(var9 * 255.0F);
               var5 = Math.round(var2 * 255.0F);
               break;
            case 5:
               var3 = Math.round(var2 * 255.0F);
               var4 = Math.round(var9 * 255.0F);
               var5 = Math.round(var10 * 255.0F);
         }
      }

      return throws_[1] | var3 << 16 | var4 << 8 | var5;
   }

   public static int class_(float var0) {
      return case_((int)var0);
   }

   public static int class_(int var0, int var1, int var2, int var3, boolean var4) {
      int var5 = byte_(var0, var1);
      var5 = (var5 >= 180 ? 360 - var5 : var5) * class_[15];
      float var6 = (float)var5 / 360.0F;
      return var4 ? byte_(var2, var3, var6) : break_(var2, var3, var6);
   }

   public static int class_(an_3 var0) {
      return break_(Color.RED.getRGB(), Color.GREEN.getRGB(), ((cb_3)import_.class_[57]).implements_(var0) / 30.0F);
   }

   public static int class_(int var0, int var1, float var2) {
      float[] var3 = new float[3];
      float[] var4 = new float[3];
      float[] var5 = new float[3];
      class_(byte_(var0), protected_(var0), break_(var0), var3);
      class_(byte_(var1), protected_(var1), break_(var1), var4);

      for (int var6 = 0; var6 < 3; var6++) {
         var5[var6] = var3[var6] + var2 * (var4[var6] - var3[var6]);
      }

      return class_(var5[0], var5[1], var5[2]);
   }

   public static int class_(int var0, int var1, int var2, int var3) {
      return rfU_2.class_(var3, 0, 255) << 24 | var0 << 16 | var1 << 8 | var2;
   }

   public static int class_(int var0, int var1, int var2) {
      return class_(var0, var1, var2, 255);
   }

   public static float[] class_(int var0) {
      return Color.RGBtoHSB(byte_(var0), protected_(var0), break_(var0), null);
   }

   public static int class_(int var0, int var1, float var2, float var3, float var4) {
      float var5 = (float)byte_(var0, var1);
      var5 = (float)((double)var5 % 360.0);
      float var7;
      return break_(
         Color.HSBtoRGB((double)((var7 = var5 % 360.0F) / 360.0F) < 0.5 ? -(var7 / 360.0F) : var7 / 360.0F, var2, var3),
         Math.max(0, Math.min(255, (int)(var4 * 255.0F)))
      );
   }

   private static void class_() {
      throws_ = new int[]{16777215, -16777216};
   }

   public static int class_(float var0, int var1) {
      return break_(case_((int)var0), var1);
   }

   public static int class_(iB_2 var0) {
      return break_(Color.RED.getRGB(), Color.GREEN.getRGB(), 1.0F - rrjZ_2.class_(var0));
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4937035723616035461L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{18, 37, -11, -68, -24, 87, -50, 126}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static float[] class_(int var0, int var1, int var2, float[] var3) {
      if (var3 == null) {
         var3 = new float[3];
      }

      int var4 = Math.max(var0, Math.max(var1, var2));
      int var5 = Math.min(var0, Math.min(var1, var2));
      float var6 = (float)var4 / 255.0F;
      float var7 = var4 != 0 ? (float)(var4 - var5) / (float)var4 : break_[23];
      float var8 = 0.0F;
      if (var7 != 0.0F) {
         float var9 = (float)(var4 - var0) / (float)(var4 - var5);
         float var10 = (float)(var4 - var1) / (float)(var4 - var5);
         float var11 = (float)(var4 - var2) / (float)(var4 - var5);
         if (var0 == var4) {
            var8 = var11 - var10;
         } else if (var1 == var4) {
            var8 = 2.0F + var9 - var11;
         } else {
            var8 = break_[27] + var10 - var9;
         }

         var8 /= 6.0F;
         if (var8 < 0.0F) {
            var8++;
         }
      }

      var3[0] = var8;
      var3[1] = var7;
      var3[2] = var6;
      return var3;
   }

   public static int break_(int var0, float var1) {
      return class_(
         (int)Math.min((float)byte_(var0) / var1, 255.0F),
         (int)Math.min((float)protected_(var0) / var1, 255.0F),
         (int)Math.min((float)break_(var0) / var1, 255.0F),
         rfU_2.class_(throws_(var0), 0, 255)
      );
   }

   private static void break_() {
      break_ = new float[]{
         0.0F,
         0.0F,
         0.0F,
         0.0F,
         0.0F,
         0.0F,
         255.0F,
         255.0F,
         255.0F,
         255.0F,
         255.0F,
         255.0F,
         360.0F,
         255.0F,
         360.0F,
         360.0F,
         360.0F,
         360.0F,
         255.0F,
         360.0F,
         0.0F,
         1.0F,
         255.0F,
         0.0F,
         0.0F,
         0.0F,
         2.0F,
         4.0F,
         6.0F,
         0.0F,
         1.0F,
         0.0F,
         255.0F,
         6.0F,
         1.0F,
         1.0F,
         1.0F,
         1.0F,
         255.0F,
         255.0F,
         255.0F,
         255.0F,
         255.0F,
         255.0F,
         255.0F,
         255.0F,
         255.0F,
         255.0F,
         255.0F,
         255.0F,
         255.0F,
         255.0F,
         255.0F,
         255.0F,
         255.0F,
         255.0F,
         0.0F,
         1.0F,
         30.0F,
         1.0F
      };
   }

   public static int break_(int var0, int var1, float var2) {
      var2 = rfU_2.class_(var2, 0.0F, 1.0F);
      return class_(
         Math.round(rrfQ_2.break_((float)byte_(var0), (float)byte_(var1), var2)),
         Math.round(rrfQ_2.break_((float)protected_(var0), (float)protected_(var1), var2)),
         Math.round(rrfQ_2.break_((float)break_(var0), (float)break_(var1), var2)),
         Math.round(rrfQ_2.break_((float)throws_(var0), (float)throws_(var1), var2))
      );
   }

   public static int break_(int var0, int var1) {
      return rfU_2.class_(var1, 0, 255) << 24 | var0 & 16777215;
   }

   public static int break_(int var0, int var1, float var2, float var3, float var4) {
      float var5 = (float)byte_(var0, var1) / 360.0F;
      return break_(class_(var5, var2, var3), Math.max(0, Math.min(255, (int)(var4 * 255.0F))));
   }

   public static int break_(int var0, int var1, int var2, int var3, float var4) {
      return class_(
         (int)Math.min((float)var0 / var4, 255.0F),
         (int)Math.min((float)var1 / var4, 255.0F),
         (int)Math.min((float)var2 / var4, 255.0F),
         rfU_2.class_(var3, 0, 255)
      );
   }

   public static int break_(int var0) {
      return var0 & 0xFF;
   }

   private static void throws_() {
      byte_ = new double[]{360.0, 0.5};
   }

   public static int throws_(int var0) {
      return var0 >> 24 & 0xFF;
   }

   private static int catch_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 400201265;
   }

   private static void case_() {
      protected_ = new short[]{7, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 360, 180, 360, 57};
   }

   private static int case_(int var0) {
      return ((ThemeType)ClickGuiTheme.class_[7]).class_().apply(var0);
   }

   public static int protected_(int var0) {
      return var0 >> 8 & 0xFF;
   }

   private static void protected_() {
      class_ = new byte[]{3, 3, 3, 3, 2, 24, 16, 8, 24, 16, 8, 16, 8, 24, 24, 2, 2, 2, 3, 2, 16, 8};
   }
}
