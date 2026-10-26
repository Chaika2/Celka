package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrFT {
   private static short[] byte_;
   public Object[] class_;
   private static byte[] protected_;
   public static Object[] break_;
   private static boolean[] throws_;

   private static void byte_() {
      byte_ = new short[]{0, 0, 0, 1, 0, 0, 1};
   }

   public rrFT() {
      this.case_();
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1509921273;
   }

   public static rrFT class_(Aw_1 var0, String var1) {
      ((rrFT)break_[0]).class_[0] = var0;
      ((rrFT)break_[0]).class_[1] = var1;
      return (rrFT)break_[0];
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8197411513702392399L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-51, 100, -4, 6, -49, -123, -18, 30}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public Aw_1 class_() {
      return (Aw_1)this.class_[0];
   }

   public String break_() {
      return (String)this.class_[1];
   }

   private static void throws_() {
      throws_ = new boolean[]{false, true};
   }

   private static void catch_() {
      Object[] var0 = new Object[]{new rrFT()};
      break_ = var0;
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
}
