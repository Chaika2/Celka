package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrNp_1 implements rrNC {
   public Object[] class_;
   private static short[] break_;
   private static byte[] byte_;

   private static void byte_() {
      break_ = new short[]{0, 1, 0, 1};
   }

   public rrNp_1(rgP_2 var1, String var2) {
      this.throws_();
      this.class_[0] = var1;
      this.class_[1] = var2;
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1341340741;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7788708698352158817L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-120, -114, 1, -64, 12, -47, -56, -94}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public rgP_2 class_() {
      return (rgP_2)this.class_[0];
   }

   public String break_() {
      return (String)this.class_[1];
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
