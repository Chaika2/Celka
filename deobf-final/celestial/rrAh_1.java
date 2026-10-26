package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAh_1 extends Om_1 {
   public static Object[] class_;
   private static short[] break_;
   private static boolean[] byte_;

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 239140996;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{124, 123, -18, 44, -118, 5, 55, 91}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2895470977129552283L;
   }

   public static rrAh_1 class_() {
      ((rrAh_1)class_[0]).class_(false);
      return (rrAh_1)class_[0];
   }

   private static void break_() {
      byte_ = new boolean[]{false, false, true};
   }

   private static void throws_() {
      Object[] var0 = new Object[]{new rrAh_1()};
      class_ = var0;
   }

   private static void protected_() {
      break_ = new short[2];
   }
}
