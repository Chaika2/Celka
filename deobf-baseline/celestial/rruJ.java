package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rruJ {
   private static float[] id_break;
   public Object[] id_class;
   private static short[] id_byte;
   private static byte[] id_protected;

   private static void id_byte() {
      id_break = new float[1];
   }

   public rruJ(rruX var1, rruX var2, float var3) {
      this.id_break();
      this.id_class[id_byte[0]] = var1;
      this.id_class[id_byte[1]] = var2;
      Float var10 = var3;
      this.id_class[id_byte[2]] = var10;
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-27, -109, 1, 82, -54, -43, -109, 22}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1374025013;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7014790125095031690L;
   }

   private static void id_class() {
      id_protected = new byte[]{3, 2};
   }

   private void id_break() {
      if (this.id_class == null) {
         this.id_class = new Object[id_protected[0]];
         Object[] var1 = this.id_class;
         var1[id_protected[1]] = id_break[0];
      }
   }

   private static void id_protected() {
      id_byte = new short[]{0, 1, 2};
   }
}
