package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrFw_1 {
   public static Object[] id_class;
   private static boolean[] id_byte;
   public Object[] id_break;
   private static short[] id_protected;

   private static void id_byte() {
      id_byte = new boolean[]{false, true, true};
   }

   public rrFw_1() {
      this.id_throws();
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{35, 88, -52, 33, -117, -39, 15, 122}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static rrFw_1 id_class(rrFI var0) {
      ((rrFw_1)id_class[id_protected[0]]).id_break[id_protected[1]] = var0;
      return (rrFw_1)id_class[id_protected[2]];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6336741881751549576L;
   }

   public rrFI id_class() {
      return (rrFI)this.id_break[id_protected[3]];
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1157784608;
   }

   private static void id_break() {
      id_protected = new short[4];
   }

   private void id_throws() {
      if (this.id_break == null) {
         this.id_break = new Object[id_byte[1]];
         Object[] var1 = this.id_break;
      }
   }

   private static void id_protected() {
      Object[] var0 = new Object[]{new rrFw_1()};
      id_class = var0;
   }
}
