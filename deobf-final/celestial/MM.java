package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class MM extends rl_3 implements rw_3 {
   public Object[] byte_;
   private static short[] break_;
   private static boolean[] protected_;

   public static String byte_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-111, -105, -64, 66, -93, 117, 29, 36}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public MM() {
      this.catch_();
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -2140340269;
   }

   @Override
   public xc_3 class_(int var1, int var2, int var3, xc_3 var4, List<xc_3> var5) {
      this.catch_();
      return ((xc_3[][][])this.byte_[0])[var1][var3][var2];
   }

   @Override
   public xc_3 class_(int var1, int var2, int var3) {
      this.catch_();
      return ((xc_3[][][])this.byte_[0])[var1][var3][var2];
   }

   @Override
   public xc_3[] class_(int var1, int var2) {
      this.catch_();
      return ((xc_3[][][])this.byte_[0])[var1][var2];
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5667185515423505910L;
   }

   private static void throws_() {
      protected_ = new boolean[]{true};
   }

   private void catch_() {
      if (this.byte_ == null) {
         this.byte_ = new Object[1];
         Object[] var1 = this.byte_;
      }
   }

   private static void case_() {
      break_ = new short[3];
   }
}
