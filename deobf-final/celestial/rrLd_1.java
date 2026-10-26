package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLd_1 {
   public Object[] class_;
   public static Object[] break_;
   private static float[] byte_;
   private static short[] protected_;
   private static byte[] throws_;
   private static boolean[] case_;

   private static void byte_() {
      throws_ = new byte[]{2};
   }

   public rrLd_1() {
      this.catch_();
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3342845784411621607L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-96, -98, -89, 42, 85, -107, -21, 98}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void class_(int var1) {
      Integer var6 = var1;
      this.class_[1] = var6;
   }

   public static rrLd_1 class_(float var0, int var1) {
      rrLd_1 var10000 = (rrLd_1)break_[0];
      Float var6 = var0;
      var10000.class_[0] = var6;
      var10000 = (rrLd_1)break_[0];
      Integer var7 = var1;
      var10000.class_[1] = var7;
      return (rrLd_1)break_[0];
   }

   public int class_() {
      return (Integer)this.class_[1];
   }

   public void class_(float var1) {
      Float var6 = var1;
      this.class_[0] = var6;
   }

   public float break_() {
      return (Float)this.class_[0];
   }

   private static int break_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -2056700097;
   }

   private static void throws_() {
      Object[] var0 = new Object[]{new rrLd_1()};
      break_ = var0;
   }

   private void catch_() {
      if (this.class_ == null) {
         this.class_ = new Object[2];
         Object[] var1 = this.class_;
         var1[0] = 0.0F;
         var1[1] = 0;
      }
   }

   private static void case_() {
      byte_ = new float[1];
   }

   private static void protected_() {
      protected_ = new short[]{0, 0, 0, 1, 0, 0, 1, 0, 1};
   }

   private static void private_() {
      case_ = new boolean[]{false, false, true, false, true};
   }
}
