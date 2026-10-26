package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLN {
   public Object[] class_;
   private static boolean[] byte_;
   public static Object[] break_;
   private static byte[] protected_;
   private static short[] throws_;

   private void byte_() {
      if (this.class_ == null) {
         this.class_ = new Object[2];
         Object[] var1 = this.class_;
      }
   }

   public rrLN() {
      this.byte_();
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{47, 110, 73, -48, -97, 49, -62, -79}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static rrLN class_(Aw_1 var0, rvY_2 var1) {
      ((rrLN)break_[0]).class_[1] = var0;
      ((rrLN)break_[0]).class_[0] = var1;
      return (rrLN)break_[0];
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4871422257966651314L;
   }

   public Aw_1 class_() {
      return (Aw_1)this.class_[1];
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1500269682;
   }

   public rvY_2 break_() {
      return (rvY_2)this.class_[0];
   }

   private static void throws_() {
      byte_ = new boolean[]{false, true};
   }

   private static void catch_() {
      protected_ = new byte[]{2};
   }

   private static void case_() {
      Object[] var0 = new Object[]{new rrLN()};
      break_ = var0;
   }

   private static void protected_() {
      throws_ = new short[]{0, 1, 0, 0, 0, 0, 1};
   }
}
