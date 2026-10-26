package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrfN_2 {
   private static short[] id_class;
   private static double[] id_break;
   private static float[] id_byte;

   private static void id_byte() {
      id_class = new short[]{20};
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 794441534;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7216642726280512827L;
   }

   private static void id_class() {
      id_break = new double[]{0.15, 0.6, 0.2};
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-3, -50, 114, 55, 10, -92, 30, -100}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static float id_class(float var0) {
      return id_break(var0) * id_break();
   }

   private static float id_break(float var0) {
      return (float)Math.round(var0 / id_break());
   }

   private static float id_break() {
      return (float)((double)id_throws() * 0.15);
   }

   private static float id_throws() {
      float var0;
      return (var0 = (float)(((Qw_1)MinecraftAccessor.id_import.id_class[20]).id_class * 0.6 + 0.2)) * var0 * var0 * 8.0F;
   }

   private static void id_protected() {
      id_byte = new float[]{8.0F};
   }
}
