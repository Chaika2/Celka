package celestial;

import java.util.BitSet;
import java.util.List;
import java.util.Random;

public class lT_2 {
   private final yC_2 class_;
   private static final ThreadLocal<lI_2> break_ = ThreadLocal.withInitial(() -> new lI_2());
   private static float byte_ = 0.2F;
   private static boolean protected_ = false;
   static final rrxc_3 throws_ = new rrxc_3();
   private static final HU[] case_ = new HU[]{rrxA_2.byte_, rrxA_2.break_, rrxA_2.protected_};
   private boolean catch_ = rrxr_3.rb.byte_();

   public boolean byte_(rRp_1 var1, IJ var2, xc_3 var3, rfH_2 var4, Ml_1 var5, Ok_1 var6, boolean var7, Random var8, long var9, int var11) {
      return this.byte_(var1, var2, var3, var4, var5, var6, var7, var8, var9, var11, rrGp_1.class_);
   }

   public static void byte_() {
      byte_ = 1.0F - rrbb_3.h() * 0.8F;
      protected_ = rrbb_3.rs() && rrdZ.synchronized_();
   }

   public boolean byte_(rRp_1 var1, IJ var2, xc_3 var3, rfH_2 var4, Ml_1 var5, Ok_1 var6, boolean var7, Random var8, long var9, int var11, rrGq_1 var12) {
      boolean var13 = false;
      rrxF_2 var14 = var6.class_(var3, var4);
      HU var15 = var6.byte_();

      for (rpr_3 var19 : rpr_3.VALUES) {
         if (!var7 || rrWP.class_(var3, var1, var4, var19, var14)) {
            var8.setSeed(var9);
            List var20 = this.catch_ ? var2.class_(var3, var19, var8, var12) : var2.class_(var3, var19, var8);
            int var21 = yX_2.class_(var1, var3, var4.break_(var19));
            var20 = rrJH.class_(var20, var1, var3, var4, var19, var15, var9, var14);
            this.class_(var1, var3, var4, var21, var11, false, var5, var6, var20, var14);
            var13 = true;
         }
      }

      var8.setSeed(var9);
      List var22 = this.catch_ ? var2.class_(var3, (rpr_3)null, var8, var12) : var2.class_(var3, (rpr_3)null, var8);
      if (!var22.isEmpty()) {
         var22 = rrJH.class_(var22, var1, var3, var4, (rpr_3)null, var15, var9, var14);
         this.class_(var1, var3, var4, -1, var11, true, var5, var6, var22, var14);
         var13 = true;
      }

      return var13;
   }

   public lT_2(yC_2 var1) {
      this.class_ = var1;
   }

   public static void class_() {
      break_.get().class_();
   }

   public void class_(MH var1, Ok_1 var2, xc_3 var3, IJ var4, float var5, float var6, float var7, int var8, int var9) {
      this.class_(var1, var2, var3, var4, var5, var6, var7, var8, var9, rrGp_1.class_);
   }

   public void class_(MH var1, Ok_1 var2, xc_3 var3, IJ var4, float var5, float var6, float var7, int var8, int var9, rrGq_1 var10) {
      Random var11 = new Random();
      long var12 = 42L;

      for (rpr_3 var17 : rpr_3.VALUES) {
         var11.setSeed(42L);
         if (this.catch_) {
            class_(var1, var2, var5, var6, var7, var4.class_(var3, var17, var11, var10), var8, var9);
         } else {
            class_(var1, var2, var5, var6, var7, var4.class_(var3, var17, var11), var8, var9);
         }
      }

      var11.setSeed(42L);
      if (this.catch_) {
         class_(var1, var2, var5, var6, var7, var4.class_(var3, (rpr_3)null, var11, var10), var8, var9);
      } else {
         class_(var1, var2, var5, var6, var7, var4.class_(var3, (rpr_3)null, var11), var8, var9);
      }
   }

