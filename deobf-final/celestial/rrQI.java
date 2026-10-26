package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrQI {
   private static String[] break_;
   public static Object[] class_;
   private static boolean[] byte_;

   private static void byte_() {
      break_ = new String[]{new String("This is a utility class and cannot be instantiated"), new String("celestial/images/account/widgets.png")};
   }

   private rrQI() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{14, -5, 101, -115, 24, -67, 24, -18}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8511318686669828203L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1603885810;
   }

   private static void class_() {
      byte_ = new boolean[]{false, true};
   }

   private static void break_() {
      Object[] var0 = new Object[]{new rqO_2("celestial/images/account/widgets.png")};
      class_ = var0;
   }
}
