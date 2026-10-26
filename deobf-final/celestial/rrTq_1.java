package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrTq_1 {
   private static byte[] break_;
   private static short[] byte_;
   public Object[] class_;

   private static void byte_() {
      byte_ = new short[]{0, 1, 0, 1};
   }

   public rrTq_1(rjG_2 var1, PX var2) {
      this.throws_();
      this.class_[0] = var1;
      this.class_[1] = var2;
   }

   static {
      ntfClinit();
   }

   public rjG_2 class_() {
      return (rjG_2)this.class_[0];
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -488229195;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -306860869783657544L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-120, 104, -52, -83, -59, 119, 91, 5}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public PX break_() {
      return (PX)this.class_[1];
   }

   private void throws_() {
      if (this.class_ == null) {
         this.class_ = new Object[2];
         Object[] var1 = this.class_;
      }
   }

   private static void protected_() {
      break_ = new byte[]{2};
   }
}
