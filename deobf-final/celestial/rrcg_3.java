package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rrcg_3 {
   ;
   public static Object[] staticFields9e7054085b8332b2a0d7ffdb908291c6;
   private static byte[] bytes9e7054085b8332b2a0d7ffdb908291c6;
   private static short[] shorts9e7054085b8332b2a0d7ffdb908291c6;
   private static String[] strings9e7054085b8332b2a0d7ffdb908291c6;
   private static boolean[] booleans9e7054085b8332b2a0d7ffdb908291c6;

   private static void byte_() {
      booleans9e7054085b8332b2a0d7ffdb908291c6 = new boolean[]{false, true, false, false, true, true};
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 601917347;
   }

   private static void class_() {
      shorts9e7054085b8332b2a0d7ffdb908291c6 = new short[]{3, 0, 1, 2};
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-10, -67, -3, -8, -60, 108, -11, -109}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3196362873232717317L;
   }

   private static void break_() {
      Object[] var0 = new Object[]{new rrcg_3(), new rrcg_3(), new rrcg_3(), null};
      var0[3] = new rrcg_3[]{(rrcg_3)var0[0], (rrcg_3)var0[1], (rrcg_3)var0[2]};
      staticFields9e7054085b8332b2a0d7ffdb908291c6 = var0;
   }

   private static void case_() {
      bytes9e7054085b8332b2a0d7ffdb908291c6 = new byte[]{3, 2, 2, 2, 3, 4};
   }

   private static void protected_() {
      strings9e7054085b8332b2a0d7ffdb908291c6 = new String[]{new String("OK"), new String("PRICE_TOO_HIGH"), new String("NOT_ENOUGH_MONEY")};
   }
}
