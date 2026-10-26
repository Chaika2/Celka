package celestial;

import java.util.BitSet;

public class lw_3 {
   final float[] class_ = new float[4];
   final int[] break_ = new int[4];
   private rrGi_1 byte_ = new rrGi_1();

   public lw_3() {
      this((lT_2)null);
   }

   public lw_3(lT_2 var1) {
   }

   private int class_(int var1, int var2, int var3, int var4) {
      if (var1 == 0) {
         var1 = var4;
      }

      if (var2 == 0) {
         var2 = var4;
      }

      if (var3 == 0) {
         var3 = var4;
      }

      return var1 + var2 + var3 + var4 >> 2 & 16711935;
   }

   private int class_(int var1, int var2, int var3, int var4, float var5, float var6, float var7, float var8) {
      int var9 = (int)(
            (float)(var1 >> 16 & 0xFF) * var5 + (float)(var2 >> 16 & 0xFF) * var6 + (float)(var3 >> 16 & 0xFF) * var7 + (float)(var4 >> 16 & 0xFF) * var8
         )
         & 0xFF;
      int var10 = (int)((float)(var1 & 0xFF) * var5 + (float)(var2 & 0xFF) * var6 + (float)(var3 & 0xFF) * var7 + (float)(var4 & 0xFF) * var8) & 0xFF;
      return var9 << 16 | var10;
   }

