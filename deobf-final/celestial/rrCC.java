package celestial;

import com.google.common.collect.ComparisonChain;
import java.nio.charset.StandardCharsets;
import java.util.Comparator;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrCC implements Comparator<rdn_3> {
   private static boolean[] class_;

   static {
      ntfClinit();
   }

   public int class_(rdn_3 var1, rdn_3 var2) {
      int var3 = 0;
      int var4 = 0;

      for (rLY var6 : rAB.class_(var1)) {
         if (var6.class_() == rLD.case_) {
            var3 = var6.byte_();
            break;
         }
      }

      for (rLY var8 : rAB.class_(var2)) {
         if (var8.class_() == rLD.case_) {
            var4 = var8.byte_();
            break;
         }
      }

      return ComparisonChain.start().compare(var4, var3).result();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{106, 4, -99, -112, 23, 88, -19, -109}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1700180512;
   }

   private static void class_() {
      class_ = new boolean[2];
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4720321809323991038L;
   }
}
