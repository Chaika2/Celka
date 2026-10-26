package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rrLq_1 {
   ;
   public static Object[] staticFields2d4389a28d3a3bcfbac26ede38e74314;
   private static String[] strings2d4389a28d3a3bcfbac26ede38e74314;
   private static short[] shorts2d4389a28d3a3bcfbac26ede38e74314;
   private static boolean[] booleans2d4389a28d3a3bcfbac26ede38e74314;
   private static byte[] bytes2d4389a28d3a3bcfbac26ede38e74314;

   private static void byte_() {
      shorts2d4389a28d3a3bcfbac26ede38e74314 = new short[]{3, 0, 1, 2};
   }

   static {
      ntfClinit();
   }

   private static void class_() {
      booleans2d4389a28d3a3bcfbac26ede38e74314 = new boolean[]{false, true, false, false, true, true};
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{68, 110, 112, 74, 46, -79, -7, 92}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 2030992301;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5824728013175333587L;
   }

   private static void break_() {
      bytes2d4389a28d3a3bcfbac26ede38e74314 = new byte[]{3, 2, 2, 2, 3, 4};
   }

   private static void throws_() {
      strings2d4389a28d3a3bcfbac26ede38e74314 = new String[]{new String("CLICK_BLOCK"), new String("DAMAGE"), new String("BROKEN")};
   }

   private static void case_() {
      Object[] var0 = new Object[]{new rrLq_1(), new rrLq_1(), new rrLq_1(), null};
      var0[3] = new rrLq_1[]{(rrLq_1)var0[0], (rrLq_1)var0[1], (rrLq_1)var0[2]};
      staticFields2d4389a28d3a3bcfbac26ede38e74314 = var0;
   }
}
