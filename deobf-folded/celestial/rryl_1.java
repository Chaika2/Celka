package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rryl_1 {
   private static short[] shortsf4b744ad2cb233a5a56c412114fd18f6;
   private static String[] stringsf4b744ad2cb233a5a56c412114fd18f6;
   private static boolean[] booleansf4b744ad2cb233a5a56c412114fd18f6;
   private static byte[] bytesf4b744ad2cb233a5a56c412114fd18f6;
   public static Object[] staticFieldsf4b744ad2cb233a5a56c412114fd18f6;

   private static void id_byte() {
      bytesf4b744ad2cb233a5a56c412114fd18f6 = new byte[]{2};
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2341797871780730100L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1238836520;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{92, -7, 16, -28, -6, -52, -99, -44}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_class() {
      stringsf4b744ad2cb233a5a56c412114fd18f6 = new String[]{new String("WAITING")};
   }

   private static void id_break() {
      shortsf4b744ad2cb233a5a56c412114fd18f6 = new short[]{1, 0};
   }

   private static void id_throws() {
      Object[] var0 = new Object[]{new rryl_1(), null};
      var0[1] = new rryl_1[]{(rryl_1)var0[0]};
      staticFieldsf4b744ad2cb233a5a56c412114fd18f6 = var0;
   }

   private static void id_case() {
      booleansf4b744ad2cb233a5a56c412114fd18f6 = new boolean[]{true, false, false, false, true};
   }
}
