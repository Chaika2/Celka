package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAf_1 {
   private static short[] byte_;
   public static Object[] class_;
   private static boolean[] protected_;
   private static byte[] throws_;
   public Object[] break_;

   public ryZ_2 byte_() {
      return (ryZ_2)this.break_[0];
   }

   public rrAf_1() {
      this.private_();
   }

   static {
      ntfClinit();
   }

   public static rrAf_1 class_(ryZ_2 var0, rdn_3 var1, rpm_3 var2) {
      ((rrAf_1)class_[0]).break_[0] = var0;
      ((rrAf_1)class_[0]).break_[1] = var1;
      ((rrAf_1)class_[0]).break_[2] = var2;
      return (rrAf_1)class_[0];
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 324437536;
   }

   public rpm_3 class_() {
      return (rpm_3)this.break_[2];
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -764743288137495460L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{102, 7, 97, 103, 4, 16, 3, 0}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public rdn_3 break_() {
      return (rdn_3)this.break_[1];
   }

   private static void throws_() {
      protected_ = new boolean[]{false, true};
   }

   private static void catch_() {
      throws_ = new byte[]{3};
   }

   private static void case_() {
      Object[] var0 = new Object[]{new rrAf_1()};
      class_ = var0;
   }

   private static void protected_() {
      byte_ = new short[]{0, 0, 0, 1, 0, 2, 0, 0, 1, 2};
   }

   private void private_() {
      if (this.break_ == null) {
         this.break_ = new Object[3];
         Object[] var1 = this.break_;
      }
   }
}
