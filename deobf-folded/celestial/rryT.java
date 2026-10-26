package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rryT {
   public static Object[] staticFields37876a19520c3c81842a5cb803ef3c99;
   private static boolean[] booleans37876a19520c3c81842a5cb803ef3c99;
   private static String[] strings37876a19520c3c81842a5cb803ef3c99;
   private static short[] shorts37876a19520c3c81842a5cb803ef3c99;
   private static byte[] bytes37876a19520c3c81842a5cb803ef3c99;

   private static void id_byte() {
      bytes37876a19520c3c81842a5cb803ef3c99 = new byte[]{5, 2, 3, 4, 2, 2, 3, 3, 4, 4, 5, 6};
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{41, -99, -91, -107, 118, -15, 69, 127}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7819576385288716237L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1749163138;
   }

   private static void id_break() {
      shorts37876a19520c3c81842a5cb803ef3c99 = new short[]{5, 0, 1, 2, 3, 4};
   }

   private static void id_throws() {
      booleans37876a19520c3c81842a5cb803ef3c99 = new boolean[]{false, true, false, false, true, true};
   }

   private static void id_case() {
      strings37876a19520c3c81842a5cb803ef3c99 = new String[]{
         new String("PAY"), new String("B"), new String("AH_SELL"), new String("CLAN_WITHDRAW"), new String("CLAN_INVEST")
      };
   }

   private static void id_protected() {
      Object[] var0 = new Object[]{new rryT(), new rryT(), new rryT(), new rryT(), new rryT(), null};
      var0[5] = new rryT[]{(rryT)var0[0], (rryT)var0[1], (rryT)var0[2], (rryT)var0[3], (rryT)var0[4]};
      staticFields37876a19520c3c81842a5cb803ef3c99 = var0;
   }
}
