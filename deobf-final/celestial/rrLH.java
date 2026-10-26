package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLH extends Om_1 {
   private static byte[] byte_;
   private static boolean[] protected_;
   public Object[] class_;
   private static short[] throws_;
   public static Object[] break_;

   public rrLH() {
      this.throws_();
   }

   static {
      ntfClinit();
   }

   public xc_3 class_() {
      this.throws_();
      return (xc_3)this.class_[1];
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{3, 52, 83, -94, -81, -18, 110, 58}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static rrLH class_(rfH_2 var0, xc_3 var1, rrLy_1 var2) {
      ((rrLH)break_[0]).class_[0] = var0;
      ((rrLH)break_[0]).class_[1] = var1;
      ((rrLH)break_[0]).class_[2] = var2;
      return (rrLH)break_[0];
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -483111606;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2914218781117785792L;
   }

   public rfH_2 break_() {
      this.throws_();
      return (rfH_2)this.class_[0];
   }

   private void throws_() {
      if (this.class_ == null) {
         this.class_ = new Object[3];
         Object[] var1 = this.class_;
      }
   }

   private static void catch_() {
      protected_ = new boolean[]{false, true};
   }

   private static void case_() {
      throws_ = new short[]{0, 0, 0, 1, 0, 2, 0, 0, 1, 2};
   }

   private static void implements_() {
      byte_ = new byte[]{3};
   }

   public rrLy_1 protected_() {
      this.throws_();
      return (rrLy_1)this.class_[2];
   }

   private static void private_() {
      Object[] var0 = new Object[]{new rrLH()};
      break_ = var0;
   }
}
