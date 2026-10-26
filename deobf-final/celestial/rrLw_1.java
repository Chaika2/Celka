package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLw_1 extends Om_1 {
   private static boolean[] byte_;
   private static short[] protected_;
   public static Object[] class_;
   public Object[] break_;
   private static byte[] throws_;

   public rrLw_1() {
      this.throws_();
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1109985070;
   }

   public void class_(VZ var1) {
      this.throws_();
      this.break_[1] = var1;
   }

   public static rrLw_1 class_(VZ var0, VZ var1) {
      ((rrLw_1)class_[0]).class_(false);
      ((rrLw_1)class_[0]).break_[0] = var0;
      ((rrLw_1)class_[0]).break_[1] = var1;
      return (rrLw_1)class_[0];
   }

   public VZ class_() {
      this.throws_();
      return (VZ)this.break_[0];
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2000062424826641087L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-31, -120, -98, 86, -120, 86, -2, 105}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public VZ break_() {
      this.throws_();
      return (VZ)this.break_[1];
   }

   private void throws_() {
      if (this.break_ == null) {
         this.break_ = new Object[2];
         Object[] var1 = this.break_;
      }
   }

   private static void catch_() {
      protected_ = new short[]{0, 0, 0, 0, 1, 0, 0, 1, 1};
   }

   private static void case_() {
      byte_ = new boolean[]{false, false, true};
   }

   private static void protected_() {
      Object[] var0 = new Object[]{new rrLw_1()};
      class_ = var0;
   }

   private static void private_() {
      throws_ = new byte[]{2};
   }
}
