package celestial;

public class IT {
   final Iw_1[] catch_;
   public final float class_;
   public final float break_;
   public final float byte_;
   public final float protected_;
   public final float throws_;
   public final float case_;
   private rrxX_2 private_;

   public IT(
      int var1,
      int var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      float var11,
      boolean var12,
      float var13,
      float var14
   ) {
      this.class_ = var3;
      this.break_ = var4;
      this.byte_ = var5;
      this.protected_ = var3 + var6;
      this.throws_ = var4 + var7;
      this.case_ = var5 + var8;
      this.catch_ = new Iw_1[6];
      float var15 = var3 + var6;
      float var16 = var4 + var7;
      float var17 = var5 + var8;
      var3 -= var9;
      var4 -= var10;
      var5 -= var11;
      var15 += var9;
      var16 += var10;
      var17 += var11;
      if (var12) {
         float var18 = var15;
         var15 = var3;
         var3 = var18;
      }

      It_1 var41 = new It_1(var3, var4, var5, 0.0F, 0.0F);
      It_1 var19 = new It_1(var15, var4, var5, 0.0F, 8.0F);
      It_1 var20 = new It_1(var15, var16, var5, 8.0F, 8.0F);
      It_1 var21 = new It_1(var3, var16, var5, 8.0F, 0.0F);
      It_1 var22 = new It_1(var3, var4, var17, 0.0F, 0.0F);
      It_1 var23 = new It_1(var15, var4, var17, 0.0F, 8.0F);
      It_1 var24 = new It_1(var15, var16, var17, 8.0F, 8.0F);
      It_1 var25 = new It_1(var3, var16, var17, 8.0F, 0.0F);
      float var26 = (float)var1;
      float var27 = (float)var1 + var8;
      float var28 = (float)var1 + var8 + var6;
      float var29 = (float)var1 + var8 + var6 + var6;
      float var30 = (float)var1 + var8 + var6 + var8;
      float var31 = (float)var1 + var8 + var6 + var8 + var6;
      float var32 = (float)var2;
      float var33 = (float)var2 + var8;
      float var34 = (float)var2 + var8 + var7;
      this.catch_[2] = new Iw_1(new It_1[]{var23, var22, var41, var19}, var27, var32, var28, var33, var13, var14, var12, rpr_3.DOWN);
      this.catch_[3] = new Iw_1(new It_1[]{var20, var21, var25, var24}, var28, var33, var29, var32, var13, var14, var12, rpr_3.UP);
      this.catch_[1] = new Iw_1(new It_1[]{var41, var22, var25, var21}, var26, var33, var27, var34, var13, var14, var12, rpr_3.WEST);
      this.catch_[4] = new Iw_1(new It_1[]{var19, var41, var21, var20}, var27, var33, var28, var34, var13, var14, var12, rpr_3.NORTH);
      this.catch_[0] = new Iw_1(new It_1[]{var23, var19, var20, var24}, var28, var33, var30, var34, var13, var14, var12, rpr_3.EAST);
      this.catch_[5] = new Iw_1(new It_1[]{var22, var23, var24, var25}, var30, var33, var31, var34, var13, var14, var12, rpr_3.SOUTH);
   }

   public IT(
      int[][] var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      boolean var11,
      float var12,
      float var13
   ) {
      this.class_ = var2;
      this.break_ = var3;
      this.byte_ = var4;
      this.protected_ = var2 + var5;
      this.throws_ = var3 + var6;
      this.case_ = var4 + var7;
      this.catch_ = new Iw_1[6];
      float var14 = var2 + var5;
      float var15 = var3 + var6;
      float var16 = var4 + var7;
      var2 -= var8;
      var3 -= var9;
      var4 -= var10;
      var14 += var8;
      var15 += var9;
      var16 += var10;
      if (var11) {
         float var17 = var14;
         var14 = var2;
         var2 = var17;
      }

      It_1 var31 = new It_1(var2, var3, var4, 0.0F, 0.0F);
      It_1 var18 = new It_1(var14, var3, var4, 0.0F, 8.0F);
      It_1 var19 = new It_1(var14, var15, var4, 8.0F, 8.0F);
      It_1 var20 = new It_1(var2, var15, var4, 8.0F, 0.0F);
      It_1 var21 = new It_1(var2, var3, var16, 0.0F, 0.0F);
      It_1 var22 = new It_1(var14, var3, var16, 0.0F, 8.0F);
      It_1 var23 = new It_1(var14, var15, var16, 8.0F, 8.0F);
      It_1 var24 = new It_1(var2, var15, var16, 8.0F, 0.0F);
      this.catch_[2] = this.class_(new It_1[]{var22, var21, var31, var18}, var1[1], true, var12, var13, var11, rpr_3.DOWN);
      this.catch_[3] = this.class_(new It_1[]{var19, var20, var24, var23}, var1[0], true, var12, var13, var11, rpr_3.UP);
      this.catch_[1] = this.class_(new It_1[]{var31, var21, var24, var20}, var1[5], false, var12, var13, var11, rpr_3.WEST);
      this.catch_[4] = this.class_(new It_1[]{var18, var31, var20, var19}, var1[2], false, var12, var13, var11, rpr_3.NORTH);
      this.catch_[0] = this.class_(new It_1[]{var22, var18, var19, var23}, var1[4], false, var12, var13, var11, rpr_3.EAST);
      this.catch_[5] = this.class_(new It_1[]{var21, var22, var23, var24}, var1[3], false, var12, var13, var11, rpr_3.SOUTH);
   }

   public rrxq_3[][] class_(int var1) {
      if (this.private_ == null) {
         this.private_ = new rrxX_2();
      }

      return this.private_.class_(var1);
   }

   private Iw_1 class_(It_1[] var1, int[] var2, boolean var3, float var4, float var5, boolean var6, rpr_3 var7) {
      if (var2 == null) {
         return null;
      } else {
         return var3
            ? new Iw_1(var1, (float)var2[2], (float)var2[3], (float)var2[0], (float)var2[1], var4, var5, var6, var7)
            : new Iw_1(var1, (float)var2[0], (float)var2[1], (float)var2[2], (float)var2[3], var4, var5, var6, var7);
      }
   }
}
