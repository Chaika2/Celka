package celestial;

import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrwC_2 extends rrwp_3 {
   private static boolean[] extends_;
   private static String[] native_;
   private static short[] volatile_;
   private static int[] final_;
   private static byte[] package_;

   public rrwC_2() {
      super("Infinity HVH", "cel.infinityhvh.com", -1766445383, "Favorites");
      this.class_(LocalDateTime.of(2025, 1, 31, 11, 59, 59));
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1450343809842854597L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1426038882;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{110, 115, 119, -48, -74, 33, 113, -109}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void extends_() {
      volatile_ = new short[]{2025};
   }

   private static void case_() {
      final_ = new int[]{-1766445383};
   }

   private static void final_() {
      native_ = new String[]{new String("Infinity HVH"), new String("cel.infinityhvh.com"), new String("Favorites")};
   }

   private static void volatile_() {
      extends_ = new boolean[]{true};
   }

   private static void native_() {
      package_ = new byte[]{31, 11, 59, 59};
   }
}
