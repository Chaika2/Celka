package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrtv_3 {
   private static byte[] break_;
   public Object[] class_;
   private static float[] byte_;
   private static short[] protected_;

   private static void byte_() {
      protected_ = new short[]{0, 0, 1, 0, 1, 0};
   }

   public rrtv_3(rrQK var1, float var2, boolean var3) {
      this.throws_();
      AnimValue var8 = new AnimValue(var1, var2, var3);
      this.class_[1] = var8;
      rrtF_2 var9 = new rrtF_2();
      this.class_[0] = var9;
   }

   public rrtv_3(float var1, boolean var2) {
      this((rrQK)rrQK.staticFieldsd7edc8a98bf936d38fa97cfea6cbd552[0], var1, var2);
   }

   public rrtv_3(boolean var1) {
      this((rrQK)rrQK.staticFieldsd7edc8a98bf936d38fa97cfea6cbd552[0], 0.5F, var1);
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1930838931;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3985574675991775696L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-52, 33, 71, -63, -48, 7, -9, -42}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public AnimValue class_() {
      return (AnimValue)this.class_[1];
   }

   public rrtF_2 break_() {
      return (rrtF_2)this.class_[0];
   }

   private void throws_() {
      if (this.class_ == null) {
         this.class_ = new Object[2];
         Object[] var1 = this.class_;
      }
   }

   private static void case_() {
      break_ = new byte[]{2};
   }

   private static void protected_() {
      byte_ = new float[]{0.5F};
   }
}
