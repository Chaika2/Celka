package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class ES extends MM {
   private static short[] protected_;
   private static byte[] throws_;
   public Object[] break_;

   public ES(EP var1, xc_3[][][] var2, rja_3 var3) {
      this.throws_();
      this.break_[0] = var2;
      this.break_[1] = var3;
      xc_3[][][] var10 = (xc_3[][][])this.break_[0];
      this.byte_[0] = var10;
      Integer var11 = ((rja_3)this.break_[1]).b_();
      this.class_[0] = var11;
      Integer var12 = ((rja_3)this.break_[1]).c_();
      this.class_[1] = var12;
      Integer var13 = ((rja_3)this.break_[1]).d_();
      this.class_[2] = var13;
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4368112342949944859L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1455785450;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-80, -72, 111, -47, 15, 112, -51, 54}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private void throws_() {
      if (this.break_ == null) {
         this.break_ = new Object[2];
         Object[] var1 = this.break_;
      }
   }

   private static void catch_() {
      protected_ = new short[]{0, 1, 0, 0, 1, 0, 1, 1, 1, 2};
   }

   private static void case_() {
      throws_ = new byte[]{2};
   }
}
