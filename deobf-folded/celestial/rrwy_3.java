package celestial;

import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrwy_3 extends rrwp_3 {
   private static short[] id_extends;
   private static String[] id_native;
   private static int[] id_volatile;
   private static byte[] id_final;
   private static boolean[] id_package;

   public rrwy_3() {
      super(id_native[0], id_native[1], -8553091, id_native[2]);
      this.id_class(LocalDateTime.of(2025, 1, 31, 11, 59, 59));
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7549085873665102376L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 167797137;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-68, 3, -69, -13, 71, 77, 98, -7}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_extends() {
      id_extends = new short[]{2025};
   }

   private static void id_case() {
      id_final = new byte[]{31, 11, 59, 59};
   }

   private static void id_final() {
      id_package = new boolean[]{true};
   }

   private static void id_volatile() {
      id_native = new String[]{new String("Snow HVH"), new String("mc.snowhvh.ru"), new String("Favorites")};
   }

   private static void id_native() {
      id_volatile = new int[]{-8553091};
   }
}
