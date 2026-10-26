package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrnW_2 {
   private static short[] break_;
   public Object[] class_;
   private static byte[] byte_;

   public rfj_3 byte_() {
      return (rfj_3)this.class_[3];
   }

   public rrnW_2(rfH_2 var1, xc_3 var2, xd_3 var3, rfj_3 var4) {
      this.catch_();
      this.class_[0] = var1;
      this.class_[1] = var2;
      this.class_[2] = var3;
      this.class_[3] = var4;
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1367470401;
   }

   public xd_3 class_() {
      return (xd_3)this.class_[2];
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-51, -44, -17, -42, 3, -11, 38, 114}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -425039585215094776L;
   }

   public rfH_2 break_() {
      return (rfH_2)this.class_[0];
   }

   private static void throws_() {
      byte_ = new byte[]{4};
   }

   private void catch_() {
      if (this.class_ == null) {
         this.class_ = new Object[4];
         Object[] var1 = this.class_;
      }
   }

   private static void case_() {
      break_ = new short[]{0, 1, 2, 3, 0, 1, 2, 3};
   }

   public xc_3 protected_() {
      return (xc_3)this.class_[1];
   }
}
