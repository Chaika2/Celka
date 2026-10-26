package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrcs_3 extends rrfI_2<rrfs_3> {
   private static byte[] break_;
   public Object[] class_;
   private static short[] byte_;
   private static boolean[] protected_;

   @Override
   public boolean byte_() {
      this.catch_();
      return this.break_() == (rrfs_3)((rrcS_2)this.class_[1]).class_[0] ? true : protected_[1];
   }

   public rrcs_3(rrcS_2 var1, rrNw_1 var2) {
      this.catch_();
      this.class_[1] = var1;
      this.class_[0] = var2;
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2326983981678645917L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{89, -90, 4, -122, -7, 121, -84, -115}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1368275262;
   }

   public rrfs_3 break_() {
      this.catch_();
      rJY var1 = ((rrNw_1)this.class_[0]).throws_();
      return rrfs_3.class_(var1 == null ? ((rrNw_1)this.class_[0]).protected_() : var1.class_());
   }

   private static void throws_() {
      protected_ = new boolean[]{true, false};
   }

   private void catch_() {
      if (this.class_ == null) {
         this.class_ = new Object[2];
         Object[] var1 = this.class_;
      }
   }

   private static void case_() {
      break_ = new byte[]{2};
   }

   private static void protected_() {
      byte_ = new short[]{1, 0, 0, 0, 1, 0};
   }
}
