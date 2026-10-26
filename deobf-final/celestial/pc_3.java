package celestial;

public class pc_3 extends qc_3<rbv_3, td_3> {
   private static final rqO_2 class_ = new rqO_2("textures/entity/bat.png");

   public pc_3(pg_3 var1) {
      super(var1, new td_3(), 0.25F);
   }

   public rqO_2 class_(rbv_3 var1) {
      return class_;
   }

   protected void class_(rbv_3 var1, Ml_1 var2, float var3, float var4, float var5) {
      if (var1.catch_()) {
         var2.class_(0.0, -0.1F, 0.0);
      } else {
         var2.class_(0.0, (double)(rfU_2.break_(var3 * 0.3F) * 0.1F), 0.0);
      }

      super.class_(var1, var2, var3, var4, var5);
   }

   protected void class_(rbv_3 var1, Ml_1 var2, float var3) {
      var2.class_(0.35F, 0.35F, 0.35F);
   }
}
