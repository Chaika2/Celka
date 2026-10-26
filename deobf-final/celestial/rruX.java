package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rruX implements rruG {
   private static boolean[] break_;
   public Object[] class_;
   private static byte[] byte_;
   private static float[] protected_;
   private static short[] throws_;

   @Override
   public float byte_(float var1) {
      return 0.0F;
   }

   private static void byte_() {
      protected_ = new float[5];
   }

   public rruX() {
      this.class_();
      rrux_1 var5 = new rrux_1(0.0F, 0.0F);
      this.class_[0] = var5;
      rrux_1 var6 = new rrux_1(0.0F, 0.0F);
      this.class_[1] = var6;
   }

   static {
      ntfClinit();
   }

   private void class_() {
      if (this.class_ == null) {
         this.class_ = new Object[3];
         Object[] var1 = this.class_;
         var1[2] = false;
      }
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{20, -100, -106, 17, -85, -100, -11, 109}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 428376189;
   }

   @Override
   public float class_(float var1) {
      return rfU_2.catch_(var1, (Float)((rrux_1)this.class_[1]).class_[0], (Float)((rrux_1)this.class_[0]).class_[0]);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8509282840081093143L;
   }

   private static void break_() {
      throws_ = new short[]{0, 1, 1, 0, 0, 0, 1, 1, 0, 1};
   }

   private static void throws_() {
      byte_ = new byte[]{3, 2};
   }

   private static void protected_() {
      break_ = new boolean[1];
   }

   @Override
   public float protected_(float var1) {
      return rfU_2.catch_(var1, (Float)((rrux_1)this.class_[1]).class_[1], (Float)((rrux_1)this.class_[0]).class_[1]);
   }
}
