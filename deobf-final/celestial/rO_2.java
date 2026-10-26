package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rO_2 implements rP_2 {
   private static int[] break_;
   private static short[] byte_;
   private static String[] protected_;
   private static boolean[] throws_;
   public Object[] class_;
   private static double[] case_;
   private static byte[] catch_;

   private static void byte_() {
      catch_ = new byte[]{100, 5, 2, 3, 4, 5, 2, 3, 4};
   }

   public rO_2(rfH_2 var1, rpr_3 var2) {
      this.private_();
      Integer var7 = var1.b_();
      this.class_[0] = var7;
      Integer var8 = var1.c_();
      this.class_[1] = var8;
      Integer var9 = var1.d_();
      this.class_[2] = var9;
      Integer var10 = var2.implements_();
      this.class_[3] = var10;
      Integer var11 = var2.extends_();
      this.class_[4] = var11;
      if ((Integer)this.class_[3] == 0 && (Integer)this.class_[4] == 0) {
         throw new IllegalArgumentException(var2 + "");
      }
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         rO_2 var2 = (rO_2)var1;
         return this.class_[0] == var2.class_[0]
               && this.class_[1] == var2.class_[1]
               && this.class_[2] == var2.class_[2]
               && this.class_[3] == var2.class_[3]
               && this.class_[4] == var2.class_[4]
            ? true
            : throws_[4];
      } else {
         return throws_[2];
      }
   }

   @Override
   public String toString() {
      return String.format(
         "GoalStrictDirection{x=%s, y=%s, z=%s, dx=%s, dz=%s}",
         Pd_1.class_((Integer)this.class_[0]),
         Pd_1.class_((Integer)this.class_[1]),
         Pd_1.class_((Integer)this.class_[2]),
         Pd_1.class_((Integer)this.class_[3]),
         Pd_1.class_((Integer)this.class_[4])
      );
   }

   @Override
   public int hashCode() {
      int var1 = (int)rU_2.byte_((Integer)this.class_[0], (Integer)this.class_[1], (Integer)this.class_[2]);
      var1 = var1 * 630627507 + (Integer)this.class_[3];
      return var1 * -283028380 + (Integer)this.class_[4];
   }

   @Override
   public double class_() {
      return Double.NEGATIVE_INFINITY;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-61, -52, 51, 72, 18, 47, 23, 58}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7478469126141294663L;
   }

   @Override
   public double class_(int var1, int var2, int var3) {
      int var4 = (var1 - (Integer)this.class_[0]) * (Integer)this.class_[3] + (var3 - (Integer)this.class_[2]) * (Integer)this.class_[4];
      int var5 = Math.abs((var1 - (Integer)this.class_[0]) * (Integer)this.class_[4]) + Math.abs((var3 - (Integer)this.class_[2]) * (Integer)this.class_[3]);
      int var6 = Math.abs(var2 - (Integer)this.class_[1]);
      double var7 = (double)(-var4 * 100);
      var7 += (double)(var5 * 1000);
      return var7 + (double)(var6 * 1000);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1306671006;
   }

   @Override
   public boolean break_(int var1, int var2, int var3) {
      return false;
   }

   private static void break_() {
      protected_ = new String[]{new String("GoalStrictDirection{x=%s, y=%s, z=%s, dx=%s, dz=%s}")};
   }

   private static void throws_() {
      case_ = new double[]{Double.NEGATIVE_INFINITY};
   }

   private static void catch_() {
      throws_ = new boolean[]{false, true, false, true, false, false, true, false, false, true, false, false, false, false};
   }

   private static void case_() {
      break_ = new int[]{630627507, -283028380};
   }

   private static void protected_() {
      byte_ = new short[]{0, 1, 2, 3, 4, 3, 4, 0, 3, 2, 4, 0, 4, 2, 3, 1, 1000, 1000, 0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 0, 1, 2, 3, 4, 0, 1, 2, 3, 4};
   }

   private void private_() {
      if (this.class_ == null) {
         this.class_ = new Object[5];
         Object[] var1 = this.class_;
         var1[0] = 0;
         var1[1] = 0;
         var1[2] = 0;
         var1[3] = 0;
         var1[4] = 0;
      }
   }
}
