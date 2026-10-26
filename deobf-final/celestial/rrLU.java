package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLU {
   public Object[] class_;
   public static Object[] break_;
   private static boolean[] byte_;
   private static short[] protected_;

   private static void byte_() {
      byte_ = new boolean[]{false, true, true};
   }

   public rrLU() {
      this.break_();
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{93, -40, -92, -1, 36, 29, 124, -104}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 2042235693;
   }

   public static void class_(vm_3 var0) {
      rrLU var1 = break_(var0);
      ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[0]).class_(var1);
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(var1);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3681916678409354687L;
   }

   public vm_3 class_() {
      return (vm_3)this.class_[0];
   }

   private static rrLU break_(vm_3 var0) {
      ((rrLU)break_[0]).class_[0] = var0;
      return (rrLU)break_[0];
   }

   private void break_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
         Object[] var1 = this.class_;
      }
   }

   private static void throws_() {
      protected_ = new short[6];
   }

   private static void protected_() {
      Object[] var0 = new Object[]{new rrLU()};
      break_ = var0;
   }
}
