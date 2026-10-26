package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum Bq_1 {
   ;
   private static short[] shortsc48d9c2a6a943f1684eec8a5f13e9034;
   private static String[] stringsc48d9c2a6a943f1684eec8a5f13e9034;
   private static byte[] bytesc48d9c2a6a943f1684eec8a5f13e9034;
   private static boolean[] booleansc48d9c2a6a943f1684eec8a5f13e9034;
   public static Object[] staticFieldsc48d9c2a6a943f1684eec8a5f13e9034;

   private static void byte_() {
      stringsc48d9c2a6a943f1684eec8a5f13e9034 = new String[]{new String("REALLY_WORLD"), new String("FUNTIME")};
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4144391371242376269L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{95, 46, 29, -63, 35, -122, -58, -116}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void class_() {
      booleansc48d9c2a6a943f1684eec8a5f13e9034 = new boolean[]{false, true, false, false, true, true};
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -72925317;
   }

   private static void break_() {
      shortsc48d9c2a6a943f1684eec8a5f13e9034 = new short[]{2, 0, 1};
   }

   private static void case_() {
      bytesc48d9c2a6a943f1684eec8a5f13e9034 = new byte[]{2, 2, 3};
   }

   private static void protected_() {
      Object[] var0 = new Object[]{new Bq_1(), new Bq_1(), null};
      var0[2] = new Bq_1[]{(Bq_1)var0[0], (Bq_1)var0[1]};
      staticFieldsc48d9c2a6a943f1684eec8a5f13e9034 = var0;
   }
}
