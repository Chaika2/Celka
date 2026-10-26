package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAu_1 extends Om_1 {
   private static boolean[] byte_;
   private static short[] protected_;
   public Object[] class_;
   public static Object[] break_;

   private static int byte_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1928450499;
   }

   public rrAu_1() {
      this.break_();
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-15, 127, 5, 54, -33, 82, -85, -29}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public int class_() {
      this.break_();
      return (Integer)this.class_[0];
   }

   public void class_(int var1) {
      this.break_();
      Integer var6 = var1;
      this.class_[0] = var6;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8995391191126555108L;
   }

   private void break_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
         Object[] var1 = this.class_;
         var1[0] = 0;
      }
   }

   public static rrAu_1 break_(int var0) {
      rrAu_1 var10000 = (rrAu_1)break_[0];
      Integer var5 = var0;
      var10000.class_[0] = var5;
      ((rrAu_1)break_[0]).class_(false);
      return (rrAu_1)break_[0];
   }

   private static void throws_() {
      Object[] var0 = new Object[]{new rrAu_1()};
      break_ = var0;
   }

   private static void case_() {
      protected_ = new short[6];
   }

   private static void protected_() {
      byte_ = new boolean[]{false, false, true, false, false, true};
   }
}
