package celestial;

public class pQ_2 extends qd_3<rSY, tJ_2> {
   public static final rqO_2 id_class = new rqO_2("textures/entity/armorstand/wood.png");

   public pQ_2(pg_3 var1) {
      super(var1, new tx_3(), 0.0F);
      this.id_class(new Tc_1<>(this, new tJ_2(0.5F), new tJ_2(1.0F)));
      this.id_class(new TT<>(this));
      this.id_class(new TC<>(this));
      this.id_class(new Tp_1<>(this));
   }

   public rqO_2 id_class(rSY var1) {
      return id_class;
   }

   protected void id_class(rSY var1, Ml_1 var2, float var3, float var4, float var5) {
      var2.id_class(rje_3.id_protected.id_byte(180.0F - var4));
      float var6 = (float)(((rYB)var1.id_throws[7]).r() - var1.id_volatile) + var5;
      if (var6 < 5.0F) {
         var2.id_class(rje_3.id_protected.id_byte(rfU_2.id_class(var6 / 1.5F * (float) Math.PI) * 3.0F));
      }
   }

   protected HU id_class(rSY var1, boolean var2, boolean var3, boolean var4) {
      if (!var1.id_implements()) {
         return super.id_class(var1, var2, var3, var4);
      } else {
         rqO_2 var5 = this.id_class(var1);
         if (var3) {
            return HU.id_byte(var5, false);
         } else {
            return var2 ? HU.id_class(var5, false) : null;
         }
      }
   }

   protected boolean id_break(rSY var1) {
      double var2 = this.id_break.id_break(var1);
      float var4 = var1.x() ? 32.0F : 64.0F;
      return var2 >= (double)(var4 * var4) ? false : var1.D();
   }
}
