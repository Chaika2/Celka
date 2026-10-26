package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrHz_1 {
   private static short[] break_;
   private static byte[] byte_;
   public Object[] class_;
   private static boolean[] protected_;
   private static double[] throws_;

   public double byte_() {
      return (Double)this.class_[5];
   }

   public rrHz_1(an_3 var1, aI_2<?> var2, double var3, double var5, double var7, double var9, double var11, double var13, int var15) {
      this.package_();
      this.class_[0] = var1;
      this.class_[2] = var2;
      Double var22 = var3;
      this.class_[3] = var22;
      Double var23 = var5;
      this.class_[4] = var23;
      Double var24 = var7;
      this.class_[5] = var24;
      Double var25 = var9;
      this.class_[6] = var25;
      Double var26 = var11;
      this.class_[7] = var26;
      Double var27 = var13;
      this.class_[8] = var27;
      Integer var28 = var15;
      this.class_[9] = var28;
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         rrHz_1 var2 = (rrHz_1)var1;
         return Objects.equals((an_3)this.class_[0], (an_3)var2.class_[0]);
      } else {
         return protected_[1];
      }
   }

   @Override
   public int hashCode() {
      return Objects.hashCode((an_3)this.class_[0]);
   }

   public void class_(List<rjG_2> var1) {
      this.class_[1] = var1;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1556726230;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3901851750731412344L;
   }

   public an_3 class_() {
      return (an_3)this.class_[0];
   }

   public double class_(iB_2 var1) {
      rjU_2 var2 = var1.Ps();
      double var3 = (Double)this.class_[3] - var2.break_;
      double var5 = (Double)this.class_[4] - var2.byte_;
      double var7 = (Double)this.class_[5] - var2.protected_;
      return var3 * var3 + var5 * var5 + var7 * var7;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-70, -19, 57, 31, -50, 93, 8, -74}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public double break_() {
      return (Double)this.class_[8];
   }

   public double throws_() {
      return (Double)this.class_[7];
   }

   public double finally_() {
      return (Double)this.class_[3];
   }

   public aI_2<?> catch_() {
      return (aI_2<?>)this.class_[2];
   }

   private static void extends_() {
      throws_ = new double[6];
   }

   public double case_() {
      return (Double)this.class_[6];
   }

   public int implements_() {
      return (Integer)this.class_[9];
   }

   private void package_() {
      if (this.class_ == null) {
         this.class_ = new Object[10];
         this.class_[3] = 0.0;
         this.class_[4] = 0.0;
         this.class_[5] = 0.0;
         this.class_[6] = 0.0;
         this.class_[7] = 0.0;
         this.class_[8] = 0.0;
         this.class_[9] = 0;
      }
   }

   public List<rjG_2> protected_() {
      return (List<rjG_2>)this.class_[1];
   }

   public double private_() {
      return (Double)this.class_[4];
   }

   private static void final_() {
      protected_ = new boolean[]{true, false, false};
   }

   private static void volatile_() {
      byte_ = new byte[]{10, 3, 4, 5, 6, 7, 8, 9};
   }

   private static void native_() {
      break_ = new short[]{3, 4, 5, 0, 0, 0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 2, 3, 4, 5, 6, 7, 8, 9, 1};
   }
}
