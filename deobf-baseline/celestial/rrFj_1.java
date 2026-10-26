package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrFj_1 extends Om_1 {
   public Object[] id_class;
   private static short[] id_byte;
   public static Object[] id_break;
   private static boolean[] id_protected;

   public rrFj_1() {
      this.id_break();
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -2082915430;
   }

   public static rrFj_1 id_class(an_3 var0) {
      ((rrFj_1)id_break[id_byte[0]]).id_class[id_byte[1]] = var0;
      ((rrFj_1)id_break[id_byte[2]]).id_class(id_protected[0]);
      return (rrFj_1)id_break[id_byte[3]];
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-47, -61, 64, 103, -16, -38, -124, -69}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public an_3 id_class() {
      this.id_break();
      return (an_3)this.id_class[id_byte[4]];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7438931810033428696L;
   }

   private void id_break() {
      if (this.id_class == null) {
         this.id_class = new Object[id_protected[2]];
         Object[] var1 = this.id_class;
      }
   }

   private static void id_throws() {
      id_byte = new short[5];
   }

   private static void id_case() {
      id_protected = new boolean[]{false, false, true, true};
   }

   private static void id_protected() {
      Object[] var0 = new Object[]{new rrFj_1()};
      id_break = var0;
   }
}
