package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrNM implements rrNG, MinecraftAccessor {
   private static byte[] byte_;
   public Object[] class_;
   private static double[] protected_;
   private static short[] throws_;
   public static Object[] break_;
   private static float[] case_;
   private static boolean[] catch_;

   @Override
   public float byte_() {
      return (Float)this.class_[2];
   }

   public rrNM(float var1) {
      this((rrQK)rrQK.staticFieldsd7edc8a98bf936d38fa97cfea6cbd552[0], var1);
   }

   public rrNM(rrQK var1, float var2) {
      this.volatile_();
      Boolean var7 = true;
      this.class_[5] = var7;
      Float var8 = var2;
      this.class_[1] = var8;
      this.class_[0] = var1;
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-1, -62, 61, 40, -21, -15, 104, -123}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4594099427491238032L;
   }

   public void class_(boolean var1) {
      Float var8 = var1 ? 1.0F : case_[1];
      this.class_[3] = var8;
      if (!this.protected_()) {
         double var2 = (Double)rrQo_1.class_[0] * 0.01;
         Float var9 = (float)rfU_2.class_(
            (double)((Float)this.class_[4]).floatValue()
               + (var1 ? (double)((Float)this.class_[1]).floatValue() * var2 : (double)(-(Float)this.class_[1]) * var2),
            0.0,
            1.0
         );
         this.class_[4] = var9;
         Float var10 = (float)((rrQK)this.class_[0]).class_((double)((Float)this.class_[4]).floatValue());
         this.class_[2] = var10;
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1406270259;
   }

   public float class_() {
      return this.class_[3] > 1.0F ? (Float)this.class_[3] - this.byte_() : case_[3] - this.byte_();
   }

   public void break_() {
      Float var5 = 0.0F;
      this.class_[2] = var5;
      Float var6 = 0.0F;
      this.class_[4] = var6;
      Float var7 = 0.0F;
      this.class_[3] = var7;
   }

   public void throws_() {
      Float var5 = 1.0F;
      this.class_[2] = var5;
      Float var6 = 1.0F;
      this.class_[3] = var6;
   }

   private static void finally_() {
      byte_ = new byte[]{6, 2, 3, 4, 5};
   }

   public float catch_() {
      if ((Float)this.class_[4] >= 1.0F) {
         Boolean var5 = false;
         this.class_[5] = var5;
      } else if ((Float)this.class_[4] <= 0.0F) {
         Boolean var6 = true;
         this.class_[5] = var6;
      }

      this.class_((Boolean)this.class_[5]);
      return (Float)this.class_[2];
   }

   private static void extends_() {
      protected_ = new double[]{0.01, 0.0, 1.0, 1.0E-10, 1.0E-10, 1.0E-10};
   }

   @Override
   public boolean case_() {
      return (double)this.byte_() > 1.0E-10 ? true : catch_[2];
   }

   private static void implements_() {
      Object[] var0 = new Object[]{1.0E-10};
      break_ = var0;
   }

   @Override
   public boolean protected_() {
      return (double)Math.abs(this.byte_() - (Float)this.class_[3]) < 1.0E-10 ? true : catch_[4];
   }

   private static void private_() {
      case_ = new float[]{1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F};
   }

   private static void final_() {
      throws_ = new short[]{5, 1, 0, 0, 3, 0, 4, 1, 1, 4, 0, 4, 2, 2, 3, 3, 3, 2, 4, 3, 2, 3, 4, 5, 4, 5, 5, 2};
   }

   private void volatile_() {
      if (this.class_ == null) {
         this.class_ = new Object[6];
         Object[] var1 = this.class_;
         var1[1] = 0.0F;
         var1[2] = 0.0F;
         var1[3] = 0.0F;
         var1[4] = 0.0F;
         var1[5] = false;
      }
   }

   private static void native_() {
      catch_ = new boolean[]{true, true, false, true, false, false, true, true, false, true, false};
   }
}
