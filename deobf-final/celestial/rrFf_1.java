package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrFf_1 {
   private static short[] byte_;
   private static boolean[] protected_;
   public Object[] class_;
   public static Object[] break_;

   private static void byte_() {
      byte_ = new short[4];
   }

   public rrFf_1() {
      this.throws_();
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6693220252548622462L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 579351278;
   }

   public static rrFf_1 class_(an_3 var0) {
      ((rrFf_1)break_[0]).class_[0] = var0;
      return (rrFf_1)break_[0];
   }

   public an_3 class_() {
      return (an_3)this.class_[0];
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{91, -112, -73, 26, 107, -15, 59, 18}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void break_() {
      protected_ = new boolean[]{false, true, true};
   }

   private void throws_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
         Object[] var1 = this.class_;
      }
   }

   private static void protected_() {
      Object[] var0 = new Object[]{new rrFf_1()};
      break_ = var0;
   }
}
