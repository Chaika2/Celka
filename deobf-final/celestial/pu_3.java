package celestial;

public class pu_3 extends qc_3<rbF_2, tk_3<rbF_2>> {
   private static final rqO_2 class_ = new rqO_2("textures/entity/bee/bee_angry.png");
   private static final rqO_2 package_ = new rqO_2("textures/entity/bee/bee_angry_nectar.png");
   private static final rqO_2 int_ = new rqO_2("textures/entity/bee/bee.png");
   private static final rqO_2 new_ = new rqO_2("textures/entity/bee/bee_nectar.png");

   public pu_3(pg_3 var1) {
      super(var1, new tk_3<>(), 0.4F);
   }

   public rqO_2 class_(rbF_2 var1) {
      if (var1.T_()) {
         return var1.sc() ? package_ : class_;
      } else {
         return var1.sc() ? new_ : int_;
      }
   }
}
