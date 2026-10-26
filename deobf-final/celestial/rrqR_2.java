package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrqR_2 {
   public Object[] class_;
   private static double[] break_;
   private static byte[] byte_;
   private static short[] protected_;
   private static boolean[] throws_;
   private static long[] case_;
   private static float[] catch_;

   private void byte_() {
      if (this.class_ == null) {
         this.class_ = new Object[5];
         this.class_[0] = 0.0;
         this.class_[1] = 0.0;
         this.class_[2] = 0.0;
         this.class_[3] = 0.0F;
         this.class_[4] = 0L;
      }
   }

   public rrqR_2(double var1, double var3, double var5) {
      this.byte_();
      Double var11 = var1;
      this.class_[0] = var11;
      Double var12 = var3;
      this.class_[1] = var12;
      Double var13 = var5;
      this.class_[2] = var13;
      Long var14 = rqR_2.break_();
      this.class_[4] = var14;
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1418349879428632476L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 581142902;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-65, -35, 30, -69, -42, -122, -94, 41}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void class_() {
      break_ = new double[3];
   }

   private static void break_() {
      byte_ = new byte[]{5, 2, 3, 4};
   }

   private static void throws_() {
      protected_ = new short[]{0, 1, 2, 4};
   }

   private static void catch_() {
      throws_ = new boolean[]{false, true};
   }

   private static void case_() {
      catch_ = new float[1];
   }

   private static void protected_() {
      case_ = new long[1];
   }
}
