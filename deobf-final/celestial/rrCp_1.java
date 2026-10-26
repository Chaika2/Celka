package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrCp_1 {
   private static short[] break_;
   public Object[] class_;
   private static boolean[] byte_;

   private void byte_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
      }
   }

   public rrCp_1() {
      this.byte_();
   }

   static {
      ntfClinit();
   }

   public rfl_3 class_() {
      return (rfl_3)this.class_[0];
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2292470231693026289L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1742568107;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-72, -41, 25, -57, 78, 47, 22, -42}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void class_(rfl_3 var1) {
      this.class_[0] = var1;
   }

   private static void break_() {
      byte_ = new boolean[]{true};
   }

   private static void protected_() {
      break_ = new short[2];
   }
}
