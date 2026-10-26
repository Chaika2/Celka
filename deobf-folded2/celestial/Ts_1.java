package celestial;

public class Ts_1 extends pm_3<rGg_1, ww_3> {
   private static final rqO_2 id_class = new rqO_2("textures/entity/illager/vex.png");
   private static final rqO_2 id_package = new rqO_2("textures/entity/illager/vex_charging.png");

   public Ts_1(pg_3 var1) {
      super(var1, new ww_3(), 0.3F);
   }

   protected int id_class(rGg_1 var1, rfH_2 var2) {
      return 15;
   }

   protected void id_class(rGg_1 var1, Ml_1 var2, float var3) {
      var2.id_class(0.4F, 0.4F, 0.4F);
   }

   public rqO_2 id_class(rGg_1 var1) {
      return var1.sx() ? id_package : id_class;
   }
}
