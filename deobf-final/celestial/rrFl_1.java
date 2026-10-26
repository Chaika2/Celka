package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Collection;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class rrFl_1<T> {
   private static short[] class_;
   private static float[] break_;
   private static boolean[] protected_;
   public Object[] byte_;

   public abstract Collection<T> byte_();

   public rrFl_1() {
      this.class_();
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -444828764;
   }

   public abstract void class_(Ml_1 var1, float var2, float var3);

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8471020242253777620L;
   }

   public abstract float class_(T var1);

   private void class_() {
      if (this.byte_ == null) {
         this.byte_ = new Object[1];
         Object[] var1 = this.byte_;
         var1[0] = 0.0F;
      }
   }

   public void class_(float var1) {
      this.break_((Float)this.byte_[0] + var1);
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{122, 89, -126, -84, -86, 41, 79, 58}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void break_() {
      protected_ = new boolean[]{true, false};
   }

   public void break_(float var1) {
      Float var6 = var1;
      this.byte_[0] = var6;
   }

   public void throws_() {
   }

   public float finally_() {
      return (Float)this.byte_[0];
   }

   private static void catch_() {
      break_ = new float[1];
   }

   private static void case_() {
      class_ = new short[3];
   }

   public abstract float protected_();
}
