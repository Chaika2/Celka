package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rG_2 implements rP_2 {
   private static short[] break_;
   private static boolean[] byte_;
   private static int[] protected_;
   private static double[] throws_;
   private static String[] case_;
   public Object[] class_;

   private static void byte_() {
      protected_ = new int[]{495796690};
   }

   public rG_2(rP_2 var1) {
      this.protected_();
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
         rG_2 var2 = (rG_2)var1;
         return Objects.equals((rP_2)this.class_[0], (rP_2)var2.class_[0]);
      } else {
         return byte_[2];
      }
   }

   @Override
   public String toString() {
      return String.format("GoalInverted{%s}", ((rP_2)this.class_[0]).toString());
   }

   @Override
   public int hashCode() {
      return ((rP_2)this.class_[0]).hashCode() * 495796690;
   }

   @Override
   public double class_(int var1, int var2, int var3) {
      return -((rP_2)this.class_[0]).class_(var1, var2, var3);
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-45, 48, -63, -68, -65, 58, -93, -57}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -814363674889322582L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 862855768;
   }

   @Override
   public double class_() {
      return Double.NEGATIVE_INFINITY;
   }

   private static void break_() {
      byte_ = new boolean[]{false, true, false, true, false, true};
   }

   @Override
   public boolean break_(int var1, int var2, int var3) {
      return false;
   }

   private static void throws_() {
      throws_ = new double[]{Double.NEGATIVE_INFINITY};
   }

   private static void catch_() {
      break_ = new short[6];
   }

   private static void case_() {
      case_ = new String[]{new String("GoalInverted{%s}")};
   }

   private void protected_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
         Object[] var1 = this.class_;
      }
   }
}
