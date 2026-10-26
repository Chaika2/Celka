package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class ss_3 implements C_for {
   private static boolean[] break_;
   public Object[] class_;
   private static short[] byte_;

   public sS_2 byte_() {
      return (sS_2)this.class_[0];
   }

   ss_3(sS_2 var1) {
      this.protected_();
      this.class_[0] = var1;
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-69, 30, 125, 26, -87, -75, 8, -105}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7954874985029894458L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 478173898;
   }

   @Override
   public C_case break_() {
      return ((F)((sS_2)this.class_[0]).class_[0]).break_();
   }

   private static void throws_() {
      byte_ = new short[4];
   }

   private static void case_() {
      break_ = new boolean[]{true};
   }

   private void protected_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
         Object[] var1 = this.class_;
      }
   }
}
