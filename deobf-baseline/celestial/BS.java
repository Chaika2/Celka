package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class BS implements rrTj_1 {
   private static short[] id_break;
   public Object[] id_class;
   private static byte[] id_byte;

   private void id_byte() {
      if (this.id_class == null) {
         this.id_class = new Object[id_byte[0]];
         Object[] var1 = this.id_class;
      }
   }

   public BS(PX var1, boolean var2) {
      this.id_byte();
      this.id_class[id_break[0]] = var1;
      Bs_1 var8 = Bs_1.id_class(var2);
      this.id_class[id_break[1]] = var8;
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -199678177;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-85, -85, 85, 59, -118, -84, 56, -74}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_class() {
      id_break = new short[]{0, 1};
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1263594501483820673L;
   }

   private static void id_break() {
      id_byte = new byte[]{2};
   }
}
