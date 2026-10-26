package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrFV {
   private static short[] byte_;
   public Object[] class_;
   public static Object[] break_;
   private static byte[] protected_;
   private static boolean[] throws_;

   public rrqP_2 byte_() {
      return (rrqP_2)this.class_[0];
   }

   public rrFV() {
      this.private_();
   }

   static {
      ntfClinit();
   }

   public static rrFV class_(rrqP_2 var0, rrqS_2 var1, rrqS_2 var2) {
      ((rrFV)break_[0]).class_[0] = var0;
      ((rrFV)break_[0]).class_[1] = var1;
      ((rrFV)break_[0]).class_[2] = var2;
      return (rrFV)break_[0];
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{41, -76, 43, -5, -66, -106, -62, 124}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public rrqS_2 class_() {
      return (rrqS_2)this.class_[2];
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8799065564282182548L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 939691046;
   }

   public rrqS_2 break_() {
      return (rrqS_2)this.class_[1];
   }

   private static void throws_() {
      protected_ = new byte[]{3};
   }

   private static void catch_() {
      throws_ = new boolean[]{false, true};
   }

   private static void case_() {
      Object[] var0 = new Object[]{new rrFV()};
      break_ = var0;
   }

   private static void protected_() {
      byte_ = new short[]{0, 0, 0, 1, 0, 2, 0, 0, 1, 2};
   }

   private void private_() {
      if (this.class_ == null) {
         this.class_ = new Object[3];
         Object[] var1 = this.class_;
      }
   }
}
