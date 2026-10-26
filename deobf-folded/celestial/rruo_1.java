package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rruo_1 implements rruq_1 {
   private static short[] id_class;

   rruo_1() {
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 2009224245;
   }

   private static void id_class() {
      id_class = new short[1];
   }

   @Override
   public void id_class(C_static var1) {
      ((rrqY_2)rrqY_2.staticFields0d81573182c03565b5bb298419afe0b7[id_class[0]]).id_break();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-100, -19, -84, 83, 38, 47, 85, -50}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 917352488908355481L;
   }
}