   public boolean class_(rRp_1 var1, IJ var2, xc_3 var3, rfH_2 var4, Ml_1 var5, Ok_1 var6, boolean var7, Random var8, long var9, int var11, rrGq_1 var12) {
      boolean var13 = QY.L() && var3.case_() == 0 && var2.class_();
      if (this.catch_) {
         var12 = var2.class_(var1, var4, var3, var12);
      }

      rjU_2 var14 = var3.class_(var4);
      var5.class_(var14.break_, var14.byte_, var14.protected_);

      try {
         if (rrbb_3.rs()) {
            rrdk_1.class_(var3, var6);
         }

         if (!rrbb_3.rJ()) {
            var9 = 0L;
         }

         rrxF_2 var15 = var6.class_(var3, var4);
         var2 = rrJH.class_(var2, var3, var15);
         boolean var20 = var13
            ? this.break_(var1, var2, var3, var4, var5, var6, var7, var8, var9, var11, var12)
            : this.byte_(var1, var2, var3, var4, var5, var6, var7, var8, var9, var11, var12);
         if (var20) {
            this.class_(var1, var2, var3, var4, var5, var6, var11, var7, var8, var9, var15, var13, var14);
         }

         if (rrbb_3.rs()) {
            rrdk_1.class_(var6);
         }

         return var20;
      } catch (Throwable var18) {
         KY var16 = KY.class_(var18, "Tesselating block model");
         Ko_1 var17 = var16.class_("Block model being tesselated");
         Ko_1.class_(var17, var4, var3);
         var17.class_("Using AO", var13);
         throw new KU(var16);
      }
   }

   public static float class_(float var0) {
      return var0 == 0.2F ? byte_ : var0;
   }

   public boolean class_(rRp_1 var1, IJ var2, xc_3 var3, rfH_2 var4, Ml_1 var5, Ok_1 var6, boolean var7, Random var8, long var9, int var11) {
      return this.class_(var1, var2, var3, var4, var5, var6, var7, var8, var9, var11, rrGp_1.class_);
   }

   private void class_(
      rRp_1 var1,
      IJ var2,
      xc_3 var3,
      rfH_2 var4,
      Ml_1 var5,
      Ok_1 var6,
      int var7,
      boolean var8,
      Random var9,
      long var10,
      rrxF_2 var12,
      boolean var13,
      rjU_2 var14
   ) {
      if (var12.int_()) {
         for (int var15 = 0; var15 < case_.length; var15++) {
            HU var16 = case_[var15];
            rrJp_1 var17 = var12.class_(var16);
            if (var17.class_() > 0) {
               Hv_1 var18 = var12.package_();
               if (var18 != null) {
                  lD_2 var19 = var18.class_(var16);
                  if (!var19.final_()) {
                     var19.class_(7, ju_3.private_);
                  }

                  for (int var20 = 0; var20 < var17.class_(); var20++) {
                     wK_2 var21 = var17.class_(var20);
                     List var22 = var17.class_(var21);
                     xc_3 var23 = var17.break_(var20);
                     if (var21.int_() != null) {
                        var17.class_(var21.int_(), var23);
                     }

                     var12.class_(var23, var4);
                     if (var13) {
                        this.class_(var1, var23, var4, var5, var19, var22, var7, var12);
                     } else {
                        int var24 = yX_2.class_(var1, var23, var4.break_(var21.protected_()));
                        this.class_(var1, var23, var4, var24, var7, false, var5, var19, var22, var12);
                     }
                  }
               }

               var17.break_();
            }
         }
      }

      if (rrbb_3.f() && !var12.case_() && rrGe_1.class_(var1, var3, var4)) {
         IJ var25 = rrGe_1.break_();
         xc_3 var26 = rrGe_1.byte_();
         var5.class_(-var14.break_, -var14.byte_, -var14.protected_);
         this.class_(var1, var25, var26, var4, var5, var6, var8, var9, var10, var7);
      }
   }

   private void class_(rRp_1 var1, xc_3 var2, rfH_2 var3, Ml_1 var4, Ok_1 var5, List<wK_2> var6, int var7, rrxF_2 var8) {
      float[] var9 = var8.byte_();
      BitSet var10 = var8.protected_();
      lw_3 var11 = var8.throws_();
      int var12 = var6.size();

      for (int var13 = 0; var13 < var12; var13++) {
         wK_2 var14 = (wK_2)var6.get(var13);
         this.class_(var1, var2, var3, var14.class_(), var14.protected_(), var9, var10);
         var11.class_(var1, var2, var3, var14.protected_(), var9, var10, var14.throws_());
         if (var14.case_().package_) {
            var11.class_();
         }

         this.class_(
            var1,
            var2,
            var3,
            var5,
            var4.byte_(),
            var14,
            var11.class_[0],
            var11.class_[1],
            var11.class_[2],
            var11.class_[3],
            var11.break_[0],
            var11.break_[1],
            var11.break_[2],
            var11.break_[3],
            var7,
            var8
         );
      }
   }

