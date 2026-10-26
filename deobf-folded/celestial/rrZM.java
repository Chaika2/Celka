package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrZM {
   private static byte[] id_break;
   private static boolean[] id_byte;
   public Object[] id_class;

   private static void id_byte() {
      id_byte = new boolean[]{false, false, true, false, false, false};
   }

   public rrZM() {
      this.id_break();
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 426697973;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3981297882929426267L;
   }

   private static void id_class() {
      id_break = new byte[]{4, 2, 3};
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-107, -74, -10, -124, 68, -101, -25, 17}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private void id_break() {
      if (this.id_class == null) {
         this.id_class = new Object[4];
         Object[] var1 = this.id_class;
         var1[id_byte[0]] = Integer.valueOf(id_byte[1]);
         var1[1] = Integer.valueOf(id_byte[3]);
         var1[2] = Integer.valueOf(id_byte[4]);
         var1[3] = Integer.valueOf(id_byte[5]);
      }
   }
}
