package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Pv_1 implements C_native {
   private static byte[] id_break;
   public Object[] id_class;
   private static short[] id_byte;

   private static void id_byte() {
      id_byte = new short[]{0, 1};
   }

   public Pv_1(C_class var1) {
      this.id_break();
      this.id_class[id_byte[0]] = var1;
      Ps_1 var7 = var1.id_throw();
      this.id_class[1] = var7;
      var1.id_break(this);
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-92, 37, 1, 90, 103, 120, -122, 72}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2286592272953112526L;
   }

   private static void id_class() {
      id_break = new byte[]{2};
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1893602366;
   }

   private void id_break() {
      if (this.id_class == null) {
         this.id_class = new Object[2];
         Object[] var1 = this.id_class;
      }
   }
}
