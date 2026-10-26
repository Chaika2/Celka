package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rryt_1 {
   public Object[] id_class;
   private static short[] id_break;
   private static byte[] id_byte;

   private static void id_byte() {
      id_byte = new byte[]{2};
   }

   public rryt_1(String var1, rryT var2) {
      this.id_throws();
      this.id_class[id_break[2]] = var1;
      this.id_class[id_break[3]] = var2;
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-108, -34, -80, -124, 17, -95, 33, -70}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public String id_class() {
      return (String)this.id_class[id_break[0]];
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -807921594;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5015609373941110987L;
   }

   public rryT id_break() {
      return (rryT)this.id_class[id_break[1]];
   }

   private void id_throws() {
      if (this.id_class == null) {
         this.id_class = new Object[2];
      }
   }

   private static void id_protected() {
      id_break = new short[]{0, 1, 0, 1};
   }
}
