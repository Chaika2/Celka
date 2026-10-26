package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrcO_2 implements rrcT_2<rrfG_2> {
   private static short[] break_;
   public Object[] class_;
   private static boolean[] byte_;

   private static void byte_() {
      byte_ = new boolean[]{true};
   }

   public rrcO_2(rrfG_2 var1) {
      this.break_();
      this.class_[0] = var1;
   }

   static {
      ntfClinit();
   }

   @Override
   public rrfI_2<rrfG_2> class_(rrNd_1 var1, rrNw_1 var2) {
      return new rrch_3(this, var2);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1954426783658740729L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1979926091;
   }

   public rrfG_2 class_() {
      return (rrfG_2)this.class_[0];
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{84, -97, -70, 125, -58, 24, -25, 124}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private void break_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
         Object[] var1 = this.class_;
      }
   }

   private static void protected_() {
      break_ = new short[2];
   }
}
