package celestial;

import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrwL_2 extends rrwp_3 {
   private static String[] extends_;
   private static byte[] native_;
   private static short[] volatile_;
   private static float[] final_;
   private static int[] package_;

   public rrwL_2() {
      super("Clear World", "online8.clearworld.pw", ColorHelper.class_(-13172970, 0.7F), "Favorites");
      this.class_(LocalDateTime.of(2025, 7, 27, 11, 59, 59));
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -622746575;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2394650579751496616L;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-54, 80, 118, 16, -23, -44, -82, -74}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void extends_() {
      native_ = new byte[]{7, 27, 11, 59, 59};
   }

   private static void case_() {
      package_ = new int[]{-13172970};
   }

   private static void final_() {
      volatile_ = new short[]{2025};
   }

   private static void volatile_() {
      final_ = new float[]{0.7F};
   }

   private static void native_() {
      extends_ = new String[]{new String("Clear World"), new String("online8.clearworld.pw"), new String("Favorites")};
   }
}
