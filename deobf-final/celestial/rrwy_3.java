package celestial;

import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrwy_3 extends rrwp_3 {
   private static short[] extends_;
   private static String[] native_;
   private static int[] volatile_;
   private static byte[] final_;
   private static boolean[] package_;

   public rrwy_3() {
      super("Snow HVH", "mc.snowhvh.ru", -8553091, "Favorites");
      this.class_(LocalDateTime.of(2025, 1, 31, 11, 59, 59));
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7549085873665102376L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 167797137;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-68, 3, -69, -13, 71, 77, 98, -7}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void extends_() {
      extends_ = new short[]{2025};
   }

   private static void case_() {
      final_ = new byte[]{31, 11, 59, 59};
   }

   private static void final_() {
      package_ = new boolean[]{true};
   }

   private static void volatile_() {
      native_ = new String[]{new String("Snow HVH"), new String("mc.snowhvh.ru"), new String("Favorites")};
   }

   private static void native_() {
      volatile_ = new int[]{-8553091};
   }
}
