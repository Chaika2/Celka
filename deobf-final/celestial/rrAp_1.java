package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAp_1 extends Om_1 {
   public static Object[] class_;
   public Object[] break_;
   private static boolean[] byte_;
   private static byte[] protected_;
   private static short[] throws_;

   public rrAp_1() {
      this.case_();
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1590343626;
   }

   public static void class_(rhd_3 var0, rdn_3 var1) {
      rrAp_1 var2 = break_(var0, var1);
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(var2);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4034630959850568959L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-55, -9, 124, 118, -12, 49, 89, 71}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public rdn_3 class_() {
      this.case_();
      return (rdn_3)this.break_[1];
   }

   private static rrAp_1 break_(rhd_3 var0, rdn_3 var1) {
      ((rrAp_1)class_[0]).break_[0] = var0;
      ((rrAp_1)class_[0]).break_[1] = var1;
      ((rrAp_1)class_[0]).class_(false);
      return (rrAp_1)class_[0];
   }

   public rhd_3 break_() {
      this.case_();
      return (rhd_3)this.break_[0];
   }

   private static void throws_() {
      throws_ = new short[]{0, 0, 0, 1, 0, 0, 0, 0, 1};
   }

   private static void catch_() {
      byte_ = new boolean[]{false, false, true};
   }

   private void case_() {
      if (this.break_ == null) {
         this.break_ = new Object[2];
         Object[] var1 = this.break_;
      }
   }

   private static void protected_() {
      protected_ = new byte[]{2};
   }

   private static void private_() {
      Object[] var0 = new Object[]{new rrAp_1()};
      class_ = var0;
   }
}
