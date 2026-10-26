package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrnh_3 {
   private static boolean[] id_byte;
   public Object[] id_class;
   public static Object[] id_break;
   private static short[] id_protected;

   private void id_byte() {
      if (this.id_class == null) {
         this.id_class = new Object[id_byte[1]];
         Object[] var1 = this.id_class;
      }
   }

   public rrnh_3() {
      this.id_byte();
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-16, -33, -49, 89, 93, 69, -23, -56}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static rrnh_3 id_class(rrnX_2 var0) {
      ((rrnh_3)id_break[id_protected[0]]).id_class[id_protected[1]] = var0;
      return (rrnh_3)id_break[id_protected[2]];
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1022665509;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1398239902212735539L;
   }

   public rrnX_2 id_class() {
      return (rrnX_2)this.id_class[id_protected[3]];
   }

   private static void id_break() {
      id_protected = new short[4];
   }

   private static void id_throws() {
      id_byte = new boolean[]{false, true, true};
   }

   private static void id_protected() {
      Object[] var0 = new Object[]{new rrnh_3()};
      id_break = var0;
   }
}
