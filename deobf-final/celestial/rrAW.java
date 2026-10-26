package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAW extends Om_1 {
   private static boolean[] byte_;
   private static short[] protected_;
   public static Object[] class_;
   public Object[] break_;

   public rrAW() {
      this.protected_();
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 288363490;
   }

   public static rrAW class_(rfo_3 var0) {
      ((rrAW)class_[0]).break_[0] = var0;
      ((rrAW)class_[0]).class_(false);
      return (rrAW)class_[0];
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{51, 43, -20, 64, 45, 92, 113, -121}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public rfo_3 class_() {
      this.protected_();
      return (rfo_3)this.break_[0];
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2694983753341653268L;
   }

   private static void break_() {
      byte_ = new boolean[]{false, false, true, true};
   }

   private static void throws_() {
      protected_ = new short[5];
   }

   private static void case_() {
      Object[] var0 = new Object[]{new rrAW()};
      class_ = var0;
   }

   private void protected_() {
      if (this.break_ == null) {
         this.break_ = new Object[1];
         Object[] var1 = this.break_;
      }
   }
}
