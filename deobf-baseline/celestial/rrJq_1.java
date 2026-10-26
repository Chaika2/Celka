package celestial;

public class rrJq_1 {
   private Iq_1 id_class = null;
   private int id_break = 0;
   private int id_byte = 0;
   private float id_protected = 0.0F;
   private float id_throws = 0.0F;
   private float id_case = 0.0F;
   private int id_catch = 0;
   private int id_private = 0;
   private int id_implements = 0;
   private float id_finally = 0.0F;
   private float id_extends = 0.0F;
   private float id_native = 0.0F;
   private float id_volatile = 0.0F;
   private float id_final = 0.0F;

   public rrJq_1(Iq_1 var1, int var2, int var3, float var4, float var5, float var6, int var7, int var8, int var9, float var10) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
      this.id_protected = var4;
      this.id_throws = var5;
      this.id_case = var6;
      this.id_catch = var7;
      this.id_private = var8;
      this.id_implements = var9;
      this.id_finally = var10;
      this.id_extends = (float)var2 / var1.id_class;
      this.id_native = (float)var3 / var1.id_break;
      this.id_volatile = (float)(var2 + var7) / var1.id_class;
      this.id_final = (float)(var3 + var8) / var1.id_break;
   }

   static void id_class(
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
      MH var16 = var0.id_byte();
      rjV_2 var17 = var16.id_class();
      rjj_3 var18 = var16.id_break();
      float var19 = var18.id_throws(var13, var14, var15);
      float var20 = var18.id_case(var13, var14, var15);
      float var21 = var18.id_catch(var13, var14, var15);
      float var22 = var17.id_break(var2, var3, var4, 1.0F);
      float var23 = var17.id_byte(var2, var3, var4, 1.0F);
      float var24 = var17.id_protected(var2, var3, var4, 1.0F);
      var1.id_class(var22, var23, var24, var5, var6, var7, var8, var9, var10, var11, var12, var19, var20, var21);
   }

   public static void id_class(
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
      float var19 = rfU_2.id_throws(var17) * (var9 / 16.0F);
      float var20 = rfU_2.id_throws(var18) * (var10 / 16.0F);
      float var21 = 0.0F;
      float var22 = 0.0F;
      float var23 = -1.0F;
      id_class(var0, var1, 0.0F, var20, 0.0F, var13, var14, var15, var16, var2, var5, var12, var11, var21, var22, var23);
      id_class(var0, var1, var19, var20, 0.0F, var13, var14, var15, var16, var4, var5, var12, var11, var21, var22, var23);
      id_class(var0, var1, var19, 0.0F, 0.0F, var13, var14, var15, var16, var4, var3, var12, var11, var21, var22, var23);
      id_class(var0, var1, 0.0F, 0.0F, 0.0F, var13, var14, var15, var16, var2, var3, var12, var11, var21, var22, var23);
      var21 = 0.0F;
      var22 = 0.0F;
      var23 = 1.0F;
      id_class(var0, var1, 0.0F, 0.0F, var8, var13, var14, var15, var16, var2, var3, var12, var11, var21, var22, var23);
      id_class(var0, var1, var19, 0.0F, var8, var13, var14, var15, var16, var4, var3, var12, var11, var21, var22, var23);
      id_class(var0, var1, var19, var20, var8, var13, var14, var15, var16, var4, var5, var12, var11, var21, var22, var23);
      id_class(var0, var1, 0.0F, var20, var8, var13, var14, var15, var16, var2, var5, var12, var11, var21, var22, var23);
      float var24 = 0.5F * var17 / (float)var6;
      float var25 = 0.5F * var18 / (float)var7;
      var21 = -1.0F;
      var22 = 0.0F;
      var23 = 0.0F;

      for (int var26 = 0; var26 < var6; var26++) {
         float var27 = (float)var26 / (float)var6;
         float var28 = var2 + var17 * var27 + var24;
         id_class(var0, var1, var27 * var19, var20, var8, var13, var14, var15, var16, var28, var5, var12, var11, var21, var22, var23);
         id_class(var0, var1, var27 * var19, var20, 0.0F, var13, var14, var15, var16, var28, var5, var12, var11, var21, var22, var23);
         id_class(var0, var1, var27 * var19, 0.0F, 0.0F, var13, var14, var15, var16, var28, var3, var12, var11, var21, var22, var23);
         id_class(var0, var1, var27 * var19, 0.0F, var8, var13, var14, var15, var16, var28, var3, var12, var11, var21, var22, var23);
      }

      var21 = 1.0F;
      var22 = 0.0F;
      var23 = 0.0F;

      for (int var45 = 0; var45 < var6; var45++) {
         float var48 = (float)var45 / (float)var6;
         float var51 = var2 + var17 * var48 + var24;
         float var29 = var48 + 1.0F / (float)var6;
         id_class(var0, var1, var29 * var19, 0.0F, var8, var13, var14, var15, var16, var51, var3, var12, var11, var21, var22, var23);
         id_class(var0, var1, var29 * var19, 0.0F, 0.0F, var13, var14, var15, var16, var51, var3, var12, var11, var21, var22, var23);
         id_class(var0, var1, var29 * var19, var20, 0.0F, var13, var14, var15, var16, var51, var5, var12, var11, var21, var22, var23);
         id_class(var0, var1, var29 * var19, var20, var8, var13, var14, var15, var16, var51, var5, var12, var11, var21, var22, var23);
      }

      var21 = 0.0F;
      var22 = 1.0F;
      var23 = 0.0F;

      for (int var46 = 0; var46 < var7; var46++) {
         float var49 = (float)var46 / (float)var7;
         float var52 = var3 + var18 * var49 + var25;
         float var54 = var49 + 1.0F / (float)var7;
         id_class(var0, var1, 0.0F, var54 * var20, var8, var13, var14, var15, var16, var2, var52, var12, var11, var21, var22, var23);
         id_class(var0, var1, var19, var54 * var20, var8, var13, var14, var15, var16, var4, var52, var12, var11, var21, var22, var23);
         id_class(var0, var1, var19, var54 * var20, 0.0F, var13, var14, var15, var16, var4, var52, var12, var11, var21, var22, var23);
         id_class(var0, var1, 0.0F, var54 * var20, 0.0F, var13, var14, var15, var16, var2, var52, var12, var11, var21, var22, var23);
      }

      var21 = 0.0F;
      var22 = -1.0F;
      var23 = 0.0F;

      for (int var47 = 0; var47 < var7; var47++) {
         float var50 = (float)var47 / (float)var7;
         float var53 = var3 + var18 * var50 + var25;
         id_class(var0, var1, var19, var50 * var20, var8, var13, var14, var15, var16, var4, var53, var12, var11, var21, var22, var23);
         id_class(var0, var1, 0.0F, var50 * var20, var8, var13, var14, var15, var16, var2, var53, var12, var11, var21, var22, var23);
         id_class(var0, var1, 0.0F, var50 * var20, 0.0F, var13, var14, var15, var16, var2, var53, var12, var11, var21, var22, var23);
         id_class(var0, var1, var19, var50 * var20, 0.0F, var13, var14, var15, var16, var4, var53, var12, var11, var21, var22, var23);
      }
   }

   public void id_class(Ml_1 var1, Ok_1 var2, int var3, int var4, float var5, float var6, float var7, float var8) {
      float var9 = 0.0625F;
      var1.id_class((double)(this.id_protected * var9), (double)(this.id_throws * var9), (double)(this.id_case * var9));
      float var10 = this.id_extends;
      float var11 = this.id_volatile;
      float var12 = this.id_native;
      float var13 = this.id_final;
      if (this.id_class.id_implements) {
         var10 = this.id_volatile;
         var11 = this.id_extends;
      }

      if (this.id_class.id_final) {
         var12 = this.id_final;
         var13 = this.id_native;
      }

      id_class(
         var1,
         var2,
         var10,
         var12,
         var11,
         var13,
         this.id_catch,
         this.id_private,
         var9 * (float)this.id_implements,
         this.id_class.id_class,
         this.id_class.id_break,
         var3,
         var4,
         var5,
         var6,
         var7,
         var8
      );
      var1.id_class((double)(-this.id_protected * var9), (double)(-this.id_throws * var9), (double)(-this.id_case * var9));
   }
}
