package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rrLS {
   private static boolean[] booleans5263c46d9cc33ff8a76200218759034b;
   private static String[] strings5263c46d9cc33ff8a76200218759034b;
   private static byte[] bytes5263c46d9cc33ff8a76200218759034b;
   private static short[] shorts5263c46d9cc33ff8a76200218759034b;
   public static Object[] staticFields5263c46d9cc33ff8a76200218759034b;

   private static void id_byte() {
      Object[] var0 = new Object[]{new rrLS(), new rrLS(), null};
      var0[2] = new rrLS[]{(rrLS)var0[0], (rrLS)var0[1]};
      staticFields5263c46d9cc33ff8a76200218759034b = var0;
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-103, 103, 29, 18, -44, -36, -42, 25}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5774752244532274139L;
   }

   private static void id_class() {
      shorts5263c46d9cc33ff8a76200218759034b = new short[]{2, 0, 1};
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1198266925;
   }

   private static void id_break() {
      booleans5263c46d9cc33ff8a76200218759034b = new boolean[]{false, true, false, false, true, true};
   }

   private static void id_throws() {
      strings5263c46d9cc33ff8a76200218759034b = new String[]{new String("MOUSE"), new String("KEYBOARD")};
   }

   private static void id_case() {
      bytes5263c46d9cc33ff8a76200218759034b = new byte[]{2, 2, 3};
   }
}
