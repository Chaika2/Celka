package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrHt_1 {
   private static float[] id_break;
   private static boolean[] id_byte;
   private static short[] id_protected;
   private static byte[] id_throws;
   public Object[] id_class;

   private static void id_byte() {
      id_protected = new short[]{0, 1, 0, 1};
   }

   public rrHt_1(String var1, float var2) {
      this.id_catch();
      this.id_class[id_protected[2]] = var1;
      Float var8 = var2;
      this.id_class[1] = var8;
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1152078501;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{123, -99, 100, -41, 33, 57, -49, 122}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5724485317022293573L;
   }

   public float id_class() {
      return (Float)this.id_class[1];
   }

   public String id_break() {
      return (String)this.id_class[id_protected[0]];
   }

   private static void id_throws() {
      id_byte = new boolean[]{true};
   }

   private void id_catch() {
      if (this.id_class == null) {
         this.id_class = new Object[2];
         this.id_class[1] = 0.0F;
      }
   }

   private static void id_case() {
      id_break = new float[1];
   }

   private static void id_protected() {
      id_throws = new byte[]{2};
   }
}
