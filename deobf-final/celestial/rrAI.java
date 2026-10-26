package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAI {
   private static short[] byte_;
   public static Object[] class_;
   private static boolean[] protected_;
   private static byte[] throws_;
   public Object[] break_;

   public xd_3 byte_() {
      return (xd_3)this.break_[2];
   }

   public rrAI() {
      this.implements_();
   }

   static {
      ntfClinit();
   }

   public static rrAI class_(rdn_3 var0, rfH_2 var1, xd_3 var2, ryZ_2 var3) {
      ((rrAI)class_[0]).break_[0] = var0;
      ((rrAI)class_[0]).break_[1] = var1;
      ((rrAI)class_[0]).break_[2] = var2;
      ((rrAI)class_[0]).break_[3] = var3;
      return (rrAI)class_[0];
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5610207736679760100L;
   }

   public rfH_2 class_() {
      return (rfH_2)this.break_[1];
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 36368328;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-116, 14, 55, -74, 103, -95, -1, -15}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public ryZ_2 break_() {
      return (ryZ_2)this.break_[3];
   }

   private static void throws_() {
      Object[] var0 = new Object[]{new rrAI()};
      class_ = var0;
   }

   private static void catch_() {
      byte_ = new short[]{0, 0, 0, 1, 0, 2, 0, 3, 0, 0, 1, 2, 3};
   }

   private static void case_() {
      protected_ = new boolean[]{false, true};
   }

   private void implements_() {
      if (this.break_ == null) {
         this.break_ = new Object[4];
         Object[] var1 = this.break_;
      }
   }

   public rdn_3 protected_() {
      return (rdn_3)this.break_[0];
   }

   private static void private_() {
      throws_ = new byte[]{4};
   }
}
