package celestial;

public class TE extends qc_3<rsq_3, wI_2<rsq_3>> {
   private static final rqO_2 id_class = new rqO_2("textures/entity/villager/villager.png");

   public TE(pg_3 var1, rAv_1 var2) {
      super(var1, new wI_2<>(0.0F), 0.5F);
      this.id_class(new Tp_1<>(this));
      this.id_class(new ts_3<>(this, var2, "villager"));
      this.id_class(new TF<>(this));
   }

   public rqO_2 id_class(rsq_3 var1) {
      return id_class;
   }

   protected void id_class(rsq_3 var1, Ml_1 var2, float var3) {
      float var4 = 0.9375F;
      if (var1.n_()) {
         var4 = (float)((double)var4 * 0.5);
         this.id_byte = 0.25F;
      } else {
         this.id_byte = 0.5F;
      }

      var2.id_class(var4, var4, var4);
   }
}
