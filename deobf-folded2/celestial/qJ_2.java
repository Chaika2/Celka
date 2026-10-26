package celestial;

public class qJ_2 extends pV_2<rsM_2> {
   private static final rqO_2 id_class = new rqO_2("textures/entity/lead_knot.png");
   private final tU_2<rsM_2> id_throws = new tU_2<>();

   public qJ_2(pg_3 var1) {
      super(var1);
   }

   public void id_class(rsM_2 var1, float var2, float var3, Ml_1 var4, Hx_1 var5, int var6) {
      var4.id_class();
      var4.id_class(-1.0F, -1.0F, 1.0F);
      this.id_throws.id_class(var1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
      Ok_1 var7 = var5.getBuffer(this.id_throws.id_class(id_class));
      this.id_throws.id_class(var4, var7, var6, fZ_2.id_class, 1.0F, 1.0F, 1.0F, 1.0F);
      var4.id_break();
      super.id_class(var1, var2, var3, var4, var5, var6);
   }

   public rqO_2 id_class(rsM_2 var1) {
      return id_class;
   }
}
