package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rB_2 implements rP_2 {
   private static short[] break_;
   public static Object[] class_;
   private static String[] byte_;
   private static boolean[] protected_;
   private static int[] throws_;
   private static double[] case_;

   private static void byte_() {
      Object[] var0 = new Object[]{0.7071067811865476};
      class_ = var0;
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean equals(Object var1) {
      return var1.getClass() == rB_2.class ? true : protected_[3];
   }

   @Override
   public String toString() {
      return "GoalAxis";
   }

   @Override
   public int hashCode() {
      return 201385781;
   }

   @Override
   public double class_(int var1, int var2, int var3) {
      int var4 = Math.abs(var1);
      int var5 = Math.abs(var3);
      int var6 = Math.min(var4, var5);
      int var7 = Math.max(var4, var5);
      int var8 = var7 - var6;
      double var9 = Math.min((double)var4, Math.min((double)var5, (double)var8 * (Double)class_[0]));
      return var9 * (Double)C_throws.break_().PS.class_[0] + rJ_2.class_((Integer)C_throws.break_().instanceof_.class_[0], var2);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3597580886043972284L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 535115551;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{41, -106, -113, -63, 70, 88, -113, -70}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void break_() {
      throws_ = new int[]{201385781};
   }

   @Override
   public boolean break_(int var1, int var2, int var3) {
      return var2 != C_throws.break_().instanceof_.class_[0] || var1 != 0 && var3 != 0 && Math.abs(var1) != Math.abs(var3) ? protected_[1] : protected_[0];
   }

   private static void throws_() {
      break_ = new short[4];
   }

   private static void catch_() {
      protected_ = new boolean[]{true, false, true, false, false, true, false};
   }

   private static void case_() {
      byte_ = new String[]{new String("GoalAxis")};
   }

   private static void protected_() {
      case_ = new double[]{2.0, 2.0, 0.0};
   }
}
