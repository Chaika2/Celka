package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrQo_1 {
   private static float[] id_break;
   private static double[] id_byte;
   private static boolean[] id_protected;
   private static short[] id_throws;
   public static Object[] id_class;

   private static void id_byte() {
      id_throws = new short[1];
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{75, 102, 110, -85, -56, -110, 16, 57}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1676807106;
   }

   public static float id_class(rrQK var0, double var1, double var3, double var5) {
      return (float)(var1 + (var3 - var1) * var0.id_class(var5 * (Double)id_class[id_throws[0]] * 0.01));
   }

   private static void id_class() {
      id_break = new float[]{1.0F, 2.0F, 2.0F};
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6986138011711787566L;
   }

   public static void id_class(Ml_1 var0, float var1, float var2, float var3, float var4, float var5) {
      float var6 = 1.0F - var5;
      var0.id_class((double)(var6 * (var1 + var3 / 2.0F)), (double)(var6 * (var2 + var4 / 2.0F)), id_byte[0]);
      var0.id_class(var5, var5, var5);
   }

   private static void id_break() {
      id_byte = new double[]{0.0, 0.01, 0.0};
   }

   private static void id_throws() {
      Object[] var0 = new Object[]{0.0};
      id_class = var0;
   }

   private static void id_protected() {
      id_protected = new boolean[]{true, false};
   }
}