   public void class_(rRp_1 var1, xc_3 var2, rfH_2 var3, rpr_3 var4, float[] var5, BitSet var6, boolean var7) {
      rfH_2 var8 = var6.get(0) ? var3.break_(var4) : var3;
      lV_2 var9 = lV_2.class_(var4);
      rrGi_1 var10 = this.byte_;
      rrxc_3 var11 = lT_2.throws_;
      var10.class_(var8, var9.corners[0]);
      xc_3 var12 = var1.byte_(var10);
      int var13 = rrxc_3.break_(var12, var1, var10);
      float var14 = rrxc_3.class_(var12, var1, var10);
      var10.class_(var8, var9.corners[1]);
      xc_3 var15 = var1.byte_(var10);
      int var16 = rrxc_3.break_(var15, var1, var10);
      float var17 = rrxc_3.class_(var15, var1, var10);
      var10.class_(var8, var9.corners[2]);
      xc_3 var18 = var1.byte_(var10);
      int var19 = rrxc_3.break_(var18, var1, var10);
      float var20 = rrxc_3.class_(var18, var1, var10);
      var10.class_(var8, var9.corners[3]);
      xc_3 var21 = var1.byte_(var10);
      int var22 = rrxc_3.break_(var21, var1, var10);
      float var23 = rrxc_3.class_(var21, var1, var10);
      var10.class_(var8, var9.corners[0], var4);
      boolean var24 = var1.byte_(var10).break_(var1, var10) == 0;
      var10.class_(var8, var9.corners[1], var4);
      boolean var25 = var1.byte_(var10).break_(var1, var10) == 0;
      var10.class_(var8, var9.corners[2], var4);
      boolean var26 = var1.byte_(var10).break_(var1, var10) == 0;
      var10.class_(var8, var9.corners[3], var4);
      boolean var27 = var1.byte_(var10).break_(var1, var10) == 0;
      float var28;
      int var29;
      if (!var26 && !var24) {
         var28 = var14;
         var29 = var13;
      } else {
         var10.class_(var8, var9.corners[0], var9.corners[2]);
         xc_3 var30 = var1.byte_(var10);
         var28 = rrxc_3.class_(var30, var1, var10);
         var29 = rrxc_3.break_(var30, var1, var10);
      }

      float var31;
      int var64;
      if (!var27 && !var24) {
         var31 = var14;
         var64 = var13;
      } else {
         var10.class_(var8, var9.corners[0], var9.corners[3]);
         xc_3 var32 = var1.byte_(var10);
         var31 = rrxc_3.class_(var32, var1, var10);
         var64 = rrxc_3.break_(var32, var1, var10);
      }

      float var33;
      int var65;
      if (!var26 && !var25) {
         var33 = var14;
         var65 = var13;
      } else {
         var10.class_(var8, var9.corners[1], var9.corners[2]);
         xc_3 var34 = var1.byte_(var10);
         var33 = rrxc_3.class_(var34, var1, var10);
         var65 = rrxc_3.break_(var34, var1, var10);
      }

      float var35;
      int var66;
      if (!var27 && !var25) {
         var35 = var14;
         var66 = var13;
      } else {
         var10.class_(var8, var9.corners[1], var9.corners[3]);
         xc_3 var36 = var1.byte_(var10);
         var35 = rrxc_3.class_(var36, var1, var10);
         var66 = rrxc_3.break_(var36, var1, var10);
      }

      int var67 = rrxc_3.break_(var2, var1, var3);
      var10.class_(var3, var4);
      xc_3 var37 = var1.byte_(var10);
      if (var6.get(0) || !var37.implements_(var1, var10)) {
         var67 = rrxc_3.break_(var37, var1, var10);
      }

      float var38 = var6.get(0) ? rrxc_3.class_(var1.byte_(var8), var1, var8) : rrxc_3.class_(var1.byte_(var3), var1, var3);
      lR_2 var39 = lR_2.class_(var4);
      if (var6.get(1) && var9.doNonCubicWeight) {
         float var68 = (var23 + var14 + var31 + var38) * 0.25F;
         float var70 = (var20 + var14 + var28 + var38) * 0.25F;
         float var72 = (var20 + var17 + var33 + var38) * 0.25F;
         float var73 = (var23 + var17 + var35 + var38) * 0.25F;
         float var44 = var5[var9.vert0Weights[0].shape] * var5[var9.vert0Weights[1].shape];
         float var45 = var5[var9.vert0Weights[2].shape] * var5[var9.vert0Weights[3].shape];
         float var46 = var5[var9.vert0Weights[4].shape] * var5[var9.vert0Weights[5].shape];
         float var47 = var5[var9.vert0Weights[6].shape] * var5[var9.vert0Weights[7].shape];
         float var48 = var5[var9.vert1Weights[0].shape] * var5[var9.vert1Weights[1].shape];
         float var49 = var5[var9.vert1Weights[2].shape] * var5[var9.vert1Weights[3].shape];
         float var50 = var5[var9.vert1Weights[4].shape] * var5[var9.vert1Weights[5].shape];
         float var51 = var5[var9.vert1Weights[6].shape] * var5[var9.vert1Weights[7].shape];
         float var52 = var5[var9.vert2Weights[0].shape] * var5[var9.vert2Weights[1].shape];
         float var53 = var5[var9.vert2Weights[2].shape] * var5[var9.vert2Weights[3].shape];
         float var54 = var5[var9.vert2Weights[4].shape] * var5[var9.vert2Weights[5].shape];
         float var55 = var5[var9.vert2Weights[6].shape] * var5[var9.vert2Weights[7].shape];
         float var56 = var5[var9.vert3Weights[0].shape] * var5[var9.vert3Weights[1].shape];
         float var57 = var5[var9.vert3Weights[2].shape] * var5[var9.vert3Weights[3].shape];
         float var58 = var5[var9.vert3Weights[4].shape] * var5[var9.vert3Weights[5].shape];
         float var59 = var5[var9.vert3Weights[6].shape] * var5[var9.vert3Weights[7].shape];
         this.class_[var39.vert0] = var68 * var44 + var70 * var45 + var72 * var46 + var73 * var47;
         this.class_[var39.vert1] = var68 * var48 + var70 * var49 + var72 * var50 + var73 * var51;
         this.class_[var39.vert2] = var68 * var52 + var70 * var53 + var72 * var54 + var73 * var55;
         this.class_[var39.vert3] = var68 * var56 + var70 * var57 + var72 * var58 + var73 * var59;
         int var60 = this.class_(var22, var13, var64, var67);
         int var61 = this.class_(var19, var13, var29, var67);
         int var62 = this.class_(var19, var16, var65, var67);
         int var63 = this.class_(var22, var16, var66, var67);
         this.break_[var39.vert0] = this.class_(var60, var61, var62, var63, var44, var45, var46, var47);
         this.break_[var39.vert1] = this.class_(var60, var61, var62, var63, var48, var49, var50, var51);
         this.break_[var39.vert2] = this.class_(var60, var61, var62, var63, var52, var53, var54, var55);
         this.break_[var39.vert3] = this.class_(var60, var61, var62, var63, var56, var57, var58, var59);
      } else {
         float var40 = (var23 + var14 + var31 + var38) * 0.25F;
         float var41 = (var20 + var14 + var28 + var38) * 0.25F;
         float var42 = (var20 + var17 + var33 + var38) * 0.25F;
         float var43 = (var23 + var17 + var35 + var38) * 0.25F;
         this.break_[var39.vert0] = this.class_(var22, var13, var64, var67);
         this.break_[var39.vert1] = this.class_(var19, var13, var29, var67);
         this.break_[var39.vert2] = this.class_(var19, var16, var65, var67);
         this.break_[var39.vert3] = this.class_(var22, var16, var66, var67);
         this.class_[var39.vert0] = var40;
         this.class_[var39.vert1] = var41;
         this.class_[var39.vert2] = var42;
         this.class_[var39.vert3] = var43;
      }

      float var69 = var1.class_(var4, var7);

      for (int var71 = 0; var71 < this.class_.length; var71++) {
         this.class_[var71] = this.class_[var71] * var69;
      }
   }

   public void class_() {
      int var1 = HQ.class_;
      this.break_[0] = var1;
      this.break_[1] = var1;
      this.break_[2] = var1;
      this.break_[3] = var1;
      this.class_[0] = 1.0F;
      this.class_[1] = 1.0F;
      this.class_[2] = 1.0F;
      this.class_[3] = 1.0F;
   }
}
