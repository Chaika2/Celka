package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrnu_3 {
   public Object[] id_class;
   public static Object[] id_break;
   private static boolean[] id_byte;
   private static short[] id_protected;

   private static void id_byte() {
      Object[] var0 = new Object[]{new rrnu_3()};
      id_break = var0;
   }

   public rrnu_3() {
      this.id_break();
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -625220029;
   }

   public rYB id_class() {
      return (rYB)this.id_class[id_protected[3]];
   }

   public static rrnu_3 id_class(rYB var0) {
      ((rrnu_3)id_break[id_protected[0]]).id_class[id_protected[1]] = var0;
      return (rrnu_3)id_break[id_protected[2]];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5205023889255428956L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-73, -43, 121, -33, -59, -71, -121, 0}, "DES");
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

   private static void id_throws() {
      id_byte = new boolean[]{false, true, true};
   }

   private static void id_protected() {
      id_protected = new short[4];
   }
}
