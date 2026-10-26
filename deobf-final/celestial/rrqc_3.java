package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrqc_3 {
   private static byte[] break_;
   public Object[] class_;
   private static boolean[] byte_;
   private static short[] protected_;

   public rja_3 byte_() {
      return (rja_3)this.class_[2];
   }

   public rrqc_3(rrqz_3 var1, rfH_2 var2, rja_3 var3) {
      this.case_();
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
         rrqc_3 var2 = (rrqc_3)var1;
         return Objects.equals((rja_3)this.class_[2], (rja_3)var2.class_[2]);
      } else {
         return byte_[1];
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash((rja_3)this.class_[2]);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2120144782555872217L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-102, -80, 54, -53, -12, 3, -28, -29}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public rrqz_3 class_() {
      return (rrqz_3)this.class_[0];
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -2070234333;
   }

   public rfH_2 break_() {
      return (rfH_2)this.class_[1];
   }

   private static void throws_() {
      protected_ = new short[]{2, 2, 2, 0, 1, 2, 0, 1, 2};
   }

   private static void catch_() {
      byte_ = new boolean[]{true, false, true, false};
   }

   private void case_() {
      if (this.class_ == null) {
         this.class_ = new Object[3];
      }
   }

   private static void protected_() {
      break_ = new byte[]{3};
   }
}
