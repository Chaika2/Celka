package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLm_1 extends Om_1 {
   public static Object[] class_;
   private static short[] byte_;
   private static boolean[] protected_;
   public Object[] break_;

   public rrLm_1() {
      this.break_();
   }

   static {
      ntfClinit();
   }

   public static rrLm_1 class_(rrTi_1 var0) {
      rrLm_1 var1 = break_(var0);
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(var1);
      return var1;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1866096165;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-65, -14, 87, 17, 122, 46, 10, 98}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -290293535589922348L;
   }

   public rrTi_1 class_() {
      this.break_();
      return (rrTi_1)this.break_[0];
   }

   private void break_() {
      if (this.break_ == null) {
         this.break_ = new Object[1];
         Object[] var1 = this.break_;
      }
   }

   public static rrLm_1 break_(rrTi_1 var0) {
      ((rrLm_1)class_[0]).break_[0] = var0;
      ((rrLm_1)class_[0]).class_(false);
      return (rrLm_1)class_[0];
   }

   private static void throws_() {
      Object[] var0 = new Object[]{new rrLm_1()};
      class_ = var0;
   }

   private static void case_() {
      byte_ = new short[6];
   }

   private static void protected_() {
      protected_ = new boolean[]{false, false, true, true};
   }
}
