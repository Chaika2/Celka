package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrFq_1 {
   private static short[] byte_;
   public Object[] class_;
   public static Object[] break_;
   private static boolean[] protected_;

   private static void byte_() {
      byte_ = new short[4];
   }

   public rrFq_1() {
      this.protected_();
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{45, 73, 119, -77, -60, 61, -6, 76}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -840310319;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7974982899155676754L;
   }

   public static rrFq_1 class_(Aw_1 var0) {
      ((rrFq_1)break_[0]).class_[0] = var0;
      return (rrFq_1)break_[0];
   }

   public Aw_1 class_() {
      return (Aw_1)this.class_[0];
   }

   private static void break_() {
      protected_ = new boolean[]{false, true, true};
   }

   private static void throws_() {
      Object[] var0 = new Object[]{new rrFq_1()};
      break_ = var0;
   }

   private void protected_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
         Object[] var1 = this.class_;
      }
   }
}
