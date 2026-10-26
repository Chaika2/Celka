package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAt_1 extends Om_1 {
   private static short[] id_byte;
   public static Object[] id_class;
   private static boolean[] id_protected;
   public Object[] id_break;

   public rrAt_1() {
      this.id_throws();
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1370175136;
   }

   public rrAw_1 id_class() {
      this.id_throws();
      return (rrAw_1)this.id_break[id_byte[4]];
   }

   public static rrAt_1 id_class(rrAw_1 var0) {
      ((rrAt_1)id_class[id_byte[0]]).id_break[id_byte[1]] = var0;
      ((rrAt_1)id_class[id_byte[2]]).id_class(id_protected[0]);
      return (rrAt_1)id_class[id_byte[3]];
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{55, 29, -68, 76, 40, 76, -51, 17}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7643682723211374362L;
   }

   private static void id_break() {
      Object[] var0 = new Object[]{new rrAt_1()};
      id_class = var0;
   }

   private void id_throws() {
      if (this.id_break == null) {
         this.id_break = new Object[1];
         Object[] var1 = this.id_break;
      }
   }

   private static void id_case() {
      id_protected = new boolean[]{false, false, true, true};
   }

   private static void id_protected() {
      id_byte = new short[5];
   }
}
