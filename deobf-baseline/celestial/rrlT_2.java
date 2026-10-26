package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rrlT_2 {
   private static boolean[] booleans8894b88cba4233cc950e42483f078233;
   public static Object[] staticFields8894b88cba4233cc950e42483f078233;
   private static short[] shorts8894b88cba4233cc950e42483f078233;
   private static byte[] bytes8894b88cba4233cc950e42483f078233;
   private static String[] strings8894b88cba4233cc950e42483f078233;

   private static void id_byte() {
      Object[] var0 = new Object[]{new rrlT_2(), null};
      var0[1] = new rrlT_2[]{(rrlT_2)var0[0]};
      staticFields8894b88cba4233cc950e42483f078233 = var0;
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7105684009277667629L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -125885337;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-127, -88, 116, 20, 73, 9, -102, 117}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_break() {
      booleans8894b88cba4233cc950e42483f078233 = new boolean[]{true, false, false, false, true};
   }

   private static void id_throws() {
      shorts8894b88cba4233cc950e42483f078233 = new short[]{1, 0};
   }

   private static void id_case() {
      strings8894b88cba4233cc950e42483f078233 = new String[]{new String("CLICK_IN_SCREEN")};
   }

   private static void id_protected() {
      bytes8894b88cba4233cc950e42483f078233 = new byte[]{2};
   }
}
