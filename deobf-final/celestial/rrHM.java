package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rrHM {
   ;
   public static Object[] staticFields6335874c02e73489a27afe393d14ab7b;
   private static boolean[] booleans6335874c02e73489a27afe393d14ab7b;
   private static byte[] bytes6335874c02e73489a27afe393d14ab7b;
   private static short[] shorts6335874c02e73489a27afe393d14ab7b;
   private static String[] strings6335874c02e73489a27afe393d14ab7b;

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1637898554;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{108, -95, 48, -86, -125, 104, 50, -128}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4753031582927704908L;
   }

   private static void class_() {
      strings6335874c02e73489a27afe393d14ab7b = new String[]{new String("FORWARD"), new String("UP"), new String("DOWN")};
   }

   private static void break_() {
      shorts6335874c02e73489a27afe393d14ab7b = new short[]{3, 0, 1, 2};
   }

   private static void throws_() {
      Object[] var0 = new Object[]{new rrHM(), new rrHM(), new rrHM(), null};
      var0[3] = new rrHM[]{(rrHM)var0[0], (rrHM)var0[1], (rrHM)var0[2]};
      staticFields6335874c02e73489a27afe393d14ab7b = var0;
   }

   private static void case_() {
      bytes6335874c02e73489a27afe393d14ab7b = new byte[]{3, 2, 2, 2, 3, 4};
   }

   private static void protected_() {
      booleans6335874c02e73489a27afe393d14ab7b = new boolean[]{false, true, false, false, true, true};
   }
}
