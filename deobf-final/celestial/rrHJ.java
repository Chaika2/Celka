package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrHJ {
   private static boolean[] break_;
   private static byte[] byte_;
   public Object[] class_;
   private static short[] protected_;

   public xd_3 byte_() {
      return (xd_3)this.class_[0];
   }

   public rrHJ(xd_3 var1, xc_3 var2, rfH_2 var3) {
      this.catch_();
      this.class_[0] = var1;
      this.class_[1] = var2;
      this.class_[2] = var3;
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         rrHJ var2 = (rrHJ)var1;
         return Objects.equals((xd_3)this.class_[0], (xd_3)var2.class_[0]) && Objects.equals((rfH_2)this.class_[2], (rfH_2)var2.class_[2]) ? true : break_[3];
      } else {
         return break_[1];
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash((xd_3)this.class_[0], (rfH_2)this.class_[2]);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2804394550419784704L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{65, -109, -118, -69, -85, 121, 73, -50}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1309569758;
   }

   public xc_3 class_() {
      return (xc_3)this.class_[1];
   }

   public rfH_2 break_() {
      return (rfH_2)this.class_[2];
   }

   private static void throws_() {
      byte_ = new byte[]{2, 3};
   }

   private void catch_() {
      if (this.class_ == null) {
         this.class_ = new Object[3];
      }
   }

   private static void case_() {
      break_ = new boolean[]{true, false, true, false, false, true};
   }

   private static void protected_() {
      protected_ = new short[]{0, 0, 2, 2, 0, 2, 0, 1, 2, 0, 1, 2};
   }
}
