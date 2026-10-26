package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrmS_2 implements rruq_1 {
   private static String[] class_;
   private static short[] break_;
   private static boolean[] byte_;

   private static void byte_() {
      byte_ = new boolean[1];
   }

   rrmS_2() {
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2290376396974475298L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -424119267;
   }

   private static void class_() {
      break_ = new short[1];
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-86, -71, 40, -115, -26, -1, 103, -35}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void class_(C_static var1) throws x_1 {
      String[] var2 = var1.class_(",");
      if (var2 != null && var2.length != 0) {
         for (String var6 : var2) {
            var6 = var6.replaceAll("\"", "");
            ((rryd_1)rryd_1.staticFields78f62b0b61073300aba99f31bcf5126e[0]).break_(var6);
         }
      } else {
         throw new k_1("Не указаны имена для удаления");
      }
   }

   private static void break_() {
      class_ = new String[]{new String(","), new String("Не указаны имена для удаления"), new String("\""), new String("")};
   }
}
