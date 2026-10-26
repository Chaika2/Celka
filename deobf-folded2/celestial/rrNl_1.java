package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrNl_1 implements rrNV {
   private static boolean[] id_break;
   private static short[] id_byte;
   public Object[] id_class;

   private static void id_byte() {
      id_break = new boolean[]{true};
   }

   public rrNl_1(rgP_2 var1) {
      this.id_break();
      this.id_class[0] = var1;
   }

   static {
      ntfClinit();
   }

   @Override
   public rgP_2 id_class() {
      return (rgP_2)this.id_class[0];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6528012819038651152L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1904208332;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-51, -111, -42, -96, 102, -12, -51, -99}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private void id_break() {
      if (this.id_class == null) {
         this.id_class = new Object[1];
         Object[] var1 = this.id_class;
      }
   }

   private static void id_protected() {
      id_byte = new short[2];
   }
}
