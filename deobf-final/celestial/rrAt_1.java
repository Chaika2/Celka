package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAt_1 extends Om_1 {
   private static short[] byte_;
   public static Object[] class_;
   private static boolean[] protected_;
   public Object[] break_;

   public rrAt_1() {
      this.throws_();
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1370175136;
   }

   public rrAw_1 class_() {
      this.throws_();
      return (rrAw_1)this.break_[0];
   }

   public static rrAt_1 class_(rrAw_1 var0) {
      ((rrAt_1)class_[0]).break_[0] = var0;
      ((rrAt_1)class_[0]).class_(false);
      return (rrAt_1)class_[0];
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{55, 29, -68, 76, 40, 76, -51, 17}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7643682723211374362L;
   }

   private static void break_() {
      Object[] var0 = new Object[]{new rrAt_1()};
      class_ = var0;
   }

   private void throws_() {
      if (this.break_ == null) {
         this.break_ = new Object[1];
         Object[] var1 = this.break_;
      }
   }

   private static void case_() {
      protected_ = new boolean[]{false, false, true, true};
   }

   private static void protected_() {
      byte_ = new short[5];
   }
}
