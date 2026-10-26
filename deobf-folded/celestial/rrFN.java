package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Comparator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrFN implements Comparator<rrFz_1> {
   private static byte[] id_class;
   private static short[] id_break;
   private static boolean[] id_byte;

   private static void id_byte() {
      id_byte = new boolean[]{false, false, true};
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5271289238365694499L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1164046626;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-126, 71, 91, 79, -15, 86, -111, -108}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_class() {
      id_break = new short[2];
   }

   public int id_class(rrFz_1 var1, rrFz_1 var2) {
      if (!var1.id_byte() && !var2.id_byte()) {
         rrFQ var3 = (rrFQ)var1;
         rrFQ var4 = (rrFQ)var2;
         int var5 = ((List)rrFk_1.id_class[id_break[0]]).indexOf(var3.id_private().id_class());
         int var6 = ((List)rrFk_1.id_class[id_break[1]]).indexOf(var4.id_private().id_class());
         if (var5 == -1 && var6 == -1) {
            return id_byte[1];
         } else if (var5 == -1) {
            return 1;
         } else {
            return var6 == -1 ? -1 : Integer.compare(var5, var6);
         }
      } else {
         return id_byte[0];
      }
   }

   private static void id_break() {
      id_class = new byte[]{-1, -1, -1, -1, -1};
   }
}
