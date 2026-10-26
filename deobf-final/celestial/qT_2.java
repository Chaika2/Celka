package celestial;

public class qT_2 extends qc_3<rOV, wQ_2<rOV>> {
   private static final rqO_2 class_ = new rqO_2("textures/entity/fish/salmon.png");

   public qT_2(pg_3 var1) {
      super(var1, new wQ_2<>(), 0.4F);
   }

   public rqO_2 class_(rOV var1) {
      return class_;
   }

   protected void class_(rOV var1, Ml_1 var2, float var3, float var4, float var5) {
      super.class_(var1, var2, var3, var4, var5);
      float var6 = 1.0F;
      float var7 = 1.0F;
      if (!var1.rT()) {
         var6 = 1.3F;
         var7 = 1.7F;
      }

      float var8 = var6 * 4.3F * rfU_2.class_(var7 * 0.6F * var3);
      var2.class_(rje_3.protected_.byte_(var8));
      var2.class_(0.0, 0.0, -0.4F);
      if (!var1.rT()) {
         var2.class_(0.2F, 0.1F, 0.0);
         var2.class_(rje_3.case_.byte_(90.0F));
      }
   }
}
