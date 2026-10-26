package celestial;

import java.awt.image.BufferedImage;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.lwjgl.opengl.GL11;

public class rrjr_3 implements MinecraftAccessor {
   private static int[] break_;
   private static float[] byte_;
   public static Object[] class_;
   private static byte[] protected_;
   private static short[] throws_;
   private static boolean[] case_;
   private static String[] catch_;

   private static void byte_() {
      Object[] var0 = new Object[]{ByteBuffer.allocateDirect(16777216).order(ByteOrder.nativeOrder()).asIntBuffer(), new int[4194304]};
      class_ = var0;
   }

   private static int byte_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1979521147;
   }

   static {
      ntfClinit();
   }

   public static void class_(boolean var0) {
      if (var0) {
         GL11.glTexParameterf(3553, 10242, 33071.0F);
         GL11.glTexParameterf(3553, 10243, 33071.0F);
      } else {
         GL11.glTexParameterf(throws_[13], 10242, 10497.0F);
         GL11.glTexParameterf(3553, 10243, 10497.0F);
      }
   }

   public static void class_(int var0, int var1, int var2) {
      class_(var0, 0, var1, var2);
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-29, -125, -83, -16, -97, 44, 81, 43}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static void class_(boolean var0, boolean var1) {
      if (var0) {
         GL11.glTexParameterf(3553, 10241, var1 ? 9987.0F : byte_[7]);
         GL11.glTexParameterf(3553, 10240, 9729.0F);
      } else {
         int var2 = rrbb_3.new_();
         GL11.glTexParameterf(3553, 10241, var1 ? (float)var2 : byte_[9]);
         GL11.glTexParameterf(3553, 10240, 9728.0F);
      }
   }

   private static void class_(int[] var0, int var1) {
      ((IntBuffer)class_[0]).clear();
      ((IntBuffer)class_[0]).put(var0, 0, var1);
      ((IntBuffer)class_[0]).position(0).limit(var1);
   }

   private static void class_(BufferedImage var0, int var1, int var2, boolean var3, boolean var4) {
      int var5 = var0.getWidth();
      int var6 = var0.getHeight();
      int var7 = 4194304 / var5;
      int[] var8 = (int[])class_[1];
      break_(var3);
      class_(var4);

      for (int var9 = 0; var9 < var5 * var6; var9 += var5 * var7) {
         int var10 = var9 / var5;
         int var11 = Math.min(var7, var6 - var10);
         int var12 = var5 * var11;
         var0.getRGB(0, var10, var5, var11, var8, 0, var5);
         break_(var8, var12);
         GL11.glTexSubImage2D(3553, 0, var1, var2 + var10, var5, var11, 32993, 33639, (IntBuffer)class_[0]);
      }
   }

   public static int class_(int var0, BufferedImage var1, int var2, int var3, boolean var4, boolean var5) {
      break_(var0);
      class_(var1, var2, var3, var4, var5);
      return var0;
   }

   public static void class_(int var0) {
      MT.continue_(var0);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4068125247015243179L;
   }

   public static void class_(int var0, int var1, int var2, int var3) {
      Class<fo_3> var4 = fo_3.class;
      synchronized (var4) {
         class_(var0);
         break_(var0);
      }

      if (var1 >= 0) {
         GL11.glTexParameterf(3553, 33085, (float)var1);
         GL11.glTexParameterf(3553, 33082, 0.0F);
         GL11.glTexParameterf(3553, 33083, (float)var1);
         GL11.glTexParameterf(3553, 34049, 0.0F);
      }

      for (int var5 = case_[3]; var5 <= var1; var5++) {
         GL11.glTexImage2D(3553, var5, 6408, var2 >> var5, var3 >> var5, 0, 32993, 33639, (IntBuffer)null);
      }
   }

   public static fk_3 class_(BufferedImage var0, boolean var1, boolean var2, boolean var3, boolean var4) {
      int var5 = var0.getWidth();
      int var6 = var0.getHeight();
      int[] var7 = var0.getRGB(0, 0, var5, var6, null, 0, var5);
      fN_2 var8 = new fN_2(var5, var6, false);

      for (int var9 = 0; var9 < var7.length; var9++) {
         int var10 = var7[var9];
         int var11 = var10 >> 24 & 0xFF;
         int var12 = var10 >> 16 & 0xFF;
         int var13 = var10 >> 8 & 0xFF;
         int var14 = var10 & 0xFF;
         var8.class_(var9 % var5, var9 / var5, ColorHelper.class_(var12, var13, var14, var11));
      }

      try {
         fk_3 var16 = new fk_3(var8);
         var16.a_(import_.F());
         int var17 = var16.new_();
         MT.super_(var17);
         GL11.glTexParameteri(throws_[32], throws_[33], throws_[34]);
         GL11.glTexParameteri(throws_[35], throws_[36], throws_[37]);
         GL11.glTexParameteri(throws_[38], throws_[39], throws_[40]);
         GL11.glTexParameteri(throws_[41], throws_[42], throws_[43]);
         GL11.glTexParameteri(throws_[44], break_[9], throws_[45]);
         GL11.glTexParameteri(throws_[46], break_[10], throws_[47]);
         GL11.glTexParameteri(throws_[48], break_[11], throws_[49]);
         GL11.glTexImage2D(throws_[50], case_[17], throws_[51], var5, var6, case_[18], throws_[52], throws_[53], (ByteBuffer)null);
         var8.class_(case_[19], case_[20], case_[21], case_[22], case_[23], var5, var6, var1, var2, var3, var4);
         MT.super_(case_[24]);
         return var16;
      } catch (Exception var15) {
         throw new RuntimeException("Failed to create texture", var15);
      }
   }

   public static int class_(int var0, BufferedImage var1, boolean var2, boolean var3) {
      class_(var0, var1.getWidth(), var1.getHeight());
      return class_(var0, var1, 0, 0, var2, var3);
   }

   private static void class_() {
      case_ = new boolean[]{
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         true
      };
   }

   private static void break_(int[] var0, int var1) {
      class_(var0, var1);
   }

   private static void break_() {
      protected_ = new byte[]{24, 16, 8, 2};
   }

   public static void break_(int var0) {
      MT.super_(var0);
   }

   private static void break_(boolean var0) {
      class_(var0, false);
   }

   private static void throws_() {
      byte_ = new float[]{0.0F, 0.0F, 33071.0F, 33071.0F, 10497.0F, 10497.0F, 9987.0F, 9729.0F, 9729.0F, 9728.0F, 9728.0F};
   }

   private static void catch_() {
      throws_ = new short[]{
         3553,
         3553,
         3553,
         3553,
         3553,
         6408,
         1,
         3553,
         0,
         3553,
         10242,
         3553,
         10243,
         3553,
         10242,
         3553,
         10243,
         3553,
         10241,
         3553,
         10240,
         3553,
         10241,
         3553,
         10240,
         0,
         0,
         0,
         255,
         255,
         255,
         255,
         3553,
         10240,
         9729,
         3553,
         10241,
         9986,
         3553,
         10242,
         10497,
         3553,
         10243,
         10497,
         3553,
         1000,
         3553,
         1000,
         3553,
         -1000,
         3553,
         6408,
         6408,
         5121
      };
   }

   private static void case_() {
      catch_ = new String[]{new String("Failed to create texture")};
   }

   private static void protected_() {
      break_ = new int[]{33085, 33082, 33083, 34049, 32993, 33639, 4194304, 32993, 33639, 33085, 33083, 33082, 4194304, 4194304};
   }
}
