package celestial;

public class TJ extends pV_2<rhU_2> {
   private static final rqO_2 id_class = new rqO_2("textures/entity/wither/wither_invulnerable.png");
   private static final rqO_2 id_throws = new rqO_2("textures/entity/wither/wither.png");
   private final tt_3 id_case = new tt_3();

   public TJ(pg_3 var1) {
      super(var1);
   }

   protected int id_class(rhU_2 var1, rfH_2 var2) {
      return 15;
   }

   public rqO_2 id_class(rhU_2 var1) {
      return var1.id_protected() ? id_class : id_throws;
   }

   public void id_class(rhU_2 var1, float var2, float var3, Ml_1 var4, Hx_1 var5, int var6) {
      var4.id_class();
      var4.id_class(-1.0F, -1.0F, 1.0F);
      float var7 = rfU_2.id_implements((Float)var1.id_throws[17], (Float)var1.id_throws[15], var3);
      float var8 = rfU_2.id_catch(var3, (Float)var1.id_throws[18], (Float)var1.id_throws[16]);
      Ok_1 var9 = var5.getBuffer(this.id_case.id_class(this.id_class(var1)));
      this.id_case.id_class(0.0F, var7, var8);
      this.id_case.id_class(var4, var9, var6, fZ_2.id_class, 1.0F, 1.0F, 1.0F, 1.0F);
      var4.id_break();
      super.id_class(var1, var2, var3, var4, var5, var6);
   }
}
