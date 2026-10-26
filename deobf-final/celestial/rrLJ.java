package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLJ extends Om_1 {
   public Object[] class_;
   private static boolean[] byte_;
   private static byte[] protected_;
   private static double[] throws_;
   private static short[] case_;
   public static Object[] break_;

   public void byte_(double var1) {
      this.private_();
      Double var7 = var1;
      this.class_[3] = var7;
   }

   public rrLJ() {
      this.private_();
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{107, -44, 119, -124, 52, 69, -100, 21}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static rrLJ class_(iB_2 var0, double var1, double var3, double var5) {
      ((rrLJ)break_[0]).class_[0] = var0;
      rrLJ var10000 = (rrLJ)break_[0];
      Double var12 = var1;
      var10000.class_[1] = var12;
      var10000 = (rrLJ)break_[0];
      Double var13 = var3;
      var10000.class_[2] = var13;
      var10000 = (rrLJ)break_[0];
      Double var14 = var5;
      var10000.class_[3] = var14;
      ((rrLJ)break_[0]).class_(false);
      return (rrLJ)break_[0];
   }

   public iB_2 class_() {
      this.private_();
      return (iB_2)this.class_[0];
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5012982579143993206L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1037183455;
   }

   public void class_(double var1) {
      this.private_();
      Double var7 = var1;
      this.class_[2] = var7;
   }

   public void break_(double var1) {
      this.private_();
      Double var7 = var1;
      this.class_[1] = var7;
   }

   public double break_() {
      this.private_();
      return (Double)this.class_[2];
   }

   public double throws_() {
      this.private_();
      return (Double)this.class_[3];
   }

   private static void finally_() {
      protected_ = new byte[]{4, 2, 3};
   }

   private static void catch_() {
      Object[] var0 = new Object[]{new rrLJ()};
      break_ = var0;
   }

   private static void extends_() {
      byte_ = new boolean[]{false, false, true, true};
   }

   private static void case_() {
      throws_ = new double[3];
   }

   private static void implements_() {
      case_ = new short[]{0, 0, 0, 1, 0, 2, 0, 3, 0, 0, 0, 1, 2, 3, 1, 2, 3};
   }

   public double protected_() {
      this.private_();
      return (Double)this.class_[1];
   }

   private void private_() {
      if (this.class_ == null) {
         this.class_ = new Object[4];
         Object[] var1 = this.class_;
         var1[1] = 0.0;
         var1[2] = 0.0;
         var1[3] = 0.0;
      }
   }
}
