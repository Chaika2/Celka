package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrmk_3 implements rruq_1 {
   private static short[] id_class;

   rrmk_3() {
   }

   static {
      ntfClinit();
   }

   @Override
   public void id_class(C_static var1) throws x_1 {
      ((rrvZ)rrvZ.staticFieldse90af7ec3c763bb3bd1d99a27ea561d9[id_class[0]]).id_protected(var1.id_extends());
   }

   private static void id_class() {
      id_class = new short[1];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1218174145526295515L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1668945392;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{96, -13, -63, -105, 18, 112, -120, -94}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }
}
