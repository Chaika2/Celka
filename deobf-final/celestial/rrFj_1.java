package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrFj_1 extends Om_1 {
   public Object[] class_;
   private static short[] byte_;
   public static Object[] break_;
   private static boolean[] protected_;

   public rrFj_1() {
      this.break_();
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -2082915430;
   }

   public static rrFj_1 class_(an_3 var0) {
      ((rrFj_1)break_[0]).class_[0] = var0;
      ((rrFj_1)break_[0]).class_(false);
      return (rrFj_1)break_[0];
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-47, -61, 64, 103, -16, -38, -124, -69}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public an_3 class_() {
      this.break_();
      return (an_3)this.class_[0];
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7438931810033428696L;
   }

   private void break_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
         Object[] var1 = this.class_;
      }
   }

   private static void throws_() {
      byte_ = new short[5];
   }

   private static void case_() {
      protected_ = new boolean[]{false, false, true, true};
   }

   private static void protected_() {
      Object[] var0 = new Object[]{new rrFj_1()};
      break_ = var0;
   }
}
