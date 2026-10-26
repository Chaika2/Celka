package celestial;

import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrwF_2 extends rrwp_3 {
   private static String[] extends_;
   private static int[] native_;
   private static byte[] volatile_;
   private static short[] final_;
   private static boolean[] package_;

   public rrwF_2() {
      super("Bravo HVH", "celestial.bravohvh.fun", -61424, "Favorites");
      this.class_(LocalDateTime.of(2025, 1, 31, 11, 59, 59));
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3735268396390359282L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1887400797;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-31, 24, -128, 27, -56, -87, -116, -51}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void extends_() {
      native_ = new int[]{-61424};
   }

   private static void case_() {
      final_ = new short[]{2025};
   }

   private static void final_() {
      package_ = new boolean[]{true};
   }

   private static void volatile_() {
      extends_ = new String[]{new String("Bravo HVH"), new String("celestial.bravohvh.fun"), new String("Favorites")};
   }

   private static void native_() {
      volatile_ = new byte[]{31, 11, 59, 59};
   }
}
