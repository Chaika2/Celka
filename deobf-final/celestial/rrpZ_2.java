package celestial;

import java.nio.charset.StandardCharsets;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrpZ_2 {
   public Object[] class_;
   private static boolean[] break_;
   private static byte[] byte_;
   private static short[] protected_;

   public int byte_() {
      return (Integer)this.class_[1];
   }

   public rrpZ_2(UUID var1, int var2) {
      this.private_();
      this.class_[0] = var1;
      Integer var8 = var2;
      this.class_[1] = var8;
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{88, -59, -29, -95, 59, 95, -116, -89}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1531831667;
   }

   public void class_(rrpv_3 var1, int var2) {
      this.class_[2] = var1;
      Integer var8 = var2;
      this.class_[3] = var8;
   }

   public UUID class_() {
      return (UUID)this.class_[0];
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7441837909566012135L;
   }

   public rrpv_3 break_() {
      return (rrpv_3)this.class_[2];
   }

   private static void throws_() {
      byte_ = new byte[]{4, 3};
   }

   private static void catch_() {
      break_ = new boolean[]{true, false, false};
   }

   private static void case_() {
      protected_ = new short[]{0, 1, 2, 3, 0, 1, 2, 3};
   }

   public int protected_() {
      return (Integer)this.class_[3];
   }

   private void private_() {
      if (this.class_ == null) {
         this.class_ = new Object[4];
         this.class_[1] = 0;
         this.class_[3] = 0;
      }
   }
}
