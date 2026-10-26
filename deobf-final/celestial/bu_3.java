package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum bu_3 {
   ;
   public static Object[] staticFields580f7ea75a023f1a97051d53b9f86917;
   private static short[] shorts580f7ea75a023f1a97051d53b9f86917;
   private static String[] strings580f7ea75a023f1a97051d53b9f86917;
   private static byte[] bytes580f7ea75a023f1a97051d53b9f86917;
   private static boolean[] booleans580f7ea75a023f1a97051d53b9f86917;

   private static void byte_() {
      bytes580f7ea75a023f1a97051d53b9f86917 = new byte[]{3, 2, 2, 2, 3, 4};
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-21, 57, -87, -103, -79, 122, 82, 60}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -521048243;
   }

   private static void class_() {
      Object[] var0 = new Object[]{new bu_3(), new bu_3(), new bu_3(), null};
      var0[3] = new bu_3[]{(bu_3)var0[0], (bu_3)var0[1], (bu_3)var0[2]};
      staticFields580f7ea75a023f1a97051d53b9f86917 = var0;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1757387921829218763L;
   }

   private static void break_() {
      booleans580f7ea75a023f1a97051d53b9f86917 = new boolean[]{false, true, false, false, true, true};
   }

   private static void throws_() {
      strings580f7ea75a023f1a97051d53b9f86917 = new String[]{new String("ATTACKING"), new String("PLACING"), new String("IDLE")};
   }

   private static void protected_() {
      shorts580f7ea75a023f1a97051d53b9f86917 = new short[]{3, 0, 1, 2};
   }
}
