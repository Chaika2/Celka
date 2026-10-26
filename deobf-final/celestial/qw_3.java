package celestial;

public class qw_3 extends pV_2<rhg_3> {
   private static final rqO_2 class_ = new rqO_2("textures/entity/shulker/spark.png");
   private static final HU throws_ = HU.private_(class_);
   private final wZ_2<rhg_3> case_ = new wZ_2<>();

   public qw_3(pg_3 var1) {
      super(var1);
   }

   protected int class_(rhg_3 var1, rfH_2 var2) {
      return 15;
   }

   public rqO_2 class_(rhg_3 var1) {
      return class_;
   }

   public void class_(rhg_3 var1, float var2, float var3, Ml_1 var4, Hx_1 var5, int var6) {
      var4.class_();
      float var7 = rfU_2.implements_((Float)var1.throws_[17], (Float)var1.throws_[15], var3);
      float var8 = rfU_2.catch_(var3, (Float)var1.throws_[18], (Float)var1.throws_[16]);
      float var9 = (float)((Integer)var1.throws_[41]).intValue() + var3;
      var4.class_(0.0, 0.15F, 0.0);
      var4.class_(rje_3.protected_.byte_(rfU_2.class_(var9 * 0.1F) * 180.0F));
      var4.class_(rje_3.break_.byte_(rfU_2.break_(var9 * 0.1F) * 180.0F));
      var4.class_(rje_3.case_.byte_(rfU_2.class_(var9 * 0.15F) * 360.0F));
      var4.class_(-0.5F, -0.5F, 0.5F);
      this.case_.class_(var1, 0.0F, 0.0F, 0.0F, var7, var8);
      Ok_1 var10 = var5.getBuffer(this.case_.class_(class_));
      this.case_.class_(var4, var10, var6, fZ_2.class_, 1.0F, 1.0F, 1.0F, 1.0F);
      var4.class_(1.5F, 1.5F, 1.5F);
      Ok_1 var11 = var5.getBuffer(throws_);
      this.case_.class_(var4, var11, var6, fZ_2.class_, 1.0F, 1.0F, 1.0F, 0.15F);
      var4.break_();
      super.class_(var1, var2, var3, var4, var5, var6);
   }
}
