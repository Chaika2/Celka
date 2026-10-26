package celestial;

public class qU_2 extends qc_3<rOk_1, wH_2<rOk_1>> {
   private static final rqO_2 id_class = new rqO_2("textures/entity/strider/strider.png");
   private static final rqO_2 id_package = new rqO_2("textures/entity/strider/strider_cold.png");

   public qU_2(pg_3 var1) {
      super(var1, new wH_2<>(), 0.5F);
      this.id_class(new TK<>(this, new wH_2<>(), new rqO_2("textures/entity/strider/strider_saddle.png")));
   }

   public rqO_2 id_class(rOk_1 var1) {
      return var1.L() ? id_package : id_class;
   }

   protected void id_class(rOk_1 var1, Ml_1 var2, float var3) {
      if (var1.n_()) {
         var2.id_class(0.5F, 0.5F, 0.5F);
         this.id_byte = 0.25F;
      } else {
         this.id_byte = 0.5F;
      }
   }

   protected boolean id_break(rOk_1 var1) {
      return var1.L();
   }
}
