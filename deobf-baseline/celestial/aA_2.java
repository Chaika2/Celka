package celestial;

public abstract class aA_2 extends is_3 {
   protected void id_byte(float var1) {
   }

   protected aA_2(aI_2<? extends aA_2> var1, rYB var2) {
      super(var1, var2);
   }

   public float id_class(rfH_2 var1) {
      return this.id_class(var1, (rYB)this.id_throws[7]);
   }

   @Override
   public boolean id_class(rRg_1 var1, iO_2 var2) {
      return this.id_class(this.Bs(), var1) >= 0.0F;
   }

   public float id_class(rfH_2 var1, rRR var2) {
      return 0.0F;
   }

   public boolean id_catch() {
      return !this.id_public().id_native();
   }

   protected double id_implements() {
      return 1.0;
   }

   @Override
   protected void id_private() {
      super.id_private();
      an_3 var1 = this.N();
      if (var1 != null && (rYB)var1.id_throws[7] == (rYB)this.id_throws[7]) {
         this.id_class(var1.Bs(), 5);
         float var2 = this.id_implements(var1);
         if (this instanceof rOQ && ((rOQ)this).Sc()) {
            if (var2 > 10.0F) {
               this.id_class(true, true);
            }

            return;
         }

         this.id_byte(var2);
         if (var2 > 10.0F) {
            this.id_class(true, true);
            this.id_package.id_class(rBW.MOVE);
         } else if (var2 > 6.0F) {
            double var3 = (var1.rx() - this.rx()) / (double)var2;
            double var5 = (var1.re() - this.re()) / (double)var2;
            double var7 = (var1.BO() - this.BO()) / (double)var2;
            this.id_byte(
               this.rv().id_break(Math.copySign(var3 * var3 * 0.4, var3), Math.copySign(var5 * var5 * 0.4, var5), Math.copySign(var7 * var7 * 0.4, var7))
            );
         } else {
            this.id_package.id_break(rBW.MOVE);
            float var9 = 2.0F;
            rjU_2 var4 = new rjU_2(var1.rx() - this.rx(), var1.re() - this.re(), var1.BO() - this.BO())
               .id_protected()
               .id_class((double)Math.max(var2 - 2.0F, 0.0F));
            this.id_public().id_class(this.rx() + var4.id_break, this.re() + var4.id_byte, this.BO() + var4.id_protected, this.id_implements());
         }
      }
   }
}
