package celestial;

import java.awt.Color;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class ColorHelper implements MinecraftAccessor {
   private static byte[] id_class;
   private static float[] id_break;
   private static double[] id_byte;
   private static short[] id_protected;
   private static int[] id_throws;
   private static boolean[] id_case;

   private static void id_byte() {
      id_case = new boolean[]{
         false, false, true, false, false, false, false, false, false, false, false, false, false, false, true, true, false, true, false, false, false
      };
   }

   public static int id_byte(int var0) {
      return var0 >> 16 & 0xFF;
   }

   private static int id_byte(int var0, int var1) {
      return (int)(rqR_2.id_break() / (long)var0 + (long)var1) % 360;
   }

   public static int id_byte(int var0, int var1, float var2) {
      var2 = rfU_2.id_class(var2, id_break[20], 1.0F);
      int var3 = id_byte(var0);
      int var4 = id_protected(var0);
      int var5 = id_break(var0);
      int var6 = id_byte(var1);
      int var7 = id_protected(var1);
      int var8 = id_break(var1);
      float[] var9 = id_class(var3, var4, var5, null);
      float[] var10 = id_class(var6, var7, var8, null);
      int var11 = id_class(
         rrfQ_2.id_break(var9[id_case[12]], var10[id_case[13]], var2), rrfQ_2.id_break(var9[1], var10[1], var2), rrfQ_2.id_break(var9[2], var10[2], var2)
      );
      return id_class(id_byte(var11), id_protected(var11), id_break(var11), (int)rrfQ_2.id_break((float)id_throws(var0), (float)id_throws(var1), var2));
   }

   static {
      ntfClinit();
   }

   public static int id_class(int var0, int var1, int var2, int var3, float var4) {
      return id_class(
         (int)Math.max((float)var0 * var4, id_break[0]),
         (int)Math.max((float)var1 * var4, id_break[1]),
         (int)Math.max((float)var2 * var4, id_break[2]),
         rfU_2.id_class(var3, id_case[3], 255)
      );
   }

   public static int id_class(int var0, int var1) {
      return rfU_2.id_class(var1, id_case[8], 255) << 24 | var0 << 16 | var0 << 8 | var0;
   }

   public static int id_class(int var0, float var1) {
      return id_class(
         (int)Math.max((float)id_byte(var0) * var1, id_break[3]),
         (int)Math.max((float)id_protected(var0) * var1, id_break[4]),
         (int)Math.max((float)id_break(var0) * var1, id_break[5]),
         rfU_2.id_class(id_throws(var0), id_case[4], 255)
      );
   }

   public static int id_class(float var0, float var1, float var2) {
      int var3 = id_case[18];
      int var4 = id_case[19];
      int var5 = id_case[20];
      if (var1 == id_break[31]) {
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

      return 0xFF000000 | var3 << 16 | var4 << 8 | var5;
   }

   public static int id_class(float var0) {
      return id_case((int)var0);
   }

   public static int id_class(int var0, int var1, int var2, int var3, boolean var4) {
      int var5 = id_byte(var0, var1);
      var5 = (var5 >= 180 ? 360 - var5 : var5) * 2;
      float var6 = (float)var5 / 360.0F;
      return var4 ? id_byte(var2, var3, var6) : id_break(var2, var3, var6);
   }

   public static int id_class(an_3 var0) {
      return id_break(Color.RED.getRGB(), Color.GREEN.getRGB(), ((cb_3)id_import.id_class[57]).id_implements(var0) / 30.0F);
   }

   public static int id_class(int var0, int var1, float var2) {
      float[] var3 = new float[3];
      float[] var4 = new float[3];
      float[] var5 = new float[3];
      id_class(id_byte(var0), id_protected(var0), id_break(var0), var3);
      id_class(id_byte(var1), id_protected(var1), id_break(var1), var4);

      for (int var6 = id_case[0]; var6 < 3; var6++) {
         var5[var6] = var3[var6] + var2 * (var4[var6] - var3[var6]);
      }

      return id_class(var5[id_case[1]], var5[1], var5[2]);
   }

   public static int id_class(int var0, int var1, int var2, int var3) {
      return rfU_2.id_class(var3, id_case[7], 255) << 24 | var0 << 16 | var1 << 8 | var2;
   }

   public static int id_class(int var0, int var1, int var2) {
      return id_class(var0, var1, var2, 255);
   }

   public static float[] id_class(int var0) {
      return Color.RGBtoHSB(id_byte(var0), id_protected(var0), id_break(var0), null);
   }

   public static int id_class(int var0, int var1, float var2, float var3, float var4) {
      float var5 = (float)id_byte(var0, var1);
      var5 = (float)((double)var5 % 360.0);
      float var7;
      return id_break(
         Color.HSBtoRGB((double)((var7 = var5 % 360.0F) / 360.0F) < 0.5 ? -(var7 / 360.0F) : var7 / 360.0F, var2, var3),
         Math.max(id_case[11], Math.min(255, (int)(var4 * 255.0F)))
      );
   }

   private static void id_class() {
      id_throws = new int[]{16777215, -16777216};
   }

   public static int id_class(float var0, int var1) {
      return id_break(id_case((int)var0), var1);
   }

   public static int id_class(iB_2 var0) {
      return id_break(Color.RED.getRGB(), Color.GREEN.getRGB(), 1.0F - rrjZ_2.id_class(var0));
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4937035723616035461L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{18, 37, -11, -68, -24, 87, -50, 126}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static float[] id_class(int var0, int var1, int var2, float[] var3) {
      if (var3 == null) {
         var3 = new float[3];
      }

      int var4 = Math.max(var0, Math.max(var1, var2));
      int var5 = Math.min(var0, Math.min(var1, var2));
      float var6 = (float)var4 / 255.0F;
      float var7 = var4 != 0 ? (float)(var4 - var5) / (float)var4 : id_break[23];
      float var8 = id_break[24];
      if (var7 != id_break[25]) {
         float var9 = (float)(var4 - var0) / (float)(var4 - var5);
         float var10 = (float)(var4 - var1) / (float)(var4 - var5);
         float var11 = (float)(var4 - var2) / (float)(var4 - var5);
         if (var0 == var4) {
            var8 = var11 - var10;
         } else if (var1 == var4) {
            var8 = 2.0F + var9 - var11;
         } else {
            var8 = 4.0F + var10 - var9;
         }

         var8 /= 6.0F;
         if (var8 < id_break[29]) {
            var8++;
         }
      }

      var3[id_case[16]] = var8;
      var3[1] = var7;
      var3[2] = var6;
      return var3;
   }

   public static int id_break(int var0, float var1) {
      return id_class(
         (int)Math.min((float)id_byte(var0) / var1, 255.0F),
         (int)Math.min((float)id_protected(var0) / var1, 255.0F),
         (int)Math.min((float)id_break(var0) / var1, 255.0F),
         rfU_2.id_class(id_throws(var0), id_case[6], 255)
      );
   }

   private static void id_break() {
      id_break = new float[]{
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

   public static int id_break(int var0, int var1, float var2) {
      var2 = rfU_2.id_class(var2, id_break[56], 1.0F);
      return id_class(
         Math.round(rrfQ_2.id_break((float)id_byte(var0), (float)id_byte(var1), var2)),
         Math.round(rrfQ_2.id_break((float)id_protected(var0), (float)id_protected(var1), var2)),
         Math.round(rrfQ_2.id_break((float)id_break(var0), (float)id_break(var1), var2)),
         Math.round(rrfQ_2.id_break((float)id_throws(var0), (float)id_throws(var1), var2))
      );
   }

   public static int id_break(int var0, int var1) {
      return rfU_2.id_class(var1, id_case[9], 255) << 24 | var0 & 16777215;
   }

   public static int id_break(int var0, int var1, float var2, float var3, float var4) {
      float var5 = (float)id_byte(var0, var1) / 360.0F;
      return id_break(id_class(var5, var2, var3), Math.max(id_case[10], Math.min(255, (int)(var4 * 255.0F))));
   }

   public static int id_break(int var0, int var1, int var2, int var3, float var4) {
      return id_class(
         (int)Math.min((float)var0 / var4, 255.0F),
         (int)Math.min((float)var1 / var4, 255.0F),
         (int)Math.min((float)var2 / var4, 255.0F),
         rfU_2.id_class(var3, id_case[5], 255)
      );
   }

   public static int id_break(int var0) {
      return var0 & 0xFF;
   }

   private static void id_throws() {
      id_byte = new double[]{360.0, 0.5};
   }

   public static int id_throws(int var0) {
      return var0 >> 24 & 0xFF;
   }

   private static int id_catch(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 400201265;
   }

   private static void id_case() {
      id_protected = new short[]{7, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 360, 180, 360, 57};
   }

   private static int id_case(int var0) {
      return ((ThemeType)ClickGuiTheme.id_class[7]).id_class().apply(var0);
   }

   public static int id_protected(int var0) {
      return var0 >> 8 & 0xFF;
   }

   private static void id_protected() {
      id_class = new byte[]{3, 3, 3, 3, 2, 24, 16, 8, 24, 16, 8, 16, 8, 24, 24, 2, 2, 2, 3, 2, 16, 8};
   }
}
