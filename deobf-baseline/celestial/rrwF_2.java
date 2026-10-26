package celestial;

import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrwF_2 extends rrwp_3 {
   private static String[] id_extends;
   private static int[] id_native;
   private static byte[] id_volatile;
   private static short[] id_final;
   private static boolean[] id_package;

   public rrwF_2() {
      super(id_extends[0], id_extends[1], id_native[0], id_extends[2]);
      this.id_class(LocalDateTime.of(id_final[0], id_package[0], id_volatile[0], id_volatile[1], id_volatile[2], id_volatile[3]));
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3735268396390359282L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1887400797;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-31, 24, -128, 27, -56, -87, -116, -51}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_extends() {
      id_native = new int[]{-61424};
   }

   private static void id_case() {
      id_final = new short[]{2025};
   }

   private static void id_final() {
      id_package = new boolean[]{true};
   }

   private static void id_volatile() {
      id_extends = new String[]{new String("Bravo HVH"), new String("celestial.bravohvh.fun"), new String("Favorites")};
   }

   private static void id_native() {
      id_volatile = new byte[]{31, 11, 59, 59};
   }
}
