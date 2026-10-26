package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class I {
   private static boolean[] byte_;
   public Object[] class_;
   public static Object[] break_;
   private static short[] protected_;

   private static void byte_() {
      Object[] var0 = new Object[]{new I()};
      break_ = var0;
   }

   public I() {
      this.throws_();
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -666575286;
   }

   public Boolean class_() {
      return (Boolean)this.class_[0];
   }

   public void class_(Boolean var1) {
      this.class_[0] = var1;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-79, -108, -87, 33, 57, -90, -32, -74}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5340733805870867199L;
   }

   public static I break_(Boolean var0) {
      ((I)break_[0]).class_[0] = var0;
      return (I)break_[0];
   }

   private static void break_() {
      protected_ = new short[5];
   }

   private void throws_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
         Object[] var1 = this.class_;
      }
   }

   private static void protected_() {
      byte_ = new boolean[]{false, true, true};
   }
}
