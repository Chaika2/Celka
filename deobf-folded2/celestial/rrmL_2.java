package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrmL_2 implements rruq_1 {
   private static short[] id_class;
   private static boolean[] id_break;
   private static String[] id_byte;

   private static void id_byte() {
      id_byte = new String[]{new String(","), new String("Не указаны имена для добавления"), new String("\""), new String("")};
   }

   rrmL_2() {
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-99, -101, 34, -60, -7, -97, 88, 112}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 930052924159890804L;
   }

   @Override
   public void id_class(C_static var1) throws x_1 {
      String[] var2 = var1.id_class(",");
      if (var2 != null && var2.length != 0) {
         for (String var6 : var2) {
            var6 = var6.replaceAll("\"", "");
            ((rrqM_2)rrqM_2.staticFields360b36d126ee3c45b942181ce786df43[0]).id_class(var6, true, true);
         }
      } else {
         throw new k_1("Не указаны имена для добавления");
      }
   }

   private static void id_class() {
      id_class = new short[1];
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -342187099;
   }

   private static void id_break() {
      id_break = new boolean[]{false, true, true};
   }
}
