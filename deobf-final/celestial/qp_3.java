package celestial;

public class qp_3 extends qc_3<rMi_1, wW_2<rMi_1>> {
   private static final rqO_2 class_ = new rqO_2("textures/entity/rabbit/brown.png");
   private static final rqO_2 package_ = new rqO_2("textures/entity/rabbit/white.png");
   private static final rqO_2 int_ = new rqO_2("textures/entity/rabbit/black.png");
   private static final rqO_2 new_ = new rqO_2("textures/entity/rabbit/gold.png");
   private static final rqO_2 continue_ = new rqO_2("textures/entity/rabbit/salt.png");
   private static final rqO_2 super_ = new rqO_2("textures/entity/rabbit/white_splotched.png");
   private static final rqO_2 this_ = new rqO_2("textures/entity/rabbit/toast.png");
   private static final rqO_2 else_ = new rqO_2("textures/entity/rabbit/caerbannog.png");

   public qp_3(pg_3 var1) {
      super(var1, new wW_2<>(), 0.3F);
   }

   public rqO_2 class_(rMi_1 var1) {
      String var2 = rgF_2.class_(var1.g().getString());
      if (var2 != null && "Toast".equals(var2)) {
         return this_;
      } else {
         switch (var1.sx()) {
            case 0:
            default:
               return class_;
            case 1:
               return package_;
            case 2:
               return int_;
            case 3:
               return super_;
            case 4:
               return new_;
            case 5:
               return continue_;
            case 99:
               return else_;
         }
      }
   }
}
