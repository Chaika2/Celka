package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrFg_1 {
   public Object[] class_;
   private static byte[] byte_;
   private static boolean[] protected_;
   public static Object[] break_;
   private static short[] throws_;

   private static void byte_() {
      throws_ = new short[]{0, 0, 0, 1, 0, 0, 1};
   }

   public rrFg_1() {
      this.catch_();
   }

   static {
      ntfClinit();
   }

   public Lu_1 class_() {
      return (Lu_1)this.class_[0];
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{26, -126, 125, 47, -91, -56, -104, 10}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7252474042059367466L;
   }

   public static rrFg_1 class_(Lu_1 var0, String var1) {
      ((rrFg_1)break_[0]).class_[0] = var0;
      ((rrFg_1)break_[0]).class_[1] = var1;
      return (rrFg_1)break_[0];
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 370867406;
   }

   public String break_() {
      return (String)this.class_[1];
   }

   private static void throws_() {
      byte_ = new byte[]{2};
   }

   private void catch_() {
      if (this.class_ == null) {
         this.class_ = new Object[2];
         Object[] var1 = this.class_;
      }
   }

   private static void case_() {
      Object[] var0 = new Object[]{new rrFg_1()};
      break_ = var0;
   }

   private static void protected_() {
      protected_ = new boolean[]{false, true};
   }
}
