package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class bx_3 extends rS_2 {
   public Object[] break_;
   private static boolean[] byte_;
   private static float[] protected_;
   private static byte[] throws_;
   private static short[] case_;

   public boolean byte_() {
      this.throws_();
      return (Boolean)this.break_[1];
   }

   public bx_3(rfH_2 var1, float var2, boolean var3) {
      super(var1);
      this.throws_();
      Float var8 = var2;
      this.break_[0] = var8;
      Boolean var9 = var3;
      this.break_[1] = var9;
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1332542960;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8292536883720265442L;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-108, -90, 6, 72, -42, 7, -38, 75}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private void throws_() {
      if (this.break_ == null) {
         this.break_ = new Object[2];
         Object[] var1 = this.break_;
         var1[0] = 0.0F;
         var1[1] = false;
      }
   }

   private static void catch_() {
      byte_ = new boolean[]{false, true, false};
   }

   private static void case_() {
      case_ = new short[]{0, 1, 1, 0};
   }

   private static void implements_() {
      protected_ = new float[1];
   }

   public float protected_() {
      this.throws_();
      return (Float)this.break_[0];
   }

   private static void private_() {
      throws_ = new byte[]{2};
   }
}
