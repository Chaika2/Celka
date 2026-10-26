package celestial;

public class pc_3 extends qc_3<rbv_3, td_3> {
   private static final rqO_2 id_class = new rqO_2("textures/entity/bat.png");

   public pc_3(pg_3 var1) {
      super(var1, new td_3(), 0.25F);
   }

   public rqO_2 id_class(rbv_3 var1) {
      return id_class;
   }

   protected void id_class(rbv_3 var1, Ml_1 var2, float var3, float var4, float var5) {
      if (var1.id_catch()) {
         var2.id_class(0.0, -0.1F, 0.0);
      } else {
         var2.id_class(0.0, (double)(rfU_2.id_break(var3 * 0.3F) * 0.1F), 0.0);
      }

      super.id_class(var1, var2, var3, var4, var5);
   }

   protected void id_class(rbv_3 var1, Ml_1 var2, float var3) {
      var2.id_class(0.35F, 0.35F, 0.35F);
   }
}
