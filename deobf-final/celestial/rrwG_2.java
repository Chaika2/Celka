package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrwG_2 {
   private static byte[] class_;
   private static boolean[] break_;

   private rrwG_2() {
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1666198226;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6749140944714093391L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-101, 58, -75, 9, 39, 84, 60, -39}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static float class_(float var0, int var1) {
      return var1 <= 1 ? var0 : (float)Math.round(var0 / (float)var1) * (float)var1;
   }

   private static void class_() {
      class_ = new byte[]{5};
   }

   public static float class_(float var0) {
      return class_(var0, 5);
   }

   private static void break_() {
      break_ = new boolean[]{true};
   }
}
