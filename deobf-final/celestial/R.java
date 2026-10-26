package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class R implements o_1 {
   public Object[] break_;
   private static short[] class_;
   private static boolean[] byte_;

   @Override
   public boolean byte_() {
      return (Boolean)this.break_[0];
   }

   public R() {
      this.throws_();
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6282458975139689922L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 801668446;
   }

   private static void class_() {
      class_ = new short[2];
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{70, -93, 66, 105, -4, 69, -92, 90}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void break_() {
      Boolean var5 = true;
      this.break_[0] = var5;
   }

   private void throws_() {
      if (this.break_ == null) {
         this.break_ = new Object[1];
         Object[] var1 = this.break_;
         var1[0] = false;
      }
   }

   private static void protected_() {
      byte_ = new boolean[]{true, true, false, false};
   }
}
