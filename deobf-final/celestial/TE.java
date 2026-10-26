package celestial;

public class TE extends qc_3<rsq_3, wI_2<rsq_3>> {
   private static final rqO_2 class_ = new rqO_2("textures/entity/villager/villager.png");

   public TE(pg_3 var1, rAv_1 var2) {
      super(var1, new wI_2<>(0.0F), 0.5F);
      this.class_(new Tp_1<>(this));
      this.class_(new ts_3<>(this, var2, "villager"));
      this.class_(new TF<>(this));
   }

   public rqO_2 class_(rsq_3 var1) {
      return class_;
   }

   protected void class_(rsq_3 var1, Ml_1 var2, float var3) {
      float var4 = 0.9375F;
      if (var1.n_()) {
         var4 = (float)((double)var4 * 0.5);
         this.byte_ = 0.25F;
      } else {
         this.byte_ = 0.5F;
      }

      var2.class_(var4, var4, var4);
   }
}
