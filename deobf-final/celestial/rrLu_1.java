package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLu_1 extends Om_1 {
   private static short[] byte_;
   public static Object[] class_;
   private static boolean[] protected_;
   public Object[] break_;

   public rrLu_1() {
      this.protected_();
   }

   static {
      ntfClinit();
   }

   public ruS_2<?> class_() {
      this.protected_();
      return (ruS_2<?>)this.break_[0];
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-120, 70, -100, -58, 10, -21, -100, -109}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1574579528;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3008522570260363189L;
   }

   public static rrLu_1 class_(ruS_2<?> var0) {
      rrLu_1 var1 = break_(var0);
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(var1);
      ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[0]).class_(var1);
      return var1;
   }

   public static rrLu_1 break_(ruS_2<?> var0) {
      ((rrLu_1)class_[0]).break_[0] = var0;
      ((rrLu_1)class_[0]).class_(false);
      return (rrLu_1)class_[0];
   }

   private static void break_() {
      Object[] var0 = new Object[]{new rrLu_1()};
      class_ = var0;
   }

   private static void throws_() {
      byte_ = new short[7];
   }

   private static void case_() {
      protected_ = new boolean[]{false, false, true, true};
   }

   private void protected_() {
      if (this.break_ == null) {
         this.break_ = new Object[1];
         Object[] var1 = this.break_;
      }
   }
}
