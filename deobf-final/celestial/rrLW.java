package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLW {
   private static short[] byte_;
   private static double[] protected_;
   public Object[] class_;
   public static Object[] break_;
   private static boolean[] throws_;

   private static void byte_() {
      protected_ = new double[1];
   }

   public rrLW() {
      this.protected_();
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{114, -86, 5, -23, -95, -3, -95, 25}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public double class_() {
      return (Double)this.class_[0];
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -21183504;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2142014078659078932L;
   }

   public static rrLW class_(double var0) {
      rrLW var10000 = (rrLW)break_[0];
      Double var6 = var0;
      var10000.class_[0] = var6;
      return (rrLW)break_[0];
   }

   public void break_(double var1) {
      Double var7 = var1;
      this.class_[0] = var7;
   }

   private static void break_() {
      throws_ = new boolean[]{false, true, false, true};
   }

   private static void throws_() {
      Object[] var0 = new Object[]{new rrLW()};
      break_ = var0;
   }

   private static void case_() {
      byte_ = new short[5];
   }

   private void protected_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
         Object[] var1 = this.class_;
         var1[0] = 0.0;
      }
   }
}
