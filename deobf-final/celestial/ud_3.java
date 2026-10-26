package celestial;

public class ud_3 {
   private final HU break_;
   private final HU byte_;
   private final float protected_;
   private final float throws_;
   private final float case_;
   private final float catch_;
   private final float private_;
   private final float implements_;
   private final float finally_;
   private final float extends_;
   public static final rjV_2 class_ = rrWD.class_();

   public ud_3(HU var1, HU var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      this.break_ = var1;
      this.byte_ = var2;
      this.protected_ = var3;
      this.throws_ = var4;
      this.case_ = var5;
      this.catch_ = var6;
      this.private_ = var7;
      this.implements_ = var8;
      this.finally_ = var9;
      this.extends_ = var10;
   }

   public void class_(boolean var1, float var2, float var3, rjV_2 var4, Ok_1 var5, float var6, float var7, float var8, float var9, int var10) {
      float var11 = var2 + this.private_;
      float var12 = var2 + this.implements_;
      float var13 = this.finally_ - 3.0F;
      float var14 = this.extends_ - 3.0F;
      float var15 = var3 + var13;
      float var16 = var3 + var14;
      float var17 = var1 ? 1.0F - 0.25F * var13 : 0.0F;
      float var18 = var1 ? 1.0F - 0.25F * var14 : 0.0F;
      if (var5 instanceof lD_2 var19 && var4 == class_) {
         int var20 = (int)(var6 * 255.0F);
         int var21 = (int)(var7 * 255.0F);
         int var22 = (int)(var8 * 255.0F);
         int var23 = (int)(var9 * 255.0F);
         int var24 = var10 & 65535;
         int var25 = var10 >> 16 & 65535;
         var19.class_(var11 + var17, var15, 0.0F, var20, var21, var22, var23, this.protected_, this.case_, var24, var25);
         var19.class_(var11 + var18, var16, 0.0F, var20, var21, var22, var23, this.protected_, this.catch_, var24, var25);
         var19.class_(var12 + var18, var16, 0.0F, var20, var21, var22, var23, this.throws_, this.catch_, var24, var25);
         var19.class_(var12 + var17, var15, 0.0F, var20, var21, var22, var23, this.throws_, this.case_, var24, var25);
         return;
      }

      var5.class_(var4, var11 + var17, var15, 0.0F).class_(var6, var7, var8, var9).class_(this.protected_, this.case_).break_(var10).class_();
      var5.class_(var4, var11 + var18, var16, 0.0F).class_(var6, var7, var8, var9).class_(this.protected_, this.catch_).break_(var10).class_();
      var5.class_(var4, var12 + var18, var16, 0.0F).class_(var6, var7, var8, var9).class_(this.throws_, this.catch_).break_(var10).class_();
      var5.class_(var4, var12 + var17, var15, 0.0F).class_(var6, var7, var8, var9).class_(this.throws_, this.case_).break_(var10).class_();
   }

   public HU class_(boolean var1) {
      return var1 ? this.byte_ : this.break_;
   }

   public void class_(uk_3 var1, rjV_2 var2, Ok_1 var3, int var4) {
      var3.class_(var2, var1.class_, var1.break_, var1.throws_)
         .class_(var1.case_, var1.catch_, var1.private_, var1.implements_)
         .class_(this.protected_, this.case_)
         .break_(var4)
         .class_();
      var3.class_(var2, var1.byte_, var1.break_, var1.throws_)
         .class_(var1.case_, var1.catch_, var1.private_, var1.implements_)
         .class_(this.protected_, this.catch_)
         .break_(var4)
         .class_();
      var3.class_(var2, var1.byte_, var1.protected_, var1.throws_)
         .class_(var1.case_, var1.catch_, var1.private_, var1.implements_)
         .class_(this.throws_, this.catch_)
         .break_(var4)
         .class_();
      var3.class_(var2, var1.class_, var1.protected_, var1.throws_)
         .class_(var1.case_, var1.catch_, var1.private_, var1.implements_)
         .class_(this.throws_, this.case_)
         .break_(var4)
         .class_();
   }
}
