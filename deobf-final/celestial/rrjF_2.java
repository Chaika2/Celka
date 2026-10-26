package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrjF_2 {
   private static boolean[] class_;

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{3, -67, -33, 85, -124, -88, -16, -79}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void class_() {
      class_ = new boolean[]{true, false, true, false};
   }

   public static boolean class_(double var0, double var2, double var4, double var6, double var8, double var10) {
      return var8 > var0 && var8 < var0 + var4 && var10 > var2 && var10 < var2 + var6 ? true : class_[1];
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 887716140604653153L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1409030288;
   }

   public static boolean class_(rjK_2 var0, rjK_2 var1, double var2, double var4) {
      return var2 > (double)var0.byte_
            && var2 < (double)(var0.byte_ + var1.byte_)
            && var4 > (double)var0.protected_
            && var4 < (double)(var0.protected_ + var1.protected_)
         ? true
         : class_[3];
   }
}
