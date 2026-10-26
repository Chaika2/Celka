package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrNb_1 {
   public Object[] class_;
   private static boolean[] break_;
   private static short[] byte_;
   private static double[] protected_;
   private static byte[] throws_;

   public double byte_() {
      return (Double)this.class_[3];
   }

   public rrNb_1(rrQK var1, double var2) {
      this.private_();
      rrQK var8 = (rrQK)rrQK.staticFieldsd7edc8a98bf936d38fa97cfea6cbd552[0];
      this.class_[6] = var8;
      this.class_[6] = var1;
      Double var10 = var2;
      this.class_[0] = var10;
   }

   public rrNb_1(double var1) {
      this.private_();
      rrQK var7 = (rrQK)rrQK.staticFieldsd7edc8a98bf936d38fa97cfea6cbd552[0];
      this.class_[6] = var7;
      Double var8 = var1;
      this.class_[0] = var8;
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 497997152;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7919856973698920066L;
   }

   public void class_(double var1) {
      if ((Double)this.class_[2] != var1) {
         Double var7 = var1;
         this.class_[2] = var7;
         Double var8 = (Double)this.class_[3];
         this.class_[1] = var8;
         Double var9 = 0.0;
         this.class_[4] = var9;
         Double var10 = (Double)this.class_[2] - (Double)this.class_[1];
         this.class_[5] = var10;
      }
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{70, 104, 57, -61, 24, -81, 32, -100}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void class_(float var1) {
      Double var6 = (double)var1;
      this.class_[3] = var6;
      Double var7 = (double)var1;
      this.class_[1] = var7;
      Double var8 = (double)var1;
      this.class_[2] = var8;
      Double var9 = 1.0;
      this.class_[4] = var9;
      Double var10 = 0.0;
      this.class_[5] = var10;
   }

   public void class_(rrQK var1) {
      this.class_[6] = var1;
   }

   public double class_() {
      return (Double)this.class_[0];
   }

   public void break_(double var1) {
      Double var7 = var1;
      this.class_[3] = var7;
   }

   public void break_() {
      Double var5 = 1.0;
      this.class_[3] = var5;
   }

   public void break_(float var1) {
      Double var6 = (double)var1;
      this.class_[0] = var6;
   }

   public boolean throws_() {
      return this.class_[3] > 0.0 ? true : break_[1];
   }

   private static void finally_() {
      throws_ = new byte[]{7, 2, 3, 4, 5};
   }

   private static void catch_() {
      byte_ = new short[]{0, 6, 6, 0, 0, 6, 0, 0, 4, 0, 4, 1, 5, 6, 4, 3, 3, 2, 2, 3, 1, 4, 2, 1, 5, 0, 1, 2, 3, 4, 5, 0, 3, 3, 3, 1, 2, 4, 5, 3, 6};
   }

   private static void extends_() {
      break_ = new boolean[]{true, false, false, true};
   }

   public void case_() {
      Double var5 = 0.0;
      this.class_[1] = var5;
      Double var6 = 0.0;
      this.class_[2] = var6;
      Double var7 = 0.0;
      this.class_[3] = var7;
      Double var8 = 0.0;
      this.class_[4] = var8;
      Double var9 = 0.0;
      this.class_[5] = var9;
   }

   private static void implements_() {
      protected_ = new double[]{0.01, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
   }

   public void protected_() {
      double var1 = (Double)rrQo_1.class_[0] * 0.01;
      Double var7 = rfU_2.class_((Double)this.class_[4] + (Double)this.class_[0] * var1, 0.0, 1.0);
      this.class_[4] = var7;
      Double var8 = (Double)this.class_[1] + (Double)this.class_[5] * ((rrQK)this.class_[6]).class_((Double)this.class_[4]);
      this.class_[3] = var8;
   }

   private void private_() {
      if (this.class_ == null) {
         this.class_ = new Object[7];
         Object[] var1 = this.class_;
         var1[0] = 0.0;
         var1[1] = 0.0;
         var1[2] = 0.0;
         var1[3] = 0.0;
         var1[4] = 0.0;
         var1[5] = 0.0;
      }
   }
}
