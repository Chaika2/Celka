package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rrFa_1 {
   ;
   private static short[] shortsc276c0e8494830db9e45df4464b752ad;
   public static Object[] staticFieldsc276c0e8494830db9e45df4464b752ad;
   private static String[] stringsc276c0e8494830db9e45df4464b752ad;
   private static boolean[] booleansc276c0e8494830db9e45df4464b752ad;
   private static byte[] bytesc276c0e8494830db9e45df4464b752ad;

   private static void byte_() {
      Object[] var0 = new Object[]{new rrFa_1(), new rrFa_1(), null};
      var0[2] = new rrFa_1[]{(rrFa_1)var0[0], (rrFa_1)var0[1]};
      staticFieldsc276c0e8494830db9e45df4464b752ad = var0;
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-120, 37, 26, -50, -72, -58, 72, -75}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void class_() {
      shortsc276c0e8494830db9e45df4464b752ad = new short[]{2, 0, 1};
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1473726426;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4419466713339496671L;
   }

   private static void throws_() {
      booleansc276c0e8494830db9e45df4464b752ad = new boolean[]{false, true, false, false, true, true};
   }

   private static void case_() {
      bytesc276c0e8494830db9e45df4464b752ad = new byte[]{2, 2, 3};
   }

   private static void protected_() {
      stringsc276c0e8494830db9e45df4464b752ad = new String[]{new String("REFRESH"), new String("DISABLE_PURCHASE")};
   }
}
