package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class QK implements AutoCloseable {
   private static short[] id_break;
   public Object[] id_class;
   private static byte[] id_byte;

   public rrGP id_byte() {
      return (rrGP)this.id_class[id_break[5]];
   }

   QK(rAt_1 var1, rAh_1 var2, rrGP var3) {
      this.id_protected();
      this.id_class[id_break[0]] = var1;
      this.id_class[id_break[1]] = var2;
      this.id_class[id_break[2]] = var3;
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-122, 15, -17, 47, -98, 44, 27, 110}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 475137055196057126L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1195950522;
   }

   public rAt_1 id_class() {
      return (rAt_1)this.id_class[id_break[3]];
   }

   @Override
   public void close() {
      ((rAt_1)this.id_class[id_break[6]]).close();
      ((rAh_1)this.id_class[id_break[7]]).close();
   }

   public rAh_1 id_break() {
      return (rAh_1)this.id_class[id_break[4]];
   }

   private static void id_throws() {
      id_break = new short[]{0, 1, 2, 0, 1, 2, 0, 1};
   }

   private static void id_case() {
      id_byte = new byte[]{3};
   }

   private void id_protected() {
      if (this.id_class == null) {
         this.id_class = new Object[3];
      }
   }
}
