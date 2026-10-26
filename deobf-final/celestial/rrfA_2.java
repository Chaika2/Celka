package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrfA_2 {
   private static short[] break_;
   private static byte[] byte_;
   public Object[] class_;
   private static boolean[] protected_;

   private static void byte_() {
      break_ = new short[]{0, 1, 0, 1};
   }

   private rrfA_2(ev_3 var1, int var2) {
      this.throws_();
      this.class_[0] = var1;
      Integer var8 = var2;
      this.class_[1] = var8;
   }

   static {
      ntfClinit();
   }

   public static rrfA_2 class_(ev_3 var0, int var1) {
      return new rrfA_2(var0, var1);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 358833922;
   }

   public int class_() {
      return (Integer)this.class_[1];
   }

   public static rrfA_2 class_(ev_3 var0) {
      return class_(var0, var0.throws_());
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-85, -96, 55, 13, 55, -59, -55, -15}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4657530844620310831L;
   }

   public ev_3 break_() {
      return (ev_3)this.class_[0];
   }

   private void throws_() {
      if (this.class_ == null) {
         this.class_ = new Object[2];
         this.class_[1] = 0;
      }
   }

   private static void case_() {
      protected_ = new boolean[]{true, false};
   }

   private static void protected_() {
      byte_ = new byte[]{2};
   }
}
