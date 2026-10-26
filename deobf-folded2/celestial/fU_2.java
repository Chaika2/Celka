package celestial;

import java.util.List;

public class fU_2 extends jW_2<rHO> {
   public static final rqO_2 id_class = new rqO_2("textures/entity/beacon_beam.png");

   public fU_2(jz_3 var1) {
      super(var1);
   }

   private static void id_class(
      rjV_2 var0, rjj_3 var1, Ok_1 var2, float var3, float var4, float var5, float var6, int var7, float var8, float var9, float var10, float var11
   ) {
      var2.id_class(var0, var8, (float)var7, var9)
         .id_class(var3, var4, var5, var6)
         .id_class(var10, var11)
         .id_byte(fZ_2.id_class)
         .id_break(15728880)
         .id_class(var1, 0.0F, 1.0F, 0.0F)
         .id_class();
   }

   public boolean id_class(rHO var1) {
      return true;
   }

   private static void id_class(
      rjV_2 var0,
      rjj_3 var1,
      Ok_1 var2,
      float var3,
      float var4,
      float var5,
      float var6,
      int var7,
      int var8,
      float var9,
      float var10,
      float var11,
      float var12,
      float var13,
      float var14,
      float var15,
      float var16
   ) {
      id_class(var0, var1, var2, var3, var4, var5, var6, var8, var9, var10, var14, var15);
      id_class(var0, var1, var2, var3, var4, var5, var6, var7, var9, var10, var14, var16);
      id_class(var0, var1, var2, var3, var4, var5, var6, var7, var11, var12, var13, var16);
      id_class(var0, var1, var2, var3, var4, var5, var6, var8, var11, var12, var13, var15);
   }

   private static void id_class(Ml_1 var0, Hx_1 var1, float var2, long var3, int var5, int var6, float[] var7) {
      id_class(var0, var1, id_class, var2, 1.0F, var3, var5, var6, var7, 0.2F, 0.25F);
   }

   public static void id_class(Ml_1 var0, Hx_1 var1, rqO_2 var2, float var3, float var4, long var5, int var7, int var8, float[] var9, float var10, float var11) {
      int var12 = var7 + var8;
      var0.id_class();
      var0.id_class(0.5, 0.0, 0.5);
      float var13 = (float)Math.floorMod(var5, 40L) + var3;
      float var14 = var8 < 0 ? var13 : -var13;
      float var15 = rfU_2.id_private(var14 * 0.2F - (float)rfU_2.id_protected(var14 * 0.1F));
      float var16 = var9[0];
      float var17 = var9[1];
      float var18 = var9[2];
      var0.id_class();
      var0.id_class(rje_3.id_protected.id_byte(var13 * 2.25F - 45.0F));
      float var19 = 0.0F;
      float var20 = 0.0F;
      float var21 = -var10;
      float var22 = 0.0F;
      float var23 = 0.0F;
      float var24 = -var10;
      float var25 = 0.0F;
      float var26 = 1.0F;
      float var27 = -1.0F + var15;
      float var28 = (float)var8 * var4 * (0.5F / var10) + var27;
      id_class(
         var0,
         var1.getBuffer(HU.id_protected(var2, false)),
         var16,
         var17,
         var18,
         1.0F,
         var7,
         var12,
         0.0F,
         var10,
         var10,
         0.0F,
         var21,
         0.0F,
         0.0F,
         var24,
         0.0F,
         1.0F,
         var28,
         var27
      );
      var0.id_break();
      var19 = -var11;
      float var29 = -var11;
      var20 = -var11;
      var21 = -var11;
      var25 = 0.0F;
      var26 = 1.0F;
      var27 = -1.0F + var15;
      var28 = (float)var8 * var4 + var27;
      id_class(
         var0,
         var1.getBuffer(HU.id_protected(var2, true)),
         var16,
         var17,
         var18,
         0.125F,
         var7,
         var12,
         var19,
         var29,
         var11,
         var20,
         var21,
         var11,
         var11,
         var11,
         0.0F,
         1.0F,
         var28,
         var27
      );
      var0.id_break();
   }

   private static void id_class(
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
      float var11,
      float var12,
      float var13,
      float var14,
      float var15,
      float var16,
      float var17,
      float var18,
      float var19
   ) {
      MH var20 = var0.id_byte();
      rjV_2 var21 = var20.id_class();
      rjj_3 var22 = var20.id_break();
      id_class(var21, var22, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var16, var17, var18, var19);
      id_class(var21, var22, var1, var2, var3, var4, var5, var6, var7, var14, var15, var12, var13, var16, var17, var18, var19);
      id_class(var21, var22, var1, var2, var3, var4, var5, var6, var7, var10, var11, var14, var15, var16, var17, var18, var19);
      id_class(var21, var22, var1, var2, var3, var4, var5, var6, var7, var12, var13, var8, var9, var16, var17, var18, var19);
   }

   public void id_class(rHO var1, float var2, Ml_1 var3, Hx_1 var4, int var5, int var6) {
      long var7 = var1.id_while().r();
      List var9 = var1.id_catch();
      int var10 = 0;

      for (int var11 = 0; var11 < var9.size(); var11++) {
         rHX var12 = (rHX)var9.get(var11);
         id_class(var3, var4, var2, var7, var10, var11 == var9.size() - 1 ? 1024 : var12.id_byte(), var12.id_break());
         var10 += var12.id_byte();
      }
   }
}
