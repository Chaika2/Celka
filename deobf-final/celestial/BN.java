package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class BN {
   private static short[] break_;
   private static double[] byte_;
   public Object[] class_;
   private static byte[] protected_;
   private static boolean[] throws_;

   private static void byte_() {
      byte_ = new double[1];
   }

   public BN(iB_2 var1, double var2) {
      this.protected_();
      this.class_[0] = var1;
      Double var9 = var2;
      this.class_[1] = var9;
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 436312998;
   }

   public iB_2 class_() {
      return (iB_2)this.class_[0];
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{12, 23, -93, -128, 109, -6, -3, 48}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3229858023384329774L;
   }

   public double break_() {
      return (Double)this.class_[1];
   }

   private static void throws_() {
      protected_ = new byte[]{2};
   }

   private static void catch_() {
      throws_ = new boolean[]{true};
   }

   private static void case_() {
      break_ = new short[]{0, 1, 0, 1};
   }

   private void protected_() {
      if (this.class_ == null) {
         this.class_ = new Object[2];
         Object[] var1 = this.class_;
         var1[1] = 0.0;
      }
   }
}
