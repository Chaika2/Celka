package celestial;

import com.google.common.collect.ComparisonChain;
import java.nio.charset.StandardCharsets;
import java.util.Comparator;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrCC implements Comparator<rdn_3> {
   private static boolean[] id_class;

   static {
      ntfClinit();
   }

   public int id_class(rdn_3 var1, rdn_3 var2) {
      int var3 = id_class[0];
      int var4 = id_class[1];

      for (rLY var6 : rAB.id_class(var1)) {
         if (var6.id_class() == rLD.id_case) {
            var3 = var6.id_byte();
            break;
         }
      }

      for (rLY var8 : rAB.id_class(var2)) {
         if (var8.id_class() == rLD.id_case) {
            var4 = var8.id_byte();
            break;
         }
      }

      return ComparisonChain.start().compare(var4, var3).result();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{106, 4, -99, -112, 23, 88, -19, -109}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1700180512;
   }

   private static void id_class() {
      id_class = new boolean[2];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4720321809323991038L;
   }
}
