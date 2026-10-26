package celestial;

public class Tx_1 extends qc_3<rOH, wV_2<rOH>> {
   private static final rqO_2 id_class = new rqO_2("textures/entity/wolf/wolf.png");
   private static final rqO_2 id_package = new rqO_2("textures/entity/wolf/wolf_tame.png");
   private static final rqO_2 id_int = new rqO_2("textures/entity/wolf/wolf_angry.png");

   public Tx_1(pg_3 var1) {
      super(var1, new wV_2<>(), 0.5F);
      this.id_class(new tb_3(this));
   }

   public void id_class(rOH var1, float var2, float var3, Ml_1 var4, Hx_1 var5, int var6) {
      if (var1.n()) {
         float var7 = var1.id_throw(var3);
         this.id_throws.id_class(var7, var7, var7);
      }

      super.id_class((rOH)var1, var2, var3, var4, var5, var6);
      if (var1.n()) {
         this.id_throws.id_class(1.0F, 1.0F, 1.0F);
      }
   }

   public rqO_2 id_class(rOH var1) {
      if (var1.sZ()) {
         return id_package;
      } else {
         return var1.T_() ? id_int : id_class;
      }
   }

   protected float id_class(rOH var1, float var2) {
      return var1.sJ();
   }
}
