package celestial;

public class qp_3 extends qc_3<rMi_1, wW_2<rMi_1>> {
   private static final rqO_2 id_class = new rqO_2("textures/entity/rabbit/brown.png");
   private static final rqO_2 id_package = new rqO_2("textures/entity/rabbit/white.png");
   private static final rqO_2 id_int = new rqO_2("textures/entity/rabbit/black.png");
   private static final rqO_2 id_new = new rqO_2("textures/entity/rabbit/gold.png");
   private static final rqO_2 id_continue = new rqO_2("textures/entity/rabbit/salt.png");
   private static final rqO_2 id_super = new rqO_2("textures/entity/rabbit/white_splotched.png");
   private static final rqO_2 id_this = new rqO_2("textures/entity/rabbit/toast.png");
   private static final rqO_2 id_else = new rqO_2("textures/entity/rabbit/caerbannog.png");

   public qp_3(pg_3 var1) {
      super(var1, new wW_2<>(), 0.3F);
   }

   public rqO_2 id_class(rMi_1 var1) {
      String var2 = rgF_2.id_class(var1.g().getString());
      if (var2 != null && "Toast".equals(var2)) {
         return id_this;
      } else {
         switch (var1.sx()) {
            case 0:
            default:
               return id_class;
            case 1:
               return id_package;
            case 2:
               return id_int;
            case 3:
               return id_super;
            case 4:
               return id_new;
            case 5:
               return id_continue;
            case 99:
               return id_else;
         }
      }
   }
}
