package celestial;

public class qV_2 extends qc_3<rGA, wA_2<rGA>> {
   private static final rqO_2 class_ = new rqO_2("textures/entity/slime/slime.png");

   public qV_2(pg_3 var1) {
      super(var1, new wA_2<>(16), 0.25F);
      this.class_(new Te_1<>(this));
   }

   protected void class_(rGA var1, Ml_1 var2, float var3) {
      float var4 = 0.999F;
      var2.class_(0.999F, 0.999F, 0.999F);
      var2.class_(0.0, 0.001F, 0.0);
      float var5 = (float)var1.sk();
      float var6 = rfU_2.catch_(var3, var1.protected_, var1.break_) / (var5 * 0.5F + 1.0F);
      float var7 = 1.0F / (var6 + 1.0F);
      var2.class_(var7 * var5, 1.0F / var7 * var5, var7 * var5);
   }

   public rqO_2 class_(rGA var1) {
      return class_;
   }

   public void class_(rGA var1, float var2, float var3, Ml_1 var4, Hx_1 var5, int var6) {
      this.byte_ = 0.25F * (float)var1.sk();
      super.class_((rGA)var1, var2, var3, var4, var5, var6);
   }
}
