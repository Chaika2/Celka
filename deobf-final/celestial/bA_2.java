package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class bA_2 extends bv_3 {
   private static byte[] byte_;
   private static short[] protected_;
   public Object[] break_;

   public bA_2(rfl_3 var1, bL_2[] var2, int var3, bF_2 var4, bF_2 var5) {
      super(var1, var2, var3);
      this.native_();
      this.break_[0] = var4;
      this.break_[1] = var5;
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1855909280;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1984615722048095432L;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{84, -73, -126, 65, -61, 17, 24, 105}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void finally_() {
      byte_ = new byte[]{2};
   }

   private static void extends_() {
      protected_ = new short[]{0, 1, 0, 1};
   }

   public bF_2 implements_() {
      this.native_();
      return (bF_2)this.break_[1];
   }

   public bF_2 private_() {
      this.native_();
      return (bF_2)this.break_[0];
   }

   private void native_() {
      if (this.break_ == null) {
         this.break_ = new Object[2];
         Object[] var1 = this.break_;
      }
   }
}
