package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrFt_1 extends Om_1 {
   private static byte[] byte_;
   public Object[] class_;
   public static Object[] break_;
   private static boolean[] protected_;
   private static short[] throws_;
   private static double[] case_;

   public rrFt_1() {
      this.throws_();
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-22, -99, 3, -78, -61, 19, -107, 52}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void class_(double var1) {
      this.throws_();
      Double var7 = var1;
      this.class_[0] = var7;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1400562983;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8901110558197226458L;
   }

   public double class_() {
      this.throws_();
      return (Double)this.class_[0];
   }

   public static rrFt_1 class_(double var0, boolean var2) {
      rrFt_1 var10000 = (rrFt_1)break_[0];
      Double var7 = var0;
      var10000.class_[0] = var7;
      var10000 = (rrFt_1)break_[0];
      Boolean var8 = var2;
      var10000.class_[1] = var8;
      ((rrFt_1)break_[0]).class_(false);
      return (rrFt_1)break_[0];
   }

   public void break_(boolean var1) {
      this.throws_();
      Boolean var6 = var1;
      this.class_[1] = var6;
   }

   public boolean break_() {
      this.throws_();
      return (Boolean)this.class_[1];
   }

   private void throws_() {
      if (this.class_ == null) {
         this.class_ = new Object[2];
         Object[] var1 = this.class_;
         var1[0] = 0.0;
         var1[1] = false;
      }
   }

   private static void catch_() {
      byte_ = new byte[]{2};
   }

   private static void case_() {
      throws_ = new short[]{0, 0, 0, 1, 0, 0, 0, 1, 0, 1};
   }

   private static void implements_() {
      case_ = new double[1];
   }

   private static void protected_() {
      protected_ = new boolean[]{false, false, false, true, false, true};
   }

   private static void private_() {
      Object[] var0 = new Object[]{new rrFt_1()};
      break_ = var0;
   }
}
