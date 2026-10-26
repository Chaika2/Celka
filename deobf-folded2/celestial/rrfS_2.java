package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrfS_2 {
   private static byte[] id_break;
   private static short[] id_byte;
   public Object[] id_class;

   public ix_3 id_byte() {
      return (ix_3)this.id_class[1];
   }

   public rrfS_2(iJ_2 var1, ix_3 var2, rXQ var3) {
      this.id_throws();
      this.id_class[0] = var1;
      this.id_class[1] = var2;
      this.id_class[2] = var3;
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -404939415;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1271405695164780069L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-9, -100, 29, 47, -25, 74, 87, 11}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public iJ_2 id_class() {
      return (iJ_2)this.id_class[0];
   }

   public rXQ id_break() {
      return (rXQ)this.id_class[2];
   }

   private void id_throws() {
      if (this.id_class == null) {
         this.id_class = new Object[3];
      }
   }

   private static void id_case() {
      id_byte = new short[]{0, 1, 2, 0, 1, 2};
   }

   private static void id_protected() {
      id_break = new byte[]{3};
   }
}
