package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrFH {
   public static Object[] class_;
   private static byte[] byte_;
   private static short[] protected_;
   private static boolean[] throws_;
   public Object[] break_;

   private static void byte_() {
      protected_ = new short[]{0, 0, 0, 1, 0, 0, 1};
   }

   public rrFH() {
      this.case_();
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -414954783;
   }

   public static rrFH class_(String var0, String var1) {
      ((rrFH)class_[0]).break_[0] = var0;
      ((rrFH)class_[0]).break_[1] = var1;
      return (rrFH)class_[0];
   }

   public String class_() {
      return (String)this.break_[0];
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-20, -67, -103, 20, 27, -80, 53, -24}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6901453050301836543L;
   }

   public String break_() {
      return (String)this.break_[1];
   }

   private static void throws_() {
      Object[] var0 = new Object[]{new rrFH()};
      class_ = var0;
   }

   private static void catch_() {
      throws_ = new boolean[]{false, true};
   }

   private void case_() {
      if (this.break_ == null) {
         this.break_ = new Object[2];
         Object[] var1 = this.break_;
      }
   }

   private static void protected_() {
      byte_ = new byte[]{2};
   }
}
