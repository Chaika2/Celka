package celestial;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrZV {
   private static byte[] break_;
   private static boolean[] byte_;
   private static short[] protected_;
   private static long[] throws_;
   public Object[] class_;

   private void byte_() {
      if (this.class_ == null) {
         this.class_ = new Object[6];
         Object[] var1 = this.class_;
         var1[0] = 0;
         var1[1] = 0L;
         var1[2] = 0L;
         var1[5] = 0;
      }
   }

   rrZV() {
      this.byte_();
      Long var5 = Long.MAX_VALUE;
      this.class_[2] = var5;
      HashMap var6 = new HashMap();
      this.class_[3] = var6;
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2629989135903626820L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{109, -7, 46, -62, 0, 3, -30, 79}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1668703629;
   }

   private static void class_() {
      break_ = new byte[]{6, 2, 5};
   }

   private static void break_() {
      protected_ = new short[]{2, 3};
   }

   private static void throws_() {
      byte_ = new boolean[]{false, false, true, false};
   }

   private static void protected_() {
      throws_ = new long[]{Long.MAX_VALUE, 0L, 0L};
   }
}
