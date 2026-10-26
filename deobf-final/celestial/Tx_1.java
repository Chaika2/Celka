package celestial;

public class Tx_1 extends qc_3<rOH, wV_2<rOH>> {
   private static final rqO_2 class_ = new rqO_2("textures/entity/wolf/wolf.png");
   private static final rqO_2 package_ = new rqO_2("textures/entity/wolf/wolf_tame.png");
   private static final rqO_2 int_ = new rqO_2("textures/entity/wolf/wolf_angry.png");

   public Tx_1(pg_3 var1) {
      super(var1, new wV_2<>(), 0.5F);
      this.class_(new tb_3(this));
   }

   public void class_(rOH var1, float var2, float var3, Ml_1 var4, Hx_1 var5, int var6) {
      if (var1.n()) {
         float var7 = var1.throw_(var3);
         this.throws_.class_(var7, var7, var7);
      }

      super.class_((rOH)var1, var2, var3, var4, var5, var6);
      if (var1.n()) {
         this.throws_.class_(1.0F, 1.0F, 1.0F);
      }
   }

   public rqO_2 class_(rOH var1) {
      if (var1.sZ()) {
         return package_;
      } else {
         return var1.T_() ? int_ : class_;
      }
   }

   protected float class_(rOH var1, float var2) {
      return var1.sJ();
   }
}
