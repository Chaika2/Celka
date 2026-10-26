package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrnr_3 {
   private static boolean[] byte_;
   private static float[] protected_;
   public Object[] class_;
   private static short[] throws_;
   private static byte[] case_;
   public static Object[] break_;

   public float byte_() {
      return (Float)this.class_[4];
   }

   public rrnr_3() {
      this.native_();
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{21, -81, -98, -122, -116, -21, 55, -19}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static rrnr_3 class_(Ml_1 var0, Ok_1 var1, rhd_3 var2, float var3, float var4, float var5, float var6) {
      ((rrnr_3)break_[0]).class_[0] = var0;
      ((rrnr_3)break_[0]).class_[1] = var1;
      ((rrnr_3)break_[0]).class_[2] = var2;
      rrnr_3 var10000 = (rrnr_3)break_[0];
      Float var14 = var3;
      var10000.class_[3] = var14;
      var10000 = (rrnr_3)break_[0];
      Float var15 = var4;
      var10000.class_[4] = var15;
      var10000 = (rrnr_3)break_[0];
      Float var16 = var5;
      var10000.class_[5] = var16;
      var10000 = (rrnr_3)break_[0];
      Float var17 = var6;
      var10000.class_[6] = var17;
      return (rrnr_3)break_[0];
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -807567719151147710L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -800390576;
   }

   public float class_() {
      return (Float)this.class_[6];
   }

   public float break_() {
      return (Float)this.class_[5];
   }

   public Ml_1 throws_() {
      return (Ml_1)this.class_[0];
   }

   private static void finally_() {
      Object[] var0 = new Object[]{new rrnr_3()};
      break_ = var0;
   }

   public rhd_3 catch_() {
      return (rhd_3)this.class_[2];
   }

   private static void extends_() {
      throws_ = new short[]{0, 0, 0, 1, 0, 2, 0, 3, 0, 4, 0, 5, 0, 6, 0, 0, 1, 2, 3, 4, 5, 6};
   }

   public float case_() {
      return (Float)this.class_[3];
   }

   private static void implements_() {
      case_ = new byte[]{7, 3, 4, 5, 6};
   }

   public Ok_1 protected_() {
      return (Ok_1)this.class_[1];
   }

   private static void private_() {
      byte_ = new boolean[]{false, true};
   }

   private static void volatile_() {
      protected_ = new float[4];
   }

   private void native_() {
      if (this.class_ == null) {
         this.class_ = new Object[7];
         Object[] var1 = this.class_;
         var1[3] = 0.0F;
         var1[4] = 0.0F;
         var1[5] = 0.0F;
         var1[6] = 0.0F;
      }
   }
}
