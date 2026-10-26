package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrnW_2 {
   private static short[] id_break;
   public Object[] id_class;
   private static byte[] id_byte;

   public rfj_3 id_byte() {
      return (rfj_3)this.id_class[3];
   }

   public rrnW_2(rfH_2 var1, xc_3 var2, xd_3 var3, rfj_3 var4) {
      this.id_catch();
      this.id_class[0] = var1;
      this.id_class[1] = var2;
      this.id_class[2] = var3;
      this.id_class[3] = var4;
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1367470401;
   }

   public xd_3 id_class() {
      return (xd_3)this.id_class[2];
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-51, -44, -17, -42, 3, -11, 38, 114}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -425039585215094776L;
   }

   public rfH_2 id_break() {
      return (rfH_2)this.id_class[0];
   }

   private static void id_throws() {
      id_byte = new byte[]{4};
   }

   private void id_catch() {
      if (this.id_class == null) {
         this.id_class = new Object[4];
         Object[] var1 = this.id_class;
      }
   }

   private static void id_case() {
      id_break = new short[]{0, 1, 2, 3, 0, 1, 2, 3};
   }

   public xc_3 id_protected() {
      return (xc_3)this.id_class[1];
   }
}
