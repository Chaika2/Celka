package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrFp_1 {
   public Object[] class_;
   public static Object[] break_;
   private static short[] byte_;
   private static boolean[] protected_;

   private static void byte_() {
      protected_ = new boolean[]{false, true, true};
   }

   public rrFp_1() {
      this.protected_();
   }

   static {
      ntfClinit();
   }

   public static rrFp_1 class_(Aw_1 var0) {
      ((rrFp_1)break_[0]).class_[0] = var0;
      return (rrFp_1)break_[0];
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -964417762;
   }

   public Aw_1 class_() {
      return (Aw_1)this.class_[0];
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3497160486310001092L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-108, 66, 127, -75, -86, 109, 9, -5}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void break_() {
      byte_ = new short[4];
   }

   private static void throws_() {
      Object[] var0 = new Object[]{new rrFp_1()};
      break_ = var0;
   }

   private void protected_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
         Object[] var1 = this.class_;
      }
   }
}
