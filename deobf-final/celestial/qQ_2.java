package celestial;

public class qQ_2 extends qc_3<rEa_1, ti_3<rEa_1>> {
   private static final rqO_2 class_ = new rqO_2("textures/entity/slime/magmacube.png");

   public qQ_2(pg_3 var1) {
      super(var1, new ti_3<>(), 0.25F);
   }

   protected int class_(rEa_1 var1, rfH_2 var2) {
      return 15;
   }

   protected void class_(rEa_1 var1, Ml_1 var2, float var3) {
      int var4 = var1.sk();
      float var5 = rfU_2.catch_(var3, var1.protected_, var1.break_) / ((float)var4 * 0.5F + 1.0F);
      float var6 = 1.0F / (var5 + 1.0F);
      var2.class_(var6 * (float)var4, 1.0F / var6 * (float)var4, var6 * (float)var4);
   }

   public rqO_2 class_(rEa_1 var1) {
      return class_;
   }
}
