package celestial;

import com.google.common.collect.ComparisonChain;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class bh_3 implements bd_3 {
   private static boolean[] class_;
   private static short[] break_;

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4804657005807200987L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 563963069;
   }

   private static void class_() {
      class_ = new boolean[]{true, false, true, false};
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-66, -88, 53, 27, -33, -35, -43, -109}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public int class_(iB_2 var1, iB_2 var2) {
      cb_3 var3 = (cb_3)import_.class_[57];
      ComparisonChain var4 = ComparisonChain.start();
      var4 = var4.compareTrueFirst(var1.BC() == aI_2.volatile_ ? true : class_[1], var2.BC() == aI_2.volatile_ ? true : class_[3]);
      var4 = var4.compare(var3.int_(var1), var3.int_(var2));
      var4 = var4.compare(var1.V(), var2.V());
      return var4.result();
   }

   private static void break_() {
      break_ = new short[]{57};
   }
}
