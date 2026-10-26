package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rrIu_1 {
   private static short[] shorts10847edfe142316aa094e53a68b36f7b;
   private static byte[] bytes10847edfe142316aa094e53a68b36f7b;
   private static String[] strings10847edfe142316aa094e53a68b36f7b;
   private static boolean[] booleans10847edfe142316aa094e53a68b36f7b;
   public static Object[] staticFields10847edfe142316aa094e53a68b36f7b;

   private static void id_byte() {
      booleans10847edfe142316aa094e53a68b36f7b = new boolean[]{false, true, false, false, true, true};
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3134107997128737233L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1646413679;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-82, -46, -115, -82, 90, -68, 109, -8}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_break() {
      shorts10847edfe142316aa094e53a68b36f7b = new short[]{2, 0, 1};
   }

   private static void id_throws() {
      strings10847edfe142316aa094e53a68b36f7b = new String[]{new String("LIST"), new String("BOX")};
   }

   private static void id_case() {
      Object[] var0 = new Object[]{new rrIu_1(), new rrIu_1(), null};
      var0[2] = new rrIu_1[]{(rrIu_1)var0[0], (rrIu_1)var0[1]};
      staticFields10847edfe142316aa094e53a68b36f7b = var0;
   }

   private static void id_protected() {
      bytes10847edfe142316aa094e53a68b36f7b = new byte[]{2, 2, 3};
   }
}
