package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrnJ_2 {
   public Object[] class_;
   private static boolean[] byte_;
   private static byte[] protected_;
   public static Object[] break_;
   private static short[] throws_;
   private static float[] case_;

   private void byte_() {
      if (this.class_ == null) {
         this.class_ = new Object[2];
         Object[] var1 = this.class_;
         var1[1] = 0.0F;
      }
   }

   public rrnJ_2() {
      this.byte_();
   }

   static {
      ntfClinit();
   }

   public static rrnJ_2 class_(an_3 var0, float var1) {
      ((rrnJ_2)break_[0]).class_[0] = var0;
      rrnJ_2 var10000 = (rrnJ_2)break_[0];
      Float var7 = var1;
      var10000.class_[1] = var7;
      return (rrnJ_2)break_[0];
   }

   public an_3 class_() {
      return (an_3)this.class_[0];
   }

   public void class_(float var1) {
      Float var6 = var1;
      this.class_[1] = var6;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-119, -55, 79, 66, 46, -1, -44, 11}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -116145993;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3903569247151121350L;
   }

   public float break_() {
      return (Float)this.class_[1];
   }

   private static void throws_() {
      protected_ = new byte[]{2};
   }

   private static void catch_() {
      byte_ = new boolean[]{false, true, true};
   }

   private static void case_() {
      case_ = new float[1];
   }

   private static void protected_() {
      Object[] var0 = new Object[]{new rrnJ_2()};
      break_ = var0;
   }

   private static void private_() {
      throws_ = new short[]{0, 0, 0, 1, 0, 0, 1, 1};
   }
}
