package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class PC {
   public Object[] class_;
   private static byte[] break_;
   private static boolean[] byte_;
   private static short[] protected_;

   public String byte_() {
      return (String)this.class_[2];
   }

   public PC(rdn_3 var1, String var2, String var3, int var4) {
      this.private_();
      this.class_[0] = var1;
      this.class_[1] = var2;
      this.class_[2] = var3;
      Integer var12 = var4;
      this.class_[3] = var12;
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2787233841795599707L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -428615265;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-30, 75, -35, 93, 10, 125, 123, 29}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public String class_() {
      return (String)this.class_[1];
   }

   public rdn_3 break_() {
      return (rdn_3)this.class_[0];
   }

   private static void throws_() {
      break_ = new byte[]{4, 3};
   }

   private static void catch_() {
      byte_ = new boolean[1];
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
         Object[] var1 = this.class_;
         var1[3] = 0;
      }
   }
}
