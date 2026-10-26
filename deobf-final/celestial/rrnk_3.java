package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrnk_3 {
   public Object[] class_;
   private static boolean[] byte_;
   private static short[] protected_;
   public static Object[] break_;

   private static void byte_() {
      byte_ = new boolean[]{false, true, true};
   }

   public rrnk_3() {
      this.protected_();
   }

   static {
      ntfClinit();
   }

   public static rrnk_3 class_(cM_2 var0) {
      ((rrnk_3)break_[0]).class_[0] = var0;
      return (rrnk_3)break_[0];
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1713691889;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4733079032950355007L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{20, -60, -42, 64, -107, 91, 64, 17}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public cM_2 class_() {
      return (cM_2)this.class_[0];
   }

   private static void break_() {
      Object[] var0 = new Object[]{new rrnk_3()};
      break_ = var0;
   }

   private static void throws_() {
      protected_ = new short[4];
   }

   private void protected_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
         Object[] var1 = this.class_;
      }
   }
}
