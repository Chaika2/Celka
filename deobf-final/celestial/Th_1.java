package celestial;

public class Th_1 extends qc_3<rSN, wj_3<rSN>> {
   private static final rqO_2 class_ = new rqO_2("textures/entity/wither/wither_invulnerable.png");
   private static final rqO_2 package_ = new rqO_2("textures/entity/wither/wither.png");

   public Th_1(pg_3 var1) {
      super(var1, new wj_3<>(0.0F), 1.0F);
      this.class_(new tG_2(this));
   }

   protected int class_(rSN var1, rfH_2 var2) {
      return 15;
   }

   protected void class_(rSN var1, Ml_1 var2, float var3) {
      float var4 = 2.0F;
      int var5 = var1.n();
      if (var5 > 0) {
         var4 -= ((float)var5 - var3) / 220.0F * 0.5F;
      }

      var2.class_(var4, var4, var4);
   }

   public rqO_2 class_(rSN var1) {
      int var2 = var1.n();
      return var2 <= 0 || var2 <= 80 && var2 / 5 % 2 == 1 ? package_ : class_;
   }
}
