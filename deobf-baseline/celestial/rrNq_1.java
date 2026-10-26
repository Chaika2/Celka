package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrNq_1 implements rrNV {
   public Object[] id_class;
   private static byte[] id_break;
   private static short[] id_byte;

   private void id_byte() {
      if (this.id_class == null) {
         this.id_class = new Object[id_break[0]];
         Object[] var1 = this.id_class;
      }
   }

   public rrNq_1(rgP_2 var1, String var2) {
      this.id_byte();
      this.id_class[id_byte[2]] = var1;
      this.id_class[id_byte[3]] = var2;
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -878013404;
   }

   @Override
   public rgP_2 id_class() {
      return (rgP_2)this.id_class[id_byte[0]];
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{58, 2, 88, -106, -54, -127, -53, 26}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 593760165159659905L;
   }

   public String id_break() {
      return (String)this.id_class[id_byte[1]];
   }

   private static void id_throws() {
      id_byte = new short[]{0, 1, 0, 1};
   }

   private static void id_protected() {
      id_break = new byte[]{2};
   }
}
