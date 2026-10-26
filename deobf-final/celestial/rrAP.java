package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public non-sealed class rrAP extends rrLi_1 {
   private static boolean[] break_;
   public static Object[] class_;

   private static void byte_() {
      break_ = new boolean[]{false, true};
   }

   private rrAP() {
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8114015763349972422L;
   }

   private static int break_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 342189048;
   }

   private static void break_() {
      Object[] var0 = new Object[]{new rrAP()};
      class_ = var0;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-104, -76, -97, 119, 61, -91, 96, -115}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }
}
