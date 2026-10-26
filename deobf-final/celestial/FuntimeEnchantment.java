package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class FuntimeEnchantment {
   public Object[] class_;
   private static byte[] break_;
   private static short[] byte_;
   private static boolean[] protected_;

   private static void byte_() {
      protected_ = new boolean[]{true, true, false};
   }

   public FuntimeEnchantment(String var1, int var2) {
      this.throws_();
      this.class_[0] = var1;
      Integer var8 = var2;
      this.class_[1] = var8;
   }

   static {
      ntfClinit();
   }

   @Override
   public String toString() {
      return "FuntimeCustomEnchantmentWrapper{enchantment='" + (String)this.class_[0] + "', level=" + (Integer)this.class_[1] + "}";
   }

   public static FuntimeEnchantment class_(String var0) {
      return class_(var0, 1);
   }

   public String class_() {
      return (String)this.class_[0];
   }

   public static FuntimeEnchantment class_(String var0, int var1) {
      return new FuntimeEnchantment(var0, var1);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -447814090;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8520792010658519645L;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{76, 57, -78, -126, 89, 32, 70, -34}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public int break_() {
      return (Integer)this.class_[1];
   }

   private void throws_() {
      if (this.class_ == null) {
         this.class_ = new Object[2];
         this.class_[1] = 0;
      }
   }

   private static void case_() {
      break_ = new byte[]{2};
   }

   private static void protected_() {
      byte_ = new short[]{0, 1, 0, 1, 0, 1};
   }
}
