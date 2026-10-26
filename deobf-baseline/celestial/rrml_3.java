package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrml_3 implements rruq_1 {
   private static boolean[] id_class;
   private static String[] id_break;
   private static short[] id_byte;

   private static void id_byte() {
      id_break = new String[]{new String(","), new String("Не указаны имена для удаления"), new String("\""), new String("")};
   }

   rrml_3() {
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 510048318;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-106, -43, 49, 1, 73, -55, -105, -113}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8936065989880581464L;
   }

   private static void id_class() {
      id_class = new boolean[1];
   }

   @Override
   public void id_class(C_static var1) throws x_1 {
      String[] var2 = var1.id_class(id_break[0]);
      if (var2 != null && var2.length != 0) {
         String[] var3 = var2;
         int var4 = var2.length;

         for (int var5 = id_class[0]; var5 < var4; var5++) {
            String var6 = var3[var5];
            var6 = var6.replaceAll(id_break[2], id_break[3]);
            ((rrqM_2)rrqM_2.staticFields360b36d126ee3c45b942181ce786df43[id_byte[0]]).id_byte(var6);
         }
      } else {
         throw new k_1(id_break[1]);
      }
   }

   private static void id_break() {
      id_byte = new short[1];
   }
}
