package celestial;

public class qi_3 extends pN_2<rhF_2> {
   public static final rqO_2 class_ = new rqO_2("textures/entity/projectiles/arrow.png");
   public static final rqO_2 throws_ = new rqO_2("textures/entity/projectiles/tipped_arrow.png");

   public qi_3(pg_3 var1) {
      super(var1);
   }

   public rqO_2 class_(rhF_2 var1) {
      return var1.super_() > 0 ? throws_ : class_;
   }
}
