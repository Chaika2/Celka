package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAM {
   private static boolean[] byte_;
   public Object[] class_;
   private static short[] protected_;
   public static Object[] break_;

   private void byte_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
         Object[] var1 = this.class_;
      }
   }

   public rrAM() {
      this.byte_();
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2804394088038247162L;
   }

   public static rrAM class_(cb_3 var0) {
      ((rrAM)break_[0]).class_[0] = var0;
      return (rrAM)break_[0];
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{64, -3, -116, 105, 120, -13, -12, 39}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1065342984;
   }

   public cb_3 class_() {
      return (cb_3)this.class_[0];
   }

   public static void break_(cb_3 var0) {
      rrAM var1 = class_(var0);
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(var1);
      ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[0]).class_(var1);
   }

   private static void break_() {
      byte_ = new boolean[]{false, true, true};
   }

   private static void throws_() {
      protected_ = new short[6];
   }

   private static void protected_() {
      Object[] var0 = new Object[]{new rrAM()};
      break_ = var0;
   }
}
