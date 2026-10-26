package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAv_1 extends Om_1 {
   private static short[] byte_;
   private static boolean[] protected_;
   public static Object[] class_;
   public Object[] break_;

   public void byte_(String var1) {
      this.protected_();
      this.break_[0] = var1;
   }

   public rrAv_1() {
      this.protected_();
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7776318601605689274L;
   }

   public String class_() {
      this.protected_();
      return (String)this.break_[0];
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-8, 63, -70, -33, 81, 18, -50, 9}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 985027896;
   }

   private static void break_() {
      byte_ = new short[6];
   }

   public static rrAv_1 break_(String var0) {
      ((rrAv_1)class_[0]).break_[0] = var0;
      ((rrAv_1)class_[0]).class_(false);
      return (rrAv_1)class_[0];
   }

   private static void throws_() {
      Object[] var0 = new Object[]{new rrAv_1()};
      class_ = var0;
   }

   private static void case_() {
      protected_ = new boolean[]{false, false, true, true};
   }

   private void protected_() {
      if (this.break_ == null) {
         this.break_ = new Object[1];
         Object[] var1 = this.break_;
      }
   }
}
