package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class A {
   private static byte[] id_break;
   private static short[] id_byte;
   public Object[] id_class;

   private void id_byte() {
      if (this.id_class == null) {
         this.id_class = new Object[2];
         Object[] var1 = this.id_class;
      }
   }

   public A(rfH_2 var1, n_1 var2) {
      this.id_byte();
      this.id_class[0] = var1;
      this.id_class[1] = var2;
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6628453180106662785L;
   }

   public n_1 id_class() {
      return (n_1)this.id_class[1];
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{117, -119, 45, 30, -92, -88, -36, 0}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -2127703565;
   }

   public rfH_2 id_break() {
      return (rfH_2)this.id_class[0];
   }

   private static void id_throws() {
      id_break = new byte[]{2};
   }

   private static void id_protected() {
      id_byte = new short[]{0, 1, 0, 1};
   }
}
