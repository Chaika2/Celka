package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class SC {
   private static boolean[] class_;
   public Object[] break_;
   private static short[] byte_;

   public String byte_() {
      return (String)this.break_[0];
   }

   public SC(String var1) {
      this.class_();
      this.break_[0] = var1;
   }

   static {
      ntfClinit();
   }

   private void class_() {
      if (this.break_ == null) {
         this.break_ = new Object[1];
         Object[] var1 = this.break_;
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1184601894;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8742757687240941025L;
   }

   public abstract int break_();

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-119, 113, -47, 104, 89, 3, -9, 113}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void throws_() {
      byte_ = new short[2];
   }

   private static void protected_() {
      class_ = new boolean[]{true};
   }
}
