package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLQ {
   public Object[] class_;
   private static short[] byte_;
   private static byte[] protected_;
   public static Object[] break_;
   private static boolean[] throws_;

   private void byte_() {
      if (this.class_ == null) {
         this.class_ = new Object[2];
         Object[] var1 = this.class_;
      }
   }

   public rrLQ() {
      this.byte_();
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6619769712308966826L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{45, -100, -64, 70, -96, 126, 7, 117}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1391667272;
   }

   public static rrLQ class_(an_3 var0, List<rmG_2<?>> var1) {
      ((rrLQ)break_[0]).class_[0] = var0;
      ((rrLQ)break_[0]).class_[1] = var1;
      return (rrLQ)break_[0];
   }

   public an_3 class_() {
      return (an_3)this.class_[0];
   }

   public List<rmG_2<?>> break_() {
      return (List<rmG_2<?>>)this.class_[1];
   }

   private static void throws_() {
      protected_ = new byte[]{2};
   }

   private static void catch_() {
      throws_ = new boolean[]{false, true};
   }

   private static void case_() {
      byte_ = new short[]{0, 0, 0, 1, 0, 0, 1};
   }

   private static void protected_() {
      Object[] var0 = new Object[]{new rrLQ()};
      break_ = var0;
   }
}
