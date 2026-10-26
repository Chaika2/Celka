package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLA {
   public static Object[] id_class;
   private static short[] id_byte;
   public Object[] id_break;
   private static boolean[] id_protected;

   private void id_byte() {
      if (this.id_break == null) {
         this.id_break = new Object[1];
         Object[] var1 = this.id_break;
      }
   }

   public rrLA() {
      this.id_byte();
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3277370369415420883L;
   }

   public rvs_3 id_class() {
      return (rvs_3)this.id_break[0];
   }

   public static rrLA id_class(rvs_3 var0) {
      ((rrLA)id_class[0]).id_break[0] = var0;
      return (rrLA)id_class[0];
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{86, 59, 83, -37, 103, -80, -46, 119}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -835979244;
   }

   private static void id_break() {
      id_byte = new short[4];
   }

   private static void id_throws() {
      Object[] var0 = new Object[]{new rrLA()};
      id_class = var0;
   }

   private static void id_protected() {
      id_protected = new boolean[]{false, true, true};
   }
}
