package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLG {
   public Object[] class_;
   private static boolean[] byte_;
   public static Object[] break_;
   private static short[] protected_;

   private static void byte_() {
      protected_ = new short[4];
   }

   public rrLG() {
      this.break_();
   }

   static {
      ntfClinit();
   }

   public static rrLG class_(SC var0) {
      ((rrLG)break_[0]).class_[0] = var0;
      return (rrLG)break_[0];
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-106, -30, -62, 66, 77, -57, -103, 74}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public SC class_() {
      return (SC)this.class_[0];
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6348743293599382816L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 743676164;
   }

   private void break_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
         Object[] var1 = this.class_;
      }
   }

   private static void throws_() {
      Object[] var0 = new Object[]{new rrLG()};
      break_ = var0;
   }

   private static void protected_() {
      byte_ = new boolean[]{false, true, true};
   }
}