   private static void class_(MH var0, Ok_1 var1, float var2, float var3, float var4, List<wK_2> var5, int var6, int var7) {
      boolean var8 = rrbY_2.class_();

      for (wK_2 var10 : var5) {
         if (var8) {
            var10 = rrbY_2.class_(var10);
            if (var10 == null) {
               continue;
            }
         }

         float var11;
         float var12;
         float var13;
         if (var10.break_()) {
            var11 = rfU_2.class_(var2, 0.0F, 1.0F);
            var12 = rfU_2.class_(var3, 0.0F, 1.0F);
            var13 = rfU_2.class_(var4, 0.0F, 1.0F);
         } else {
            var11 = 1.0F;
            var12 = 1.0F;
            var13 = 1.0F;
         }

         var1.class_(var0, var10, var11, var12, var13, var6, var7);
      }
   }

   private void class_(
      rRp_1 var1,
      xc_3 var2,
      rfH_2 var3,
      Ok_1 var4,
      MH var5,
      wK_2 var6,
      float var7,
      float var8,
      float var9,
      float var10,
      int var11,
      int var12,
      int var13,
      int var14,
      int var15,
      rrxF_2 var16
   ) {
      int var17 = rrbN_2.class_(var6, var2, var1, var3, var16);
      float var18;
      float var19;
      float var20;
      if (!var6.break_() && var17 == -1) {
         var18 = 1.0F;
         var19 = 1.0F;
         var20 = 1.0F;
      } else {
         int var21 = var17 != -1 ? var17 : this.class_.class_(var2, var1, var3, var6.byte_());
         var18 = (float)(var21 >> 16 & 0xFF) / 255.0F;
         var19 = (float)(var21 >> 8 & 0xFF) / 255.0F;
         var20 = (float)(var21 & 0xFF) / 255.0F;
      }

      var4.class_(var5, var6, var4.break_(var7, var8, var9, var10), var18, var19, var20, var4.byte_(var11, var12, var13, var14), var15, true);
   }

   private void class_(rRp_1 var1, xc_3 var2, rfH_2 var3, int[] var4, rpr_3 var5, float[] var6, BitSet var7) {
      float var8 = 32.0F;
      float var9 = 32.0F;
      float var10 = 32.0F;
      float var11 = -32.0F;
      float var12 = -32.0F;
      float var13 = -32.0F;
      int var14 = var4.length / 4;

      for (int var15 = 0; var15 < 4; var15++) {
         float var16 = Float.intBitsToFloat(var4[var15 * var14]);
         float var17 = Float.intBitsToFloat(var4[var15 * var14 + 1]);
         float var18 = Float.intBitsToFloat(var4[var15 * var14 + 2]);
         var8 = Math.min(var8, var16);
         var9 = Math.min(var9, var17);
         var10 = Math.min(var10, var18);
         var11 = Math.max(var11, var16);
         var12 = Math.max(var12, var17);
         var13 = Math.max(var13, var18);
      }

      if (var6 != null) {
         var6[rpr_3.WEST.byte_()] = var8;
         var6[rpr_3.EAST.byte_()] = var11;
         var6[rpr_3.DOWN.byte_()] = var9;
         var6[rpr_3.UP.byte_()] = var12;
         var6[rpr_3.NORTH.byte_()] = var10;
         var6[rpr_3.SOUTH.byte_()] = var13;
         int var19 = rpr_3.VALUES.length;
         var6[rpr_3.WEST.byte_() + var19] = 1.0F - var8;
         var6[rpr_3.EAST.byte_() + var19] = 1.0F - var11;
         var6[rpr_3.DOWN.byte_() + var19] = 1.0F - var9;
         var6[rpr_3.UP.byte_() + var19] = 1.0F - var12;
         var6[rpr_3.NORTH.byte_() + var19] = 1.0F - var10;
         var6[rpr_3.SOUTH.byte_() + var19] = 1.0F - var13;
      }

      switch (var5) {
         case DOWN:
            var7.set(1, var8 >= 1.0E-4F || var10 >= 1.0E-4F || var11 <= 0.9999F || var13 <= 0.9999F);
            var7.set(0, var9 == var12 && (var9 < 1.0E-4F || var2.new_(var1, var3)));
            break;
         case UP:
            var7.set(1, var8 >= 1.0E-4F || var10 >= 1.0E-4F || var11 <= 0.9999F || var13 <= 0.9999F);
            var7.set(0, var9 == var12 && (var12 > 0.9999F || var2.new_(var1, var3)));
            break;
         case NORTH:
            var7.set(1, var8 >= 1.0E-4F || var9 >= 1.0E-4F || var11 <= 0.9999F || var12 <= 0.9999F);
            var7.set(0, var10 == var13 && (var10 < 1.0E-4F || var2.new_(var1, var3)));
            break;
         case SOUTH:
            var7.set(1, var8 >= 1.0E-4F || var9 >= 1.0E-4F || var11 <= 0.9999F || var12 <= 0.9999F);
            var7.set(0, var10 == var13 && (var13 > 0.9999F || var2.new_(var1, var3)));
            break;
         case WEST:
            var7.set(1, var9 >= 1.0E-4F || var10 >= 1.0E-4F || var12 <= 0.9999F || var13 <= 0.9999F);
            var7.set(0, var8 == var11 && (var8 < 1.0E-4F || var2.new_(var1, var3)));
            break;
         case EAST:
            var7.set(1, var9 >= 1.0E-4F || var10 >= 1.0E-4F || var12 <= 0.9999F || var13 <= 0.9999F);
            var7.set(0, var8 == var11 && (var11 > 0.9999F || var2.new_(var1, var3)));
      }
   }

