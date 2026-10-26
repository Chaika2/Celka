package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Em_1 {
   private static byte[] id_break;
   public Object[] id_class;

   public Em_1() {
      this.id_break();
   }

   static {
      ntfClinit();
   }

   private static void id_class() {
      id_break = new byte[]{2};
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5305135489751669937L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-66, -11, 71, 20, -120, 93, 82, 121}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1359000322;
   }

   private void id_break() {
      if (this.id_class == null) {
         this.id_class = new Object[id_break[0]];
         Object[] var1 = this.id_class;
      }
   }
}
