package celestial;

public class qU_2 extends qc_3<rOk_1, wH_2<rOk_1>> {
   private static final rqO_2 class_ = new rqO_2("textures/entity/strider/strider.png");
   private static final rqO_2 package_ = new rqO_2("textures/entity/strider/strider_cold.png");

   public qU_2(pg_3 var1) {
      super(var1, new wH_2<>(), 0.5F);
      this.class_(new TK<>(this, new wH_2<>(), new rqO_2("textures/entity/strider/strider_saddle.png")));
   }

   public rqO_2 class_(rOk_1 var1) {
      return var1.L() ? package_ : class_;
   }

   protected void class_(rOk_1 var1, Ml_1 var2, float var3) {
      if (var1.n_()) {
         var2.class_(0.5F, 0.5F, 0.5F);
         this.byte_ = 0.25F;
      } else {
         this.byte_ = 0.5F;
      }
   }

   protected boolean break_(rOk_1 var1) {
      return var1.L();
   }
}
