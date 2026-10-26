package celestial;

public class Ts_1 extends pm_3<rGg_1, ww_3> {
   private static final rqO_2 class_ = new rqO_2("textures/entity/illager/vex.png");
   private static final rqO_2 package_ = new rqO_2("textures/entity/illager/vex_charging.png");

   public Ts_1(pg_3 var1) {
      super(var1, new ww_3(), 0.3F);
   }

   protected int class_(rGg_1 var1, rfH_2 var2) {
      return 15;
   }

   protected void class_(rGg_1 var1, Ml_1 var2, float var3) {
      var2.class_(0.4F, 0.4F, 0.4F);
   }

   public rqO_2 class_(rGg_1 var1) {
      return var1.sx() ? package_ : class_;
   }
}
