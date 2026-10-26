package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrIR extends rrIV {
   private static String[] class_;
   private static boolean[] break_;

   public rrIR() {
      super("module_enable");
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 2014699657;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5641779140616676631L;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-124, -22, 121, 31, -26, 126, -80, 57}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void package_() {
      break_ = new boolean[1];
   }

   private static void final_() {
      class_ = new String[]{new String("module_enable"), new String("module.enable")};
   }

   @Override
   public NY volatile_() {
      return new NY(this, false, "module.enable");
   }
}
