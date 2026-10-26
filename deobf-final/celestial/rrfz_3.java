package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrfz_3 {
   private static byte[] break_;
   private static short[] byte_;
   private static boolean[] protected_;
   private static float[] throws_;
   public Object[] class_;

   public float byte_() {
      return (Float)this.class_[2];
   }

   public void byte_(float var1) {
      Float var6 = var1;
      this.class_[0] = var6;
   }

   public rrfz_3(rrfk_3 var1, rrfx_3 var2, rrfJ_2 var3) {
      this.implements_();
      this.class_[5] = var1;
      this.class_[3] = var2;
      this.class_[4] = var3;
   }

   static {
      ntfClinit();
   }

   public void class_(float var1) {
      Float var6 = var1;
      this.class_[1] = var6;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-4, 47, -99, 3, 32, -113, 12, -32}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1740188309;
   }

   public rrfx_3 class_() {
      return (rrfx_3)this.class_[3];
   }

   public boolean class_(float var1, float var2) {
      return var1 >= this.throws_() && var1 <= this.throws_() + 15.0F && var2 >= this.break_() && var2 <= this.break_() + 15.0F ? true : protected_[1];
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3256675010353841910L;
   }

   public void break_(float var1) {
      Float var6 = var1;
      this.class_[2] = var6;
   }

   public float break_() {
      return (Float)this.class_[1] + (Float)this.class_[2] + ((rrZH)((rrfk_3)this.class_[5]).class_[1]).case_();
   }

   public float throws_() {
      return (Float)this.class_[0];
   }

   private static void finally_() {
      throws_ = new float[]{15.0F, 15.0F, 0.0F, 0.0F, 0.0F};
   }

   private static void catch_() {
      protected_ = new boolean[]{true, false, false, true};
   }

   private static void case_() {
      break_ = new byte[]{6, 2};
   }

   private void implements_() {
      if (this.class_ == null) {
         this.class_ = new Object[6];
         this.class_[0] = 0.0F;
         this.class_[1] = 0.0F;
         this.class_[2] = 0.0F;
      }
   }

   public rrfJ_2 protected_() {
      return (rrfJ_2)this.class_[4];
   }

   private static void private_() {
      byte_ = new short[]{5, 3, 4, 0, 1, 2, 5, 1, 2, 2, 3, 4, 0, 1};
   }
}
