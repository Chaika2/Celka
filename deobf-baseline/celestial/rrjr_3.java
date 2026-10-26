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
   private static int[] id_break;
   private static float[] id_byte;
   public static Object[] id_class;
   private static byte[] id_protected;
   private static short[] id_throws;
   private static boolean[] id_case;
   private static String[] id_catch;

   private static void id_byte() {
      Object[] var0 = new Object[]{ByteBuffer.allocateDirect(16777216).order(ByteOrder.nativeOrder()).asIntBuffer(), new int[4194304]};
      id_class = var0;
   }

   private static int id_byte(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1979521147;
   }

   static {
      ntfClinit();
   }

   public static void id_class(boolean var0) {
      if (var0) {
         GL11.glTexParameterf(id_throws[9], id_throws[10], id_byte[2]);
         GL11.glTexParameterf(id_throws[11], id_throws[12], id_byte[3]);
      } else {
         GL11.glTexParameterf(id_throws[13], id_throws[14], id_byte[4]);
         GL11.glTexParameterf(id_throws[15], id_throws[16], id_byte[5]);
      }
   }

   public static void id_class(int var0, int var1, int var2) {
      id_class(var0, id_case[2], var1, var2);
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-29, -125, -83, -16, -97, 44, 81, 43}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static void id_class(boolean var0, boolean var1) {
      if (var0) {
         GL11.glTexParameterf(id_throws[17], id_throws[18], var1 ? id_byte[6] : id_byte[7]);
         GL11.glTexParameterf(id_throws[19], id_throws[20], id_byte[8]);
      } else {
         int var2 = rrbb_3.id_new();
         GL11.glTexParameterf(id_throws[21], id_throws[22], var1 ? (float)var2 : id_byte[9]);
         GL11.glTexParameterf(id_throws[23], id_throws[24], id_byte[10]);
      }
   }

   private static void id_class(int[] var0, int var1) {
      ((IntBuffer)id_class[id_throws[25]]).clear();
      ((IntBuffer)id_class[id_throws[26]]).put(var0, id_case[10], var1);
      ((IntBuffer)id_class[id_throws[27]]).position(id_case[11]).limit(var1);
   }

   private static void id_class(BufferedImage var0, int var1, int var2, boolean var3, boolean var4) {
      int var5 = var0.getWidth();
      int var6 = var0.getHeight();
      int var7 = id_break[6] / var5;
      int[] var8 = (int[])id_class[id_throws[6]];
      id_break(var3);
      id_class(var4);

      for (int var9 = id_case[5]; var9 < var5 * var6; var9 += var5 * var7) {
         int var10 = var9 / var5;
         int var11 = Math.min(var7, var6 - var10);
         int var12 = var5 * var11;
         var0.getRGB(id_case[6], var10, var5, var11, var8, id_case[7], var5);
         id_break(var8, var12);
         GL11.glTexSubImage2D(id_throws[7], id_case[8], var1, var2 + var10, var5, var11, id_break[7], id_break[8], (IntBuffer)id_class[id_throws[8]]);
      }
   }

   public static int id_class(int var0, BufferedImage var1, int var2, int var3, boolean var4, boolean var5) {
      id_break(var0);
      id_class(var1, var2, var3, var4, var5);
      return var0;
   }

   public static void id_class(int var0) {
      MT.id_continue(var0);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4068125247015243179L;
   }

   public static void id_class(int var0, int var1, int var2, int var3) {
      Class<fo_3> var4 = fo_3.class;
      synchronized (var4) {
         id_class(var0);
         id_break(var0);
      }

      if (var1 >= 0) {
         GL11.glTexParameterf(id_throws[0], id_break[0], (float)var1);
         GL11.glTexParameterf(id_throws[1], id_break[1], id_byte[0]);
         GL11.glTexParameterf(id_throws[2], id_break[2], (float)var1);
         GL11.glTexParameterf(id_throws[3], id_break[3], id_byte[1]);
      }

      for (int var5 = id_case[3]; var5 <= var1; var5++) {
         GL11.glTexImage2D(id_throws[4], var5, id_throws[5], var2 >> var5, var3 >> var5, id_case[4], id_break[4], id_break[5], (IntBuffer)null);
      }
   }

   public static fk_3 id_class(BufferedImage var0, boolean var1, boolean var2, boolean var3, boolean var4) {
      int var5 = var0.getWidth();
      int var6 = var0.getHeight();
      int[] var7 = var0.getRGB(id_case[12], id_case[13], var5, var6, null, id_case[14], var5);
      fN_2 var8 = new fN_2(var5, var6, id_case[15]);

      for (int var9 = id_case[16]; var9 < var7.length; var9++) {
         int var10 = var7[var9];
         int var11 = var10 >> id_protected[0] & id_throws[28];
         int var12 = var10 >> id_protected[1] & id_throws[29];
         int var13 = var10 >> id_protected[2] & id_throws[30];
         int var14 = var10 & id_throws[31];
         var8.id_class(var9 % var5, var9 / var5, ColorHelper.id_class(var12, var13, var14, var11));
      }

      try {
         fk_3 var16 = new fk_3(var8);
         var16.a_(id_import.F());
         int var17 = var16.id_new();
         MT.id_super(var17);
         GL11.glTexParameteri(id_throws[32], id_throws[33], id_throws[34]);
         GL11.glTexParameteri(id_throws[35], id_throws[36], id_throws[37]);
         GL11.glTexParameteri(id_throws[38], id_throws[39], id_throws[40]);
         GL11.glTexParameteri(id_throws[41], id_throws[42], id_throws[43]);
         GL11.glTexParameteri(id_throws[44], id_break[9], id_throws[45]);
         GL11.glTexParameteri(id_throws[46], id_break[10], id_throws[47]);
         GL11.glTexParameteri(id_throws[48], id_break[11], id_throws[49]);
         GL11.glTexImage2D(id_throws[50], id_case[17], id_throws[51], var5, var6, id_case[18], id_throws[52], id_throws[53], (ByteBuffer)null);
         var8.id_class(id_case[19], id_case[20], id_case[21], id_case[22], id_case[23], var5, var6, var1, var2, var3, var4);
         MT.id_super(id_case[24]);
         return var16;
      } catch (Exception var15) {
         throw new RuntimeException(id_catch[0], var15);
      }
   }

   public static int id_class(int var0, BufferedImage var1, boolean var2, boolean var3) {
      id_class(var0, var1.getWidth(), var1.getHeight());
      return id_class(var0, var1, id_case[0], id_case[1], var2, var3);
   }

   private static void id_class() {
      id_case = new boolean[]{
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

   private static void id_break(int[] var0, int var1) {
      id_class(var0, var1);
   }

   private static void id_break() {
      id_protected = new byte[]{24, 16, 8, 2};
   }

   public static void id_break(int var0) {
      MT.id_super(var0);
   }

   private static void id_break(boolean var0) {
      id_class(var0, id_case[9]);
   }

   private static void id_throws() {
      id_byte = new float[]{0.0F, 0.0F, 33071.0F, 33071.0F, 10497.0F, 10497.0F, 9987.0F, 9729.0F, 9729.0F, 9728.0F, 9728.0F};
   }

   private static void id_catch() {
      id_throws = new short[]{
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

   private static void id_case() {
      id_catch = new String[]{new String("Failed to create texture")};
   }

   private static void id_protected() {
      id_break = new int[]{33085, 33082, 33083, 34049, 32993, 33639, 4194304, 32993, 33639, 33085, 33083, 33082, 4194304, 4194304};
   }
}
