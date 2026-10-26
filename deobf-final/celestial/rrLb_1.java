package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLb_1 extends Om_1 {
   public static Object[] class_;
   private static short[] byte_;
   public Object[] break_;
   private static boolean[] protected_;

   public static String byte_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{24, -49, -12, -12, 43, 60, -6, 13}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public rrLb_1() {
      this.break_();
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3371091469669464821L;
   }

   public String class_() {
      this.break_();
      return (String)this.break_[0];
   }

   public static rrLb_1 class_(String var0) {
      ((rrLb_1)class_[0]).break_[0] = var0;
      return (rrLb_1)class_[0];
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1305737962;
   }

   public void break_(String var1) {
      this.break_();
      this.break_[0] = var1;
   }

   private void break_() {
      if (this.break_ == null) {
         this.break_ = new Object[1];
         Object[] var1 = this.break_;
      }
   }

   private static void throws_() {
      Object[] var0 = new Object[]{new rrLb_1()};
      class_ = var0;
   }

   private static void case_() {
      protected_ = new boolean[]{false, true, true};
   }

   private static void protected_() {
      byte_ = new short[5];
   }
}
