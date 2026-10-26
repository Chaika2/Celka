package celestial;

public class rrJq_1 {
   private Iq_1 class_ = null;
   private int break_ = 0;
   private int byte_ = 0;
   private float protected_ = 0.0F;
   private float throws_ = 0.0F;
   private float case_ = 0.0F;
   private int catch_ = 0;
   private int private_ = 0;
   private int implements_ = 0;
   private float finally_ = 0.0F;
   private float extends_ = 0.0F;
   private float native_ = 0.0F;
   private float volatile_ = 0.0F;
   private float final_ = 0.0F;

   public rrJq_1(Iq_1 var1, int var2, int var3, float var4, float var5, float var6, int var7, int var8, int var9, float var10) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
      this.protected_ = var4;
      this.throws_ = var5;
      this.case_ = var6;
      this.catch_ = var7;
      this.private_ = var8;
      this.implements_ = var9;
      this.finally_ = var10;
      this.extends_ = (float)var2 / var1.class_;
      this.native_ = (float)var3 / var1.break_;
      this.volatile_ = (float)(var2 + var7) / var1.class_;
      this.final_ = (float)(var3 + var8) / var1.break_;
   }

   static void class_(
      Ml_1 var0,
      Ok_1 var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      int var11,
      int var12,
      float var13,
      float var14,
      float var15
   ) {
      MH var16 = var0.byte_();
      rjV_2 var17 = var16.class_();
      rjj_3 var18 = var16.break_();
      float var19 = var18.throws_(var13, var14, var15);
      float var20 = var18.case_(var13, var14, var15);
      float var21 = var18.catch_(var13, var14, var15);
      float var22 = var17.break_(var2, var3, var4, 1.0F);
      float var23 = var17.byte_(var2, var3, var4, 1.0F);
      float var24 = var17.protected_(var2, var3, var4, 1.0F);
      var1.class_(var22, var23, var24, var5, var6, var7, var8, var9, var10, var11, var12, var19, var20, var21);
   }

   public static void class_(
      Ml_1 var0,
      Ok_1 var1,
      float var2,
      float var3,
      float var4,
      float var5,
      int var6,
      int var7,
      float var8,
      float var9,
      float var10,
      int var11,
      int var12,
      float var13,
      float var14,
      float var15,
      float var16
   ) {
      if (var8 < 6.25E-4F) {
         var8 = 6.25E-4F;
      }

      float var17 = var4 - var2;
      float var18 = var5 - var3;
      float var19 = rfU_2.throws_(var17) * (var9 / 16.0F);
      float var20 = rfU_2.throws_(var18) * (var10 / 16.0F);
      float var21 = 0.0F;
      float var22 = 0.0F;
      float var23 = -1.0F;
      class_(var0, var1, 0.0F, var20, 0.0F, var13, var14, var15, var16, var2, var5, var12, var11, var21, var22, var23);
      class_(var0, var1, var19, var20, 0.0F, var13, var14, var15, var16, var4, var5, var12, var11, var21, var22, var23);
      class_(var0, var1, var19, 0.0F, 0.0F, var13, var14, var15, var16, var4, var3, var12, var11, var21, var22, var23);
      class_(var0, var1, 0.0F, 0.0F, 0.0F, var13, var14, var15, var16, var2, var3, var12, var11, var21, var22, var23);
      var21 = 0.0F;
      var22 = 0.0F;
      var23 = 1.0F;
      class_(var0, var1, 0.0F, 0.0F, var8, var13, var14, var15, var16, var2, var3, var12, var11, var21, var22, var23);
      class_(var0, var1, var19, 0.0F, var8, var13, var14, var15, var16, var4, var3, var12, var11, var21, var22, var23);
      class_(var0, var1, var19, var20, var8, var13, var14, var15, var16, var4, var5, var12, var11, var21, var22, var23);
      class_(var0, var1, 0.0F, var20, var8, var13, var14, var15, var16, var2, var5, var12, var11, var21, var22, var23);
      float var24 = 0.5F * var17 / (float)var6;
      float var25 = 0.5F * var18 / (float)var7;
      var21 = -1.0F;
      var22 = 0.0F;
      var23 = 0.0F;

      for (int var26 = 0; var26 < var6; var26++) {
         float var27 = (float)var26 / (float)var6;
         float var28 = var2 + var17 * var27 + var24;
         class_(var0, var1, var27 * var19, var20, var8, var13, var14, var15, var16, var28, var5, var12, var11, var21, var22, var23);
         class_(var0, var1, var27 * var19, var20, 0.0F, var13, var14, var15, var16, var28, var5, var12, var11, var21, var22, var23);
         class_(var0, var1, var27 * var19, 0.0F, 0.0F, var13, var14, var15, var16, var28, var3, var12, var11, var21, var22, var23);
         class_(var0, var1, var27 * var19, 0.0F, var8, var13, var14, var15, var16, var28, var3, var12, var11, var21, var22, var23);
      }

      var21 = 1.0F;
      var22 = 0.0F;
      var23 = 0.0F;

      for (int var45 = 0; var45 < var6; var45++) {
         float var48 = (float)var45 / (float)var6;
         float var51 = var2 + var17 * var48 + var24;
         float var29 = var48 + 1.0F / (float)var6;
         class_(var0, var1, var29 * var19, 0.0F, var8, var13, var14, var15, var16, var51, var3, var12, var11, var21, var22, var23);
         class_(var0, var1, var29 * var19, 0.0F, 0.0F, var13, var14, var15, var16, var51, var3, var12, var11, var21, var22, var23);
         class_(var0, var1, var29 * var19, var20, 0.0F, var13, var14, var15, var16, var51, var5, var12, var11, var21, var22, var23);
         class_(var0, var1, var29 * var19, var20, var8, var13, var14, var15, var16, var51, var5, var12, var11, var21, var22, var23);
      }

      var21 = 0.0F;
      var22 = 1.0F;
      var23 = 0.0F;

      for (int var46 = 0; var46 < var7; var46++) {
         float var49 = (float)var46 / (float)var7;
         float var52 = var3 + var18 * var49 + var25;
         float var54 = var49 + 1.0F / (float)var7;
         class_(var0, var1, 0.0F, var54 * var20, var8, var13, var14, var15, var16, var2, var52, var12, var11, var21, var22, var23);
         class_(var0, var1, var19, var54 * var20, var8, var13, var14, var15, var16, var4, var52, var12, var11, var21, var22, var23);
         class_(var0, var1, var19, var54 * var20, 0.0F, var13, var14, var15, var16, var4, var52, var12, var11, var21, var22, var23);
         class_(var0, var1, 0.0F, var54 * var20, 0.0F, var13, var14, var15, var16, var2, var52, var12, var11, var21, var22, var23);
      }

      var21 = 0.0F;
      var22 = -1.0F;
      var23 = 0.0F;

      for (int var47 = 0; var47 < var7; var47++) {
         float var50 = (float)var47 / (float)var7;
         float var53 = var3 + var18 * var50 + var25;
         class_(var0, var1, var19, var50 * var20, var8, var13, var14, var15, var16, var4, var53, var12, var11, var21, var22, var23);
         class_(var0, var1, 0.0F, var50 * var20, var8, var13, var14, var15, var16, var2, var53, var12, var11, var21, var22, var23);
         class_(var0, var1, 0.0F, var50 * var20, 0.0F, var13, var14, var15, var16, var2, var53, var12, var11, var21, var22, var23);
         class_(var0, var1, var19, var50 * var20, 0.0F, var13, var14, var15, var16, var4, var53, var12, var11, var21, var22, var23);
      }
   }

   public void class_(Ml_1 var1, Ok_1 var2, int var3, int var4, float var5, float var6, float var7, float var8) {
      float var9 = 0.0625F;
      var1.class_((double)(this.protected_ * var9), (double)(this.throws_ * var9), (double)(this.case_ * var9));
      float var10 = this.extends_;
      float var11 = this.volatile_;
      float var12 = this.native_;
      float var13 = this.final_;
      if (this.class_.implements_) {
         var10 = this.volatile_;
         var11 = this.extends_;
      }

      if (this.class_.final_) {
         var12 = this.final_;
         var13 = this.native_;
      }

      class_(
         var1,
         var2,
         var10,
         var12,
         var11,
         var13,
         this.catch_,
         this.private_,
         var9 * (float)this.implements_,
         this.class_.class_,
         this.class_.break_,
         var3,
         var4,
         var5,
         var6,
         var7,
         var8
      );
      var1.class_((double)(-this.protected_ * var9), (double)(-this.throws_ * var9), (double)(-this.case_ * var9));
   }
}
