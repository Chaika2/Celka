package celestial;

public abstract class pN_2<T extends rhm_3> extends pV_2<T> {
   public pN_2(pg_3 var1) {
      super(var1);
   }

   public void id_class(rjV_2 var1, rjj_3 var2, Ok_1 var3, int var4, int var5, int var6, float var7, float var8, int var9, int var10, int var11, int var12) {
      var3.id_class(var1, (float)var4, (float)var5, (float)var6)
         .id_break(255, 255, 255, 255)
         .id_class(var7, var8)
         .id_byte(fZ_2.id_class)
         .id_break(var12)
         .id_class(var2, (float)var9, (float)var11, (float)var10)
         .id_class();
   }

   public void id_class(T var1, float var2, float var3, Ml_1 var4, Hx_1 var5, int var6) {
      var4.id_class();
      var4.id_class(rje_3.id_protected.id_byte(rfU_2.id_catch(var3, (Float)var1.id_throws[17], (Float)var1.id_throws[15]) - 90.0F));
      var4.id_class(rje_3.id_case.id_byte(rfU_2.id_catch(var3, (Float)var1.id_throws[18], (Float)var1.id_throws[16])));
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
      float var17 = (float)var1.id_catch - var3;
      if (var17 > 0.0F) {
         float var18 = -rfU_2.id_class(var17 * 3.0F) * var17;
         var4.id_class(rje_3.id_case.id_byte(var18));
      }

      var4.id_class(rje_3.id_break.id_byte(45.0F));
      var4.id_class(0.05625F, 0.05625F, 0.05625F);
      var4.id_class(-4.0, 0.0, 0.0);
      Ok_1 var23 = var5.getBuffer(HU.id_byte(this.id_class((T)var1)));
      MH var19 = var4.id_byte();
      rjV_2 var20 = var19.id_class();
      rjj_3 var21 = var19.id_break();
      this.id_class(var20, var21, var23, -7, -2, -2, 0.0F, 0.15625F, -1, 0, 0, var6);
      this.id_class(var20, var21, var23, -7, -2, 2, 0.15625F, 0.15625F, -1, 0, 0, var6);
      this.id_class(var20, var21, var23, -7, 2, 2, 0.15625F, 0.3125F, -1, 0, 0, var6);
      this.id_class(var20, var21, var23, -7, 2, -2, 0.0F, 0.3125F, -1, 0, 0, var6);
      this.id_class(var20, var21, var23, -7, 2, -2, 0.0F, 0.15625F, 1, 0, 0, var6);
      this.id_class(var20, var21, var23, -7, 2, 2, 0.15625F, 0.15625F, 1, 0, 0, var6);
      this.id_class(var20, var21, var23, -7, -2, 2, 0.15625F, 0.3125F, 1, 0, 0, var6);
      this.id_class(var20, var21, var23, -7, -2, -2, 0.0F, 0.3125F, 1, 0, 0, var6);

      for (int var22 = 0; var22 < 4; var22++) {
         var4.id_class(rje_3.id_break.id_byte(90.0F));
         this.id_class(var20, var21, var23, -8, -2, 0, 0.0F, 0.0F, 0, 1, 0, var6);
         this.id_class(var20, var21, var23, 8, -2, 0, 0.5F, 0.0F, 0, 1, 0, var6);
         this.id_class(var20, var21, var23, 8, 2, 0, 0.5F, 0.15625F, 0, 1, 0, var6);
         this.id_class(var20, var21, var23, -8, 2, 0, 0.0F, 0.15625F, 0, 1, 0, var6);
      }

      var4.id_break();
      super.id_class((T)var1, var2, var3, var4, var5, var6);
   }
}
