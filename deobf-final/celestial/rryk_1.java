package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rryk_1 {
   public Object[] class_;
   private static byte[] break_;
   private static boolean[] byte_;
   private static short[] protected_;

   private static void byte_() {
      byte_ = new boolean[]{true, false};
   }

   public rryk_1(String var1, String var2) {
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
      } else {
         return var1 instanceof rryk_1 var2 ? Objects.equals(this.break_(), var2.break_()) : byte_[1];
      }
   }

   @Override
   public int hashCode() {
      return Objects.hashCode(this.break_());
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6287089806163990618L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-113, -105, -91, -79, 115, 7, 3, 26}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 2024150512;
   }

   public String class_() {
      return (String)this.class_[1];
   }

   public String break_() {
      return (String)this.class_[0];
   }

   private static void throws_() {
      break_ = new byte[]{2};
   }

   private static void case_() {
      protected_ = new short[]{0, 1, 0, 1};
   }

   private void protected_() {
      if (this.class_ == null) {
         this.class_ = new Object[2];
      }
   }
}
