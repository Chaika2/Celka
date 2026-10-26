package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rrtz_3 {
   ;
   private static String[] stringsb85642e435023a9b997fb27aa0167b70;
   private static byte[] bytesb85642e435023a9b997fb27aa0167b70;
   private static short[] shortsb85642e435023a9b997fb27aa0167b70;
   public static Object[] staticFieldsb85642e435023a9b997fb27aa0167b70;
   private static boolean[] booleansb85642e435023a9b997fb27aa0167b70;

   private static void byte_() {
      stringsb85642e435023a9b997fb27aa0167b70 = new String[]{new String("ENABLED"), new String("DISABLED"), new String("BIND_CHANGED")};
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-97, -121, 84, -60, -44, 71, 18, -61}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void class_() {
      shortsb85642e435023a9b997fb27aa0167b70 = new short[]{3, 0, 1, 2};
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1946424578455629141L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 74037715;
   }

   private static void throws_() {
      booleansb85642e435023a9b997fb27aa0167b70 = new boolean[]{false, true, false, false, true, true};
   }

   private static void case_() {
      bytesb85642e435023a9b997fb27aa0167b70 = new byte[]{3, 2, 2, 2, 3, 4};
   }

   private static void protected_() {
      Object[] var0 = new Object[]{new rrtz_3(), new rrtz_3(), new rrtz_3(), null};
      var0[3] = new rrtz_3[]{(rrtz_3)var0[0], (rrtz_3)var0[1], (rrtz_3)var0[2]};
      staticFieldsb85642e435023a9b997fb27aa0167b70 = var0;
   }
}
