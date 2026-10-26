package celestial;

import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class SW extends Bn_1 {
   private static String[] byte_;
   private static short[] protected_;

   public SW() {
      super("Торговец", (Pattern[])BH.class_[7]);
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5859562376537785887L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -211638340;
   }

   private static void catch_() {
      byte_ = new String[]{new String("Торговец")};
   }

   public static String catch_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{120, -114, 39, 105, -36, 11, -95, 40}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void private_() {
      protected_ = new short[]{7};
   }
}
