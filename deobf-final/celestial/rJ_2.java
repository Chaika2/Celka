package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rJ_2 implements rP_2, rx_3 {
   public Object[] class_;
   private static double[] new_;
   private static short[] continue_;
   private static String[] super_;
   private static int[] this_;
   private static boolean[] else_;
   private static byte[] synchronized_;

   private static void byte_() {
      new_ = new double[]{2.0, 0.0};
   }

   public rJ_2(int var1) {
      this.case_();
      Integer var6 = var1;
      this.class_[0] = var6;
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         rJ_2 var2 = (rJ_2)var1;
         return this.class_[0] == var2.class_[0] ? true : else_[5];
      } else {
         return else_[3];
      }
   }

   @Override
   public String toString() {
      return String.format("GoalYLevel{y=%s}", Pd_1.class_((Integer)this.class_[0]));
   }

   @Override
   public int hashCode() {
      return (Integer)this.class_[0] * 1271009915;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{49, 115, 96, 70, 10, -50, 57, -51}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2490053521021185537L;
   }

   public static double class_(int var0, int var1) {
      if (var1 > var0) {
         return package_[2] / 2.0 * (double)(var1 - var0);
      } else {
         return var1 < var0 ? (double)(var0 - var1) * break_ : new_[1];
      }
   }

   @Override
   public double class_(int var1, int var2, int var3) {
      return class_((Integer)this.class_[0], var2);
   }

   private static int break_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1829798921;
   }

   @Override
   public boolean break_(int var1, int var2, int var3) {
      return var2 == this.class_[0] ? true : else_[1];
   }

   private static void break_() {
      synchronized_ = new byte[]{2};
   }

   private static void throws_() {
      else_ = new boolean[]{true, false, true, false, true, false, true, false, true, false, false};
   }

   private static void catch_() {
      super_ = new String[]{new String("GoalYLevel{y=%s}")};
   }

   private void case_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
         Object[] var1 = this.class_;
         var1[0] = 0;
      }
   }

   private static void protected_() {
      this_ = new int[]{1271009915};
   }

   private static void private_() {
      continue_ = new short[7];
   }
}
