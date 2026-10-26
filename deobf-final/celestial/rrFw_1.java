package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrFw_1 {
   public static Object[] class_;
   private static boolean[] byte_;
   public Object[] break_;
   private static short[] protected_;

   private static void byte_() {
      byte_ = new boolean[]{false, true, true};
   }

   public rrFw_1() {
      this.throws_();
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{35, 88, -52, 33, -117, -39, 15, 122}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static rrFw_1 class_(rrFI var0) {
      ((rrFw_1)class_[0]).break_[0] = var0;
      return (rrFw_1)class_[0];
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6336741881751549576L;
   }

   public rrFI class_() {
      return (rrFI)this.break_[0];
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1157784608;
   }

   private static void break_() {
      protected_ = new short[4];
   }

   private void throws_() {
      if (this.break_ == null) {
         this.break_ = new Object[1];
         Object[] var1 = this.break_;
      }
   }

   private static void protected_() {
      Object[] var0 = new Object[]{new rrFw_1()};
      class_ = var0;
   }
}
