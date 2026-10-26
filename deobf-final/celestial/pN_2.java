package celestial;

public abstract class pN_2<T extends rhm_3> extends pV_2<T> {
   public pN_2(pg_3 var1) {
      super(var1);
   }

   public void class_(rjV_2 var1, rjj_3 var2, Ok_1 var3, int var4, int var5, int var6, float var7, float var8, int var9, int var10, int var11, int var12) {
      var3.class_(var1, (float)var4, (float)var5, (float)var6)
         .break_(255, 255, 255, 255)
         .class_(var7, var8)
         .byte_(fZ_2.class_)
         .break_(var12)
         .class_(var2, (float)var9, (float)var11, (float)var10)
         .class_();
   }

   public void class_(T var1, float var2, float var3, Ml_1 var4, Hx_1 var5, int var6) {
      var4.class_();
      var4.class_(rje_3.protected_.byte_(rfU_2.catch_(var3, (Float)var1.throws_[17], (Float)var1.throws_[15]) - 90.0F));
      var4.class_(rje_3.case_.byte_(rfU_2.catch_(var3, (Float)var1.throws_[18], (Float)var1.throws_[16])));
      boolean var7 = false;
      float var8 = 0.0F;
      float var9 = 0.5F;
      float var10 = 0.0F;
      float var11 = 0.15625F;
      float var12 = 0.0F;
      float var13 = 0.15625F;
      float var14 = 0.15625F;
      float var15 = 0.3125F;
      float var16 = 0.05625F;
      float var17 = (float)var1.catch_ - var3;
      if (var17 > 0.0F) {
         float var18 = -rfU_2.class_(var17 * 3.0F) * var17;
         var4.class_(rje_3.case_.byte_(var18));
      }

      var4.class_(rje_3.break_.byte_(45.0F));
      var4.class_(0.05625F, 0.05625F, 0.05625F);
      var4.class_(-4.0, 0.0, 0.0);
      Ok_1 var23 = var5.getBuffer(HU.byte_(this.class_((T)var1)));
      MH var19 = var4.byte_();
      rjV_2 var20 = var19.class_();
      rjj_3 var21 = var19.break_();
      this.class_(var20, var21, var23, -7, -2, -2, 0.0F, 0.15625F, -1, 0, 0, var6);
      this.class_(var20, var21, var23, -7, -2, 2, 0.15625F, 0.15625F, -1, 0, 0, var6);
      this.class_(var20, var21, var23, -7, 2, 2, 0.15625F, 0.3125F, -1, 0, 0, var6);
      this.class_(var20, var21, var23, -7, 2, -2, 0.0F, 0.3125F, -1, 0, 0, var6);
      this.class_(var20, var21, var23, -7, 2, -2, 0.0F, 0.15625F, 1, 0, 0, var6);
      this.class_(var20, var21, var23, -7, 2, 2, 0.15625F, 0.15625F, 1, 0, 0, var6);
      this.class_(var20, var21, var23, -7, -2, 2, 0.15625F, 0.3125F, 1, 0, 0, var6);
      this.class_(var20, var21, var23, -7, -2, -2, 0.0F, 0.3125F, 1, 0, 0, var6);

      for (int var22 = 0; var22 < 4; var22++) {
         var4.class_(rje_3.break_.byte_(90.0F));
         this.class_(var20, var21, var23, -8, -2, 0, 0.0F, 0.0F, 0, 1, 0, var6);
         this.class_(var20, var21, var23, 8, -2, 0, 0.5F, 0.0F, 0, 1, 0, var6);
         this.class_(var20, var21, var23, 8, 2, 0, 0.5F, 0.15625F, 0, 1, 0, var6);
         this.class_(var20, var21, var23, -8, 2, 0, 0.0F, 0.15625F, 0, 1, 0, var6);
      }

      var4.break_();
      super.class_((T)var1, var2, var3, var4, var5, var6);
   }
}
