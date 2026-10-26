package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class bR_2 extends rn_3 {
   public Object[] break_;
   private static boolean[] byte_;
   private static short[] protected_;

   private static void byte_() {
      protected_ = new short[1];
   }

   public bR_2(rP_2 var1, rC_2 var2, EZ var3) {
      super(var1, var2);
      this.protected_();
      this.break_[0] = var3;
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 73762650;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1588265897270969577L;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-76, -128, -49, -66, -74, -101, 22, -19}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void throws_() {
      byte_ = new boolean[]{true};
   }

   private void protected_() {
      if (this.break_ == null) {
         this.break_ = new Object[1];
         Object[] var1 = this.break_;
      }
   }
}
