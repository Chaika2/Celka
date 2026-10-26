package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class l_1 {
   private static byte[] break_;
   public Object[] class_;
   private static boolean[] byte_;
   private static short[] protected_;

   public int byte_() {
      return (Integer)this.class_[2];
   }

   public l_1(Y var1, H var2, int var3, int var4) {
      this.private_();
      this.class_[0] = var1;
      this.class_[1] = var2;
      Integer var11 = var3;
      this.class_[2] = var11;
      Integer var12 = var4;
      this.class_[3] = var12;
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5626222361976864675L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-78, 118, -46, 107, 107, -101, 46, -24}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public int class_() {
      return (Integer)this.class_[3];
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1389694509;
   }

   public H break_() {
      return (H)this.class_[1];
   }

   private static void throws_() {
      break_ = new byte[]{4, 2, 3};
   }

   private static void catch_() {
      protected_ = new short[]{0, 1, 2, 3, 0, 1, 2, 3};
   }

   private static void case_() {
      byte_ = new boolean[2];
   }

   public Y protected_() {
      return (Y)this.class_[0];
   }

   private void private_() {
      if (this.class_ == null) {
         this.class_ = new Object[4];
         Object[] var1 = this.class_;
         var1[2] = 0;
         var1[3] = 0;
      }
   }
}
