package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrck_3 implements rrcT_2<rrfh_3> {
   public Object[] class_;
   private static boolean[] break_;
   private static short[] byte_;

   private static void byte_() {
      break_ = new boolean[]{true};
   }

   public rrck_3(rrfh_3 var1) {
      this.protected_();
      this.class_[0] = var1;
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1177372036;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3834815570388926310L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-39, 91, -85, 91, 38, -16, -16, -28}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public rrfh_3 class_() {
      return (rrfh_3)this.class_[0];
   }

   @Override
   public rrfI_2<rrfh_3> class_(rrNd_1 var1, rrNw_1 var2) {
      return new rrcW_2(this, var2);
   }

   private static void break_() {
      byte_ = new short[2];
   }

   private void protected_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
         Object[] var1 = this.class_;
      }
   }
}
