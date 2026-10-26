package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Sp_1 {
   public Object[] id_class;
   private static short[] id_break;
   private static byte[] id_byte;

   private static void id_byte() {
      id_byte = new byte[]{2};
   }

   public Sp_1(Sy_1 var1, rdn_3 var2, Sq_1 var3) {
      this.id_throws();
      this.id_class[0] = var2;
      this.id_class[1] = var3;
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1672184664;
   }

   public rdn_3 id_class() {
      return (rdn_3)this.id_class[0];
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-72, -70, -128, 31, 74, 58, 5, -38}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3510191025344882357L;
   }

   public Sq_1 id_break() {
      return (Sq_1)this.id_class[1];
   }

   private void id_throws() {
      if (this.id_class == null) {
         this.id_class = new Object[2];
         Object[] var1 = this.id_class;
      }
   }

   private static void id_protected() {
      id_break = new short[]{0, 1, 0, 1};
   }
}
