package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class y_1 {
   private static byte[] break_;
   private static short[] byte_;
   public Object[] class_;

   public Y byte_() {
      return (Y)this.class_[1];
   }

   public y_1(rud_3 var1, Y var2, ruS_2<?> var3) {
      this.throws_();
      this.class_[0] = var1;
      this.class_[1] = var2;
      this.class_[2] = var3;
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1141619428;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2123466536096503113L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-94, 6, 14, -15, -61, -68, -23, -75}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public rud_3 class_() {
      return (rud_3)this.class_[0];
   }

   public <T extends ruS_2<?>> T break_() {
      return (T)this.class_[2];
   }

   private void throws_() {
      if (this.class_ == null) {
         this.class_ = new Object[3];
         Object[] var1 = this.class_;
      }
   }

   private static void catch_() {
      break_ = new byte[]{3};
   }

   private static void case_() {
      byte_ = new short[]{0, 1, 2, 0, 1, 2, 2};
   }

   public ruS_2<?> protected_() {
      return (ruS_2<?>)this.class_[2];
   }
}
