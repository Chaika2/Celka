package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLr_1 {
   public static Object[] class_;
   private static boolean[] byte_;
   public Object[] break_;
   private static short[] protected_;

   private static void byte_() {
      Object[] var0 = new Object[]{new rrLr_1()};
      class_ = var0;
   }

   public rrLr_1() {
      this.throws_();
   }

   static {
      ntfClinit();
   }

   public static rrLr_1 class_(rrtO_2 var0) {
      ((rrLr_1)class_[0]).break_[0] = var0;
      return (rrLr_1)class_[0];
   }

   public rrtO_2 class_() {
      return (rrtO_2)this.break_[0];
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -558160979;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7388309012171153629L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{61, 107, 51, -13, 27, -4, -37, -87}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void break_() {
      byte_ = new boolean[]{false, true, true};
   }

   private void throws_() {
      if (this.break_ == null) {
         this.break_ = new Object[1];
         Object[] var1 = this.break_;
      }
   }

   private static void protected_() {
      protected_ = new short[4];
   }
}
