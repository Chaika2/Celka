package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class q_1 {
   private static short[] break_;
   private static boolean[] byte_;
   public Object[] class_;

   private static void byte_() {
      byte_ = new boolean[]{true};
   }

   public q_1(Y var1) {
      this.protected_();
      this.class_[0] = var1;
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2037747312431737292L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{120, 89, -10, 123, 55, 84, -82, -45}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1305930874;
   }

   public Y class_() {
      return (Y)this.class_[0];
   }

   public static void class_(Y var0) {
      q_1 var1 = new q_1(var0);
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(var1);
      ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[0]).class_(var1);
      if (var0 == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         ((rrIK)rrIK.staticFields1247f214054b3fe790ff7a957ceb5ae0[0]).class_();
      }
   }

   public void break_(Y var1) {
      this.class_[0] = var1;
   }

   private static void break_() {
      break_ = new short[7];
   }

   private void protected_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
         Object[] var1 = this.class_;
      }
   }
}
