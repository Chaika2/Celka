package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrmy_3 implements rruq_1 {
   private static short[] class_;
   private static boolean[] break_;
   private static String[] byte_;

   private static void byte_() {
      byte_ = new String[]{new String(","), new String("Не указаны префиксы для добавления"), new String("\""), new String("")};
   }

   rrmy_3() {
   }

   static {
      ntfClinit();
   }

   private static void class_() {
      break_ = new boolean[]{false, true, true};
   }

   @Override
   public void class_(C_static var1) throws x_1 {
      String[] var2 = var1.class_(",");
      if (var2 != null && var2.length != 0) {
         for (String var6 : var2) {
            var6 = var6.replaceAll("\"", "");
            ((rrqX_2)rrqX_2.staticFields25cb0eac93bd35f999c477f8effd8890[0]).class_(var6, true, true);
         }
      } else {
         throw new k_1("Не указаны префиксы для добавления");
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6195638612621484609L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{127, 78, -109, 47, -5, -105, -96, -86}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -29707565;
   }

   private static void break_() {
      class_ = new short[1];
   }
}
