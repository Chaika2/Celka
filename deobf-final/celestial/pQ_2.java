package celestial;

public class pQ_2 extends qd_3<rSY, tJ_2> {
   public static final rqO_2 class_ = new rqO_2("textures/entity/armorstand/wood.png");

   public pQ_2(pg_3 var1) {
      super(var1, new tx_3(), 0.0F);
      this.class_(new Tc_1<>(this, new tJ_2(0.5F), new tJ_2(1.0F)));
      this.class_(new TT<>(this));
      this.class_(new TC<>(this));
      this.class_(new Tp_1<>(this));
   }

   public rqO_2 class_(rSY var1) {
      return class_;
   }

   protected void class_(rSY var1, Ml_1 var2, float var3, float var4, float var5) {
      var2.class_(rje_3.protected_.byte_(180.0F - var4));
      float var6 = (float)(((rYB)var1.throws_[7]).r() - var1.volatile_) + var5;
      if (var6 < 5.0F) {
         var2.class_(rje_3.protected_.byte_(rfU_2.class_(var6 / 1.5F * (float) Math.PI) * 3.0F));
      }
   }

   protected HU class_(rSY var1, boolean var2, boolean var3, boolean var4) {
      if (!var1.implements_()) {
         return super.class_(var1, var2, var3, var4);
      } else {
         rqO_2 var5 = this.class_(var1);
         if (var3) {
            return HU.byte_(var5, false);
         } else {
            return var2 ? HU.class_(var5, false) : null;
         }
      }
   }

   protected boolean break_(rSY var1) {
      double var2 = this.break_.break_(var1);
      float var4 = var1.x() ? 32.0F : 64.0F;
      return var2 >= (double)(var4 * var4) ? false : var1.D();
   }
}
