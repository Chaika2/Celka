package celestial;

class rEp_1 extends rBk_1 {
   private final rEy_1 id_break;
   public int id_class;

   @Override
   public void id_byte() {
      this.id_class = 0;
   }

   public rEp_1(rEy_1 var1) {
      this.id_break = var1;
   }

   @Override
   public boolean id_class() {
      return this.id_break.I_() != null;
   }

   @Override
   public void id_throws() {
      iB_2 var1 = this.id_break.I_();
      double var2 = 64.0;
      if (var1.id_int(this.id_break) < 4096.0 && this.id_break.id_while(var1)) {
         rYB var4 = (rYB)this.id_break.id_throws[7];
         this.id_class++;
         if (this.id_class == 10 && !this.id_break.BF()) {
            var4.id_class((rhd_3)null, 1015, this.id_break.Bs(), 0);
         }

         if (this.id_class == 20) {
            double var5 = 4.0;
            rjU_2 var7 = this.id_break.id_break(1.0F);
            double var8 = var1.rx() - (this.id_break.rx() + var7.id_break * 4.0);
            double var10 = var1.id_byte(0.5) - (0.5 + this.id_break.id_byte(0.5));
            double var12 = var1.BO() - (this.id_break.BO() + var7.id_protected * 4.0);
            if (!this.id_break.BF()) {
               var4.id_class((rhd_3)null, 1016, this.id_break.Bs(), 0);
            }

            rhH_2 var14 = new rhH_2(var4, this.id_break, var8, var10, var12);
            var14.id_catch = this.id_break.id_catch();
            var14.id_new(this.id_break.rx() + var7.id_break * 4.0, this.id_break.id_byte(0.5) + 0.5, var14.BO() + var7.id_protected * 4.0);
            var4.a_(var14);
            this.id_class = -40;
         }
      } else if (this.id_class > 0) {
         this.id_class--;
      }

      this.id_break.id_this(this.id_class > 10);
   }

   @Override
   public void id_protected() {
      this.id_break.id_this(false);
   }
}
