package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAj_1 {
   private static boolean[] byte_;
   private static byte[] protected_;
   private static short[] throws_;
   private static double[] case_;
   public static Object[] class_;
   public Object[] break_;
   private static float[] catch_;

   public double byte_() {
      return (Double)this.break_[0];
   }

   private void int_() {
      if (this.break_ == null) {
         this.break_ = new Object[13];
         Object[] var1 = this.break_;
         var1[0] = 0.0;
         var1[1] = 0.0;
         var1[2] = 0.0;
         var1[3] = 0.0;
         var1[4] = 0.0;
         var1[5] = 0.0;
         var1[6] = 0.0F;
         var1[7] = 0.0F;
         var1[8] = 0.0F;
         var1[9] = 0.0F;
         var1[10] = false;
         var1[11] = false;
         var1[12] = false;
      }
   }

   public rrAj_1() {
      this.int_();
   }

   static {
      ntfClinit();
   }

   private static void this_() {
      throws_ = new short[]{0, 0, 0, 1, 0, 2, 0, 3, 0, 4, 0, 5, 0, 6, 0, 7, 0, 8, 0, 9, 0, 10, 0, 11, 0, 12, 0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{78, -107, -127, -83, -94, -93, -113, 76}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1521031948608246867L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1650171379;
   }

   public static rrAj_1 class_(
      double var0,
      double var2,
      double var4,
      double var6,
      double var8,
      double var10,
      float var12,
      float var13,
      float var14,
      float var15,
      boolean var16,
      boolean var17,
      boolean var18
   ) {
      rrAj_1 var10000 = (rrAj_1)class_[0];
      Double var23 = var0;
      var10000.break_[0] = var23;
      var10000 = (rrAj_1)class_[0];
      Double var24 = var2;
      var10000.break_[1] = var24;
      var10000 = (rrAj_1)class_[0];
      Double var25 = var4;
      var10000.break_[2] = var25;
      var10000 = (rrAj_1)class_[0];
      Double var26 = var6;
      var10000.break_[3] = var26;
      var10000 = (rrAj_1)class_[0];
      Double var27 = var8;
      var10000.break_[4] = var27;
      var10000 = (rrAj_1)class_[0];
      Double var28 = var10;
      var10000.break_[5] = var28;
      var10000 = (rrAj_1)class_[0];
      Float var29 = var12;
      var10000.break_[6] = var29;
      var10000 = (rrAj_1)class_[0];
      Float var30 = var13;
      var10000.break_[7] = var30;
      var10000 = (rrAj_1)class_[0];
      Float var31 = var14;
      var10000.break_[8] = var31;
      var10000 = (rrAj_1)class_[0];
      Float var32 = var15;
      var10000.break_[9] = var32;
      var10000 = (rrAj_1)class_[0];
      Boolean var33 = var16;
      var10000.break_[10] = var33;
      var10000 = (rrAj_1)class_[0];
      Boolean var34 = var17;
      var10000.break_[11] = var34;
      var10000 = (rrAj_1)class_[0];
      Boolean var35 = var18;
      var10000.break_[12] = var35;
      return (rrAj_1)class_[0];
   }

   public double class_() {
      return (Double)this.break_[4];
   }

   public double break_() {
      return (Double)this.break_[1];
   }

   public boolean throws_() {
      return (Boolean)this.break_[12];
   }

   public double finally_() {
      return (Double)this.break_[3];
   }

   public double catch_() {
      return (Double)this.break_[5];
   }

   public float extends_() {
      return (Float)this.break_[9];
   }

   public float case_() {
      return (Float)this.break_[6];
   }

   private static void continue_() {
      protected_ = new byte[]{13, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
   }

   public double implements_() {
      return (Double)this.break_[2];
   }

   private static void new_() {
      case_ = new double[6];
   }

   private static void package_() {
      Object[] var0 = new Object[]{new rrAj_1()};
      class_ = var0;
   }

   private static void super_() {
      catch_ = new float[4];
   }

   public float protected_() {
      return (Float)this.break_[8];
   }

   public float private_() {
      return (Float)this.break_[7];
   }

   private static void final_() {
      byte_ = new boolean[]{false, false, true, false, false, false, true};
   }

   public boolean volatile_() {
      return (Boolean)this.break_[11];
   }

   public boolean native_() {
      return (Boolean)this.break_[10];
   }
}
