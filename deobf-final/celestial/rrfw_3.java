package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrfw_3 {
   private static double[] break_;
   private static short[] byte_;
   private static boolean[] protected_;
   public Object[] class_;
   private static long[] throws_;

   public void byte_() {
      Long var5 = 0L;
      this.class_[0] = var5;
   }

   public rrfw_3() {
      this.private_();
      Long var5 = this.case_();
      this.class_[0] = var5;
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6156807766121165946L;
   }

   public boolean class_(double var1) {
      if (var1 <= 0.0) {
         return true;
      } else {
         return (double)(this.case_() - this.class_[0]) > var1 ? true : protected_[2];
      }
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-123, 14, 25, 48, -84, -20, 120, 0}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 197447281;
   }

   public void class_() {
      Long var5 = this.case_();
      this.class_[0] = var5;
   }

   public long break_() {
      return this.case_() - (Long)this.class_[0];
   }

   private static void throws_() {
      break_ = new double[1];
   }

   private static void catch_() {
      byte_ = new short[5];
   }

   private long case_() {
      return System.currentTimeMillis();
   }

   private static void implements_() {
      throws_ = new long[2];
   }

   private static void protected_() {
      protected_ = new boolean[]{true, true, false, true, false};
   }

   private void private_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
         this.class_[0] = 0L;
      }
   }
}
