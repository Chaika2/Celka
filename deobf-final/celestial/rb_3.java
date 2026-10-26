package celestial;

import it.unimi.dsi.fastutil.doubles.DoubleIterator;
import it.unimi.dsi.fastutil.doubles.DoubleOpenHashSet;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rb_3 implements PZ, rP_2 {
   public Object[] class_;
   private static byte[] break_;
   private static short[] byte_;
   private static boolean[] protected_;
   private static double[] throws_;
   private static String[] case_;

   private static void byte_() {
      break_ = new byte[]{4, 2, 3, 4, 2, 3};
   }

   public rb_3(rfH_2 var1, int var2) {
      this.throws_();
      Integer var7 = var1.b_();
      this.class_[0] = var7;
      Integer var8 = var1.c_();
      this.class_[1] = var8;
      Integer var9 = var1.d_();
      this.class_[2] = var9;
      Integer var10 = var2 * var2;
      this.class_[3] = var10;
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         rb_3 var2 = (rb_3)var1;
         return this.class_[0] == var2.class_[0] && this.class_[1] == var2.class_[1] && this.class_[2] == var2.class_[2] && this.class_[3] == var2.class_[3]
            ? true
            : protected_[5];
      } else {
         return protected_[3];
      }
   }

   @Override
   public String toString() {
      return String.format(
         "GoalNear{x=%s, y=%s, z=%s, rangeSq=%d}",
         Pd_1.class_((Integer)this.class_[0]),
         Pd_1.class_((Integer)this.class_[1]),
         Pd_1.class_((Integer)this.class_[2]),
         (Integer)this.class_[3]
      );
   }

   @Override
   public int hashCode() {
      return (int)rU_2.byte_((Integer)this.class_[0], (Integer)this.class_[1], (Integer)this.class_[2]) + (Integer)this.class_[3];
   }

   @Override
   public double class_(int var1, int var2, int var3) {
      int var4 = var1 - (Integer)this.class_[0];
      int var5 = var2 - (Integer)this.class_[1];
      int var6 = var3 - (Integer)this.class_[2];
      return rS_2.class_((double)var4, var5, (double)var6);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1333548188069331969L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -550505083;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-60, 67, 55, -70, 98, 98, 89, -61}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public double class_() {
      int var1 = (int)Math.ceil(Math.sqrt((double)((Integer)this.class_[3]).intValue()));
      DoubleOpenHashSet var2 = new DoubleOpenHashSet();
      double var3 = Double.POSITIVE_INFINITY;

      for (int var5 = -var1; var5 <= var1; var5++) {
         for (int var6 = -var1; var6 <= var1; var6++) {
            for (int var7 = -var1; var7 <= var1; var7++) {
               double var8 = this.class_((Integer)this.class_[0] + var5, (Integer)this.class_[1] + var6, (Integer)this.class_[2] + var7);
               if (var8 < var3 && this.break_((Integer)this.class_[0] + var5, (Integer)this.class_[1] + var6, (Integer)this.class_[2] + var7)) {
                  var2.add(var8);
               } else {
                  var3 = Math.min(var3, var8);
               }
            }
         }
      }

      double var10 = throws_[1];
      DoubleIterator var11 = var2.iterator();

      while (var11.hasNext()) {
         double var12 = var11.nextDouble();
         if (var12 < var3) {
            var10 = Math.max(var10, var12);
         }
      }

      return var10;
   }

   @Override
   public rfH_2 break_() {
      return new rfH_2((Integer)this.class_[0], (Integer)this.class_[1], (Integer)this.class_[2]);
   }

   @Override
   public boolean break_(int var1, int var2, int var3) {
      int var4 = var1 - (Integer)this.class_[0];
      int var5 = var2 - (Integer)this.class_[1];
      int var6 = var3 - (Integer)this.class_[2];
      return var4 * var4 + var5 * var5 + var6 * var6 <= this.class_[3] ? true : protected_[1];
   }

   private void throws_() {
      if (this.class_ == null) {
         this.class_ = new Object[4];
         Object[] var1 = this.class_;
         var1[0] = 0;
         var1[1] = 0;
         var1[2] = 0;
         var1[3] = 0;
      }
   }

   private static void catch_() {
      byte_ = new short[]{0, 1, 2, 3, 0, 1, 2, 3, 0, 1, 2, 3, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 0, 1, 1, 2, 2, 3, 3, 0, 1, 2, 3, 0, 1, 2, 3};
   }

   private static void case_() {
      throws_ = new double[]{Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY};
   }

   private static void protected_() {
      case_ = new String[]{new String("GoalNear{x=%s, y=%s, z=%s, rangeSq=%d}")};
   }

   private static void private_() {
      protected_ = new boolean[]{true, false, true, false, true, false, false, true, false, false, true, false, false, false};
   }
}
