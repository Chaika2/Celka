package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrnm_3 {
   private static boolean[] byte_;
   private static short[] protected_;
   public Object[] class_;
   public static Object[] break_;

   private void byte_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
         Object[] var1 = this.class_;
      }
   }

   public rrnm_3() {
      this.byte_();
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 2080035464;
   }

   public rYB class_() {
      return (rYB)this.class_[0];
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{75, -45, 95, -88, -14, 72, 91, -114}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1450420192883156000L;
   }

   public static rrnm_3 class_(rYB var0) {
      ((rrnm_3)break_[0]).class_[0] = var0;
      return (rrnm_3)break_[0];
   }

   private static void break_() {
      protected_ = new short[4];
   }

   private static void throws_() {
      Object[] var0 = new Object[]{new rrnm_3()};
      break_ = var0;
   }

   private static void protected_() {
      byte_ = new boolean[]{false, true, true};
   }
}
