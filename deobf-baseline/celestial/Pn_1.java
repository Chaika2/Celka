package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum Pn_1 {
   private static short[] shorts96e7b83c036d3953981f6df41072b416;
   private static boolean[] booleans96e7b83c036d3953981f6df41072b416;
   private static String[] strings96e7b83c036d3953981f6df41072b416;
   private static byte[] bytes96e7b83c036d3953981f6df41072b416;
   public static Object[] staticFields96e7b83c036d3953981f6df41072b416;

   private static void id_byte() {
      bytes96e7b83c036d3953981f6df41072b416 = new byte[]{2, 2, 3};
   }

   static {
      ntfClinit();
   }

   private static void id_class() {
      Object[] var0 = new Object[]{new Pn_1(), new Pn_1(), null};
      var0[2] = new Pn_1[]{(Pn_1)var0[0], (Pn_1)var0[1]};
      staticFields96e7b83c036d3953981f6df41072b416 = var0;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1833195154;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-38, 108, -13, -73, 82, -35, -84, -45}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8431673283900085753L;
   }

   private static void id_break() {
      booleans96e7b83c036d3953981f6df41072b416 = new boolean[]{false, true, false, false, true, true};
   }

   private static void id_throws() {
      strings96e7b83c036d3953981f6df41072b416 = new String[]{new String("RECONNECTING"), new String("PENDING_AH_AVAILABILITY")};
   }

   private static void id_protected() {
      shorts96e7b83c036d3953981f6df41072b416 = new short[]{2, 0, 1};
   }
}
