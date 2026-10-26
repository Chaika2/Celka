package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLR extends Om_1 {
   public Object[] class_;
   private static boolean[] byte_;
   public static Object[] break_;
   private static short[] protected_;

   private static int byte_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -2122044064;
   }

   public rrLR() {
      this.protected_();
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8906123811809368203L;
   }

   public void class_(int var1) {
      this.protected_();
      Integer var6 = var1;
      this.class_[0] = var6;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-65, 14, 124, -56, -97, -59, 17, -9}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public int class_() {
      this.protected_();
      return (Integer)this.class_[0];
   }

   public static rrLR break_(int var0) {
      rrLR var10000 = (rrLR)break_[0];
      Integer var5 = var0;
      var10000.class_[0] = var5;
      ((rrLR)break_[0]).class_(false);
      return (rrLR)break_[0];
   }

   private static void break_() {
      byte_ = new boolean[]{false, false, true, false, false, true};
   }

   private static void throws_() {
      Object[] var0 = new Object[]{new rrLR()};
      break_ = var0;
   }

   private static void case_() {
      protected_ = new short[6];
   }

   private void protected_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
         Object[] var1 = this.class_;
         var1[0] = 0;
      }
   }
}
