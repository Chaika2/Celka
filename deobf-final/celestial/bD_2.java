package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class bD_2 extends rqr_3 {
   private static short[] volatile_;
   private static boolean[] final_;
   private static float[] package_;
   public Object[] class_;
   private static double[] int_;

   public bD_2(bV_2 var1) {
      this.catch_();
      this.class_[0] = var1;
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-128, 76, -90, -35, -44, -48, -91, -20}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void class_(boolean var1) {
      this.catch_();
      this.break_ = 0.0F;
      this.byte_ = 0.0F;
      this.private_ = ((bV_2)this.class_[0]).class_((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[6]);
      if (this.protected_ = ((bV_2)this.class_[0]).class_((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[0])) {
         this.byte_++;
      }

      if (this.throws_ = ((bV_2)this.class_[0]).class_((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[1])) {
         this.byte_--;
      }

      if (this.case_ = ((bV_2)this.class_[0]).class_((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[2])) {
         this.break_++;
      }

      if (this.catch_ = ((bV_2)this.class_[0]).class_((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[3])) {
         this.break_--;
      }

      if (this.implements_ = ((bV_2)this.class_[0]).class_((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[7])) {
         this.break_ = (float)((double)this.break_ * 0.3);
         this.byte_ = (float)((double)this.byte_ * 0.3);
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -783662286;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1787823403877654655L;
   }

   private static void throws_() {
      package_ = new float[]{0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 1.0F};
   }

   private void catch_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
         Object[] var1 = this.class_;
      }
   }

   private static void case_() {
      volatile_ = new short[]{0, 0, 6, 0, 0, 0, 1, 0, 2, 0, 3, 0, 7};
   }

   private static void implements_() {
      final_ = new boolean[]{true};
   }

   private static void private_() {
      int_ = new double[]{0.3, 0.3};
   }
}
