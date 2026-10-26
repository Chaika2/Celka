package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrue_1 implements rruq_1 {
   private static short[] id_class;

   rrue_1() {
   }

   static {
      ntfClinit();
   }

   private static void id_class() {
      id_class = new short[1];
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 2045938738;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{12, 81, -40, 38, -55, 79, -48, 82}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2352033348654313281L;
   }

   @Override
   public void id_class(C_static var1) throws x_1 {
      ((rrqY_2)rrqY_2.staticFields0d81573182c03565b5bb298419afe0b7[id_class[0]]).id_class(var1.id_extends());
   }
}
