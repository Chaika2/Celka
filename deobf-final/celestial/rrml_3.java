package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrml_3 implements rruq_1 {
   private static boolean[] class_;
   private static String[] break_;
   private static short[] byte_;

   private static void byte_() {
      break_ = new String[]{new String(","), new String("Не указаны имена для удаления"), new String("\""), new String("")};
   }

   rrml_3() {
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 510048318;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-106, -43, 49, 1, 73, -55, -105, -113}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8936065989880581464L;
   }

   private static void class_() {
      class_ = new boolean[1];
   }

   @Override
   public void class_(C_static var1) throws x_1 {
      String[] var2 = var1.class_(",");
      if (var2 != null && var2.length != 0) {
         for (String var6 : var2) {
            var6 = var6.replaceAll("\"", "");
            ((rrqM_2)rrqM_2.staticFields360b36d126ee3c45b942181ce786df43[0]).byte_(var6);
         }
      } else {
         throw new k_1("Не указаны имена для удаления");
      }
   }

   private static void break_() {
      byte_ = new short[1];
   }
}
