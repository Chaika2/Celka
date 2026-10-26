package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rruk_1 implements rruG {
   public Object[] class_;
   private static boolean[] break_;
   private static short[] byte_;
   private static float[] protected_;
   private static byte[] throws_;

   private static void byte_() {
      byte_ = new short[]{0, 1, 1, 0, 0, 0, 1, 1, 0, 1, 1, 2, 0, 2};
   }

   @Override
   public float byte_(float var1) {
      return rfU_2.catch_(var1, (Float)((rrub_1)this.class_[1]).class_[2], (Float)((rrub_1)this.class_[0]).class_[2]);
   }

   public rruk_1() {
      this.protected_();
      rrub_1 var5 = new rrub_1(0.0F, 0.0F, 0.0F);
      this.class_[0] = var5;
      rrub_1 var6 = new rrub_1(0.0F, 0.0F, 0.0F);
      this.class_[1] = var6;
   }

   static {
      ntfClinit();
   }

   @Override
   public float class_(float var1) {
      return rfU_2.catch_(var1, (Float)((rrub_1)this.class_[1]).class_[0], (Float)((rrub_1)this.class_[0]).class_[0]);
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{50, 116, 64, -127, 91, -105, -119, 15}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1890006491;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8764329106784031506L;
   }

   private static void class_() {
      throws_ = new byte[]{3, 2};
   }

   private static void break_() {
      protected_ = new float[6];
   }

   private static void throws_() {
      break_ = new boolean[1];
   }

   private void protected_() {
      if (this.class_ == null) {
         this.class_ = new Object[3];
         Object[] var1 = this.class_;
         var1[2] = false;
      }
   }

   @Override
   public float protected_(float var1) {
      return rfU_2.catch_(var1, (Float)((rrub_1)this.class_[1]).class_[1], (Float)((rrub_1)this.class_[0]).class_[1]);
   }
}
