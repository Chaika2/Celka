package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrwh_3 {
   private static boolean[] id_break;
   private static float[] id_byte;
   private static byte[] id_protected;
   public Object[] id_class;

   private static void id_byte() {
      id_byte = new float[2];
   }

   public rrwh_3() {
      this.id_class();
   }

   static {
      ntfClinit();
   }

   private void id_class() {
      if (this.id_class == null) {
         this.id_class = new Object[6];
         Object[] var1 = this.id_class;
         var1[id_break[0]] = id_byte[0];
         var1[1] = id_byte[1];
         var1[2] = id_break[2];
         var1[3] = id_break[3];
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 900716173;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2877255649525667875L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-126, -7, 79, -100, 59, 55, -7, -98}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_break() {
      id_protected = new byte[]{6, 2, 3};
   }

   private static void id_protected() {
      id_break = new boolean[]{false, true, false, false};
   }
}
