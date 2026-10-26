package celestial;

import com.google.common.collect.ComparisonChain;
import java.nio.charset.StandardCharsets;
import java.util.Comparator;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrqb_3 implements Comparator<rrqr_3> {
   private static short[] class_;
   private static byte[] break_;
   private static boolean[] byte_;

   private static void byte_() {
      class_ = new short[]{1, 1};
   }

   rrqb_3() {
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4520746932471546088L;
   }

   public int class_(rrqr_3 var1, rrqr_3 var2) {
      boolean var3 = var1.throws_();
      boolean var4 = var2.throws_();
      if (var3 && !var4) {
         return -1;
      } else if (!var3 && var4) {
         return 1;
      } else {
         rrqP_2 var5 = (rrqP_2)var1;
         rrqP_2 var6 = (rrqP_2)var2;
         int var7 = rrqB_2.class_(var5.case_());
         int var8 = rrqB_2.class_(var6.case_());
         return ComparisonChain.start()
            .compareTrueFirst(
               var5.finally_().byte_() == (rrqS_2)rrqS_2.staticFields76a63d849f9636f9a8b567c1e8edd09e[1] ? true : byte_[2],
               var6.finally_().byte_() == (rrqS_2)rrqS_2.staticFields76a63d849f9636f9a8b567c1e8edd09e[1] ? true : byte_[4]
            )
            .compare(var7, var8)
            .result();
      }
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-111, -104, 64, 84, 0, 79, -126, 63}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1572569123;
   }

   private static void class_() {
      break_ = new byte[]{-1};
   }

   private static void break_() {
      byte_ = new boolean[]{true, true, false, true, false};
   }
}
