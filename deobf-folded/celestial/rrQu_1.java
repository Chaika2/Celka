package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrQu_1 {
   private static short[] id_break;
   public Object[] id_class;
   private static byte[] id_byte;

   private void id_byte() {
      if (this.id_class == null) {
         this.id_class = new Object[3];
         Object[] var1 = this.id_class;
      }
   }

   public rrQu_1() {
      this.id_byte();
      rrQm_1 var5 = new rrQm_1();
      this.id_class[id_break[0]] = var5;
      rrQZ var6 = new rrQZ();
      this.id_class[1] = var6;
      rrQv_1 var7 = new rrQv_1();
      this.id_class[2] = var7;
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1633588335460725724L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1204977666;
   }

   private static void id_class() {
      id_break = new short[]{0, 1, 2};
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-88, 80, -38, 24, -31, -14, -100, -56}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_break() {
      id_byte = new byte[]{3};
   }
}
