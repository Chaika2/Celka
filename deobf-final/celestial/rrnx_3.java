package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrnx_3 {
   private static boolean[] byte_;
   private static byte[] protected_;
   public static Object[] class_;
   private static short[] throws_;
   public Object[] break_;

   private static void byte_() {
      throws_ = new short[]{0, 0, 0, 1, 0, 0, 1};
   }

   public rrnx_3() {
      this.catch_();
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8605444625588263827L;
   }

   public static rrnx_3 class_(iB_2 var0, rjG_2 var1) {
      ((rrnx_3)class_[0]).break_[0] = var0;
      ((rrnx_3)class_[0]).break_[1] = var1;
      return (rrnx_3)class_[0];
   }

   public rjG_2 class_() {
      return (rjG_2)this.break_[1];
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{37, 39, 6, -13, 15, 123, -80, 38}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -699329944;
   }

   public iB_2 break_() {
      return (iB_2)this.break_[0];
   }

   private static void throws_() {
      protected_ = new byte[]{2};
   }

   private void catch_() {
      if (this.break_ == null) {
         this.break_ = new Object[2];
         Object[] var1 = this.break_;
      }
   }

   private static void case_() {
      byte_ = new boolean[]{false, true};
   }

   private static void protected_() {
      Object[] var0 = new Object[]{new rrnx_3()};
      class_ = var0;
   }
}
