package celestial;

public class qz_3 extends pV_2<rhw_3> {
   private static final rqO_2 class_ = new rqO_2("textures/entity/llama/spit.png");
   private final ta_3<rhw_3> throws_ = new ta_3<>();

   public qz_3(pg_3 var1) {
      super(var1);
   }

   public void class_(rhw_3 var1, float var2, float var3, Ml_1 var4, Hx_1 var5, int var6) {
      var4.class_();
      var4.class_(0.0, 0.15F, 0.0);
      var4.class_(rje_3.protected_.byte_(rfU_2.catch_(var3, (Float)var1.throws_[17], (Float)var1.throws_[15]) - 90.0F));
      var4.class_(rje_3.case_.byte_(rfU_2.catch_(var3, (Float)var1.throws_[18], (Float)var1.throws_[16])));
      this.throws_.class_(var1, var3, 0.0F, -0.1F, 0.0F, 0.0F);
      Ok_1 var7 = var5.getBuffer(this.throws_.class_(class_));
      this.throws_.class_(var4, var7, var6, fZ_2.class_, 1.0F, 1.0F, 1.0F, 1.0F);
      var4.break_();
      super.class_(var1, var2, var3, var4, var5, var6);
   }

   public rqO_2 class_(rhw_3 var1) {
      return class_;
   }
}
