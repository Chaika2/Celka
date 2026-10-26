package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrIa_1 {
   private static float[] break_;
   public Object[] class_;
   private static short[] byte_;
   private static boolean[] protected_;

   private static void byte_() {
      protected_ = new boolean[]{true, false};
   }

   public rrIa_1() {
      this.break_();
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{118, -52, -115, 73, -100, -71, 78, -111}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1701101202;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6285369063558811322L;
   }

   public void class_() {
      Float var5 = 0.0F;
      this.class_[0] = var5;
   }

   public float class_(float var1, float var2) {
      float var10003 = (Float)this.class_[0] + var2;
      Float var7 = var10003;
      this.class_[0] = var7;
      var1 *= Math.min(var10003, 1.0F);
      return (float)Math.sin((double)var1);
   }

   private void break_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
         this.class_[0] = 0.0F;
      }
   }

   private static void throws_() {
      break_ = new float[]{1.0F, 0.0F, 0.0F};
   }

   private static void protected_() {
      byte_ = new short[3];
   }
}
