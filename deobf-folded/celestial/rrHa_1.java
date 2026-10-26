package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrHa_1 {
   public Object[] id_class;
   private static boolean[] id_break;
   private static short[] id_byte;

   private static void id_byte() {
      id_byte = new short[2];
   }

   public rrHa_1(String var1) {
      this.id_protected();
      this.id_class[id_byte[1]] = var1;
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1586687846296171822L;
   }

   public String id_class() {
      return (String)this.id_class[id_byte[0]];
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 2139129767;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-13, -97, 116, 65, 33, -118, 48, -27}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_break() {
      id_break = new boolean[]{true};
   }

   private void id_protected() {
      if (this.id_class == null) {
         this.id_class = new Object[1];
      }
   }
}
