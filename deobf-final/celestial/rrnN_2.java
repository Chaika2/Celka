package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrnN_2 {
   private static short[] byte_;
   private static boolean[] protected_;
   private static byte[] throws_;
   public static Object[] class_;
   public Object[] break_;

   private void byte_() {
      if (this.break_ == null) {
         this.break_ = new Object[2];
         Object[] var1 = this.break_;
      }
   }

   public rrnN_2() {
      this.byte_();
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1643049322043215562L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-80, 29, 38, 5, -74, -41, 34, -81}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1868095707;
   }

   public static rrnN_2 class_(SZ var0, rfl_3 var1) {
      ((rrnN_2)class_[0]).break_[0] = var0;
      ((rrnN_2)class_[0]).break_[1] = var1;
      return (rrnN_2)class_[0];
   }

   public SZ class_() {
      return (SZ)this.break_[0];
   }

   public rfl_3 break_() {
      return (rfl_3)this.break_[1];
   }

   private static void throws_() {
      throws_ = new byte[]{2};
   }

   private static void catch_() {
      Object[] var0 = new Object[]{new rrnN_2()};
      class_ = var0;
   }

   private static void case_() {
      protected_ = new boolean[]{false, true};
   }

   private static void protected_() {
      byte_ = new short[]{0, 0, 0, 1, 0, 0, 1};
   }
}
