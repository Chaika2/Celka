package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class bB_2 {
   private static byte[] break_;
   private static boolean[] byte_;
   private static float[] protected_;
   private static short[] throws_;
   public Object[] class_;

   public void byte_() {
      Object var5 = null;
      this.class_[0] = var5;
      Float var6 = 0.0F;
      this.class_[1] = var6;
   }

   public bB_2() {
      this.protected_();
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-38, -13, -126, -58, -81, 120, -10, -19}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void class_(rjU_2 var1) {
      if ((rjU_2)this.class_[0] == null) {
         this.class_[0] = var1;
      }

      Float var7 = (Float)this.class_[1] + (float)((rjU_2)this.class_[0]).case_(var1);
      this.class_[1] = var7;
      this.class_[0] = var1;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1669401699;
   }

   public float class_() {
      return (Float)this.class_[1];
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3642944291624709720L;
   }

   public rjU_2 break_() {
      return (rjU_2)this.class_[0];
   }

   private static void throws_() {
      protected_ = new float[2];
   }

   private static void catch_() {
      throws_ = new short[]{0, 0, 1, 0, 1, 0, 0, 1, 0, 1};
   }

   private static void case_() {
      break_ = new byte[]{2};
   }

   private void protected_() {
      if (this.class_ == null) {
         this.class_ = new Object[2];
         Object[] var1 = this.class_;
         var1[1] = 0.0F;
      }
   }

   private static void private_() {
      byte_ = new boolean[]{true};
   }
}
