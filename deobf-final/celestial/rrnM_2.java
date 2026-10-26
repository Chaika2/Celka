package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrnM_2 extends Om_1 {
   private static short[] byte_;
   private static boolean[] protected_;
   public static Object[] class_;
   public Object[] break_;

   public rrnM_2() {
      this.case_();
   }

   static {
      ntfClinit();
   }

   public cG_2 class_() {
      this.case_();
      return (cG_2)this.break_[0];
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -432262413978621072L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -2095134601;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{98, 32, -43, 51, 82, 127, -116, -29}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static rrnM_2 class_(cG_2 var0) {
      ((rrnM_2)class_[0]).class_(false);
      ((rrnM_2)class_[0]).break_[0] = var0;
      return (rrnM_2)class_[0];
   }

   public static void break_(cG_2 var0) {
      rrnM_2 var1 = class_(var0);
      ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[0]).class_(var1);
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(var1);
   }

   private static void break_() {
      Object[] var0 = new Object[]{new rrnM_2()};
      class_ = var0;
   }

   private static void throws_() {
      protected_ = new boolean[]{false, false, true, true};
   }

   private void case_() {
      if (this.break_ == null) {
         this.break_ = new Object[1];
         Object[] var1 = this.break_;
      }
   }

   private static void protected_() {
      byte_ = new short[7];
   }
}
