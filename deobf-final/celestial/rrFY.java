package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrFY extends Om_1 {
   public Object[] class_;
   public static Object[] break_;
   private static boolean[] byte_;
   private static short[] protected_;

   public rrFY() {
      this.break_();
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7315550379352348987L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 164204858;
   }

   public vm_3 class_() {
      this.break_();
      return (vm_3)this.class_[0];
   }

   public static rrFY class_(vm_3 var0) {
      rrFY var1 = break_(var0);
      ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[0]).class_(var1);
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(var1);
      return var1;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-65, -7, 52, -100, -16, 93, -65, 112}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static rrFY break_(vm_3 var0) {
      ((rrFY)break_[0]).class_[0] = var0;
      ((rrFY)break_[0]).class_(false);
      return (rrFY)break_[0];
   }

   private void break_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
         Object[] var1 = this.class_;
      }
   }

   private static void throws_() {
      protected_ = new short[7];
   }

   private static void case_() {
      Object[] var0 = new Object[]{new rrFY()};
      break_ = var0;
   }

   private static void protected_() {
      byte_ = new boolean[]{false, false, true, true};
   }
}
