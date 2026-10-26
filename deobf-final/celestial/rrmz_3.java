package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrmz_3 implements rruq_1 {
   private static short[] class_;
   private static boolean[] break_;

   rrmz_3() {
   }

   static {
      ntfClinit();
   }

   private static void class_() {
      class_ = new short[1];
   }

   @Override
   public void class_(C_static var1) throws x_1 {
      String var2 = var1.extends_();
      ((rrHE)rrHE.staticFieldsba1f59fc216a32d3a8f1aabb25cf0fd2[0]).class_(ri_3.class_(var2), var2, true);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5322903036832160501L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 484001369;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-98, 76, 100, 75, -93, 81, -42, 49}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void break_() {
      break_ = new boolean[]{true};
   }
}
