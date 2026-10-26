package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrcm_3 extends rrfI_2<Boolean> {
   private static byte[] break_;
   private static boolean[] byte_;
   public Object[] class_;
   private static short[] protected_;

   @Override
   public boolean byte_() {
      return this.break_();
   }

   public rrcm_3(rrcu_3 var1, rrNw_1 var2, rrNd_1 var3) {
      this.throws_();
      this.class_[2] = var1;
      this.class_[0] = var2;
      this.class_[1] = var3;
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 317320827;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{123, -104, -19, -52, -25, 53, 5, 13}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1664999237194343862L;
   }

   public Boolean break_() {
      this.throws_();
      rJY var1 = ((rrNw_1)this.class_[0]).throws_();
      rdn_3 var2 = var1 == null ? ((rrNw_1)this.class_[0]).protected_() : var1.class_();
      if (var2 == null) {
         return false;
      } else {
         List var3 = rrjS_2.class_(var2);
         if (var3 == null) {
            return false;
         } else if (!((rrcu_3)this.class_[2]).class_((rrNd_1)this.class_[1], var2, var3)) {
            return false;
         } else if (!((rrcu_3)this.class_[2]).break_((rrNd_1)this.class_[1], var3)) {
            return false;
         } else {
            return !((rrcu_3)this.class_[2]).class_((rrNd_1)this.class_[1], var3) ? false : byte_[5];
         }
      }
   }

   private void throws_() {
      if (this.class_ == null) {
         this.class_ = new Object[3];
         Object[] var1 = this.class_;
      }
   }

   private static void catch_() {
      byte_ = new boolean[]{false, false, false, false, false, true};
   }

   private static void case_() {
      protected_ = new short[]{2, 0, 1, 0, 0, 2, 1, 2, 1, 2, 1};
   }

   private static void protected_() {
      break_ = new byte[]{3};
   }
}
