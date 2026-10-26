package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAx_1 extends Om_1 {
   public Object[] class_;
   private static short[] byte_;
   public static Object[] break_;
   private static boolean[] protected_;

   public rrAx_1() {
      this.throws_();
   }

   static {
      ntfClinit();
   }

   public rrAd_1 class_() {
      this.throws_();
      return (rrAd_1)this.class_[0];
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-121, 20, -2, 43, 39, -73, 99, -76}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static rrAx_1 class_(rrAd_1 var0) {
      ((rrAx_1)break_[0]).class_[0] = var0;
      ((rrAx_1)break_[0]).class_(false);
      return (rrAx_1)break_[0];
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 99570339125897169L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 957099941;
   }

   private static void break_() {
      protected_ = new boolean[]{false, false, true, true};
   }

   private void throws_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
         Object[] var1 = this.class_;
      }
   }

   private static void case_() {
      byte_ = new short[5];
   }

   private static void protected_() {
      Object[] var0 = new Object[]{new rrAx_1()};
      break_ = var0;
   }
}
