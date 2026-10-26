package celestial;

public class TN<T extends iB_2, M extends wh_3<T>> extends tB_2<T, M> {
   private static final rqO_2 class_ = new rqO_2("textures/entity/bee/bee_stinger.png");

   public TN(qd_3<T, M> var1) {
      super(var1);
   }

   @Override
   protected int class_(T var1) {
      return var1.SM();
   }

   private static void class_(Ok_1 var0, rjV_2 var1, rjj_3 var2, float var3, int var4, float var5, float var6, int var7) {
      var0.class_(var1, var3, (float)var4, 0.0F)
         .break_(255, 255, 255, 255)
         .class_(var5, var6)
         .byte_(fZ_2.class_)
         .break_(var7)
         .class_(var2, 0.0F, 1.0F, 0.0F)
         .class_();
   }

   @Override
   protected void class_(Ml_1 var1, Hx_1 var2, int var3, an_3 var4, float var5, float var6, float var7, float var8) {
      float var9 = rfU_2.byte_(var5 * var5 + var7 * var7);
      float var10 = (float)(Math.atan2((double)var5, (double)var7) * 180.0F / (float)Math.PI);
      float var11 = (float)(Math.atan2((double)var6, (double)var9) * 180.0F / (float)Math.PI);
      var1.class_(0.0, 0.0, 0.0);
      var1.class_(rje_3.protected_.byte_(var10 - 90.0F));
      var1.class_(rje_3.case_.byte_(var11));
      float var12 = 0.0F;
      float var13 = 0.125F;
      float var14 = 0.0F;
      float var15 = 0.0625F;
      float var16 = 0.03125F;
      var1.class_(rje_3.break_.byte_(45.0F));
      var1.class_(0.03125F, 0.03125F, 0.03125F);
      var1.class_(2.5, 0.0, 0.0);
      Ok_1 var17 = var2.getBuffer(HU.protected_(class_));

      for (int var18 = 0; var18 < 4; var18++) {
         var1.class_(rje_3.break_.byte_(90.0F));
         MH var19 = var1.byte_();
         rjV_2 var20 = var19.class_();
         rjj_3 var21 = var19.break_();
         class_(var17, var20, var21, -4.5F, -1, 0.0F, 0.0F, var3);
         class_(var17, var20, var21, 4.5F, -1, 0.125F, 0.0F, var3);
         class_(var17, var20, var21, 4.5F, 1, 0.125F, 0.0625F, var3);
         class_(var17, var20, var21, -4.5F, 1, 0.0F, 0.0625F, var3);
      }
   }
}
