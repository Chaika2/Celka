package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrCy_1 {
   private static boolean[] break_;
   public Object[] class_;
   private static short[] byte_;

   private void byte_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
      }
   }

   public rrCy_1() {
      this.byte_();
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         rrCy_1 var2 = (rrCy_1)var1;
         return Objects.equals((rfl_3)this.class_[0], (rfl_3)var2.class_[0]);
      } else {
         return break_[1];
      }
   }

   @Override
   public int hashCode() {
      return Objects.hashCode((rfl_3)this.class_[0]);
   }

   public rfl_3 class_() {
      return (rfl_3)this.class_[0];
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{113, -28, 49, -66, 23, 107, -82, 105}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void class_(rfl_3 var1) {
      this.class_[0] = var1;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6307308944059457293L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -652160680;
   }

   private static void break_() {
      byte_ = new short[5];
   }

   private static void protected_() {
      break_ = new boolean[]{true, false, true};
   }
}
