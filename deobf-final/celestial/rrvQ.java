package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrvQ {
   private static byte[] break_;
   private static short[] byte_;
   private static boolean[] protected_;
   public Object[] class_;

   String byte_() {
      return (String)this.class_[1];
   }

   public rrvQ(String var1, String var2, boolean var3) {
      this.protected_();
      this.class_[0] = var1;
      this.class_[1] = var2;
      Boolean var10 = var3;
      this.class_[2] = var10;
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1567012384;
   }

   private static void class_() {
      protected_ = new boolean[1];
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{18, 71, 112, 109, -22, 72, 21, -36}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2559276905479784104L;
   }

   private static void break_() {
      break_ = new byte[]{3, 2};
   }

   private static void throws_() {
      byte_ = new short[]{0, 1, 2, 0, 1, 2};
   }

   boolean catch_() {
      return (Boolean)this.class_[2];
   }

   String case_() {
      return (String)this.class_[0];
   }

   private void protected_() {
      if (this.class_ == null) {
         this.class_ = new Object[3];
         Object[] var1 = this.class_;
         var1[2] = false;
      }
   }
}
