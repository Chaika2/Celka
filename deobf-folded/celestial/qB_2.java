package celestial;

public class qB_2 extends qc_3<rEg_1, tc_3<rEg_1>> {
   private static final rqO_2 id_class = new rqO_2("textures/entity/hoglin/hoglin.png");

   public qB_2(pg_3 var1) {
      super(var1, new tc_3<>(), 0.7F);
   }

   public rqO_2 id_class(rEg_1 var1) {
      return id_class;
   }

   protected boolean id_break(rEg_1 var1) {
      return var1.sx();
   }
}
