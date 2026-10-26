package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAN {
   private static boolean[] byte_;
   private static short[] protected_;
   public Object[] class_;
   public static Object[] break_;

   private static void byte_() {
      protected_ = new short[6];
   }

   public rrAN() {
      this.protected_();
   }

   static {
      ntfClinit();
   }

   public rLR class_() {
      return (rLR)this.class_[0];
   }

   public static rrAN class_(rLR var0) {
      ((rrAN)break_[0]).class_[0] = var0;
      return (rrAN)break_[0];
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{92, 66, -62, 109, -16, 30, 69, -22}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1447422709;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7056690815489559153L;
   }

   public static void break_(rLR var0) {
      rrAN var1 = class_(var0);
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(var1);
      ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[0]).class_(var1);
   }

   private static void break_() {
      Object[] var0 = new Object[]{new rrAN()};
      break_ = var0;
   }

   private static void throws_() {
      byte_ = new boolean[]{false, true, true};
   }

   private void protected_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
         Object[] var1 = this.class_;
      }
   }
}
