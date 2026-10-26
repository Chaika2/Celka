package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrcq_3 extends rrfI_2<Boolean> {
   private static byte[] break_;
   private static short[] byte_;
   public Object[] class_;

   @Override
   public boolean byte_() {
      return this.break_();
   }

   public rrcq_3(rrcp_3 var1, rrNw_1 var2, rrNd_1 var3) {
      this.case_();
      this.class_[0] = var2;
      this.class_[1] = var3;
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{26, -37, 124, -87, 43, -57, -37, -6}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1220632854;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2761279932027189137L;
   }

   public Boolean break_() {
      this.case_();
      rJY var1 = ((rrNw_1)this.class_[0]).throws_();
      rdb_3 var2 = ((rrNd_1)this.class_[1]).catch_();
      rdb_3 var3 = var1 == null ? ((rrNw_1)this.class_[0]).protected_().break_() : var1.class_().break_();
      return var2.equals(var3);
   }

   private static void throws_() {
      break_ = new byte[]{2};
   }

   private void case_() {
      if (this.class_ == null) {
         this.class_ = new Object[2];
         Object[] var1 = this.class_;
      }
   }

   private static void protected_() {
      byte_ = new short[]{0, 1, 0, 1, 0};
   }
}
