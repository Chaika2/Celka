package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAG {
   public Object[] class_;
   public static Object[] break_;
   private static boolean[] byte_;
   private static short[] protected_;

   private static void byte_() {
      byte_ = new boolean[]{false, true, true};
   }

   public rrAG() {
      this.break_();
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-126, -19, -46, -36, 47, -113, 78, 117}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 16421677;
   }

   public rjU_2 class_() {
      return (rjU_2)this.class_[0];
   }

   public static rrAG class_(rjU_2 var0) {
      ((rrAG)break_[0]).class_[0] = var0;
      return (rrAG)break_[0];
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8873870976576787414L;
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
      Object[] var0 = new Object[]{new rrAG()};
      break_ = var0;
   }
}
