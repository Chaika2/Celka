package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAk_1 extends Om_1 {
   private static boolean[] byte_;
   public static Object[] class_;
   public Object[] break_;
   private static byte[] protected_;
   private static short[] throws_;

   public rrAk_1() {
      this.private_();
   }

   static {
      ntfClinit();
   }

   public void class_(xc_3 var1) {
      this.private_();
      this.break_[2] = var1;
   }

   public xc_3 class_() {
      this.private_();
      return (xc_3)this.break_[2];
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-12, -49, 79, 70, -29, 66, -51, -86}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5246407357504937366L;
   }

   public void class_(rjB_2 var1) {
      this.private_();
      this.break_[1] = var1;
   }

   public static rrAk_1 class_(rff_3 var0, rjB_2 var1, xc_3 var2) {
      ((rrAk_1)class_[0]).break_[0] = var0;
      ((rrAk_1)class_[0]).break_[1] = var1;
      ((rrAk_1)class_[0]).break_[2] = var2;
      return (rrAk_1)class_[0];
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -623863540;
   }

   public void class_(rff_3 var1) {
      this.private_();
      this.break_[0] = var1;
   }

   public rff_3 break_() {
      this.private_();
      return (rff_3)this.break_[0];
   }

   private static void throws_() {
      throws_ = new short[]{0, 0, 0, 1, 0, 2, 0, 0, 1, 2, 0, 1, 2};
   }

   private static void catch_() {
      byte_ = new boolean[]{false, true};
   }

   private static void case_() {
      Object[] var0 = new Object[]{new rrAk_1()};
      class_ = var0;
   }

   private static void implements_() {
      protected_ = new byte[]{3};
   }

   public rjB_2 protected_() {
      this.private_();
      return (rjB_2)this.break_[1];
   }

   private void private_() {
      if (this.break_ == null) {
         this.break_ = new Object[3];
         Object[] var1 = this.break_;
      }
   }
}
