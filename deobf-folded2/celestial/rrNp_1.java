package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrNp_1 implements rrNC {
   public Object[] id_class;
   private static short[] id_break;
   private static byte[] id_byte;

   private static void id_byte() {
      id_break = new short[]{0, 1, 0, 1};
   }

   public rrNp_1(rgP_2 var1, String var2) {
      this.id_throws();
      this.id_class[0] = var1;
      this.id_class[1] = var2;
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1341340741;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7788708698352158817L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-120, -114, 1, -64, 12, -47, -56, -94}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public rgP_2 id_class() {
      return (rgP_2)this.id_class[0];
   }

   public String id_break() {
      return (String)this.id_class[1];
   }

   private void id_throws() {
      if (this.id_class == null) {
         this.id_class = new Object[2];
         Object[] var1 = this.id_class;
      }
   }

   private static void id_protected() {
      id_byte = new byte[]{2};
   }
}
