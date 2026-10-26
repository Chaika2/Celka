package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrjF_2 {
   private static boolean[] id_class;

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{3, -67, -33, 85, -124, -88, -16, -79}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_class() {
      id_class = new boolean[]{true, false, true, false};
   }

   public static boolean id_class(double var0, double var2, double var4, double var6, double var8, double var10) {
      return var8 > var0 && var8 < var0 + var4 && var10 > var2 && var10 < var2 + var6 ? true : id_class[1];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 887716140604653153L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1409030288;
   }

   public static boolean id_class(rjK_2 var0, rjK_2 var1, double var2, double var4) {
      return var2 > (double)var0.id_byte
            && var2 < (double)(var0.id_byte + var1.id_byte)
            && var4 > (double)var0.id_protected
            && var4 < (double)(var0.id_protected + var1.id_protected)
         ? true
         : id_class[3];
   }
}
