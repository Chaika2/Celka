package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Mr_1 {
   private static short[] break_;
   public Object[] class_;
   private static boolean[] byte_;
   private static byte[] protected_;
   private static double[] throws_;

   private static void byte_() {
      byte_ = new boolean[]{false, false, false, false, false, true, false, false};
   }

   public Mr_1() {
      this.break_();
      this.class_();
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-99, -65, -121, -51, 60, -29, -12, -90}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void class_() {
      Integer var5 = 0;
      this.class_[0] = var5;
      Integer var6 = 0;
      this.class_[1] = var6;
      Integer var7 = 0;
      this.class_[2] = var7;
      Double var8 = 1000000.0;
      this.class_[3] = var8;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5837124145670315591L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1004990378;
   }

   private void break_() {
      if (this.class_ == null) {
         this.class_ = new Object[4];
         Object[] var1 = this.class_;
         var1[0] = 0;
         var1[1] = 0;
         var1[2] = 0;
         var1[3] = 0.0;
      }
   }

   private static void throws_() {
      break_ = new short[]{0, 1, 2, 3};
   }

   private static void case_() {
      throws_ = new double[]{1000000.0, 0.0};
   }

   private static void protected_() {
      protected_ = new byte[]{4, 2, 3};
   }
}
