package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrcw_3 extends rrfI_2<Boolean> {
   private static boolean[] break_;
   public Object[] class_;
   private static short[] byte_;
   private static byte[] protected_;

   @Override
   public boolean byte_() {
      return this.break_();
   }

   public rrcw_3(rrct_3 var1, rrNw_1 var2, rrNd_1 var3) {
      this.protected_();
      this.class_[2] = var1;
      this.class_[0] = var2;
      this.class_[1] = var3;
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{105, 66, -30, 94, -79, 6, 90, 26}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1922496675;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6183939659540882686L;
   }

   public Boolean break_() {
      this.protected_();
      rJY var1 = ((rrNw_1)this.class_[0]).throws_();
      rdn_3 var2 = var1 == null ? ((rrNw_1)this.class_[0]).protected_() : var1.class_();
      if (var2 != null && var2.package_() != null) {
         List var3 = ((rrct_3)this.class_[2]).class_(var2);
         if (!((rrct_3)this.class_[2]).class_((rrNd_1)this.class_[1], var3)) {
            return false;
         } else {
            return !((rrct_3)this.class_[2]).break_((rrNd_1)this.class_[1], var3) ? false : ((rrct_3)this.class_[2]).byte_((rrNd_1)this.class_[1], var3);
         }
      } else {
         return break_[0];
      }
   }

   private static void throws_() {
      protected_ = new byte[]{3};
   }

   private static void catch_() {
      byte_ = new short[]{2, 0, 1, 0, 0, 2, 2, 1, 2, 1, 2, 1};
   }

   private static void case_() {
      break_ = new boolean[3];
   }

   private void protected_() {
      if (this.class_ == null) {
         this.class_ = new Object[3];
         Object[] var1 = this.class_;
      }
   }
}
