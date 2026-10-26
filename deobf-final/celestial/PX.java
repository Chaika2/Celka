package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class PX {
   public static Object[] class_;
   private static boolean[] byte_;
   public Object[] break_;
   private static float[] protected_;
   private static double[] throws_;
   private static short[] case_;
   private static byte[] catch_;

   public void byte_(float var1) {
      Float var6 = var1;
      this.break_[1] = var6;
   }

   public PX byte_(PX var1) {
      return new PX((Float)this.break_[0] - (Float)var1.break_[0], (Float)this.break_[1] - (Float)var1.break_[1]);
   }

   public PX byte_() {
      return new PX(protected_((Float)this.break_[0]), break_((Float)this.break_[1]));
   }

   public PX(float var1, float var2) {
      this.private_();
      Float var7 = var1;
      this.break_[0] = var7;
      Float var8 = var2;
      this.break_[1] = var8;
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (var1 != null && var1.getClass() == this.getClass()) {
         PX var2 = (PX)var1;
         return Float.floatToIntBits((Float)this.break_[0]) == Float.floatToIntBits((Float)var2.break_[0])
               && Float.floatToIntBits((Float)this.break_[1]) == Float.floatToIntBits((Float)var2.break_[1])
            ? true
            : byte_[19];
      } else {
         return byte_[17];
      }
   }

   @Override
   public String toString() {
      return "Yaw: " + (Float)this.break_[0] + ", Pitch: " + (Float)this.break_[1];
   }

   @Override
   public int hashCode() {
      return Objects.hash((Float)this.break_[0], (Float)this.break_[1]);
   }

   public boolean class_(PX var1, float var2) {
      return this.break_(var1.throws_(), var2) && this.class_(var1.protected_(), var2) ? true : byte_[3];
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{126, 34, -20, -114, 63, -47, 57, 116}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public PX class_() {
      return new PX((Float)this.break_[0], break_((Float)this.break_[1]));
   }

   public boolean class_(PX var1) {
      return this.break_(var1) && this.throws_(var1) ? true : byte_[1];
   }

   public boolean class_(float var1, float var2, float var3) {
      return this.break_(var1, var3) && this.class_(var2, var3) ? true : byte_[5];
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1643416083;
   }

   public void class_(float var1) {
      Float var6 = var1;
      this.break_[0] = var6;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4428564563199629314L;
   }

   public rjU_2 class_(an_3 var1, float var2) {
      return PJ.class_(this).throws_(var1.new_(var2));
   }

   public boolean class_(float var1, float var2) {
      return Math.abs((Float)this.break_[1] - var1) < var2 ? true : byte_[9];
   }

   public boolean break_(PX var1, float var2) {
      return Math.abs((Float)this.break_[1] - (Float)var1.break_[1]) < var2 ? true : byte_[11];
   }

   public boolean break_(float var1, float var2) {
      float var3 = Math.abs(protected_((Float)this.break_[0]) - protected_(var1));
      return !(var3 < var2) && !(var3 > 360.0F - var2) ? byte_[15] : byte_[14];
   }

   public static float break_(float var0) {
      return rfU_2.class_(var0, -90.0F, 90.0F);
   }

   public PX break_() {
      return new PX(protected_((Float)this.break_[0]), (Float)this.break_[1]);
   }

   public boolean break_(PX var1) {
      float var2 = Math.abs(protected_((Float)this.break_[0]) - protected_((Float)var1.break_[0]));
      return !((double)var2 < 0.01) && !((double)var2 > 359.99) ? byte_[13] : byte_[12];
   }

   public float throws_() {
      return (Float)this.break_[0];
   }

   public boolean throws_(PX var1) {
      return (double)Math.abs((Float)this.break_[1] - (Float)var1.break_[1]) < 0.01 ? true : byte_[7];
   }

   public PX throws_(float var1) {
      return new PX(var1, (Float)this.break_[1]);
   }

   private static void finally_() {
      Object[] var0 = new Object[]{new PX(0.0F, 0.0F)};
      class_ = var0;
   }

   private static void catch_() {
      case_ = new short[]{0, 1, 0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1, 0, 0, 1, 1, 0, 1};
   }

   private static void extends_() {
      catch_ = new byte[]{2, 2};
   }

   public PX case_(float var1) {
      return new PX((Float)this.break_[0], var1);
   }

   private static void case_() {
      byte_ = new boolean[]{
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         false,
         true,
         false,
         false,
         true,
         true
      };
   }

   private static void implements_() {
      protected_ = new float[]{360.0F, -90.0F, 90.0F, 360.0F, -180.0F, 360.0F, 180.0F, 360.0F, 0.0F, 0.0F, 0.0F, 0.0F};
   }

   public PX protected_(PX var1) {
      return new PX((Float)this.break_[0] + (Float)var1.break_[0], (Float)this.break_[1] + (Float)var1.break_[1]);
   }

   public float protected_() {
      return (Float)this.break_[1];
   }

   public static float protected_(float var0) {
      float var1 = var0 % 360.0F;
      if (var1 < -180.0F) {
         var1 += 360.0F;
      }

      if (var1 > 180.0F) {
         var1 -= 360.0F;
      }

      return var1;
   }

   private void private_() {
      if (this.break_ == null) {
         this.break_ = new Object[2];
         Object[] var1 = this.break_;
         var1[0] = 0.0F;
         var1[1] = 0.0F;
      }
   }

   private static void native_() {
      throws_ = new double[]{0.01, 0.01, 359.99};
   }
}
