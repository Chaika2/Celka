package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrls_3 extends rrTF<Speed> {
   private static float[] class_;
   private static short[] break_;
   private static double[] byte_;

   private static void byte_() {
      byte_ = new double[2];
   }

   public rrls_3(Speed var1) {
      super(var1);
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{120, 110, 126, 76, 126, 90, 3, 11}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @EventTarget
   public void class_(q_1 var1) {
      if (var1.class_() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         if (((cb_3)import_.class_[57]).Y() || ((cb_3)import_.class_[57]).Pe() || ((cb_3)import_.class_[57]).o_() || ((cb_3)import_.class_[57]).PZ()) {
            return;
         }

         if (((cb_3)import_.class_[57]).BL() && !((rqr_3)((cb_3)import_.class_[57]).break_[17]).private_) {
            ((cb_3)import_.class_[57]).sl();
            return;
         }

         rjU_2 var2 = ((cb_3)import_.class_[57]).rv();
         if (!((cb_3)import_.class_[57]).BL()
            && rrfo_3.byte_()
            && !((gm_3)import_.class_[56]).a_((cb_3)import_.class_[57], ((cb_3)import_.class_[57]).rN().protected_(0.0, var2.byte_, 0.0))) {
            float var3 = 2.0F;
            var2.break_ *= (double)var3;
            var2.protected_ *= (double)var3;
         }
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 2005159457;
   }

   private static void class_() {
      break_ = new short[]{0, 57, 57, 57, 57, 57, 57, 17, 57, 57, 57, 56, 57, 57};
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3219978026483362594L;
   }

   private static void break_() {
      class_ = new float[]{2.0F};
   }
}
