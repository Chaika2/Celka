package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrlU_2 {
   private static float[] byte_;
   public Object[] class_;
   public static Object[] break_;
   private static boolean[] protected_;
   private static double[] throws_;
   private static byte[] case_;
   private static short[] catch_;

   public double byte_() {
      return (Double)this.class_[1];
   }

   public rrlU_2(double var1, double var3, double var5, float var7, float var8, boolean var9) {
      this.finally_();
      Double var14 = var1;
      this.class_[0] = var14;
      Double var15 = var3;
      this.class_[1] = var15;
      Double var16 = var5;
      this.class_[2] = var16;
      Float var17 = var7;
      this.class_[3] = var17;
      Float var18 = var8;
      this.class_[4] = var18;
      Boolean var19 = var9;
      this.class_[5] = var19;
   }

   public rrlU_2() {
      this.finally_();
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8937454708955066051L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{117, 71, -17, 46, 125, -28, 118, 117}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -189996017;
   }

   public double class_() {
      return (Double)this.class_[2];
   }

   public double break_() {
      return (Double)this.class_[0];
   }

   public float throws_() {
      return (Float)this.class_[3];
   }

   private void finally_() {
      if (this.class_ == null) {
         this.class_ = new Object[6];
         this.class_[0] = 0.0;
         this.class_[1] = 0.0;
         this.class_[2] = 0.0;
         this.class_[3] = 0.0F;
         this.class_[4] = 0.0F;
         this.class_[5] = false;
      }
   }

   private static void catch_() {
      protected_ = new boolean[]{false, false, true, false, true};
   }

   private static void extends_() {
      throws_ = new double[3];
   }

   public float case_() {
      return (Float)this.class_[4];
   }

   private static void implements_() {
      catch_ = new short[]{0, 1, 2, 3, 4, 5, 0, 1, 2, 3, 4, 5};
   }

   public boolean protected_() {
      return (Boolean)this.class_[5];
   }

   private static void private_() {
      case_ = new byte[]{6, 2, 3, 4, 5};
   }

   private static void volatile_() {
      Object[] var0 = new Object[]{new rrlU_2()};
      break_ = var0;
   }

   private static void native_() {
      byte_ = new float[2];
   }
}
