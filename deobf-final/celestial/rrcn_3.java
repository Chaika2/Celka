package celestial;

import java.nio.charset.StandardCharsets;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrcn_3 {
   private static short[] break_;
   public Object[] class_;
   private static byte[] byte_;
   private static boolean[] protected_;

   private static void byte_() {
      break_ = new short[]{1, 0, 1, 0};
   }

   public rrcn_3(int var1) {
      this.case_();
      Integer var6 = var1;
      this.class_[0] = var6;
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7113842133423058461L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 261485176;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{23, -94, 78, -61, -49, 101, -76, 81}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public rrcn_3 class_(Predicate<rJY> var1) {
      this.class_[1] = var1;
      return this;
   }

   public Predicate<rJY> class_() {
      return (Predicate<rJY>)this.class_[1];
   }

   public int break_() {
      return (Integer)this.class_[0];
   }

   private static void throws_() {
      protected_ = new boolean[2];
   }

   private void case_() {
      if (this.class_ == null) {
         this.class_ = new Object[2];
         Object[] var1 = this.class_;
         var1[0] = 0;
      }
   }

   private static void protected_() {
      byte_ = new byte[]{2};
   }
}
