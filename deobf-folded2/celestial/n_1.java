package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum n_1 {
   private static String[] stringse7df95b1dfb038edb75e6ac1f750d600;
   private static byte[] bytese7df95b1dfb038edb75e6ac1f750d600;
   private static short[] shortse7df95b1dfb038edb75e6ac1f750d600;
   public static Object[] staticFieldse7df95b1dfb038edb75e6ac1f750d600;
   private static boolean[] booleanse7df95b1dfb038edb75e6ac1f750d600;

   private static void id_byte() {
      stringse7df95b1dfb038edb75e6ac1f750d600 = new String[]{new String("START_BREAK"), new String("USE")};
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8965575936624071574L;
   }

   private static void id_class() {
      booleanse7df95b1dfb038edb75e6ac1f750d600 = new boolean[]{false, true, false, false, true, true};
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-88, 97, -43, 72, 55, 106, -24, 30}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1428461331;
   }

   private static void id_throws() {
      Object[] var0 = new Object[]{new n_1(), new n_1(), null};
      var0[2] = new n_1[]{(n_1)var0[0], (n_1)var0[1]};
      staticFieldse7df95b1dfb038edb75e6ac1f750d600 = var0;
   }

   private static void id_case() {
      bytese7df95b1dfb038edb75e6ac1f750d600 = new byte[]{2, 2, 3};
   }

   private static void id_protected() {
      shortse7df95b1dfb038edb75e6ac1f750d600 = new short[]{2, 0, 1};
   }
}
