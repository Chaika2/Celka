package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rX_2 implements rP_2 {
   private static boolean[] byte_;
   private static short[] protected_;
   public static Object[] class_;
   private static byte[] throws_;
   private static int[] case_;
   private static double[] catch_;
   public Object[] break_;
   private static String[] private_;

   public int byte_() {
      return (Integer)this.break_[0];
   }

   public rX_2(rU_2 var1) {
      this.case_();
      Integer var6 = (Integer)var1.break_[0];
      this.break_[0] = var6;
      Integer var7 = (Integer)var1.break_[2];
      this.break_[1] = var7;
   }

   public rX_2(int var1, int var2) {
      this.case_();
      Integer var7 = var1;
      this.break_[0] = var7;
      Integer var8 = var2;
      this.break_[1] = var8;
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         rX_2 var2 = (rX_2)var1;
         return this.break_[0] == var2.break_[0] && this.break_[1] == var2.break_[1] ? true : byte_[5];
      } else {
         return byte_[3];
      }
   }

   @Override
   public String toString() {
      return String.format("GoalXZ{x=%s,z=%s}", Pd_1.class_((Integer)this.break_[0]), Pd_1.class_((Integer)this.break_[1]));
   }

   @Override
   public int hashCode() {
      int var1 = 1791873246;
      var1 = var1 * 222601791 + (Integer)this.break_[0];
      return var1 * -1331679453 + (Integer)this.break_[1];
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{54, -123, -48, -20, 32, -27, -7, 119}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static double class_(double var0, double var2) {
      double var4 = Math.abs(var0);
      double var6 = Math.abs(var2);
      double var8;
      double var10;
      if (var4 < var6) {
         var8 = var6 - var4;
         var10 = var4;
      } else {
         var8 = var4 - var6;
         var10 = var6;
      }

      var10 *= class_[0];
      return (var10 + var8) * (Double)C_throws.break_().PS.class_[0];
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -884276889;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2307622736696774989L;
   }

   public static rX_2 class_(rjU_2 var0, float var1, double var2) {
      float var4 = (float)Math.toRadians((double)var1);
      double var5 = var0.break_ - (double)rfU_2.class_(var4) * var2;
      double var7 = var0.protected_ + (double)rfU_2.break_(var4) * var2;
      return new rX_2(rfU_2.byte_(var5), rfU_2.byte_(var7));
   }

   @Override
   public double class_(int var1, int var2, int var3) {
      int var4 = var1 - (Integer)this.break_[0];
      int var5 = var3 - (Integer)this.break_[1];
      return class_((double)var4, (double)var5);
   }

   @Override
   public boolean break_(int var1, int var2, int var3) {
      return var1 == this.break_[0] && var3 == this.break_[1] ? true : byte_[1];
   }

   public int break_() {
      return (Integer)this.break_[1];
   }

   private static void throws_() {
      catch_ = new double[]{2.0, 0.0};
   }

   private static void finally_() {
      case_ = new int[]{1791873246, 222601791, -1331679453};
   }

   private static void catch_() {
      Object[] var0 = new Object[]{1.4142135623730951};
      class_ = var0;
   }

   private static void extends_() {
      protected_ = new short[]{0, 1, 0, 0, 2, 1, 0, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 0, 0, 1};
   }

   private void case_() {
      if (this.break_ == null) {
         this.break_ = new Object[2];
         Object[] var1 = this.break_;
         var1[0] = 0;
         var1[1] = 0;
      }
   }

   private static void implements_() {
      throws_ = new byte[]{2, 2};
   }

   private static void protected_() {
      byte_ = new boolean[]{true, false, true, false, true, false, false, true, false, false, false, true, false, true, false};
   }

   private static void private_() {
      private_ = new String[]{new String("GoalXZ{x=%s,z=%s}")};
   }
}
