package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrIg_1 extends rrIV {
   private static boolean[] class_;
   private static String[] break_;

   public rrIg_1() {
      super("module_disable");
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1645832827378569980L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1290009092;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-101, -85, -88, 22, 13, -116, -83, -119}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void package_() {
      break_ = new String[]{new String("module_disable"), new String("module.disable")};
   }

   private static void final_() {
      class_ = new boolean[1];
   }

   @Override
   public NY volatile_() {
      return new NY(this, false, "module.disable");
   }
}
