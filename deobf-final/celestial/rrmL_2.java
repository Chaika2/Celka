package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrmL_2 implements rruq_1 {
   private static short[] class_;
   private static boolean[] break_;
   private static String[] byte_;

   private static void byte_() {
      byte_ = new String[]{new String(","), new String("Не указаны имена для добавления"), new String("\""), new String("")};
   }

   rrmL_2() {
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-99, -101, 34, -60, -7, -97, 88, 112}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 930052924159890804L;
   }

   @Override
   public void class_(C_static var1) throws x_1 {
      String[] var2 = var1.class_(",");
      if (var2 != null && var2.length != 0) {
         for (String var6 : var2) {
            var6 = var6.replaceAll("\"", "");
            ((rrqM_2)rrqM_2.staticFields360b36d126ee3c45b942181ce786df43[0]).class_(var6, true, true);
         }
      } else {
         throw new k_1("Не указаны имена для добавления");
      }
   }

   private static void class_() {
      class_ = new short[1];
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -342187099;
   }

   private static void break_() {
      break_ = new boolean[]{false, true, true};
   }
}
