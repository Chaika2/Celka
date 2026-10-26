package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrnz_3 {
   private static boolean[] byte_;
   private static short[] protected_;
   public Object[] class_;
   public static Object[] break_;

   private static void byte_() {
      byte_ = new boolean[]{false, true, true};
   }

   public rrnz_3() {
      this.break_();
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6894233272564675L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -744412586;
   }

   public static rrnz_3 class_(rhd_3 var0) {
      ((rrnz_3)break_[0]).class_[0] = var0;
      return (rrnz_3)break_[0];
   }

   public rhd_3 class_() {
      return (rhd_3)this.class_[0];
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{84, -92, -128, -37, -1, -115, -42, -18}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private void break_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
         Object[] var1 = this.class_;
      }
   }

   private static void throws_() {
      protected_ = new short[4];
   }

   private static void protected_() {
      Object[] var0 = new Object[]{new rrnz_3()};
      break_ = var0;
   }
}
