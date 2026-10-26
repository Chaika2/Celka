package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrpQ_2 {
   private static boolean[] break_;
   public Object[] class_;
   private static short[] byte_;
   private static byte[] protected_;

   public rrNt_1 byte_() {
      return (rrNt_1)this.class_[0];
   }

   public rrpQ_2 byte_(boolean var1) {
      Boolean var6 = var1;
      this.class_[1] = var6;
      return this;
   }

   public rrpQ_2(rrNt_1 var1) {
      this.throws_();
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
         rrpQ_2 var2 = (rrpQ_2)var1;
         return Objects.equals((rrNt_1)this.class_[0], (rrNt_1)var2.class_[0]);
      } else {
         return break_[1];
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash((rrNt_1)this.class_[0]);
   }

   public boolean class_() {
      return (Boolean)this.class_[3];
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -854060504;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2419275975293679545L;
   }

   public rrpQ_2 class_(boolean var1) {
      Boolean var6 = var1;
      this.class_[2] = var6;
      return this;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{114, 106, -41, -110, -44, -111, 38, 11}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public rrpQ_2 break_(boolean var1) {
      Boolean var6 = var1;
      this.class_[3] = var6;
      return this;
   }

   public boolean break_() {
      return (Boolean)this.class_[1];
   }

   private void throws_() {
      if (this.class_ == null) {
         this.class_ = new Object[4];
         this.class_[1] = false;
         this.class_[2] = false;
         this.class_[3] = false;
      }
   }

   private static void catch_() {
      byte_ = new short[]{1, 2, 3, 0, 0, 0, 0, 1, 2, 3, 0};
   }

   private static void case_() {
      break_ = new boolean[]{true, false, true, false, true, false, false, false};
   }

   public boolean protected_() {
      return (Boolean)this.class_[2];
   }

   private static void private_() {
      protected_ = new byte[]{4, 2, 3};
   }
}
