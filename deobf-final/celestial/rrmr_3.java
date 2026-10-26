package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrmr_3 implements rruq_1 {
   private static boolean[] class_;
   private static short[] break_;

   rrmr_3() {
   }

   static {
      ntfClinit();
   }

   private static void class_() {
      break_ = new short[1];
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{72, 16, -18, -110, 101, -72, -60, 8}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1970488372;
   }

   @Override
   public void class_(C_static var1) {
      ((rryd_1)rryd_1.staticFields78f62b0b61073300aba99f31bcf5126e[0]).class_(true);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 926084776444046444L;
   }

   private static void break_() {
      class_ = new boolean[]{true};
   }
}
