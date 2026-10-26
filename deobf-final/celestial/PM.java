package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.Optional;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class PM {
   private static byte[] break_;
   public Object[] class_;
   private static short[] byte_;

   private void byte_() {
      if (this.class_ == null) {
         this.class_ = new Object[2];
         Object[] var1 = this.class_;
      }
   }

   public PM(PO var1, a_1 var2) {
      this.byte_();
      Objects.requireNonNull(var1);
      this.class_[0] = var2;
      this.class_[1] = var1;
   }

   public PM(PO var1) {
      this(var1, null);
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-67, -78, -8, -50, 31, 127, 98, 11}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5325629904514335996L;
   }

   public Optional<a_1> class_() {
      return Optional.ofNullable((a_1)this.class_[0]);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1512224130;
   }

   public PO break_() {
      return (PO)this.class_[1];
   }

   private static void throws_() {
      break_ = new byte[]{2};
   }

   private static void protected_() {
      byte_ = new short[]{0, 1, 0, 1};
   }
}
