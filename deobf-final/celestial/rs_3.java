package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rs_3 implements rP_2 {
   private static short[] break_;
   private static boolean[] byte_;
   public Object[] class_;
   private static double[] protected_;

   private static void byte_() {
      break_ = new short[9];
   }

   public rs_3(rP_2... var1) {
      this.throws_();
      this.class_[0] = var1;
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         rs_3 var2 = (rs_3)var1;
         return Arrays.equals((Object[])((rP_2[])this.class_[0]), (Object[])((rP_2[])var2.class_[0]));
      } else {
         return byte_[6];
      }
   }

   @Override
   public String toString() {
      return "GoalComposite" + Arrays.toString((Object[])((rP_2[])this.class_[0]));
   }

   @Override
   public int hashCode() {
      return Arrays.hashCode((Object[])((rP_2[])this.class_[0]));
   }

   @Override
   public double class_(int var1, int var2, int var3) {
      double var4 = Double.MAX_VALUE;

      for (rP_2 var9 : (rP_2[])this.class_[0]) {
         var4 = Math.min(var4, var9.class_(var1, var2, var3));
      }

      return var4;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 796425861;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-24, 106, -37, -44, 22, -77, -117, -47}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -592638550000721693L;
   }

   @Override
   public double class_() {
      double var1 = Double.MAX_VALUE;

      for (rP_2 var6 : (rP_2[])this.class_[0]) {
         var1 = Math.min(var1, var6.class_());
      }

      return var1;
   }

   @Override
   public boolean break_(int var1, int var2, int var3) {
      for (rP_2 var7 : (rP_2[])this.class_[0]) {
         if (var7.break_(var1, var2, var3)) {
            return true;
         }
      }

      return byte_[2];
   }

   public rP_2[] break_() {
      return (rP_2[])this.class_[0];
   }

   private void throws_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
         Object[] var1 = this.class_;
      }
   }

   private static void case_() {
      byte_ = new boolean[]{false, true, false, false, false, true, false, true};
   }

   private static void protected_() {
      protected_ = new double[]{Double.MAX_VALUE, Double.MAX_VALUE};
   }
}
