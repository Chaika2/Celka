package celestial;

public class pt_3 extends pV_2<rSa_1> {
   private static final rqO_2 class_ = new rqO_2("textures/entity/end_crystal/end_crystal.png");
   private static final HU throws_ = HU.protected_(class_);
   private static final float case_ = (float)Math.sin(Math.PI / 4);
   private final Iq_1 catch_;
   private final Iq_1 private_;
   private final Iq_1 implements_;

   public pt_3(pg_3 var1) {
      super(var1);
      this.byte_ = 0.5F;
      this.private_ = new Iq_1(64, 32, 0, 0);
      this.private_.class_(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F);
      this.catch_ = new Iq_1(64, 32, 32, 0);
      this.catch_.class_(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F);
      this.implements_ = new Iq_1(64, 32, 0, 16);
      this.implements_.class_(-6.0F, 0.0F, -6.0F, 12.0F, 4.0F, 12.0F);
   }

   public boolean class_(rSa_1 var1, yt_3 var2, double var3, double var5, double var7) {
      return super.class_(var1, var2, var3, var5, var7) || var1.protected_() != null;
   }

   public void class_(rSa_1 var1, float var2, float var3, Ml_1 var4, Hx_1 var5, int var6) {
      var4.class_();
      float var7 = class_(var1, var3);
      float var8 = ((float)var1.class_ + var3) * 3.0F;
      Ok_1 var9 = var5.getBuffer(throws_);
      var4.class_();
      var4.class_(2.0F, 2.0F, 2.0F);
      var4.class_(0.0, -0.5, 0.0);
      int var10 = fZ_2.class_;
      if (var1.throws_()) {
         this.implements_.class_(var4, var9, var6, var10);
      }

      var4.class_(rje_3.protected_.byte_(var8));
      var4.class_(0.0, (double)(1.5F + var7 / 2.0F), 0.0);
      var4.class_(new rjY_2(new rje_3(case_, 0.0F, case_), 60.0F, true));
      this.private_.class_(var4, var9, var6, var10);
      float var11 = 0.875F;
      var4.class_(0.875F, 0.875F, 0.875F);
      var4.class_(new rjY_2(new rje_3(case_, 0.0F, case_), 60.0F, true));
      var4.class_(rje_3.protected_.byte_(var8));
      this.private_.class_(var4, var9, var6, var10);
      var4.class_(0.875F, 0.875F, 0.875F);
      var4.class_(new rjY_2(new rje_3(case_, 0.0F, case_), 60.0F, true));
      var4.class_(rje_3.protected_.byte_(var8));
      this.catch_.class_(var4, var9, var6, var10);
      var4.break_();
      var4.break_();
      rfH_2 var12 = var1.protected_();
      if (var12 != null) {
         float var13 = (float)var12.b_() + 0.5F;
         float var14 = (float)var12.c_() + 0.5F;
         float var15 = (float)var12.d_() + 0.5F;
         float var16 = (float)((double)var13 - var1.rx());
         float var17 = (float)((double)var14 - var1.re());
         float var18 = (float)((double)var15 - var1.BO());
         var4.class_((double)var16, (double)var17, (double)var18);
         pw_3.class_(-var16, -var17 + var7, -var18, var3, var1.class_, var4, var5, var6);
      }

      super.class_(var1, var2, var3, var4, var5, var6);
   }

   public rqO_2 class_(rSa_1 var1) {
      return class_;
   }

   public static float class_(rSa_1 var0, float var1) {
      float var2 = (float)var0.class_ + var1;
      float var3 = rfU_2.class_(var2 * 0.2F) / 2.0F + 0.5F;
      var3 = (var3 * var3 + var3) * 0.4F;
      return var3 - 1.4F;
   }
}
