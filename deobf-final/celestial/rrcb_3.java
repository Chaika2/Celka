package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrcb_3 implements rrcT_2<rrfE_2> {
   private static boolean[] break_;
   private static short[] byte_;
   public Object[] class_;

   private static void byte_() {
      break_ = new boolean[]{true};
   }

   public rrcb_3(rrfE_2 var1) {
      this.break_();
      this.class_[0] = var1;
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8916334738466514323L;
   }

   @Override
   public rrfI_2<rrfE_2> class_(rrNd_1 var1, rrNw_1 var2) {
      return new rrcM_2(this, var2);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -357867134;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-70, 105, 19, -4, -57, 112, -64, -120}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public rrfE_2 class_() {
      return (rrfE_2)this.class_[0];
   }

   private void break_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
         Object[] var1 = this.class_;
      }
   }

   private static void protected_() {
      byte_ = new short[2];
   }
}
