package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrmA_2 implements rruq_1 {
   private static short[] id_class;
   private static boolean[] id_break;

   rrmA_2() {
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-4, -54, 67, 27, 118, 0, 102, -104}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1761099988891328322L;
   }

   @Override
   public void id_class(C_static var1) {
      ((rrqM_2)rrqM_2.staticFields360b36d126ee3c45b942181ce786df43[0]).id_class(true);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 624656568;
   }

   private static void id_class() {
      id_class = new short[1];
   }

   private static void id_break() {
      id_break = new boolean[]{true};
   }
}
