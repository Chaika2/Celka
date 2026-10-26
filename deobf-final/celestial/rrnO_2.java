package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrnO_2 {
   private static short[] byte_;
   public static Object[] class_;
   private static byte[] protected_;
   private static boolean[] throws_;
   public Object[] break_;

   private static void byte_() {
      protected_ = new byte[]{2};
   }

   public rrnO_2() {
      this.protected_();
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1915576359;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-105, -116, -62, 31, -14, -84, 6, -127}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2232792347216104352L;
   }

   public ryO_2 class_() {
      return (ryO_2)this.break_[0];
   }

   public static rrnO_2 class_(ryO_2 var0, rfH_2 var1) {
      ((rrnO_2)class_[0]).break_[0] = var0;
      ((rrnO_2)class_[0]).break_[1] = var1;
      return (rrnO_2)class_[0];
   }

   public rfH_2 break_() {
      return (rfH_2)this.break_[1];
   }

   private static void throws_() {
      Object[] var0 = new Object[]{new rrnO_2()};
      class_ = var0;
   }

   private static void catch_() {
      byte_ = new short[]{0, 0, 0, 1, 0, 0, 1};
   }

   private static void case_() {
      throws_ = new boolean[]{false, true};
   }

   private void protected_() {
      if (this.break_ == null) {
         this.break_ = new Object[2];
         Object[] var1 = this.break_;
      }
   }
}
