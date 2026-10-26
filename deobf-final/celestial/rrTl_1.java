package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrTl_1 extends rrTC {
   private static short[] protected_;
   private static byte[] throws_;
   public Object[] byte_;

   public rrTl_1(rrTC var1, rrTC var2) {
      super(var2);
      this.private_();
      this.byte_[1] = var1;
      PX var8 = ((rrTC)this.byte_[1]).throws_();
      this.byte_[0] = var8;
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-64, -36, 67, -103, 87, 110, -39, 36}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3338598128255283821L;
   }

   private static int break_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1102986369;
   }

   @Override
   public PX break_(PX var1) {
      this.private_();
      PX var6;
      PX var10000 = var6 = super.break_(var1);
      this.byte_[0] = var6;
      return var10000;
   }

   @Override
   public PX throws_() {
      this.private_();
      return (PX)this.byte_[0];
   }

   private static void catch_() {
      protected_ = new short[]{1, 1, 0, 0, 0};
   }

   private static void case_() {
      throws_ = new byte[]{2};
   }

   private void private_() {
      if (this.byte_ == null) {
         this.byte_ = new Object[2];
         Object[] var1 = this.byte_;
      }
   }
}
