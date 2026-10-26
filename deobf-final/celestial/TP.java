package celestial;

public class TP extends qc_3<rOg_1, tp_3<rOg_1>> {
   private final wq_3<rOg_1> class_ = new wq_3<>(0.0F);
   private final wT_2<rOg_1> package_ = new wT_2<>(0.0F);

   public TP(pg_3 var1) {
      super(var1, new wq_3<>(0.0F), 0.15F);
      this.class_(new tS_2(this));
   }

   public rqO_2 class_(rOg_1 var1) {
      return var1.sF();
   }

   public void class_(rOg_1 var1, float var2, float var3, Ml_1 var4, Hx_1 var5, int var6) {
      Object var7 = var1.sZ() == 0 ? this.class_ : this.package_;
      this.throws_ = (tp_3<rOg_1>)var7;
      float[] var8 = var1.su();
      ((tO_2)var7).class_(var8[0], var8[1], var8[2]);
      super.class_((rOg_1)var1, var2, var3, var4, var5, var6);
      ((tO_2)var7).class_(1.0F, 1.0F, 1.0F);
   }

   protected void class_(rOg_1 var1, Ml_1 var2, float var3, float var4, float var5) {
      super.class_(var1, var2, var3, var4, var5);
      float var6 = 4.3F * rfU_2.class_(0.6F * var3);
      var2.class_(rje_3.protected_.byte_(var6));
      if (!var1.rT()) {
         var2.class_(0.2F, 0.1F, 0.0);
         var2.class_(rje_3.case_.byte_(90.0F));
      }
   }
}
