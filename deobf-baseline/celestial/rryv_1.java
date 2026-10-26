package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class rryv_1 {
   private static short[] id_class;
   private static boolean[] id_break;

   public boolean id_byte() {
      return this.id_class() == (rryF)rryF.staticFieldsfd087588ab503ef5ba48903746a1e506[id_class[2]] ? id_break[4] : id_break[5];
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8562890644460602199L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1630636971;
   }

   public abstract rryF id_class();

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-102, -94, 69, -113, -107, -72, -5, -14}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_break() {
      id_class = new short[]{0, 1, 2};
   }

   public boolean id_throws() {
      return this.id_class() == (rryF)rryF.staticFieldsfd087588ab503ef5ba48903746a1e506[id_class[1]] ? id_break[2] : id_break[3];
   }

   private static void id_case() {
      id_break = new boolean[]{true, false, true, false, true, false};
   }

   public boolean id_protected() {
      return this.id_class() == (rryF)rryF.staticFieldsfd087588ab503ef5ba48903746a1e506[id_class[0]] ? id_break[0] : id_break[1];
   }
}
