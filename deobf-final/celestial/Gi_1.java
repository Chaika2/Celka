package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Gi_1 extends rh_3 {
   private static String[] break_;
   private static int[] byte_;
   private static short[] protected_;
   private static boolean[] throws_;
   private static byte[] case_;

   private static void byte_() {
      protected_ = new short[]{0, 1, 1, 1, 2, 0, 1, 2, 0, 1, 2};
   }

   public Gi_1(rfH_2 var1) {
      super(var1);
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   @Override
   public String toString() {
      return String.format(
         "GoalThreeBlocks{x=%s,y=%s,z=%s}", Pd_1.class_((Integer)this.class_[0]), Pd_1.class_((Integer)this.class_[1]), Pd_1.class_((Integer)this.class_[2])
      );
   }

   @Override
   public int hashCode() {
      return super.hashCode() * 393857768;
   }

   @Override
   public double class_(int var1, int var2, int var3) {
      int var4 = var1 - (Integer)this.class_[0];
      int var5 = var2 - (Integer)this.class_[1];
      int var6 = var3 - (Integer)this.class_[2];
      return rS_2.class_((double)var4, var5 < -1 ? var5 + 2 : (var5 == -1 ? 0 : var5), (double)var6);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1047722277;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5830505949635191587L;
   }

   @Override
   public boolean break_(int var1, int var2, int var3) {
      return var1 == this.class_[0] && (var2 == this.class_[1] || var2 == this.class_[1] - 1 || var2 == this.class_[1] - 2) && var3 == this.class_[2]
         ? true
         : throws_[2];
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{119, 2, -75, -78, -110, -19, -70, -32}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void throws_() {
      break_ = new String[]{new String("GoalThreeBlocks{x=%s,y=%s,z=%s}")};
   }

   private static void catch_() {
      case_ = new byte[]{2, -1, 2, -1, 3, 2};
   }

   private static void case_() {
      byte_ = new int[]{393857768};
   }

   private static void protected_() {
      throws_ = new boolean[]{true, true, false, false, false, true};
   }
}
