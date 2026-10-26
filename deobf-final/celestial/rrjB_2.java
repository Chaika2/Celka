package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrjB_2 implements Ok_1 {
   private static byte[] break_;
   private static float[] byte_;
   private static short[] protected_;
   private static int[] throws_;
   private static boolean[] private_;
   public Object[] class_;

   @Override
   public Ok_1 byte_(int var1, int var2) {
      ((Ok_1)this.class_[0]).byte_(var1, var2);
      return this;
   }

   public rrjB_2() {
      this.case_();
      Float var5 = 1.0F;
      this.class_[1] = var5;
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{29, -59, 55, -47, -58, 118, -15, 48}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public Ok_1 class_(float var1, float var2) {
      ((Ok_1)this.class_[0]).class_(var1, var2);
      return this;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7877508388274684056L;
   }

   @Override
   public Ok_1 class_(int var1) {
      int var2 = var1 >>> 24 & 0xFF;
      int var3 = var1 & 16777215;
      ((Ok_1)this.class_[0]).class_(var3 | this.throws_(var2) << 24);
      return this;
   }

   @Override
   public Ok_1 class_(int var1, int var2) {
      ((Ok_1)this.class_[0]).class_(var1, this.throws_(var2));
      return this;
   }

   @Override
   public Ok_1 class_(double var1, double var3, double var5) {
      ((Ok_1)this.class_[0]).class_(var1, var3, var5);
      return this;
   }

   @Override
   public void class_() {
      ((Ok_1)this.class_[0]).class_();
   }

   public rrjB_2 class_(Ok_1 var1, float var2) {
      this.class_[0] = var1;
      Float var8 = var2;
      this.class_[1] = var8;
      return this;
   }

   @Override
   public Ok_1 class_(float var1, float var2, float var3) {
      ((Ok_1)this.class_[0]).class_(var1, var2, var3);
      return this;
   }

   @Override
   public Ok_1 break_(int var1, int var2, int var3, int var4) {
      ((Ok_1)this.class_[0]).break_(var1, var2, var3, this.throws_(var4));
      return this;
   }

   @Override
   public Ok_1 break_(int var1, int var2) {
      ((Ok_1)this.class_[0]).break_(var1, var2);
      return this;
   }

   private int throws_(int var1) {
      int var2 = (int)((float)var1 * (Float)this.class_[1]);
      return var2 < 0 ? 0 : Math.min(var2, 255);
   }

   private static void finally_() {
      private_ = new boolean[]{false, true};
   }

   private static void catch_() {
      byte_ = new float[]{1.0F, 0.0F};
   }

   private static void extends_() {
      throws_ = new int[]{16777215};
   }

   private void case_() {
      if (this.class_ == null) {
         this.class_ = new Object[2];
         this.class_[1] = 0.0F;
      }
   }

   private static int case_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1035970034;
   }

   private static void implements_() {
      protected_ = new short[]{1, 0, 1, 0, 0, 255, 0, 0, 0, 0, 0, 0, 0, 0, 1, 255};
   }

   @Override
   public Hd_1 protected_() {
      return ((Ok_1)this.class_[0]).protected_();
   }

   private static void private_() {
      break_ = new byte[]{24, 24, 2};
   }
}
