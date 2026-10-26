package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrnb_3 extends Om_1 {
   private static short[] byte_;
   private static boolean[] protected_;
   public Object[] class_;
   public static Object[] break_;

   public rrnb_3() {
      this.break_();
   }

   static {
      ntfClinit();
   }

   public ao_3 class_() {
      this.break_();
      return (ao_3)this.class_[0];
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{34, 73, -23, 20, 40, -47, -126, 19}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1560584844;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5164332387383149215L;
   }

   public static rrnb_3 class_(ao_3 var0) {
      ((rrnb_3)break_[0]).class_(false);
      ((rrnb_3)break_[0]).class_[0] = var0;
      return (rrnb_3)break_[0];
   }

   private void break_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
         Object[] var1 = this.class_;
      }
   }

   private static void throws_() {
      Object[] var0 = new Object[]{new rrnb_3()};
      break_ = var0;
   }

   private static void case_() {
      protected_ = new boolean[]{false, false, true, true};
   }

   private static void protected_() {
      byte_ = new short[5];
   }
}
