package celestial;

public class qy_3 extends qc_3<rOf_1, tp_3<rOf_1>> {
   private static final rqO_2 id_class = new rqO_2("textures/entity/fish/pufferfish.png");
   private int id_package;
   private final wd_3<rOf_1> id_int = new wd_3<>();
   private final wx_3<rOf_1> id_new = new wx_3<>();
   private final wJ_2<rOf_1> id_continue = new wJ_2<>();

   public qy_3(pg_3 var1) {
      super(var1, new wJ_2<>(), 0.2F);
      this.id_package = 3;
   }

   public void id_class(rOf_1 var1, float var2, float var3, Ml_1 var4, Hx_1 var5, int var6) {
      int var7 = var1.sx();
      if (var7 != this.id_package) {
         if (var7 == 0) {
            this.id_throws = this.id_int;
         } else if (var7 == 1) {
            this.id_throws = this.id_new;
         } else {
            this.id_throws = this.id_continue;
         }
      }

      this.id_package = var7;
      this.id_byte = 0.1F + 0.1F * (float)var7;
      super.id_class((rOf_1)var1, var2, var3, var4, var5, var6);
   }

   protected void id_class(rOf_1 var1, Ml_1 var2, float var3, float var4, float var5) {
      var2.id_class(0.0, (double)(rfU_2.id_break(var3 * 0.05F) * 0.08F), 0.0);
      super.id_class(var1, var2, var3, var4, var5);
   }

   public rqO_2 id_class(rOf_1 var1) {
      return id_class;
   }
}
