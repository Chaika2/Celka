package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrZd_1 {
   private static short[] break_;
   private static byte[] byte_;
   public Object[] class_;
   private static boolean[] protected_;

   private static void byte_() {
      break_ = new short[]{0, 1, 0, 1};
   }

   public rrZd_1(int var1, int var2) {
      this.throws_();
      if (var1 > var2) {
         int var3 = var2;
         var2 = var1;
         var1 = var3;
      }

      Integer var8 = var1;
      this.class_[0] = var8;
      Integer var9 = var2;
      this.class_[1] = var9;
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 755254210;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2278811853138035835L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-85, 35, 43, -35, 30, 28, -120, -44}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public int class_() {
      return (Integer)this.class_[1];
   }

   public int break_() {
      return (Integer)this.class_[0];
   }

   private void throws_() {
      if (this.class_ == null) {
         this.class_ = new Object[2];
         Object[] var1 = this.class_;
         var1[0] = 0;
         var1[1] = 0;
      }
   }

   private static void case_() {
      byte_ = new byte[]{2};
   }

   private static void protected_() {
      protected_ = new boolean[]{false, false, true, false};
   }
}
