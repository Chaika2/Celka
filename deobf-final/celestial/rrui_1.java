package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrui_1 implements rruq_1 {
   private static short[] class_;
   private static boolean[] break_;
   private static String[] byte_;

   private static void byte_() {
      break_ = new boolean[]{true, true};
   }

   rrui_1() {
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1865739026711042628L;
   }

   @Override
   public void class_(C_static var1) throws x_1 {
      String var2 = var1.extends_().replaceAll(",", "");
      String[] var3 = var1.class_(" ");
      String var4 = var3.length == 0 ? null : String.join(byte_[3], var3);
      ((rryd_1)rryd_1.staticFields78f62b0b61073300aba99f31bcf5126e[0]).class_(var2, var4, true, true);
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-72, 123, 121, -4, 15, -13, 49, -6}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void class_() {
      class_ = new short[1];
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 824596304;
   }

   private static void break_() {
      byte_ = new String[]{new String(","), new String(""), new String(" "), new String(" ")};
   }
}
