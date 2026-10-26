package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAc_1 extends Om_1 {
   public static Object[] class_;
   private static short[] break_;
   private static boolean[] byte_;

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -253607254;
   }

   public static rrAc_1 class_() {
      return (rrAc_1)class_[0];
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7931165048055360867L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-34, -115, -79, -74, -102, 102, -126, 121}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static rrAc_1 break_() {
      rrAc_1 var0 = class_();
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(var0);
      return var0;
   }

   private static void throws_() {
      break_ = new short[2];
   }

   private static void case_() {
      byte_ = new boolean[]{false, true};
   }

   private static void protected_() {
      Object[] var0 = new Object[]{new rrAc_1()};
      class_ = var0;
   }
}
