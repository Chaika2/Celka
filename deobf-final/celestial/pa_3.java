package celestial;

public class pa_3 extends qc_3<rba_3, tT_2<rba_3>> {
   private static final rqO_2 class_ = new rqO_2("textures/entity/fox/fox.png");
   private static final rqO_2 package_ = new rqO_2("textures/entity/fox/fox_sleep.png");
   private static final rqO_2 int_ = new rqO_2("textures/entity/fox/snow_fox.png");
   private static final rqO_2 new_ = new rqO_2("textures/entity/fox/snow_fox_sleep.png");

   public pa_3(pg_3 var1) {
      super(var1, new tT_2<>(), 0.4F);
      this.class_(new Ty_1(this));
   }

   protected void class_(rba_3 var1, Ml_1 var2, float var3, float var4, float var5) {
      super.class_(var1, var2, var3, var4, var5);
      if (var1.sd() || var1.sx()) {
         float var6 = -rfU_2.catch_(var5, (Float)var1.throws_[18], (Float)var1.throws_[16]);
         var2.class_(rje_3.break_.byte_(var6));
      }
   }

   public rqO_2 class_(rba_3 var1) {
      if (var1.n() == rMN.RED) {
         return var1.Sc() ? package_ : class_;
      } else {
         return var1.Sc() ? new_ : int_;
      }
   }
}
