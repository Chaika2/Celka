package celestial;

import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrwL_2 extends rrwp_3 {
   private static String[] id_extends;
   private static byte[] id_native;
   private static short[] id_volatile;
   private static float[] id_final;
   private static int[] id_package;

   public rrwL_2() {
      super("Clear World", "online8.clearworld.pw", ColorHelper.id_class(-13172970, 0.7F), "Favorites");
      this.id_class(LocalDateTime.of(2025, 7, 27, 11, 59, 59));
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -622746575;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2394650579751496616L;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-54, 80, 118, 16, -23, -44, -82, -74}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_extends() {
      id_native = new byte[]{7, 27, 11, 59, 59};
   }

   private static void id_case() {
      id_package = new int[]{-13172970};
   }

   private static void id_final() {
      id_volatile = new short[]{2025};
   }

   private static void id_volatile() {
      id_final = new float[]{0.7F};
   }

   private static void id_native() {
      id_extends = new String[]{new String("Clear World"), new String("online8.clearworld.pw"), new String("Favorites")};
   }
}
