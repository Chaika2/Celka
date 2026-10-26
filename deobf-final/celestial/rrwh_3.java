package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrwh_3 {
   private static boolean[] break_;
   private static float[] byte_;
   private static byte[] protected_;
   public Object[] class_;

   private static void byte_() {
      byte_ = new float[2];
   }

   public rrwh_3() {
      this.class_();
   }

   static {
      ntfClinit();
   }

   private void class_() {
      if (this.class_ == null) {
         this.class_ = new Object[6];
         Object[] var1 = this.class_;
         var1[0] = 0.0F;
         var1[1] = 0.0F;
         var1[2] = false;
         var1[3] = false;
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 900716173;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2877255649525667875L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-126, -7, 79, -100, 59, 55, -7, -98}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void break_() {
      protected_ = new byte[]{6, 2, 3};
   }

   private static void protected_() {
      break_ = new boolean[]{false, true, false, false};
   }
}
