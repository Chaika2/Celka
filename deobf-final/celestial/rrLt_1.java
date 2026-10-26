package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLt_1 {
   public static Object[] class_;
   private static byte[] byte_;
   private static boolean[] protected_;
   public Object[] break_;
   private static short[] throws_;

   public boolean byte_() {
      return (Boolean)this.break_[2];
   }

   public rrLt_1() {
      this.case_();
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-33, 74, -74, -12, -28, 108, -56, 108}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void class_(rjU_2 var1) {
      this.break_[0] = var1;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3478087875744000012L;
   }

   public void class_(boolean var1) {
      Boolean var6 = var1;
      this.break_[2] = var6;
   }

   public static rrLt_1 class_(rjU_2 var0, rjU_2 var1, boolean var2) {
      ((rrLt_1)class_[0]).break_[0] = var0;
      ((rrLt_1)class_[0]).break_[1] = var1;
      rrLt_1 var10000 = (rrLt_1)class_[0];
      Boolean var9 = var2;
      var10000.break_[2] = var9;
      return (rrLt_1)class_[0];
   }

   public rjU_2 class_() {
      return (rjU_2)this.break_[1];
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -850554814;
   }

   public void break_(rjU_2 var1) {
      this.break_[1] = var1;
   }

   public rjU_2 break_() {
      return (rjU_2)this.break_[0];
   }

   private static void throws_() {
      throws_ = new short[]{0, 0, 0, 1, 0, 2, 0, 0, 1, 2, 0, 1, 2};
   }

   private static void catch_() {
      byte_ = new byte[]{3, 2};
   }

   private void case_() {
      if (this.break_ == null) {
         this.break_ = new Object[3];
         Object[] var1 = this.break_;
         var1[2] = false;
      }
   }

   private static void protected_() {
      protected_ = new boolean[]{false, false, true};
   }

   private static void private_() {
      Object[] var0 = new Object[]{new rrLt_1()};
      class_ = var0;
   }
}
