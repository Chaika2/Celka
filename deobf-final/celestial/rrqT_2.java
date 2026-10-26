package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrqT_2 {
   public Object[] class_;
   private static boolean[] break_;
   private static short[] byte_;
   private static float[] protected_;
   private static double[] throws_;
   private static byte[] case_;

   private static void byte_() {
      throws_ = new double[]{0.05, 0.0, 0.0, 0.0};
   }

   public rrqT_2(JumpCircles var1, double var2, double var4, double var6) {
      this.protected_();
      this.class_[4] = var1;
      Float var13 = 0.0F;
      this.class_[3] = var13;
      Double var14 = var2;
      this.class_[0] = var14;
      Double var15 = var4;
      this.class_[1] = var15;
      Double var16 = var6;
      this.class_[2] = var16;
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1523596185;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{47, -29, -70, 83, 122, 103, 86, -18}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public boolean class_() {
      return (double)((Float)this.class_[3]).floatValue() > (double)((rrIm_1)((JumpCircles)this.class_[4]).break_[0]).byte_().floatValue() - 0.05
         ? true
         : break_[1];
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7748431669332272066L;
   }

   private static void break_() {
      protected_ = new float[2];
   }

   private static void throws_() {
      case_ = new byte[]{5, 2, 3};
   }

   private static void catch_() {
      byte_ = new short[]{4, 3, 0, 1, 2, 3, 4, 0};
   }

   private static void case_() {
      break_ = new boolean[]{true, false, false, true};
   }

   private void protected_() {
      if (this.class_ == null) {
         this.class_ = new Object[5];
         this.class_[0] = 0.0;
         this.class_[1] = 0.0;
         this.class_[2] = 0.0;
         this.class_[3] = 0.0F;
      }
   }
}
