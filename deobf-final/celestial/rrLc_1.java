package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLc_1 extends Om_1 {
   public static Object[] class_;
   public Object[] break_;
   private static boolean[] byte_;
   private static short[] protected_;

   public rrLc_1() {
      this.case_();
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2111377237534551303L;
   }

   public rrTi_1 class_() {
      this.case_();
      return (rrTi_1)this.break_[0];
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-27, 85, -35, -30, -53, 107, -8, 109}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1918012988;
   }

   public static rrLc_1 class_(rrTi_1 var0) {
      ((rrLc_1)class_[0]).break_[0] = var0;
      ((rrLc_1)class_[0]).class_(false);
      return (rrLc_1)class_[0];
   }

   private static void break_() {
      protected_ = new short[7];
   }

   public static rrLc_1 break_(rrTi_1 var0) {
      rrLc_1 var1 = class_(var0);
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(var1);
      ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[0]).class_(var1);
      return var1;
   }

   private static void throws_() {
      Object[] var0 = new Object[]{new rrLc_1()};
      class_ = var0;
   }

   private void case_() {
      if (this.break_ == null) {
         this.break_ = new Object[1];
         Object[] var1 = this.break_;
      }
   }

   private static void protected_() {
      byte_ = new boolean[]{false, false, true, true};
   }
}
