package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rrpC_2 {
   ;
   private static short[] shorts58cea7ed1d8d31da9b1cc2bca3fc3669;
   private static String[] strings58cea7ed1d8d31da9b1cc2bca3fc3669;
   private static boolean[] booleans58cea7ed1d8d31da9b1cc2bca3fc3669;
   public static Object[] staticFields58cea7ed1d8d31da9b1cc2bca3fc3669;
   private static byte[] bytes58cea7ed1d8d31da9b1cc2bca3fc3669;

   private static void byte_() {
      Object[] var0 = new Object[]{new rrpC_2(), null};
      var0[1] = new rrpC_2[]{(rrpC_2)var0[0]};
      staticFields58cea7ed1d8d31da9b1cc2bca3fc3669 = var0;
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1082152467;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6600616586715488289L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-99, 17, -106, -44, 61, 79, 69, -1}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void class_() {
      strings58cea7ed1d8d31da9b1cc2bca3fc3669 = new String[]{new String("JOINING")};
   }

   private static void break_() {
      booleans58cea7ed1d8d31da9b1cc2bca3fc3669 = new boolean[]{true, false, false, false, true};
   }

   private static void throws_() {
      shorts58cea7ed1d8d31da9b1cc2bca3fc3669 = new short[]{1, 0};
   }

   private static void protected_() {
      bytes58cea7ed1d8d31da9b1cc2bca3fc3669 = new byte[]{2};
   }
}
