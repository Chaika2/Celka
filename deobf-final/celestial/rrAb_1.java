package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAb_1 extends Om_1 {
   private static byte[] byte_;
   private static boolean[] protected_;
   public Object[] class_;
   public static Object[] break_;
   private static short[] throws_;

   public rrAb_1() {
      this.throws_();
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-68, -66, -94, 25, 66, 98, -124, 73}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static rrAb_1 class_(xd_3 var0, rjU_2 var1) {
      ((rrAb_1)break_[0]).class_(var0);
      ((rrAb_1)break_[0]).class_(var1);
      ((rrAb_1)break_[0]).class_(false);
      return (rrAb_1)break_[0];
   }

   public xd_3 class_() {
      this.throws_();
      return (xd_3)this.class_[0];
   }

   public void class_(rjU_2 var1) {
      this.throws_();
      this.class_[1] = var1;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -9175302473198595463L;
   }

   public void class_(xd_3 var1) {
      this.throws_();
      this.class_[0] = var1;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -274556254;
   }

   public rjU_2 break_() {
      this.throws_();
      return (rjU_2)this.class_[1];
   }

   private void throws_() {
      if (this.class_ == null) {
         this.class_ = new Object[2];
         Object[] var1 = this.class_;
      }
   }

   private static void catch_() {
      byte_ = new byte[]{2};
   }

   private static void case_() {
      Object[] var0 = new Object[]{new rrAb_1()};
      break_ = var0;
   }

   private static void protected_() {
      throws_ = new short[]{0, 0, 0, 0, 0, 1, 0, 1};
   }

   private static void private_() {
      protected_ = new boolean[]{false, false, true};
   }
}
