package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrcx_3 implements rrcT_2<rrfO_2> {
   private static short[] break_;
   public Object[] class_;
   private static boolean[] byte_;

   private void byte_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
         Object[] var1 = this.class_;
      }
   }

   public rrcx_3(rrfO_2 var1) {
      this.byte_();
      this.class_[0] = var1;
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4680518301379964127L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 329258038;
   }

   @Override
   public rrfI_2<rrfO_2> class_(rrNd_1 var1, rrNw_1 var2) {
      return new rrcd_3(this, var2);
   }

   public rrfO_2 class_() {
      return (rrfO_2)this.class_[0];
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-12, -121, -96, 103, 14, -51, 61, -66}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void break_() {
      byte_ = new boolean[]{true};
   }

   private static void protected_() {
      break_ = new short[2];
   }
}
