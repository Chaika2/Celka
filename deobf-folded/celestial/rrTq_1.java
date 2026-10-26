package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrTq_1 {
   private static byte[] id_break;
   private static short[] id_byte;
   public Object[] id_class;

   private static void id_byte() {
      id_byte = new short[]{0, 1, 0, 1};
   }

   public rrTq_1(rjG_2 var1, PX var2) {
      this.id_throws();
      this.id_class[id_byte[2]] = var1;
      this.id_class[1] = var2;
   }

   static {
      ntfClinit();
   }

   public rjG_2 id_class() {
      return (rjG_2)this.id_class[id_byte[0]];
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -488229195;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -306860869783657544L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-120, 104, -52, -83, -59, 119, 91, 5}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public PX id_break() {
      return (PX)this.id_class[1];
   }

   private void id_throws() {
      if (this.id_class == null) {
         this.id_class = new Object[2];
         Object[] var1 = this.id_class;
      }
   }

   private static void id_protected() {
      id_break = new byte[]{2};
   }
}
