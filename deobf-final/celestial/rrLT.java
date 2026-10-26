package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLT {
   private static boolean[] byte_;
   public Object[] class_;
   private static float[] protected_;
   public static Object[] break_;
   private static short[] throws_;

   private static void byte_() {
      throws_ = new short[5];
   }

   public rrLT() {
      this.break_();
   }

   static {
      ntfClinit();
   }

   public static rrLT class_(float var0) {
      rrLT var10000 = (rrLT)break_[0];
      Float var5 = var0;
      var10000.class_[0] = var5;
      return (rrLT)break_[0];
   }

   public float class_() {
      return (Float)this.class_[0];
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -175328981;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{17, 111, -109, -14, -123, 43, 17, -26}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3858324127826546662L;
   }

   public void break_(float var1) {
      Float var6 = var1;
      this.class_[0] = var6;
   }

   private void break_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
         Object[] var1 = this.class_;
         var1[0] = 0.0F;
      }
   }

   private static void throws_() {
      Object[] var0 = new Object[]{new rrLT()};
      break_ = var0;
   }

   private static void case_() {
      byte_ = new boolean[]{false, true, false, true};
   }

   private static void protected_() {
      protected_ = new float[1];
   }
}
