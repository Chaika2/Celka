package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrli_3 extends rrTF<GuiMove> {
   private static boolean[] class_;

   public rrli_3(GuiMove var1) {
      super(var1);
   }

   static {
      ntfClinit();
   }

   public boolean class_(vm_3 var1) {
      return false;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8495448147456392041L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-85, -11, -123, 1, -88, 102, -94, 14}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 330579518;
   }

   private static void class_() {
      class_ = new boolean[1];
   }
}
