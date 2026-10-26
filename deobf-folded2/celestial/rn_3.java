package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rn_3 {
   public Object[] id_class;
   private static short[] id_break;
   private static byte[] id_byte;

   private void id_byte() {
      if (this.id_class == null) {
         this.id_class = new Object[2];
         Object[] var1 = this.id_class;
      }
   }

   public rn_3(rP_2 var1, rC_2 var2) {
      this.id_byte();
      Objects.requireNonNull(var2);
      this.id_class[0] = var1;
      this.id_class[1] = var2;
   }

   static {
      ntfClinit();
   }

   @Override
   public String toString() {
      return (rC_2)this.id_class[1] + " " + (rP_2)this.id_class[0];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2136993024907811988L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-59, 12, 124, -4, -114, -56, 63, -22}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 133834271;
   }

   public rP_2 id_class() {
      return (rP_2)this.id_class[0];
   }

   public rC_2 id_break() {
      return (rC_2)this.id_class[1];
   }

   private static void id_throws() {
      id_break = new short[]{0, 1, 1, 0, 0, 1};
   }

   private static void id_protected() {
      id_byte = new byte[]{2};
   }
}
