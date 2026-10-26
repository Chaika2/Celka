package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrFf_1 {
   private static short[] id_byte;
   private static boolean[] id_protected;
   public Object[] id_class;
   public static Object[] id_break;

   private static void id_byte() {
      id_byte = new short[4];
   }

   public rrFf_1() {
      this.id_throws();
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6693220252548622462L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 579351278;
   }

   public static rrFf_1 id_class(an_3 var0) {
      ((rrFf_1)id_break[0]).id_class[0] = var0;
      return (rrFf_1)id_break[0];
   }

   public an_3 id_class() {
      return (an_3)this.id_class[0];
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{91, -112, -73, 26, 107, -15, 59, 18}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_break() {
      id_protected = new boolean[]{false, true, true};
   }

   private void id_throws() {
      if (this.id_class == null) {
         this.id_class = new Object[1];
         Object[] var1 = this.id_class;
      }
   }

   private static void id_protected() {
      Object[] var0 = new Object[]{new rrFf_1()};
      id_break = var0;
   }
}
