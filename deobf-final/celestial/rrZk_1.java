package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrZk_1 {
   private static short[] break_;
   private static boolean[] byte_;
   public Object[] class_;

   private void byte_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
         Object[] var1 = this.class_;
      }
   }

   public rrZk_1(String var1) {
      this.byte_();
      this.class_[0] = var1;
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         rrZk_1 var2 = (rrZk_1)var1;
         return Objects.equals(((String)this.class_[0]).toLowerCase(), ((String)var2.class_[0]).toLowerCase());
      } else {
         return byte_[1];
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(((String)this.class_[0]).toLowerCase());
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{25, 38, -109, 56, 11, -20, 85, -29}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public String class_() {
      return (String)this.class_[0];
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6952051550290940521L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1735071235;
   }

   private static void break_() {
      break_ = new short[5];
   }

   private static void protected_() {
      byte_ = new boolean[]{true, false, true, false, true};
   }
}
