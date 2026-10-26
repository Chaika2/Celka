package celestial;

public abstract class aV_2 extends is_3 {
   protected aV_2(aI_2<? extends aV_2> var1, rYB var2) {
      super(var1, var2);
   }

   @Override
   protected void id_class(double var1, boolean var3, xc_3 var4, rfH_2 var5) {
   }

   @Override
   public boolean id_class(float var1, float var2) {
      return false;
   }

   @Override
   public void id_private(rjU_2 var1) {
      if (this.rT()) {
         this.id_class(0.02F, var1);
         this.id_class(iG_2.SELF, this.rv());
         this.id_byte(this.rv().id_class(0.8F));
      } else if (this.ry()) {
         this.id_class(0.02F, var1);
         this.id_class(iG_2.SELF, this.rv());
         this.id_byte(this.rv().id_class(0.5));
      } else {
         float var2 = 0.91F;
         if ((Boolean)this.id_throws[20]) {
            var2 = ((rYB)this.id_throws[7]).id_byte(new rfH_2(this.rx(), this.re() - 1.0, this.BO())).id_break().id_final() * 0.91F;
         }

         float var3 = 0.16277137F / (var2 * var2 * var2);
         var2 = 0.91F;
         if ((Boolean)this.id_throws[20]) {
            var2 = ((rYB)this.id_throws[7]).id_byte(new rfH_2(this.rx(), this.re() - 1.0, this.BO())).id_break().id_final() * 0.91F;
         }

         this.id_class(this.id_throws[20] ? 0.1F * var3 : 0.02F, var1);
         this.id_class(iG_2.SELF, this.rv());
         this.id_byte(this.rv().id_class((double)var2));
      }

      this.id_class(this, false);
   }

   @Override
   public boolean o_() {
      return false;
   }
}
