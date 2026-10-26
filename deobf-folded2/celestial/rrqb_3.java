package celestial;

import com.google.common.collect.ComparisonChain;
import java.nio.charset.StandardCharsets;
import java.util.Comparator;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrqb_3 implements Comparator<rrqr_3> {
   private static short[] id_class;
   private static byte[] id_break;
   private static boolean[] id_byte;

   private static void id_byte() {
      id_class = new short[]{1, 1};
   }

   rrqb_3() {
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4520746932471546088L;
   }

   public int id_class(rrqr_3 var1, rrqr_3 var2) {
      boolean var3 = var1.id_throws();
      boolean var4 = var2.id_throws();
      if (var3 && !var4) {
         return -1;
      } else if (!var3 && var4) {
         return 1;
      } else {
         rrqP_2 var5 = (rrqP_2)var1;
         rrqP_2 var6 = (rrqP_2)var2;
         int var7 = rrqB_2.id_class(var5.id_case());
         int var8 = rrqB_2.id_class(var6.id_case());
         return ComparisonChain.start()
            .compareTrueFirst(
               var5.id_finally().id_byte() == (rrqS_2)rrqS_2.staticFields76a63d849f9636f9a8b567c1e8edd09e[1] ? true : id_byte[2],
               var6.id_finally().id_byte() == (rrqS_2)rrqS_2.staticFields76a63d849f9636f9a8b567c1e8edd09e[1] ? true : id_byte[4]
            )
            .compare(var7, var8)
            .result();
      }
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-111, -104, 64, 84, 0, 79, -126, 63}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1572569123;
   }

   private static void id_class() {
      id_break = new byte[]{-1};
   }

   private static void id_break() {
      id_byte = new boolean[]{true, true, false, true, false};
   }
}
