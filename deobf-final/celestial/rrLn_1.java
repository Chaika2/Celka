package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLn_1 extends Om_1 {
   private static short[] byte_;
   public Object[] class_;
   private static boolean[] protected_;
   public static Object[] break_;

   public rrLn_1() {
      this.throws_();
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3092080240723336261L;
   }

   public rvs_3 class_() {
      this.throws_();
      return (rvs_3)this.class_[0];
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1668870798;
   }

   public static rrLn_1 class_(rvs_3 var0) {
      ((rrLn_1)break_[0]).class_[0] = var0;
      ((rrLn_1)break_[0]).class_(false);
      return (rrLn_1)break_[0];
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-60, 52, -7, -2, 102, -79, 39, 124}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void break_() {
      byte_ = new short[5];
   }

   private void throws_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
         Object[] var1 = this.class_;
      }
   }

   private static void case_() {
      protected_ = new boolean[]{false, false, true, true};
   }

   private static void protected_() {
      Object[] var0 = new Object[]{new rrLn_1()};
      break_ = var0;
   }
}
