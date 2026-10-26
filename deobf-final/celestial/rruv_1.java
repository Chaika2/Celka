package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rruv_1 {
   public static Object[] class_;
   private static byte[] byte_;
   public Object[] break_;
   private static float[] protected_;
   private static boolean[] throws_;
   private static short[] case_;

   public float byte_() {
      return (Float)this.break_[2];
   }

   public rruv_1(float var1, float var2, float var3, float var4) {
      this.throws_();
      Float var9 = var1;
      this.break_[0] = var9;
      Float var10 = var2;
      this.break_[1] = var10;
      Float var11 = var3;
      this.break_[2] = var11;
      Float var12 = var4;
      this.break_[3] = var12;
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof rruv_1 var2)) {
         return false;
      } else if (Float.compare(this.break_(), var2.break_()) != 0) {
         return false;
      } else if (Float.compare(this.protected_(), var2.protected_()) != 0) {
         return false;
      } else if (Float.compare(this.byte_(), var2.byte_()) != 0) {
         return false;
      } else {
         return Float.compare(this.class_(), var2.class_()) != 0 ? false : throws_[10];
      }
   }

   @Override
   public String toString() {
      return "Bound(x=" + this.break_() + ", y=" + this.protected_() + ", width=" + this.byte_() + ", height=" + this.class_() + ")";
   }

   @Override
   public int hashCode() {
      byte var1 = 59;
      int var2 = 1;
      var2 = var2 * 59 + Float.floatToIntBits(this.break_());
      var2 = var2 * 59 + Float.floatToIntBits(this.protected_());
      var2 = var2 * 59 + Float.floatToIntBits(this.byte_());
      return var2 * 59 + Float.floatToIntBits(this.class_());
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8397752255162701236L;
   }

   public rruv_1 class_(float var1, float var2) {
      return new rruv_1((Float)this.break_[0] - var1, (Float)this.break_[1] - var2, (Float)this.break_[2] + var1 * 2.0F, (Float)this.break_[3] + var2 * 2.0F);
   }

   public boolean class_(rruv_1 var1) {
      return this.break_[0] < var1.break_[0] + var1.break_[2]
            && this.break_[0] + this.break_[2] > var1.break_[0]
            && this.break_[1] < var1.break_[1] + var1.break_[3]
            && this.break_[1] + this.break_[3] > var1.break_[1]
         ? true
         : throws_[1];
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{53, 7, -66, 13, -46, 60, -24, 95}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1353702271;
   }

   public float class_() {
      return (Float)this.break_[3];
   }

   public float break_() {
      return (Float)this.break_[0];
   }

   public boolean break_(float var1, float var2) {
      return this.break_[0] < var1 && this.break_[0] + this.break_[2] > var1 && this.break_[1] < var2 && this.break_[1] + this.break_[3] > var2
         ? true
         : throws_[3];
   }

   private void throws_() {
      if (this.break_ == null) {
         this.break_ = new Object[4];
         Object[] var1 = this.break_;
         var1[0] = 0.0F;
         var1[1] = 0.0F;
         var1[2] = 0.0F;
         var1[3] = 0.0F;
      }
   }

   private static void finally_() {
      protected_ = new float[]{2.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F};
   }

   private static void catch_() {
      throws_ = new boolean[]{true, false, true, false, true, false, false, false, false, false, true, true, false, false, true, true};
   }

   private static void case_() {
      Object[] var0 = new Object[]{new rruv_1(0.0F, 0.0F, 0.0F, 0.0F)};
      class_ = var0;
   }

   private static void implements_() {
      case_ = new short[]{0, 1, 2, 3, 0, 0, 2, 0, 2, 0, 1, 1, 3, 1, 3, 1, 0, 0, 2, 1, 1, 3, 0, 1, 2, 3, 0, 1, 2, 3};
   }

   public float protected_() {
      return (Float)this.break_[1];
   }

   private static void private_() {
      byte_ = new byte[]{59, 59, 59, 59, 59, 4, 2, 3};
   }
}
