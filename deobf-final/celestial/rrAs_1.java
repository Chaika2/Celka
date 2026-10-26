package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAs_1 {
   public Object[] class_;
   private static byte[] byte_;
   public static Object[] break_;
   private static boolean[] protected_;
   private static short[] throws_;
   private static double[] case_;

   private static void byte_() {
      throws_ = new short[]{0, 0, 0, 1, 0, 0, 1, 0, 1};
   }

   public rrAs_1() {
      this.catch_();
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7298857769212079789L;
   }

   public static rrAs_1 class_(rLY var0, double var1) {
      ((rrAs_1)break_[0]).class_[0] = var0;
      rrAs_1 var10000 = (rrAs_1)break_[0];
      Double var8 = var1;
      var10000.class_[1] = var8;
      return (rrAs_1)break_[0];
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{102, -35, -26, -116, 97, -43, 49, 108}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void class_(rLY var1) {
      this.class_[0] = var1;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 2101272974;
   }

   public void class_(double var1) {
      Double var7 = var1;
      this.class_[1] = var7;
   }

   public rLY class_() {
      return (rLY)this.class_[0];
   }

   public double break_() {
      return (Double)this.class_[1];
   }

   private static void throws_() {
      byte_ = new byte[]{2};
   }

   private void catch_() {
      if (this.class_ == null) {
         this.class_ = new Object[2];
         Object[] var1 = this.class_;
         var1[1] = 0.0;
      }
   }

   private static void case_() {
      case_ = new double[1];
   }

   private static void protected_() {
      protected_ = new boolean[]{false, true, true};
   }

   private static void private_() {
      Object[] var0 = new Object[]{new rrAs_1()};
      break_ = var0;
   }
}