   private void class_(rRp_1 var1, xc_3 var2, rfH_2 var3, int var4, int var5, boolean var6, Ml_1 var7, Ok_1 var8, List<wK_2> var9, rrxF_2 var10) {
      BitSet var11 = var10.protected_();
      int var12 = var9.size();

      for (int var13 = 0; var13 < var12; var13++) {
         wK_2 var14 = (wK_2)var9.get(var13);
         if (var6) {
            this.class_(var1, var2, var3, var14.class_(), var14.protected_(), (float[])null, var11);
            rfH_2 var15 = var11.get(0) ? var3.break_(var14.protected_()) : var3;
            var4 = yX_2.class_(var1, var2, var15);
         }

         if (var14.case_().package_) {
            var4 = HQ.class_;
         }

         float var16 = var1.class_(var14.protected_(), var14.throws_());
         this.class_(var1, var2, var3, var8, var7.byte_(), var14, var16, var16, var16, var16, var4, var4, var4, var4, var5, var10);
      }
   }

   public boolean break_(rRp_1 var1, IJ var2, xc_3 var3, rfH_2 var4, Ml_1 var5, Ok_1 var6, boolean var7, Random var8, long var9, int var11, rrGq_1 var12) {
      boolean var13 = false;
      rrxF_2 var14 = var6.class_(var3, var4);
      HU var15 = var6.byte_();

      for (rpr_3 var19 : rpr_3.VALUES) {
         if (!var7 || rrWP.class_(var3, var1, var4, var19, var14)) {
            var8.setSeed(var9);
            List var20 = this.catch_ ? var2.class_(var3, var19, var8, var12) : var2.class_(var3, var19, var8);
            var20 = rrJH.class_(var20, var1, var3, var4, var19, var15, var9, var14);
            this.class_(var1, var3, var4, var5, var6, var20, var11, var14);
            var13 = true;
         }
      }

      var8.setSeed(var9);
      List var21 = this.catch_ ? var2.class_(var3, (rpr_3)null, var8, var12) : var2.class_(var3, (rpr_3)null, var8);
      if (!var21.isEmpty()) {
         var21 = rrJH.class_(var21, var1, var3, var4, (rpr_3)null, var15, var9, var14);
         this.class_(var1, var3, var4, var5, var6, var21, var11, var14);
         var13 = true;
      }

      return var13;
   }

   public static void break_() {
      break_.get().break_();
   }

   public boolean break_(rRp_1 var1, IJ var2, xc_3 var3, rfH_2 var4, Ml_1 var5, Ok_1 var6, boolean var7, Random var8, long var9, int var11) {
      return this.break_(var1, var2, var3, var4, var5, var6, var7, var8, var9, var11, rrGp_1.class_);
   }

   public static boolean protected_() {
      return protected_;
   }
}
