package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrZl_1 extends rrZN {
   private static int[] protected_;
   private static float[] throws_;
   public Object[] break_;
   private static byte[] case_;
   public static Object[] byte_;
   private static short[] catch_;
   private static double[] private_;
   private static boolean[] implements_;

   public boolean int_() {
      this.return_();
      return (Boolean)this.break_[9];
   }

   public rrZl_1(rrtN_2 var1, rrZH var2) {
      this.return_();
      Float var7 = -1.0F;
      this.break_[7] = var7;
      AnimValue var8 = new AnimValue(0.4F, false);
      this.break_[10] = var8;
      this.break_[0] = var2;
      this.break_[11] = var1;
   }

   public rrZl_1(rrZH var1) {
      this.return_();
      Float var6 = -1.0F;
      this.break_[7] = var6;
      AnimValue var7 = new AnimValue(0.4F, false);
      this.break_[10] = var7;
      this.break_[0] = var1;
   }

   static {
      ntfClinit();
   }

   private static void this_() {
      Object[] var0 = new Object[]{15};
      byte_ = var0;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2488182610250880398L;
   }

   private void class_(float var1, float var2, float var3, float var4) {
      this.return_();
      Float var9 = var1;
      this.break_[1] = var9;
      Float var10 = var2;
      this.break_[2] = var10;
      Float var11 = var3;
      this.break_[3] = var11;
      Float var12 = var4;
      this.break_[4] = var12;
   }

   @Override
   public boolean class_(Ml_1 var1, rrtu_3 var2, float var3, float var4, float var5, float var6, int var7, int var8, boolean var9) {
      return true;
   }

   private boolean class_(rrtu_3 var1, int var2, int var3, boolean var4) {
      this.return_();
      if (var4 && rrtu_3.class_(var1, var2, var3)) {
         return false;
      } else {
         return (rrtN_2)this.break_[11] != null && var1.class_((rrtN_2)this.break_[11], var2, var3) ? false : this.final_().break_((float)var2, (float)var3);
      }
   }

   @Override
   public boolean class_(rrtu_3 var1, int var2, int var3, int var4, boolean var5) {
      this.return_();
      if (!super.class_(var1, var2, var3, var4, var5)) {
         return false;
      } else {
         boolean var6 = this.class_(var1, var2, var3, var5);
         if (var4 == 0 && var6) {
            Float var11 = (float)var3;
            this.break_[7] = var11;
            Boolean var12 = true;
            this.break_[8] = var12;
            Boolean var13 = true;
            this.break_[6] = var13;
            return true;
         } else {
            Boolean var14 = false;
            this.break_[6] = var14;
            return false;
         }
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 791658498;
   }

   public void class_(Ml_1 var1, rrtu_3 var2, float var3, float var4, int var5, int var6, float var7, float var8, float var9, boolean var10, float var11) {
      this.return_();
      if (!(Boolean)this.break_[9]) {
         boolean var12 = var8 > var9 ? true : implements_[3];
         ((AnimValue)this.break_[10]).class_(var12);
         if (!((AnimValue)this.break_[10]).case_()) {
            return;
         }

         if (var12) {
            Float var24 = var8;
            this.break_[5] = var24;
         }

         float var13 = ((AnimValue)this.break_[10]).byte_();
         var11 *= var13;
         if (!((AnimValue)this.break_[10]).case_()) {
            return;
         }
      } else {
         Float var25 = var8;
         this.break_[5] = var25;
      }

      this.class_(var3, var4, var7, var9);
      boolean var28 = !this.break_[6] && !this.class_(var2, var5, var6, var10) ? implements_[5] : implements_[4];
      float var29 = (Float)this.break_[5] / var9;
      float var14 = Math.max(var9 / var29, 15.0F);
      float var15 = ((rrZH)this.break_[0]).break_();
      if ((Float)this.break_[7] != -1.0F) {
         float var16 = (Float)this.break_[7] - (float)var6;
         Float var26 = (float)var6;
         this.break_[7] = var26;
         var15 += var16 * var29;
      }

      float var30 = var15 / (-(Float)this.break_[5] + var9);
      float var17 = rfU_2.class_(var30, 0.0F, 1.0F);
      float var18 = (var9 - var14) * var17;
      if ((Boolean)this.break_[6]) {
         ((rrZH)this.break_[0]).byte_(-((Float)this.break_[5] - var9) * var17);
      }

      if ((Boolean)this.break_[8]) {
         this.class_(var6, var4, (Float)this.break_[5], var9, var18, var14);
         Boolean var27 = false;
         this.break_[8] = var27;
      }

      class_(var1, var3, var4, 0.0F, var7, var9, ColorHelper.break_((Integer)rrZI.break_[4], (int)var11));
      int var19 = (int)Math.min(var28 ? (double)var11 : (double)var11 / 1.2, private_[1]);
      class_(var1, var3, var4, var18, var7, var14, ColorHelper.break_(6781311, var19));
   }

   @Override
   public boolean class_(rrtu_3 var1, int var2, int var3, double var4, boolean var6) {
      return false;
   }

   private static void class_(Ml_1 var0, float var1, float var2, float var3, float var4, float var5, int var6) {
      rrfD_2.class_(var0, var1 + 1.0F, var2 + 1.0F + var3, var4 - 2.0F, var5 - 2.0F, 1.0F, 1.0F, 1.0F, 1.0F, var6);
   }

   private void class_(int var1, float var2, float var3, float var4, float var5, float var6) {
      this.return_();
      int var7 = (int)((float)var1 - var2);
      if (!((float)var7 >= var5) || !((float)var7 < var5 + var6)) {
         if (var7 >= 0 && !((float)var7 >= var4)) {
            float var8 = (float)var7 / var4;
            float var9 = -(var3 - var4) * var8;
            ((rrZH)this.break_[0]).byte_(var9);
         }
      }
   }

   @Override
   public void break_(int var1, int var2, int var3) {
      this.return_();
      if (var3 == 0) {
         Float var8 = -1.0F;
         this.break_[7] = var8;
         Boolean var9 = false;
         this.break_[6] = var9;
      }
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-96, -23, -124, 46, -79, -77, 124, -108}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public boolean finally_() {
      this.return_();
      return (Boolean)this.break_[6];
   }

   public rrZH extends_() {
      this.return_();
      return (rrZH)this.break_[0];
   }

   private static void continue_() {
      case_ = new byte[]{12, 2, 3, 4, 5, 6, 7, 8, 9, 15};
   }

   private static void else_() {
      private_ = new double[]{1.2, 255.0};
   }

   private static void new_() {
      throws_ = new float[]{
         -1.0F,
         0.4F,
         -1.0F,
         0.4F,
         15.0F,
         -1.0F,
         0.0F,
         1.0F,
         0.0F,
         -1.0F,
         -1.0F,
         0.0F,
         1.0F,
         1.0F,
         2.0F,
         2.0F,
         1.0F,
         1.0F,
         1.0F,
         1.0F,
         0.0F,
         0.0F,
         0.0F,
         0.0F,
         0.0F,
         0.0F
      };
   }

   public AnimValue package_() {
      this.return_();
      return (AnimValue)this.break_[10];
   }

   private void return_() {
      if (this.break_ == null) {
         this.break_ = new Object[12];
         Object[] var1 = this.break_;
         var1[1] = 0.0F;
         var1[2] = 0.0F;
         var1[3] = 0.0F;
         var1[4] = 0.0F;
         var1[5] = 0.0F;
         var1[6] = false;
         var1[7] = 0.0F;
         var1[8] = false;
         var1[9] = false;
      }
   }

   private static void super_() {
      implements_ = new boolean[]{
         false,
         false,
         true,
         false,
         true,
         false,
         false,
         false,
         true,
         true,
         true,
         false,
         true,
         false,
         false,
         false,
         false,
         false,
         true,
         true,
         false,
         false,
         false,
         true,
         false
      };
   }

   private static void public_() {
      protected_ = new int[]{6781311};
   }

   @Override
   public void private_() {
      this.return_();
      super.private_();
      Float var5 = -1.0F;
      this.break_[7] = var5;
      Boolean var6 = false;
      this.break_[6] = var6;
   }

   public rruv_1 final_() {
      this.return_();
      return new rruv_1((Float)this.break_[1], (Float)this.break_[2], (Float)this.break_[3], (Float)this.break_[4]);
   }

   @Override
   public void volatile_() {
      rrZH var1 = this.extends_();
      var1.byte_(0.0F);
   }

   private static void synchronized_() {
      catch_ = new short[]{
         7,
         10,
         0,
         7,
         10,
         0,
         11,
         9,
         10,
         10,
         5,
         10,
         10,
         5,
         6,
         5,
         0,
         7,
         7,
         7,
         5,
         6,
         0,
         5,
         8,
         5,
         8,
         4,
         7,
         8,
         6,
         6,
         7,
         6,
         7,
         6,
         11,
         11,
         1,
         2,
         3,
         4,
         1,
         2,
         3,
         4,
         6,
         0,
         0,
         10,
         9,
         9
      };
   }

   public rrZl_1 native_() {
      this.return_();
      Boolean var5 = true;
      this.break_[9] = var5;
      return this;
   }
}
