package celestial;

public class qb_3 extends qG_2<rED> {
   private static final rqO_2 id_class = new rqO_2("textures/entity/illager/illusioner.png");

   public qb_3(pg_3 var1) {
      super(var1, new tK_2<>(0.0F, 0.0F, 64, 64), 0.5F);
      this.id_class(new qM_2(this, this));
      this.id_throws.id_break().id_finally = true;
   }

   public rqO_2 id_class(rED var1) {
      return id_class;
   }

   public void id_class(rED var1, float var2, float var3, Ml_1 var4, Hx_1 var5, int var6) {
      if (var1.Pp()) {
         rjU_2[] var7 = var1.id_throw(var3);
         float var8 = this.id_class(var1, var3);

         for (int var9 = 0; var9 < var7.length; var9++) {
            var4.id_class();
            var4.id_class(
               var7[var9].id_break + (double)rfU_2.id_break((float)var9 + var8 * 0.5F) * 0.025,
               var7[var9].id_byte + (double)rfU_2.id_break((float)var9 + var8 * 0.75F) * 0.0125,
               var7[var9].id_protected + (double)rfU_2.id_break((float)var9 + var8 * 0.7F) * 0.025
            );
            super.id_class(var1, var2, var3, var4, var5, var6);
            var4.id_break();
         }
      } else {
         super.id_class(var1, var2, var3, var4, var5, var6);
      }
   }

   protected boolean id_break(rED var1) {
      return true;
   }
}
