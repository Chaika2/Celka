package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrnQ_2 {
   private static short[] byte_;
   public Object[] class_;
   private static byte[] protected_;
   public static Object[] break_;
   private static boolean[] throws_;

   private static void byte_() {
      Object[] var0 = new Object[]{new rrnQ_2()};
      break_ = var0;
   }

   public rrnQ_2() {
      this.catch_();
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3602539244008878255L;
   }

   public Sz_1 class_() {
      return (Sz_1)this.class_[0];
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -909213969;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{20, -58, 37, -86, -27, 38, 80, -12}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static rrnQ_2 class_(Sz_1 var0, rfl_3 var1) {
      ((rrnQ_2)break_[0]).class_[0] = var0;
      ((rrnQ_2)break_[0]).class_[1] = var1;
      return (rrnQ_2)break_[0];
   }

   public rfl_3 break_() {
      return (rfl_3)this.class_[1];
   }

   private static void throws_() {
      throws_ = new boolean[]{false, true};
   }

   private void catch_() {
      if (this.class_ == null) {
         this.class_ = new Object[2];
         Object[] var1 = this.class_;
      }
   }

   private static void case_() {
      byte_ = new short[]{0, 0, 0, 1, 0, 0, 1};
   }

   private static void protected_() {
      protected_ = new byte[]{2};
   }
}
