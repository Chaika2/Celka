package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrHc_1 {
   private static byte[] break_;
   private static short[] byte_;
   private static boolean[] protected_;
   public Object[] class_;

   public String byte_() {
      return (String)this.class_[0];
   }

   public rrHc_1(String var1, String var2, String var3) {
      this.protected_();
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
         rrHc_1 var2 = (rrHc_1)var1;
         return Objects.equals((String)this.class_[0], (String)var2.class_[0])
               && Objects.equals((String)this.class_[1], (String)var2.class_[1])
               && Objects.equals((String)this.class_[2], (String)var2.class_[2])
            ? true
            : protected_[3];
      } else {
         return protected_[1];
      }
   }

   @Override
   public String toString() {
      return "AutoAuthModule.AccountData(login=" + this.byte_() + ", server=" + this.break_() + ", password=" + this.class_() + ")";
   }

   @Override
   public int hashCode() {
      return Objects.hash((String)this.class_[0], (String)this.class_[1], (String)this.class_[2]);
   }

   public String class_() {
      return (String)this.class_[2];
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -339820176;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7908379082467027634L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-13, -22, -62, 22, -88, -12, -2, 11}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public String break_() {
      return (String)this.class_[1];
   }

   private static void throws_() {
      break_ = new byte[]{3, 2, 3};
   }

   private static void catch_() {
      byte_ = new short[]{0, 0, 1, 1, 2, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2};
   }

   private static void case_() {
      protected_ = new boolean[]{true, false, true, false, false, true};
   }

   private void protected_() {
      if (this.class_ == null) {
         this.class_ = new Object[3];
      }
   }
}
