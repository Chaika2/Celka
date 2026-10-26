package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrNT implements rrNV {
   private static boolean[] break_;
   public Object[] class_;
   private static short[] byte_;

   private static void byte_() {
      byte_ = new short[2];
   }

   public rrNT(rgP_2 var1) {
      this.break_();
      this.class_[0] = var1;
   }

   static {
      ntfClinit();
   }

   @Override
   public rgP_2 class_() {
      return (rgP_2)this.class_[0];
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{51, -91, 119, -67, -122, -37, 41, 41}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -937659831;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2254864526163567250L;
   }

   private void break_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
         Object[] var1 = this.class_;
      }
   }

   private static void protected_() {
      break_ = new boolean[]{true};
   }
}
