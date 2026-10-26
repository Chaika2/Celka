package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAq_1 {
   private static boolean[] byte_;
   private static short[] protected_;
   private static byte[] throws_;
   public static Object[] class_;
   public Object[] break_;

   public rdn_3 byte_() {
      return (rdn_3)this.break_[2];
   }

   public rrAq_1() {
      this.throws_();
   }

   static {
      ntfClinit();
   }

   public rJY class_() {
      return (rJY)this.break_[1];
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{52, -22, -72, 54, 81, 68, -16, -101}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2614145716078790324L;
   }

   public static rrAq_1 class_(rJr_1 var0, rJY var1, rdn_3 var2) {
      ((rrAq_1)class_[0]).break_[0] = var0;
      ((rrAq_1)class_[0]).break_[1] = var1;
      ((rrAq_1)class_[0]).break_[2] = var2;
      return (rrAq_1)class_[0];
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 165957202;
   }

   public rJr_1 break_() {
      return (rJr_1)this.break_[0];
   }

   public static void break_(rJr_1 var0, rJY var1, rdn_3 var2) {
      rrAq_1 var3 = class_(var0, var1, var2);
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(var3);
      ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[0]).class_(var3);
   }

   private void throws_() {
      if (this.break_ == null) {
         this.break_ = new Object[3];
         Object[] var1 = this.break_;
      }
   }

   private static void catch_() {
      byte_ = new boolean[]{false, true};
   }

   private static void case_() {
      protected_ = new short[]{0, 0, 0, 1, 0, 2, 0, 0, 0, 0, 1, 2};
   }

   private static void protected_() {
      throws_ = new byte[]{3};
   }

   private static void private_() {
      Object[] var0 = new Object[]{new rrAq_1()};
      class_ = var0;
   }
}
