package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rD_2 extends rK_2 {
   public Object[] break_;
   private static short[] byte_;
   private static byte[] protected_;

   @Override
   public PX byte_() {
      this.case_();
      return (PX)this.break_[0];
   }

   public rD_2(rK_2 var1, rK_2 var2) {
      super(var2);
      this.case_();
      this.break_[1] = var1;
      PX var8 = ((rK_2)this.break_[1]).byte_();
      this.break_[0] = var8;
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 496327860325629408L;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{76, -48, 12, -53, 72, 99, 117, -18}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int break_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -659182227;
   }

   @Override
   public PX break_(PX var1) {
      this.case_();
      PX var6;
      PX var10000 = var6 = super.break_(var1);
      this.break_[0] = var6;
      return var10000;
   }

   private static void throws_() {
      protected_ = new byte[]{2};
   }

   private void case_() {
      if (this.break_ == null) {
         this.break_ = new Object[2];
         Object[] var1 = this.break_;
      }
   }

   private static void protected_() {
      byte_ = new short[]{1, 1, 0, 0, 0};
   }
}
