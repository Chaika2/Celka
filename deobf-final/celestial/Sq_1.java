package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum Sq_1 {
   ;
   private static boolean[] booleans3819d0a25319329c972e0f964aeaa125;
   private static short[] shorts3819d0a25319329c972e0f964aeaa125;
   private static byte[] bytes3819d0a25319329c972e0f964aeaa125;
   public static Object[] staticFields3819d0a25319329c972e0f964aeaa125;
   private static String[] strings3819d0a25319329c972e0f964aeaa125;

   private static void byte_() {
      bytes3819d0a25319329c972e0f964aeaa125 = new byte[]{2, 2, 3};
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1440871525;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{104, 12, 21, -128, -13, -106, -119, 67}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6123749136472283655L;
   }

   private static void class_() {
      strings3819d0a25319329c972e0f964aeaa125 = new String[]{new String("FOUND_BUT_NO_NEEDED_NUMBER"), new String("OK")};
   }

   private static void break_() {
      booleans3819d0a25319329c972e0f964aeaa125 = new boolean[]{false, true, false, false, true, true};
   }

   private static void throws_() {
      Object[] var0 = new Object[]{new Sq_1(), new Sq_1(), null};
      var0[2] = new Sq_1[]{(Sq_1)var0[0], (Sq_1)var0[1]};
      staticFields3819d0a25319329c972e0f964aeaa125 = var0;
   }

   private static void protected_() {
      shorts3819d0a25319329c972e0f964aeaa125 = new short[]{2, 0, 1};
   }
}
