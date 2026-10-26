package celestial;

public class TN<T extends iB_2, M extends wh_3<T>> extends tB_2<T, M> {
   private static final rqO_2 id_class = new rqO_2("textures/entity/bee/bee_stinger.png");

   public TN(qd_3<T, M> var1) {
      super(var1);
   }

   @Override
   protected int id_class(T var1) {
      return var1.SM();
   }

   private static void id_class(Ok_1 var0, rjV_2 var1, rjj_3 var2, float var3, int var4, float var5, float var6, int var7) {
      var0.id_class(var1, var3, (float)var4, 0.0F)
         .id_break(255, 255, 255, 255)
         .id_class(var5, var6)
         .id_byte(fZ_2.id_class)
         .id_break(var7)
         .id_class(var2, 0.0F, 1.0F, 0.0F)
         .id_class();
   }

   @Override
   protected void id_class(Ml_1 var1, Hx_1 var2, int var3, an_3 var4, float var5, float var6, float var7, float var8) {
      float var9 = rfU_2.id_byte(var5 * var5 + var7 * var7);
      float var10 = (float)(Math.atan2((double)var5, (double)var7) * 180.0F / (float)Math.PI);
      float var11 = (float)(Math.atan2((double)var6, (double)var9) * 180.0F / (float)Math.PI);
      var1.id_class(0.0, 0.0, 0.0);
      var1.id_class(rje_3.id_protected.id_byte(var10 - 90.0F));
      var1.id_class(rje_3.id_case.id_byte(var11));
      float var12 = 0.0F;
      float var13 = 0.125F;
      float var14 = 0.0F;
      float var15 = 0.0625F;
      float var16 = 0.03125F;
      var1.id_class(rje_3.id_break.id_byte(45.0F));
      var1.id_class(0.03125F, 0.03125F, 0.03125F);
      var1.id_class(2.5, 0.0, 0.0);
      Ok_1 var17 = var2.getBuffer(HU.id_protected(id_class));

      for (int var18 = 0; var18 < 4; var18++) {
         var1.id_class(rje_3.id_break.id_byte(90.0F));
         MH var19 = var1.id_byte();
         rjV_2 var20 = var19.id_class();
         rjj_3 var21 = var19.id_break();
         id_class(var17, var20, var21, -4.5F, -1, 0.0F, 0.0F, var3);
         id_class(var17, var20, var21, 4.5F, -1, 0.125F, 0.0F, var3);
         id_class(var17, var20, var21, 4.5F, 1, 0.125F, 0.0625F, var3);
         id_class(var17, var20, var21, -4.5F, 1, 0.0F, 0.0625F, var3);
      }
   }
}
