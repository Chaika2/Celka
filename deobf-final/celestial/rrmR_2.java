package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrmR_2 implements rruq_1 {
   private static String[] class_;
   private static boolean[] break_;
   private static short[] byte_;

   private static void byte_() {
      class_ = new String[]{new String(" ")};
   }

   rrmR_2() {
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-86, 90, 113, -66, -2, 60, -29, 112}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5042298508603401248L;
   }

   @Override
   public void class_(C_static var1) throws x_1 {
      ((rrje_3)rrje_3.staticFields67a5399629443d9d93e54c2de6d74063[0]).break_(var1.break_(" "), true);
   }

   private static void class_() {
      break_ = new boolean[]{true};
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1224925130;
   }

   private static void break_() {
      byte_ = new short[1];
   }
}
