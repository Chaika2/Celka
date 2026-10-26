package celestial;

import java.nio.charset.StandardCharsets;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrcy_3 {
   private static short[] break_;
   private static boolean[] byte_;
   private static byte[] protected_;
   public Object[] class_;

   private static void byte_() {
      protected_ = new byte[]{2};
   }

   public rrcy_3(int var1) {
      this.case_();
      Integer var6 = var1;
      this.class_[0] = var6;
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7627204733082405828L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{10, -65, 69, -26, -66, -29, -56, -127}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public int class_() {
      return (Integer)this.class_[0];
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1827277212;
   }

   public rrcy_3 class_(Predicate<rJY> var1) {
      this.class_[1] = var1;
      return this;
   }

   public Predicate<rJY> break_() {
      return (Predicate<rJY>)this.class_[1];
   }

   private static void throws_() {
      byte_ = new boolean[2];
   }

   private void case_() {
      if (this.class_ == null) {
         this.class_ = new Object[2];
         Object[] var1 = this.class_;
         var1[0] = 0;
      }
   }

   private static void protected_() {
      break_ = new short[]{1, 0, 1, 0};
   }
}
