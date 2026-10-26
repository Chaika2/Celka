package celestial;

public class pK_2 extends pV_2<rsP_2> {
   private static final rqO_2 class_ = new rqO_2("textures/entity/experience_orb.png");
   private static final HU throws_ = HU.case_(class_);

   public pK_2(pg_3 var1) {
      super(var1);
      this.byte_ = 0.15F;
      this.protected_ = 0.75F;
   }

   public rqO_2 class_(rsP_2 var1) {
      return class_;
   }

   protected int class_(rsP_2 var1, rfH_2 var2) {
      return rfU_2.class_(super.class_(var1, var2) + 7, 0, 15);
   }

   private static void class_(Ok_1 var0, rjV_2 var1, rjj_3 var2, float var3, float var4, int var5, int var6, int var7, float var8, float var9, int var10) {
      var0.class_(var1, var3, var4, 0.0F)
         .break_(var5, var6, var7, 128)
         .class_(var8, var9)
         .byte_(fZ_2.class_)
         .break_(var10)
         .class_(var2, 0.0F, 1.0F, 0.0F)
         .class_();
   }

   public void class_(rsP_2 var1, float var2, float var3, Ml_1 var4, Hx_1 var5, int var6) {
      var4.class_();
      int var7 = var1.throws_();
      float var8 = (float)(var7 % 4 * 16 + 0) / 64.0F;
      float var9 = (float)(var7 % 4 * 16 + 16) / 64.0F;
      float var10 = (float)(var7 / 4 * 16 + 0) / 64.0F;
      float var11 = (float)(var7 / 4 * 16 + 16) / 64.0F;
      float var12 = 1.0F;
      float var13 = 0.5F;
      float var14 = 0.25F;
      float var15 = 255.0F;
      float var16 = ((float)var1.class_ + var3) / 2.0F;
      if (rrbb_3.K()) {
         var16 = rrbN_2.class_(var16);
      }

      int var17 = (int)((rfU_2.class_(var16 + 0.0F) + 1.0F) * 0.5F * 255.0F);
      short var18 = 255;
      int var19 = (int)((rfU_2.class_(var16 + (float) (Math.PI * 4.0 / 3.0)) + 1.0F) * 0.1F * 255.0F);
      var4.class_(0.0, 0.1F, 0.0);
      var4.class_(this.break_.byte_());
      var4.class_(rje_3.protected_.byte_(180.0F));
      float var20 = 0.3F;
      var4.class_(0.3F, 0.3F, 0.3F);
      Ok_1 var21 = var5.getBuffer(throws_);
      MH var22 = var4.byte_();
      rjV_2 var23 = var22.class_();
      rjj_3 var24 = var22.break_();
      int var25 = var17;
      int var26 = 255;
      int var27 = var19;
      if (rrbb_3.K()) {
         int var28 = rrbN_2.break_(var16);
         if (var28 >= 0) {
            var25 = var28 >> 16 & 0xFF;
            var26 = var28 >> 8 & 0xFF;
            var27 = var28 >> 0 & 0xFF;
         }
      }

      class_(var21, var23, var24, -0.5F, -0.25F, var25, var26, var27, var8, var11, var6);
      class_(var21, var23, var24, 0.5F, -0.25F, var25, var26, var27, var9, var11, var6);
      class_(var21, var23, var24, 0.5F, 0.75F, var25, var26, var27, var9, var10, var6);
      class_(var21, var23, var24, -0.5F, 0.75F, var25, var26, var27, var8, var10, var6);
      var4.break_();
      super.class_(var1, var2, var3, var4, var5, var6);
   }
}
