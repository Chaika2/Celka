package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrNm_1 {
   public Object[] class_;
   private static byte[] break_;
   private static short[] byte_;
   private static boolean[] protected_;

   private static void byte_() {
      break_ = new byte[]{2, 2};
   }

   public rrNm_1(rrNd_1 var1, String var2) {
      this.throws_();
      this.class_[0] = var1;
      this.class_[1] = var2;
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         rrNm_1 var2 = (rrNm_1)var1;
         return Objects.equals((rrNd_1)this.class_[0], (rrNd_1)var2.class_[0]) && Objects.equals((String)this.class_[1], (String)var2.class_[1])
            ? true
            : protected_[3];
      } else {
         return protected_[1];
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash((rrNd_1)this.class_[0], (String)this.class_[1]);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 284811020;
   }

   public rrNd_1 class_() {
      return (rrNd_1)this.class_[0];
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 666599172023230472L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-87, 100, -55, 118, 30, -10, 115, 115}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public String break_() {
      return (String)this.class_[1];
   }

   private void throws_() {
      if (this.class_ == null) {
         this.class_ = new Object[2];
         Object[] var1 = this.class_;
      }
   }

   private static void case_() {
      protected_ = new boolean[]{true, false, true, false, false, true};
   }

   private static void protected_() {
      byte_ = new short[]{0, 0, 1, 1, 0, 1, 0, 1, 0, 1};
   }
}
