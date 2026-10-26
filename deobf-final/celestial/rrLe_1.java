package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLe_1 extends Om_1 {
   private static boolean[] byte_;
   private static byte[] protected_;
   public Object[] class_;
   private static short[] throws_;
   public static Object[] break_;

   public rrLe_1() {
      this.case_();
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-24, -104, -114, 31, 74, -84, -126, -64}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3486191301410303578L;
   }

   public rpm_3 class_() {
      this.case_();
      return (rpm_3)this.class_[1];
   }

   public static rrLe_1 class_(iB_2 var0, rpm_3 var1) {
      ((rrLe_1)break_[0]).class_[0] = var0;
      ((rrLe_1)break_[0]).class_[1] = var1;
      ((rrLe_1)break_[0]).class_(false);
      return (rrLe_1)break_[0];
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 998394215;
   }

   public iB_2 break_() {
      this.case_();
      return (iB_2)this.class_[0];
   }

   private static void throws_() {
      byte_ = new boolean[]{false, false, true};
   }

   private static void catch_() {
      throws_ = new short[]{0, 0, 0, 1, 0, 0, 0, 1};
   }

   private void case_() {
      if (this.class_ == null) {
         this.class_ = new Object[2];
         Object[] var1 = this.class_;
      }
   }

   private static void protected_() {
      protected_ = new byte[]{2};
   }

   private static void private_() {
      Object[] var0 = new Object[]{new rrLe_1()};
      break_ = var0;
   }
}
