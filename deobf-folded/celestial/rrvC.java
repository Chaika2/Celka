package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrvC {
   private static short[] id_break;
   private static byte[] id_byte;
   public Object[] id_class;

   private static void id_byte() {
      id_break = new short[]{0, 1, 0, 1, 0, 1};
   }

   public rrvC(rruQ var1) {
      this.id_throws();
      rruv_1 var6 = (rruv_1)rruv_1.id_class[id_break[0]];
      this.id_class[1] = var6;
      this.id_class[id_break[2]] = var1;
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1449623099;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-20, -98, -1, -114, -127, -87, -106, 12}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8921968586672149208L;
   }

   public void id_class(rruv_1 var1) {
      this.id_class[1] = var1;
   }

   public rruv_1 id_class() {
      return (rruv_1)this.id_class[1];
   }

   public rruQ id_break() {
      return (rruQ)this.id_class[id_break[4]];
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
