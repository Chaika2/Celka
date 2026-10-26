package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLE extends Om_1 {
   private static short[] byte_;
   public Object[] class_;
   private static boolean[] protected_;
   public static Object[] break_;

   public rrLE() {
      this.protected_();
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8398178785711850925L;
   }

   public static rrLE class_(cW_2 var0) {
      rrLE var1 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(break_(var0));
      ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[0]).class_(var1);
      return var1;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-126, -19, 48, 13, 92, -45, 51, 84}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -2072374487;
   }

   public cW_2 class_() {
      this.protected_();
      return (cW_2)this.class_[0];
   }

   private static rrLE break_(cW_2 var0) {
      ((rrLE)break_[0]).class_[0] = var0;
      ((rrLE)break_[0]).class_(false);
      return (rrLE)break_[0];
   }

   private static void break_() {
      byte_ = new short[7];
   }

   private static void throws_() {
      protected_ = new boolean[]{false, false, true, true};
   }

   private static void case_() {
      Object[] var0 = new Object[]{new rrLE()};
      break_ = var0;
   }

   private void protected_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
         Object[] var1 = this.class_;
      }
   }
}
