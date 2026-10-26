package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrmp_3 implements rruq_1 {
   private static short[] id_class;
   private static boolean[] id_break;

   rrmp_3() {
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -2098316988;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-49, -8, 46, -38, -1, 104, 52, -92}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1942027634057104267L;
   }

   private static void id_class() {
      id_class = new short[1];
   }

   @Override
   public void id_class(C_static var1) {
      ((rrqX_2)rrqX_2.staticFields25cb0eac93bd35f999c477f8effd8890[id_class[0]]).id_class(true);
   }

   private static void id_break() {
      id_break = new boolean[]{true};
   }
}
