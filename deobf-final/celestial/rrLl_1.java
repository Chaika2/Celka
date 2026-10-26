package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLl_1 {
   public static Object[] class_;
   private static float[] byte_;
   public Object[] break_;
   private static boolean[] protected_;
   private static short[] throws_;

   private static void byte_() {
      Object[] var0 = new Object[]{new rrLl_1()};
      class_ = var0;
   }

   public rrLl_1() {
      this.throws_();
   }

   static {
      ntfClinit();
   }

   public float class_() {
      return (Float)this.break_[0];
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{12, -17, -39, 53, 82, -21, -87, 64}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void class_(float var1) {
      Float var6 = var1;
      this.break_[0] = var6;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7826481549747456384L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -509214765;
   }

   public static rrLl_1 break_(float var0) {
      rrLl_1 var10000 = (rrLl_1)class_[0];
      Float var5 = var0;
      var10000.break_[0] = var5;
      return (rrLl_1)class_[0];
   }

   private static void break_() {
      throws_ = new short[5];
   }

   private void throws_() {
      if (this.break_ == null) {
         this.break_ = new Object[1];
         Object[] var1 = this.break_;
         var1[0] = 0.0F;
      }
   }

   private static void case_() {
      protected_ = new boolean[]{false, true, false, true};
   }

   private static void protected_() {
      byte_ = new float[1];
   }
}
