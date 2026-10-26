package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rryu_1 {
   private static short[] break_;
   private static byte[] byte_;
   private static boolean[] protected_;
   public Object[] class_;

   private static void byte_() {
      break_ = new short[]{0, 0, 0, 0, 1, 0, 1};
   }

   public rryu_1(String var1, rryv_1 var2) {
      this.protected_();
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
         rryu_1 var2 = (rryu_1)var1;
         return Objects.equals((String)this.class_[0], (String)var2.class_[0]);
      } else {
         return protected_[1];
      }
   }

   @Override
   public int hashCode() {
      return Objects.hashCode((String)this.class_[0]);
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-59, -24, -17, -46, -56, 96, -87, 95}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 117002855;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 9219450123234104810L;
   }

   public String class_() {
      return (String)this.class_[0];
   }

   public rryv_1 break_() {
      return (rryv_1)this.class_[1];
   }

   private static void throws_() {
      protected_ = new boolean[]{true, false};
   }

   private static void case_() {
      byte_ = new byte[]{2};
   }

   private void protected_() {
      if (this.class_ == null) {
         this.class_ = new Object[2];
      }
   }
}
