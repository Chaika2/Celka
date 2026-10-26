package celestial;

public class qi_3 extends pN_2<rhF_2> {
   public static final rqO_2 id_class = new rqO_2("textures/entity/projectiles/arrow.png");
   public static final rqO_2 id_throws = new rqO_2("textures/entity/projectiles/tipped_arrow.png");

   public qi_3(pg_3 var1) {
      super(var1);
   }

   public rqO_2 id_class(rhF_2 var1) {
      return var1.id_super() > 0 ? id_throws : id_class;
   }
}
