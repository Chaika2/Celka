package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class T {
   private static byte[] id_break;
   public Object[] id_class;
   private static short[] id_byte;
   private static boolean[] id_protected;
   private static float[] id_throws;

   public Ml_1 id_byte() {
      return (Ml_1)this.id_class[2];
   }

   public T(float var1, Ml_1 var2, rjV_2 var3) {
      this.id_case();
      Float var8 = var1;
      this.id_class[id_byte[0]] = var8;
      this.id_class[2] = var2;
      this.id_class[1] = var3;
   }

   static {
      ntfClinit();
   }

   public rjV_2 id_class() {
      return (rjV_2)this.id_class[1];
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1350712839;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1104475345115424592L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-40, 104, -124, 18, 108, -75, 38, 126}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public float id_break() {
      return (Float)this.id_class[id_byte[3]];
   }

   private static void id_throws() {
      id_break = new byte[]{3};
   }

   private static void id_catch() {
      id_protected = new boolean[1];
   }

   private void id_case() {
      if (this.id_class == null) {
         this.id_class = new Object[3];
         Object[] var1 = this.id_class;
         var1[id_protected[0]] = id_throws[0];
      }
   }

   private static void id_protected() {
      id_throws = new float[1];
   }

   private static void id_private() {
      id_byte = new short[]{0, 2, 1, 0, 2, 1};
   }
}
