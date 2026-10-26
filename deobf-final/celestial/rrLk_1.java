package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLk_1 {
   private static boolean[] byte_;
   public Object[] class_;
   public static Object[] break_;
   private static short[] protected_;
   private static double[] throws_;

   private static void byte_() {
      protected_ = new short[5];
   }

   public rrLk_1() {
      this.throws_();
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-24, -8, 51, -13, -57, -105, 100, 34}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6109696586066393299L;
   }

   public double class_() {
      return (Double)this.class_[0];
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 2062757537;
   }

   public void class_(double var1) {
      Double var7 = var1;
      this.class_[0] = var7;
   }

   public static rrLk_1 break_(double var0) {
      rrLk_1 var10000 = (rrLk_1)break_[0];
      Double var6 = var0;
      var10000.class_[0] = var6;
      return (rrLk_1)break_[0];
   }

   private static void break_() {
      throws_ = new double[1];
   }

   private void throws_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
         Object[] var1 = this.class_;
         var1[0] = 0.0;
      }
   }

   private static void case_() {
      Object[] var0 = new Object[]{new rrLk_1()};
      break_ = var0;
   }

   private static void protected_() {
      byte_ = new boolean[]{false, true, false, true};
   }
}
