package celestial;

public class TJ extends pV_2<rhU_2> {
   private static final rqO_2 class_ = new rqO_2("textures/entity/wither/wither_invulnerable.png");
   private static final rqO_2 throws_ = new rqO_2("textures/entity/wither/wither.png");
   private final tt_3 case_ = new tt_3();

   public TJ(pg_3 var1) {
      super(var1);
   }

   protected int class_(rhU_2 var1, rfH_2 var2) {
      return 15;
   }

   public rqO_2 class_(rhU_2 var1) {
      return var1.protected_() ? class_ : throws_;
   }

   public void class_(rhU_2 var1, float var2, float var3, Ml_1 var4, Hx_1 var5, int var6) {
      var4.class_();
      var4.class_(-1.0F, -1.0F, 1.0F);
      float var7 = rfU_2.implements_((Float)var1.throws_[17], (Float)var1.throws_[15], var3);
      float var8 = rfU_2.catch_(var3, (Float)var1.throws_[18], (Float)var1.throws_[16]);
      Ok_1 var9 = var5.getBuffer(this.case_.class_(this.class_(var1)));
      this.case_.class_(0.0F, var7, var8);
      this.case_.class_(var4, var9, var6, fZ_2.class_, 1.0F, 1.0F, 1.0F, 1.0F);
      var4.break_();
      super.class_(var1, var2, var3, var4, var5, var6);
   }
}
