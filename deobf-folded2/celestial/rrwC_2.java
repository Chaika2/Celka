package celestial;

import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrwC_2 extends rrwp_3 {
   private static boolean[] id_extends;
   private static String[] id_native;
   private static short[] id_volatile;
   private static int[] id_final;
   private static byte[] id_package;

   public rrwC_2() {
      super("Infinity HVH", "cel.infinityhvh.com", -1766445383, "Favorites");
      this.id_class(LocalDateTime.of(2025, 1, 31, 11, 59, 59));
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1450343809842854597L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1426038882;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{110, 115, 119, -48, -74, 33, 113, -109}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_extends() {
      id_volatile = new short[]{2025};
   }

   private static void id_case() {
      id_final = new int[]{-1766445383};
   }

   private static void id_final() {
      id_native = new String[]{new String("Infinity HVH"), new String("cel.infinityhvh.com"), new String("Favorites")};
   }

   private static void id_volatile() {
      id_extends = new boolean[]{true};
   }

   private static void id_native() {
      id_package = new byte[]{31, 11, 59, 59};
   }
}
