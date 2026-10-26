package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrvC {
   private static short[] break_;
   private static byte[] byte_;
   public Object[] class_;

   private static void byte_() {
      break_ = new short[]{0, 1, 0, 1, 0, 1};
   }

   public rrvC(rruQ var1) {
      this.throws_();
      rruv_1 var6 = (rruv_1)rruv_1.class_[0];
      this.class_[1] = var6;
      this.class_[0] = var1;
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1449623099;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-20, -98, -1, -114, -127, -87, -106, 12}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8921968586672149208L;
   }

   public void class_(rruv_1 var1) {
      this.class_[1] = var1;
   }

   public rruv_1 class_() {
      return (rruv_1)this.class_[1];
   }

   public rruQ break_() {
      return (rruQ)this.class_[0];
   }

   private void throws_() {
      if (this.class_ == null) {
         this.class_ = new Object[2];
         Object[] var1 = this.class_;
      }
   }

   private static void protected_() {
      byte_ = new byte[]{2};
   }
}
