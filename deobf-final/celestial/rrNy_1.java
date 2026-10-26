package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrNy_1 implements rrNC {
   private static boolean[] break_;
   private static long[] byte_;
   private static short[] protected_;
   private static byte[] throws_;
   public Object[] class_;

   public long byte_() {
      return (Long)this.class_[1];
   }

   public rrNy_1(rgP_2 var1, long var2, long var4) {
      this.protected_();
      this.class_[0] = var1;
      Long var11 = var2;
      this.class_[1] = var11;
      Long var12 = var4;
      this.class_[2] = var12;
   }

   static {
      ntfClinit();
   }

   @Override
   public rgP_2 class_() {
      return (rgP_2)this.class_[0];
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6814158873953098067L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{42, 63, -34, -8, -30, -70, 43, 45}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -966055776;
   }

   public long break_() {
      return (Long)this.class_[2];
   }

   private static void throws_() {
      byte_ = new long[2];
   }

   private static void catch_() {
      throws_ = new byte[]{3, 2};
   }

   private static void case_() {
      protected_ = new short[]{0, 1, 2, 0, 1, 2};
   }

   private void protected_() {
      if (this.class_ == null) {
         this.class_ = new Object[3];
         Object[] var1 = this.class_;
         var1[1] = 0L;
         var1[2] = 0L;
      }
   }

   private static void private_() {
      break_ = new boolean[]{true};
   }
}
