package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrym_1 extends rryv_1 {
   private static short[] break_;
   public Object[] class_;
   private static boolean[] byte_;

   public rrym_1(rryk_1 var1) {
      this.private_();
      this.class_[0] = var1;
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1224876525;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6760242133329309018L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{105, -65, 30, -71, -64, -14, -88, -55}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public rryF class_() {
      return (rryF)rryF.staticFieldsfd087588ab503ef5ba48903746a1e506[2];
   }

   public rryk_1 break_() {
      this.private_();
      return (rryk_1)this.class_[0];
   }

   private static void catch_() {
      break_ = new short[]{2, 0, 0};
   }

   private static void case_() {
      byte_ = new boolean[]{true};
   }

   private void private_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
      }
   }
}
