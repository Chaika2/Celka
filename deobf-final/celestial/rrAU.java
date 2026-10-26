package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAU {
   private static boolean[] byte_;
   private static float[] protected_;
   private static byte[] throws_;
   public static Object[] class_;
   public Object[] break_;
   private static short[] case_;

   public float byte_() {
      return (Float)this.break_[2];
   }

   public rrAU() {
      this.protected_();
   }

   static {
      ntfClinit();
   }

   public static void class_(Ml_1 var0, rjV_2 var1, float var2) {
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(break_(var0, var1, var2));
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 2088496454;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-87, -25, -73, 64, 86, -121, -10, -91}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 924459958944856133L;
   }

   public rjV_2 class_() {
      return (rjV_2)this.break_[1];
   }

   public static rrAU break_(Ml_1 var0, rjV_2 var1, float var2) {
      ((rrAU)class_[0]).break_[0] = var0;
      ((rrAU)class_[0]).break_[1] = var1;
      rrAU var10000 = (rrAU)class_[0];
      Float var9 = var2;
      var10000.break_[2] = var9;
      return (rrAU)class_[0];
   }

   public Ml_1 break_() {
      return (Ml_1)this.break_[0];
   }

   private static void throws_() {
      case_ = new short[]{0, 0, 0, 1, 0, 2, 0, 0, 0, 1, 2};
   }

   private static void catch_() {
      throws_ = new byte[]{3, 2};
   }

   private static void case_() {
      protected_ = new float[1];
   }

   private static void implements_() {
      Object[] var0 = new Object[]{new rrAU()};
      class_ = var0;
   }

   private void protected_() {
      if (this.break_ == null) {
         this.break_ = new Object[3];
         Object[] var1 = this.break_;
         var1[2] = 0.0F;
      }
   }

   private static void private_() {
      byte_ = new boolean[]{false, true};
   }
}
