package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rrpE_2 {
   ;
   private static String[] stringsb83609a63cb43b15a88fd9d3cb0e97ea;
   private static boolean[] booleansb83609a63cb43b15a88fd9d3cb0e97ea;
   private static byte[] bytesb83609a63cb43b15a88fd9d3cb0e97ea;
   public static Object[] staticFieldsb83609a63cb43b15a88fd9d3cb0e97ea;
   private static short[] shortsb83609a63cb43b15a88fd9d3cb0e97ea;

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{47, 88, 85, -18, -28, -59, -122, -103}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1948416843;
   }

   private static void class_() {
      stringsb83609a63cb43b15a88fd9d3cb0e97ea = new String[]{new String("SUCCESS"), new String("ITEM_NOT_FOUND"), new String("ITEM_HAS_COOLDOWN")};
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5671305679428031223L;
   }

   private static void break_() {
      shortsb83609a63cb43b15a88fd9d3cb0e97ea = new short[]{3, 0, 1, 2};
   }

   private static void throws_() {
      Object[] var0 = new Object[]{new rrpE_2(), new rrpE_2(), new rrpE_2(), null};
      var0[3] = new rrpE_2[]{(rrpE_2)var0[0], (rrpE_2)var0[1], (rrpE_2)var0[2]};
      staticFieldsb83609a63cb43b15a88fd9d3cb0e97ea = var0;
   }

   private static void case_() {
      bytesb83609a63cb43b15a88fd9d3cb0e97ea = new byte[]{3, 2, 2, 2, 3, 4};
   }

   private static void protected_() {
      booleansb83609a63cb43b15a88fd9d3cb0e97ea = new boolean[]{false, true, false, false, true, true};
   }
}
