package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrnm_3 {
   private static boolean[] id_byte;
   private static short[] id_protected;
   public Object[] id_class;
   public static Object[] id_break;

   private void id_byte() {
      if (this.id_class == null) {
         this.id_class = new Object[id_byte[1]];
         Object[] var1 = this.id_class;
      }
   }

   public rrnm_3() {
      this.id_byte();
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 2080035464;
   }

   public rYB id_class() {
      return (rYB)this.id_class[id_protected[3]];
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{75, -45, 95, -88, -14, 72, 91, -114}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1450420192883156000L;
   }

   public static rrnm_3 id_class(rYB var0) {
      ((rrnm_3)id_break[id_protected[0]]).id_class[id_protected[1]] = var0;
      return (rrnm_3)id_break[id_protected[2]];
   }

   private static void id_break() {
      id_protected = new short[4];
   }

   private static void id_throws() {
      Object[] var0 = new Object[]{new rrnm_3()};
      id_break = var0;
   }

   private static void id_protected() {
      id_byte = new boolean[]{false, true, true};
   }
}
