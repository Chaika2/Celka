package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rruz_1 {
   private static boolean[] break_;
   public Object[] class_;
   private static short[] byte_;
   private static byte[] protected_;

   private static void byte_() {
      protected_ = new byte[]{2, 2};
   }

   public rruz_1(String var1, String var2) {
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
         rruz_1 var2 = (rruz_1)var1;
         return Objects.equals((String)this.class_[0], (String)var2.class_[0]) && Objects.equals((String)this.class_[1], (String)var2.class_[1])
            ? true
            : break_[3];
      } else {
         return break_[1];
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash((String)this.class_[0], (String)this.class_[1]);
   }

   public String class_() {
      return (String)this.class_[0];
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1847239551;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-126, 44, -120, 85, -78, 56, -97, 113}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5484671391165483245L;
   }

   public String break_() {
      return (String)this.class_[1];
   }

   private static void throws_() {
      break_ = new boolean[]{true, false, true, false, false, true};
   }

   private static void case_() {
      byte_ = new short[]{0, 0, 1, 1, 0, 1, 0, 1, 0, 1};
   }

   private void protected_() {
      if (this.class_ == null) {
         this.class_ = new Object[2];
         Object[] var1 = this.class_;
      }
   }
}
