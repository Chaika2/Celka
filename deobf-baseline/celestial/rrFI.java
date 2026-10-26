package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rrFI {
   private static boolean[] booleans7eee503931553d5586d91adc0f9df349;
   private static short[] shorts7eee503931553d5586d91adc0f9df349;
   private static String[] strings7eee503931553d5586d91adc0f9df349;
   public static Object[] staticFields7eee503931553d5586d91adc0f9df349;
   private static byte[] bytes7eee503931553d5586d91adc0f9df349;

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -509820502;
   }

   private static void id_class() {
      shorts7eee503931553d5586d91adc0f9df349 = new short[]{2, 0, 1};
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{46, -14, 95, 118, -84, -3, 3, -120}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1548735351769749456L;
   }

   private static void id_break() {
      Object[] var0 = new Object[]{new rrFI(), new rrFI(), null};
      var0[2] = new rrFI[]{(rrFI)var0[0], (rrFI)var0[1]};
      staticFields7eee503931553d5586d91adc0f9df349 = var0;
   }

   private static void id_throws() {
      bytes7eee503931553d5586d91adc0f9df349 = new byte[]{2, 2, 3};
   }

   private static void id_case() {
      booleans7eee503931553d5586d91adc0f9df349 = new boolean[]{false, true, false, false, true, true};
   }

   private static void id_protected() {
      strings7eee503931553d5586d91adc0f9df349 = new String[]{new String("START"), new String("END")};
   }
}
