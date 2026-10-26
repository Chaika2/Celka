package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrcS_2 implements rrcT_2<rrfs_3> {
   public Object[] class_;
   private static boolean[] break_;
   private static short[] byte_;

   private void byte_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
         Object[] var1 = this.class_;
      }
   }

   public rrcS_2(rrfs_3 var1) {
      this.byte_();
      this.class_[0] = var1;
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1181179542;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3141396676239308699L;
   }

   public rrfs_3 class_() {
      return (rrfs_3)this.class_[0];
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{121, -121, -64, 32, 124, 55, -61, -59}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public rrfI_2<rrfs_3> class_(rrNd_1 var1, rrNw_1 var2) {
      return new rrcs_3(this, var2);
   }

   private static void break_() {
      break_ = new boolean[]{true};
   }

   private static void protected_() {
      byte_ = new short[2];
   }
}
