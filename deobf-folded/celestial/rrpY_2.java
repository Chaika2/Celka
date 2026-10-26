package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rrpY_2 {
   private static short[] shortsf0e328803e763329a58eb35af5ba74f4;
   private static boolean[] booleansf0e328803e763329a58eb35af5ba74f4;
   public static Object[] staticFieldsf0e328803e763329a58eb35af5ba74f4;
   private static byte[] bytesf0e328803e763329a58eb35af5ba74f4;
   private static String[] stringsf0e328803e763329a58eb35af5ba74f4;

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1245405391;
   }

   private static void id_class() {
      Object[] var0 = new Object[]{new rrpY_2(), new rrpY_2(), new rrpY_2(), null};
      var0[3] = new rrpY_2[]{(rrpY_2)var0[0], (rrpY_2)var0[1], (rrpY_2)var0[2]};
      staticFieldsf0e328803e763329a58eb35af5ba74f4 = var0;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{91, 2, -2, 126, 7, 61, 1, 42}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7006934154926197666L;
   }

   private static void id_break() {
      stringsf0e328803e763329a58eb35af5ba74f4 = new String[]{new String("SUCCESS"), new String("ITEM_NOT_FOUND"), new String("ITEM_HAS_COOLDOWN")};
   }

   private static void id_throws() {
      bytesf0e328803e763329a58eb35af5ba74f4 = new byte[]{3, 2, 2, 2, 3, 4};
   }

   private static void id_case() {
      booleansf0e328803e763329a58eb35af5ba74f4 = new boolean[]{false, true, false, false, true, true};
   }

   private static void id_protected() {
      shortsf0e328803e763329a58eb35af5ba74f4 = new short[]{3, 0, 1, 2};
   }
}
