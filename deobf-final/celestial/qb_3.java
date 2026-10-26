package celestial;

public class qb_3 extends qG_2<rED> {
   private static final rqO_2 class_ = new rqO_2("textures/entity/illager/illusioner.png");

   public qb_3(pg_3 var1) {
      super(var1, new tK_2<>(0.0F, 0.0F, 64, 64), 0.5F);
      this.class_(new qM_2(this, this));
      this.throws_.break_().finally_ = true;
   }

   public rqO_2 class_(rED var1) {
      return class_;
   }

   public void class_(rED var1, float var2, float var3, Ml_1 var4, Hx_1 var5, int var6) {
      if (var1.Pp()) {
         rjU_2[] var7 = var1.throw_(var3);
         float var8 = this.class_(var1, var3);

         for (int var9 = 0; var9 < var7.length; var9++) {
            var4.class_();
            var4.class_(
               var7[var9].break_ + (double)rfU_2.break_((float)var9 + var8 * 0.5F) * 0.025,
               var7[var9].byte_ + (double)rfU_2.break_((float)var9 + var8 * 0.75F) * 0.0125,
               var7[var9].protected_ + (double)rfU_2.break_((float)var9 + var8 * 0.7F) * 0.025
            );
            super.class_(var1, var2, var3, var4, var5, var6);
            var4.break_();
         }
      } else {
         super.class_(var1, var2, var3, var4, var5, var6);
      }
   }

   protected boolean break_(rED var1) {
      return true;
   }
}
