package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rruQ {
   private static byte[] id_break;
   public Object[] id_class;
   private static short[] id_byte;

   public rruN id_byte() {
      return (rruN)this.id_class[2];
   }

   public rruQ(rVi_1 var1, rruN var2) {
      this(var1, null, var2);
   }

   public rruQ(rVi_1 var1, rVi_1 var2, rruN var3) {
      this.id_throws();
      this.id_class[0] = var1;
      this.id_class[1] = var2;
      this.id_class[2] = var3;
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{123, -3, -2, 81, -103, 34, 86, 0}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1137903977;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8934430967774506953L;
   }

   public rVi_1 id_class() {
      return (rVi_1)this.id_class[0];
   }

   public rVi_1 id_break() {
      return (rVi_1)this.id_class[1];
   }

   private void id_throws() {
      if (this.id_class == null) {
         this.id_class = new Object[3];
         Object[] var1 = this.id_class;
      }
   }

   private static void id_case() {
      id_break = new byte[]{3};
   }

   private static void id_protected() {
      id_byte = new short[]{0, 1, 2, 0, 1, 2};
   }
}
