package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class f_1 extends R {
   private static short[] id_byte;
   private static byte[] id_protected;
   public Object[] id_class;

   public f_1(String var1) {
      this.id_protected();
      this.id_class[id_byte[0]] = var1;
      Object var7 = null;
      this.id_class[id_byte[1]] = var7;
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4924605411104381072L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{28, 21, 39, 87, -16, 78, -38, -42}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_class() {
      id_byte = new short[]{0, 1};
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -2035665303;
   }

   private static void id_throws() {
      id_protected = new byte[]{2};
   }

   private void id_protected() {
      if (this.id_class == null) {
         this.id_class = new Object[id_protected[0]];
         Object[] var1 = this.id_class;
      }
   }
}
