package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrZd_1 {
   private static short[] id_break;
   private static byte[] id_byte;
   public Object[] id_class;
   private static boolean[] id_protected;

   private static void id_byte() {
      id_break = new short[]{0, 1, 0, 1};
   }

   public rrZd_1(int var1, int var2) {
      this.id_throws();
      if (var1 > var2) {
         int var3 = var2;
         var2 = var1;
         var1 = var3;
      }

      Integer var8 = var1;
      this.id_class[id_break[0]] = var8;
      Integer var9 = var2;
      this.id_class[1] = var9;
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 755254210;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2278811853138035835L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-85, 35, 43, -35, 30, 28, -120, -44}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public int id_class() {
      return (Integer)this.id_class[1];
   }

   public int id_break() {
      return (Integer)this.id_class[id_break[2]];
   }

   private void id_throws() {
      if (this.id_class == null) {
         this.id_class = new Object[2];
         Object[] var1 = this.id_class;
         var1[id_protected[0]] = Integer.valueOf(id_protected[1]);
         var1[1] = Integer.valueOf(id_protected[3]);
      }
   }

   private static void id_case() {
      id_byte = new byte[]{2};
   }

   private static void id_protected() {
      id_protected = new boolean[]{false, false, true, false};
   }
}
