package celestial;

public class qW_2 extends qc_3<rhP_2, te_3<rhP_2>> {
   private static final rqO_2[] class_ = new rqO_2[]{
      new rqO_2("textures/entity/llama/creamy.png"),
      new rqO_2("textures/entity/llama/white.png"),
      new rqO_2("textures/entity/llama/brown.png"),
      new rqO_2("textures/entity/llama/gray.png")
   };

   public qW_2(pg_3 var1) {
      super(var1, new te_3<>(0.0F), 0.7F);
      this.class_(new TV(this));
   }

   public rqO_2 class_(rhP_2 var1) {
      return class_[var1.se()];
   }
}
