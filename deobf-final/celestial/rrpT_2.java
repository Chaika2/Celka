package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rrpT_2 {
   ;
   private static boolean[] booleans40114faa3468399f904240e789c63c91;
   private static String[] strings40114faa3468399f904240e789c63c91;
   private static short[] shorts40114faa3468399f904240e789c63c91;
   public static Object[] staticFields40114faa3468399f904240e789c63c91;
   private static byte[] bytes40114faa3468399f904240e789c63c91;

   private static void byte_() {
      booleans40114faa3468399f904240e789c63c91 = new boolean[]{false, true, false, false, true, true};
   }

   static {
      ntfClinit();
   }

   private static void class_() {
      Object[] var0 = new Object[]{new rrpT_2(), new rrpT_2(), new rrpT_2(), null};
      var0[3] = new rrpT_2[]{(rrpT_2)var0[0], (rrpT_2)var0[1], (rrpT_2)var0[2]};
      staticFields40114faa3468399f904240e789c63c91 = var0;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7898614083974234578L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1642832668;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-63, -29, 40, 96, 126, -104, -68, -104}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void break_() {
      bytes40114faa3468399f904240e789c63c91 = new byte[]{3, 2, 2, 2, 3, 4};
   }

   private static void case_() {
      shorts40114faa3468399f904240e789c63c91 = new short[]{3, 0, 1, 2};
   }

   private static void protected_() {
      strings40114faa3468399f904240e789c63c91 = new String[]{new String("SUCCESS"), new String("ITEM_NOT_FOUND"), new String("ITEM_HAS_COOLDOWN")};
   }
}
