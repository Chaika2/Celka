package celestial;

import java.nio.charset.StandardCharsets;
import java.time.DayOfWeek;
import java.time.LocalTime;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrTE {
   private static byte[] break_;
   public Object[] class_;
   private static short[] byte_;

   private void byte_() {
      if (this.class_ == null) {
         this.class_ = new Object[2];
      }
   }

   private rrTE(DayOfWeek var1, LocalTime var2) {
      this.byte_();
      this.class_[0] = var1;
      this.class_[1] = var2;
   }

   private rrTE(LocalTime var1) {
      this(null, var1);
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{123, -4, -76, -51, -75, -28, 35, 119}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6162464395707330069L;
   }

   public static rrTE class_(LocalTime var0) {
      return new rrTE(var0);
   }

   public LocalTime class_() {
      return (LocalTime)this.class_[1];
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1461973258;
   }

   public static rrTE class_(DayOfWeek var0, LocalTime var1) {
      return new rrTE(var0, var1);
   }

   public DayOfWeek break_() {
      return (DayOfWeek)this.class_[0];
   }

   private static void throws_() {
      break_ = new byte[]{2};
   }

   private static void protected_() {
      byte_ = new short[]{0, 1, 0, 1};
   }
}
