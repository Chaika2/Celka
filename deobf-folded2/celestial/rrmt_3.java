package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrmt_3 implements rruq_1 {
   private static String[] id_class;
   private static short[] id_break;
   private static boolean[] id_byte;

   private static void id_byte() {
      id_class = new String[]{new String(","), new String("Не указаны префиксы для удаления"), new String("\""), new String("")};
   }

   rrmt_3() {
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2903006629364227115L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1085594853;
   }

   private static void id_class() {
      id_byte = new boolean[1];
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-6, 116, 61, 37, 40, -63, 121, 1}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void id_class(C_static var1) throws x_1 {
      String[] var2 = var1.id_class(",");
      if (var2 != null && var2.length != 0) {
         for (String var6 : var2) {
            var6 = var6.replaceAll("\"", "");
            ((rrqX_2)rrqX_2.staticFields25cb0eac93bd35f999c477f8effd8890[0]).id_protected(var6);
         }
      } else {
         throw new k_1("Не указаны префиксы для удаления");
      }
   }

   private static void id_break() {
      id_break = new short[1];
   }
}
