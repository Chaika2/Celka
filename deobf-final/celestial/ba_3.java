package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class ba_3 {
   private static double[] break_;
   private static byte[] byte_;
   private static short[] protected_;
   public Object[] class_;
   private static boolean[] throws_;

   private static void byte_() {
      break_ = new double[4];
   }

   public ba_3(roE_2 var1) {
      this.break_();
      Double var6 = var1.throws_();
      this.class_[0] = var6;
      Double var7 = var1.catch_();
      this.class_[1] = var7;
      Double var8 = var1.case_();
      this.class_[2] = var8;
      Double var9 = var1.private_();
      this.class_[3] = var9;
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 2022537167;
   }

   public boolean class_(int var1, int var2) {
      return (double)var1 > this.class_[0] && (double)(var1 + 1) < this.class_[1] && (double)var2 > this.class_[2] && (double)(var2 + 1) < this.class_[3]
         ? true
         : throws_[7];
   }

   private static void class_() {
      protected_ = new short[]{0, 1, 2, 3, 0, 1, 2, 3, 0, 1, 2, 3};
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -322604063719551415L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{64, 21, -101, -6, -29, -117, -113, 31}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public boolean break_(int var1, int var2) {
      return (double)(var1 + 1) > this.class_[0] && (double)var1 < this.class_[1] && (double)(var2 + 1) > this.class_[2] && (double)var2 < this.class_[3]
         ? true
         : throws_[3];
   }

   private void break_() {
      if (this.class_ == null) {
         this.class_ = new Object[4];
         Object[] var1 = this.class_;
         var1[0] = 0.0;
         var1[1] = 0.0;
         var1[2] = 0.0;
         var1[3] = 0.0;
      }
   }

   private static void throws_() {
      byte_ = new byte[]{4, 2, 3};
   }

   private static void protected_() {
      throws_ = new boolean[]{true, true, true, false, true, true, true, false, false, true};
   }
}
