package celestial;

public class pC_2 extends qc_3<rOI, tF_2<rOI>> {
   private static final rqO_2 class_ = new rqO_2("textures/entity/fish/cod.png");

   public pC_2(pg_3 var1) {
      super(var1, new tF_2<>(), 0.3F);
   }

   public rqO_2 class_(rOI var1) {
      return class_;
   }

   protected void class_(rOI var1, Ml_1 var2, float var3, float var4, float var5) {
      super.class_(var1, var2, var3, var4, var5);
      float var6 = 4.3F * rfU_2.class_(0.6F * var3);
      var2.class_(rje_3.protected_.byte_(var6));
      if (!var1.rT()) {
         var2.class_(0.1F, 0.1F, -0.1F);
         var2.class_(rje_3.case_.byte_(90.0F));
      }
   }
}
