package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrvi_1 extends rrvj_1 implements rrTZ {
   private static long[] native_;
   private static float[] volatile_;
   public Object[] byte_;
   private static int[] final_;
   private static byte[] package_;
   private static short[] int_;
   private static boolean[] new_;
   private static String[] continue_;
   public static Object[] protected_;

   public rrvi_1() {
      super("Item Keybinds", () -> 0.0F, () -> 0.0F);
      this.d();
      ArrayList var7 = new ArrayList();
      this.byte_[0] = var7;
      AnimValue var8 = new AnimValue(0.5F, false).package_();
      this.byte_[3] = var8;
      AnimValue var9 = new AnimValue(0.5F, false).package_();
      this.byte_[4] = var9;
      Boolean var10 = false;
      this.byte_[5] = var10;
      Boolean var11 = false;
      this.byte_[6] = var11;
      ((rrTm_1)rrTm_1.staticFields9ecc5a8aa54b3c499a2c916d8fcc4ea4[0]).break_(this);

      for (rrHv_1 var2 : ((rrTm_1)rrTm_1.staticFields9ecc5a8aa54b3c499a2c916d8fcc4ea4[0]).break_()) {
         ((List)this.byte_[0]).add(new rrFP(var2));
      }

      ((List)this.byte_[0]).add(new rrFB(this, rdy_3.OW, "Q"));
      ((List)this.byte_[0]).add(new rrFB(this, rdy_3.Jd, "W"));
      ((List)this.byte_[0]).add(new rrFB(this, rdy_3.JT, "E"));
      ((List)this.byte_[0]).add(new rrFB(this, rdy_3.XY, "R"));
      ((List)this.byte_[0]).add(new rrFB(this, rdy_3.ko, "T"));
      ((List)this.byte_[0]).add(new rrFB(this, rdy_3.xa, "Y"));
   }

   static {
      ntfClinit();
   }

   private static boolean B() {
      Hud var0 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).private_().w();
      return var0.aJ_() && var0.else_() ? true : new_[30];
   }

   private static void J() {
      volatile_ = new float[]{
         0.5F,
         0.5F,
         0.0F,
         0.0F,
         0.001F,
         4.0F,
         150.0F,
         0.0F,
         4.0F,
         0.0F,
         15.0F,
         0.001F,
         4.0F,
         0.0F,
         0.0F,
         0.0F,
         0.001F,
         4.0F,
         150.0F,
         0.0F,
         4.0F,
         0.0F,
         0.0F,
         10.0F,
         5.0F,
         0.0F,
         1.0F,
         0.0F,
         225.0F,
         255.0F,
         1.5F,
         1.0F,
         0.5F,
         0.0F,
         0.0F,
         8.0F,
         2.0F,
         4.0F,
         1.0F,
         0.7F,
         0.5F,
         0.5F,
         8.0F,
         4.5F,
         10.0F,
         2.0F,
         1.0F,
         10.0F,
         0.0F,
         90.0F,
         270.0F,
         180.0F,
         4.0F,
         0.0F,
         0.0F,
         0.0F,
         0.0F,
         0.5F,
         8.0F,
         10.0F,
         4.0F,
         4.0F,
         5.0F,
         150.0F,
         1.5F,
         2.5F,
         4.5F,
         0.5F,
         8.0F,
         0.7F,
         4.0F,
         0.001F
      };
   }

   private static void S() {
      continue_ = new String[]{
         new String("Item Keybinds"), new String("Q"), new String("W"), new String("E"), new String("R"), new String("T"), new String("Y")
      };
   }

   boolean x() {
      return (vm_3)import_.class_[73] instanceof FP && !this.h() ? true : new_[19];
   }

   private static void s() {
      Object[] var0 = new Object[]{0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.689349E19F, 16777215, 0.0F, 300L, -3.689349E19F};
      protected_ = var0;
   }

   private boolean h() {
      this.d();

      for (rrFr_1 var2 : (List)this.byte_[0]) {
         if (!var2.byte_() && var2.protected_()) {
            return true;
         }
      }

      return new_[21];
   }

   private void d() {
      if (this.byte_ == null) {
         this.byte_ = new Object[7];
         Object[] var1 = this.byte_;
         var1[1] = 0.0F;
         var1[2] = 0.0F;
         var1[5] = false;
         var1[6] = false;
      }
   }

   @Override
   public void class_(rrHv_1 var1) {
      this.d();

      for (rrFr_1 var3 : (List)this.byte_[0]) {
         if (var3 instanceof rrFP && (rrHv_1)((rrFP)var3).break_[0] == var1) {
            return;
         }
      }

      int var5 = new_[31];

      for (rrFr_1 var4 : (List)this.byte_[0]) {
         if (var4.byte_()) {
            break;
         }

         var5++;
      }

      ((List)this.byte_[0]).add(var5, new rrFP(var1));
   }

   @Override
   public void class_(Ml_1 var1, rrtu_3 var2, int var3, int var4, boolean var5) {
      this.d();
      super.class_(var1, var2, var3, var4, var5);
      rrZO var6 = ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).private_();
      boolean var7 = B();
      float var8 = this.long_();
      long var9 = rqR_2.break_();
      boolean var11 = this.x();
      if (var11 && !(Boolean)this.byte_[6]) {
         for (rrFr_1 var13 : (List)this.byte_[0]) {
            if (!var13.byte_()) {
               ((AnimValue)var13.class_[0]).class_(0.0F);
               var13.case_();
            }
         }
      }

      Boolean var32 = var11;
      this.byte_[6] = var32;
      this.protected_(var7);
      float var33 = this.default_();
      float var34 = this.abstract_();
      int var14 = 0;
      int var15 = 0;
      float var16 = 0.0F;
      var6.class_((lD_2)rrfD_2.class_[7]);
      rrfD_2.throws_((lD_2)rrfD_2.class_[8]);

      for (rrFr_1 var18 : (List)this.byte_[0]) {
         boolean var19 = var18.class_(var7);
         boolean var20 = ((AnimValue)var18.class_[0]).byte_() > 0.001F ? true : new_[7];
         var18.class_(var7, var9);
         if (!var19 && !var20) {
            var18.case_();
         } else {
            float var21 = (Float)var18.class_[5];
            if (var15 > 0 && var16 + 4.0F + var21 > 150.0F) {
               var14++;
               var15 = 0;
               var16 = 0.0F;
            }

            float var22 = var16 + (var15 > 0 ? 4.0F : volatile_[9]);
            float var23 = (float)var14 * 15.0F;
            var18.class_(var22, var23);
            float var24 = var18.catch_();
            float var25 = ((AnimValue)var18.class_[0]).byte_();
            if (var25 > 0.001F) {
               float var26 = var33 + var18.break_();
               float var27 = var34 + var18.private_() + var18.class_(var9);
               this.class_(var1, var6, var18, var26, var27, var24, var25, var8);
            }

            var16 += (var15 > 0 ? 4.0F : volatile_[13]) + var21;
            var15++;
         }
      }

      rrfD_2.private_((lD_2)rrfD_2.class_[8]);
      var6.byte_((lD_2)rrfD_2.class_[7]);
   }

   private static void class_(Ml_1 var0, float var1, float var2, float var3, int var4) {
      rrfD_2.class_(
         var0,
         var1,
         var2,
         var3,
         10.0F,
         var4,
         ColorHelper.class_(0.0F, var4),
         ColorHelper.class_(90.0F, var4),
         ColorHelper.class_(270.0F, var4),
         ColorHelper.class_(180.0F, var4),
         false,
         4.0F
      );
   }

   private void class_(Ml_1 var1, rrZO var2, rrFr_1 var3, float var4, float var5, float var6, float var7, float var8) {
      int var9 = (int)(225.0F * var7 * var8);
      int var10 = (int)(255.0F * var7 * var8);
      class_(var1, var4, var5, var6, var9);
      float var11 = var4 + 1.5F;
      float var12 = var5 + 1.0F;
      rrfD_2.class_(var1, var3.class_(), var11, var12, var7 * var8, 0.5F, 0.0F, 0.0F, 0, false, !var3.byte_() ? true : new_[25]);
      float var13 = var11 + 8.0F + 2.0F;
      float var14 = 4.0F;
      float var15 = var5 + 1.0F;
      float var16 = var15 + var14;
      int var17 = ColorHelper.break_(-1, (int)((float)var10 * 0.7F));
      rrfD_2.class_(var1, (lD_2)rrfD_2.class_[8], var13, var15, 0.5F, var14, var17, var17, 16777215, 16777215);
      rrfD_2.class_(var1, (lD_2)rrfD_2.class_[8], var13, var16, 0.5F, var14, 16777215, 16777215, var17, var17);
      float var18 = var11 + 8.0F + 4.5F;
      float var19 = var5 + (10.0F - (float)var2.class_()) / 2.0F + 1.0F;
      var1.class_();
      var2.break_(var1, (lD_2)rrfD_2.class_[7], var3.implements_(), (double)var18, (double)var19, ColorHelper.break_(rrZF.d_, var10), false, false);
      var1.break_();
   }

   public void class_(rrAM var1) {
      this.d();
      rrZO var2 = ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).private_();
      boolean var3 = B();

      for (rrFr_1 var5 : (List)this.byte_[0]) {
         var5.class_(var2);
         boolean var6 = var5.class_(var3);
         ((AnimValue)var5.class_[0]).class_(var6 ? 1.0F : volatile_[27]);
         ((AnimValue)var5.class_[1]).package_();
         var5.case_();
      }

      ((AnimValue)this.byte_[3]).package_();
      ((AnimValue)this.byte_[4]).package_();
      Boolean var11 = false;
      this.byte_[5] = var11;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1267787027;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4221913575643560989L;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-51, 60, 87, 76, 75, 92, 74, 5}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void M() {
      native_ = new long[]{300L};
   }

   private static void G() {
      int_ = new short[]{
         0,
         3,
         4,
         5,
         6,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         6,
         0,
         0,
         6,
         7,
         8,
         0,
         0,
         5,
         0,
         8,
         7,
         0,
         0,
         5,
         5,
         4,
         3,
         5,
         4,
         3,
         4,
         1,
         3,
         2,
         0,
         0,
         0,
         0,
         0,
         1,
         3,
         4,
         5,
         73,
         0,
         8,
         8,
         7,
         0,
         0,
         0,
         0,
         0,
         1,
         2,
         0,
         0
      };
   }

   @Override
   public float implements_() {
      this.d();
      return (Float)this.byte_[1];
   }

   @Override
   public void instanceof_() {
      this.d();
      super.instanceof_();
      rrZO var1 = ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).private_();

      for (rrFr_1 var3 : (List)this.byte_[0]) {
         var3.class_(var1);
      }
   }

   @Override
   public boolean package_() {
      this.d();
      if (!B()) {
         return false;
      } else {
         for (rrFr_1 var2 : (List)this.byte_[0]) {
            if (var2.protected_()) {
               return true;
            }
         }

         return new_[34];
      }
   }

   private static void throw_() {
      new_ = new boolean[]{
         false,
         false,
         false,
         false,
         false,
         false,
         true,
         false,
         false,
         false,
         false,
         true,
         false,
         false,
         true,
         true,
         false,
         false,
         true,
         false,
         true,
         false,
         false,
         false,
         true,
         false,
         false,
         false,
         false,
         true,
         false,
         false,
         false,
         true,
         false,
         false,
         true,
         false,
         false,
         false,
         true
      };
   }

   private static void try_() {
      final_ = new int[]{16777215, 16777215, 16777215, 16777215, 16777215};
   }

   private void protected_(boolean var1) {
      this.d();
      float var2 = 0.0F;
      float var3 = 0.0F;
      int var4 = 0;
      int var5 = 0;
      int var6 = -1;

      for (rrFr_1 var8 : (List)this.byte_[0]) {
         boolean var9 = var8.class_(var1);
         boolean var10 = ((AnimValue)var8.class_[0]).byte_() > 0.001F ? true : new_[12];
         if (var9 || var10) {
            float var11 = (Float)var8.class_[5];
            if (var5 > 0 && var3 + 4.0F + var11 > 150.0F) {
               var2 = Math.max(var2, var3);
               var4++;
               var5 = 0;
               var3 = 0.0F;
            }

            if (var4 > var6) {
               var6 = var4;
            }

            var3 += (var5 > 0 ? 4.0F : volatile_[21]) + var11;
            var5++;
         }
      }

      var2 = Math.max(var2, var3);
      float var20 = Math.max(0.0F, var2);
      float var21 = var6 >= 0 ? (float)(var6 + 1) * 10.0F + (float)var6 * 5.0F : volatile_[25];
      boolean var22 = var6 >= 0 ? true : new_[16];
      if (var22 && !(Boolean)this.byte_[5]) {
         ((AnimValue)this.byte_[4]).package_();
         ((AnimValue)this.byte_[3]).package_();
      }

      Boolean var16 = var22;
      this.byte_[5] = var16;
      ((AnimValue)this.byte_[4]).break_(var20);
      ((AnimValue)this.byte_[3]).break_(var21);
      Float var17 = ((AnimValue)this.byte_[4]).byte_();
      this.byte_[1] = var17;
      Float var18 = ((AnimValue)this.byte_[3]).byte_();
      this.byte_[2] = var18;
   }

   @Override
   public boolean protected_() {
      return false;
   }

   private static void X() {
      package_ = new byte[]{-1, -1, 7, 2, 5, 6, 17, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
   }

   @Override
   public float ao_() {
      this.d();
      return (Float)this.byte_[2];
   }

   @Override
   public void at_() {
      super.at_();
      ((rrTm_1)rrTm_1.staticFields9ecc5a8aa54b3c499a2c916d8fcc4ea4[0]).class_(this);
   }
}
