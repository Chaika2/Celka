package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rn_3 {
   public Object[] class_;
   private static short[] break_;
   private static byte[] byte_;

   private void byte_() {
      if (this.class_ == null) {
         this.class_ = new Object[2];
         Object[] var1 = this.class_;
      }
   }

   public rn_3(rP_2 var1, rC_2 var2) {
      this.byte_();
      Objects.requireNonNull(var2);
      this.class_[0] = var1;
      this.class_[1] = var2;
   }

   static {
      ntfClinit();
   }

   @Override
   public String toString() {
      return (rC_2)this.class_[1] + " " + (rP_2)this.class_[0];
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2136993024907811988L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-59, 12, 124, -4, -114, -56, 63, -22}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 133834271;
   }

   public rP_2 class_() {
      return (rP_2)this.class_[0];
   }

   public rC_2 break_() {
      return (rC_2)this.class_[1];
   }

   private static void throws_() {
      break_ = new short[]{0, 1, 1, 0, 0, 1};
   }

   private static void protected_() {
      byte_ = new byte[]{2};
   }
}
