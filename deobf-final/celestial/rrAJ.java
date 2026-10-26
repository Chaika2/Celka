package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAJ {
   public Object[] class_;
   private static boolean[] byte_;
   public static Object[] break_;
   private static short[] protected_;

   private void byte_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
         Object[] var1 = this.class_;
      }
   }

   public rrAJ() {
      this.byte_();
   }

   static {
      ntfClinit();
   }

   public void class_(iM_2 var1) {
      this.class_[0] = var1;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-104, 124, -36, -120, -72, 57, 97, -52}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public iM_2 class_() {
      return (iM_2)this.class_[0];
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 917425419;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5030345346690978495L;
   }

   public static rrAJ break_(iM_2 var0) {
      ((rrAJ)break_[0]).class_[0] = var0;
      return (rrAJ)break_[0];
   }

   private static void break_() {
      protected_ = new short[5];
   }

   private static void throws_() {
      byte_ = new boolean[]{false, true, true};
   }

   private static void protected_() {
      Object[] var0 = new Object[]{new rrAJ()};
      break_ = var0;
   }
}
