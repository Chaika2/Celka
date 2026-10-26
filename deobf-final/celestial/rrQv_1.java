package celestial;

import java.nio.charset.StandardCharsets;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrQv_1 {
   private static String[] break_;
   @Nullable
   public String class_ = "";

   static {
      ntfClinit();
   }

   private static void class_() {
      break_ = new String[]{new String("")};
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2015225998529834498L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{44, 125, 43, -32, -83, -91, 45, -112}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1735113916;
   }
}
