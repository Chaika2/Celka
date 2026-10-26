package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class BQ {
   private static byte[] break_;
   private static short[] byte_;
   private static long[] protected_;
   public Object[] class_;

   public an_3 byte_() {
      return (an_3)this.class_[0];
   }

   public BQ(an_3 var1, rjU_2 var2, rdn_3 var3, List<BN> var4) {
      this.case_();
      this.class_[0] = var1;
      this.class_[2] = var2;
      this.class_[1] = var3;
      this.class_[3] = var4;
      Long var13 = rqR_2.break_();
      this.class_[4] = var13;
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-18, -20, 67, 77, 27, 113, -74, 124}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6234106365949094498L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1042232214;
   }

   public long class_() {
      return (Long)this.class_[4];
   }

   public rjU_2 break_() {
      return (rjU_2)this.class_[2];
   }

   public rdn_3 throws_() {
      return (rdn_3)this.class_[1];
   }

   private static void catch_() {
      protected_ = new long[1];
   }

   private void case_() {
      if (this.class_ == null) {
         this.class_ = new Object[5];
         Object[] var1 = this.class_;
         var1[4] = 0L;
      }
   }

   private static void implements_() {
      byte_ = new short[]{0, 2, 1, 3, 4, 0, 1, 2, 3, 4};
   }

   public List<BN> protected_() {
      return (List<BN>)this.class_[3];
   }

   private static void private_() {
      break_ = new byte[]{5, 4};
   }
}
