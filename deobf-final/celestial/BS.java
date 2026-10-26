package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class BS implements rrTj_1 {
   private static short[] break_;
   public Object[] class_;
   private static byte[] byte_;

   private void byte_() {
      if (this.class_ == null) {
         this.class_ = new Object[2];
         Object[] var1 = this.class_;
      }
   }

   public BS(PX var1, boolean var2) {
      this.byte_();
      this.class_[0] = var1;
      Bs_1 var8 = Bs_1.class_(var2);
      this.class_[1] = var8;
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -199678177;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-85, -85, 85, 59, -118, -84, 56, -74}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void class_() {
      break_ = new short[]{0, 1};
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1263594501483820673L;
   }

   private static void break_() {
      byte_ = new byte[]{2};
   }
}
