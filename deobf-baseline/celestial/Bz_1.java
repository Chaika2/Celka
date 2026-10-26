package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Bz_1 {
   private static short[] id_break;
   public Object[] id_class;
   private static byte[] id_byte;

   private static void id_byte() {
      id_break = new short[]{0, 1};
   }

   public Bz_1(BQ var1, BW var2) {
      this.id_break();
      this.id_class[id_break[0]] = var1;
      this.id_class[id_break[1]] = var2;
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1523309822;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 200946690802184880L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-36, -8, 56, -108, -97, 80, -40, -66}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_class() {
      id_byte = new byte[]{2};
   }

   private void id_break() {
      if (this.id_class == null) {
         this.id_class = new Object[id_byte[0]];
         Object[] var1 = this.id_class;
      }
   }
}
