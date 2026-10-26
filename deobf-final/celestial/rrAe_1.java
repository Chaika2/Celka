package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAe_1 extends Om_1 {
   public static Object[] class_;
   private static boolean[] break_;
   private static short[] byte_;

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -980017614;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-124, 111, 104, -60, 80, -10, -92, 47}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5692083173991842482L;
   }

   public static rrAe_1 class_() {
      ((rrAe_1)class_[0]).class_(false);
      return (rrAe_1)class_[0];
   }

   private static void break_() {
      break_ = new boolean[]{false, false, true};
   }

   private static void throws_() {
      Object[] var0 = new Object[]{new rrAe_1()};
      class_ = var0;
   }

   private static void protected_() {
      byte_ = new short[2];
   }
}
