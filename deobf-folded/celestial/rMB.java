package celestial;

public class rMB extends rBp_1 {
   protected int id_catch;

   @Override
   public void id_byte() {
      this.id_catch = 0;
      this.id_private.id_this(false);
      super.id_byte();
   }

   public rMB(rba_3 var1, double var2, int var4, int var5) {
      super(var1, var2, var4, var5);
      this.id_private = var1;
   }

   @Override
   public boolean id_class() {
      return !this.id_private.Sc() && super.id_class();
   }

   @Override
   protected boolean id_class(rRR var1, rfH_2 var2) {
      xc_3 var3 = var1.id_byte(var2);
      return var3.id_class(xu_3.XJ) && var3.id_byte(zz_3.id_volatile) >= 2;
   }

   @Override
   public void id_throws() {
      if (this.id_native()) {
         if (this.id_catch >= 40) {
            this.id_final();
         } else {
            this.id_catch++;
         }
      } else if (!this.id_native() && rba_3.id_class(this.id_private).nextFloat() < 0.05F) {
         this.id_private.id_class(rqn_3.SC, 1.0F, 1.0F);
      }

      super.id_throws();
   }

   @Override
   public boolean id_extends() {
      return this.id_protected % 100 == 0;
   }

   @Override
   public double id_private() {
      return 2.0;
   }

   protected void id_final() {
      if (((rYB)this.id_private.id_throws[7]).B().id_break(rRu_1.id_break)) {
         xc_3 var1 = ((rYB)this.id_private.id_throws[7]).id_byte(this.id_throws);
         if (var1.id_class(xu_3.XJ)) {
            int var2 = var1.id_byte(zz_3.id_volatile);
            var1.id_class(zz_3.id_volatile, Integer.valueOf(1));
            int var3 = 1 + ((rYB)this.id_private.id_throws[7]).id_int.nextInt(2) + (var2 == 3 ? 1 : 0);
            rdn_3 var4 = this.id_private.id_class(rXQ.MAINHAND);
            if (var4.id_class()) {
               this.id_private.id_class(rXQ.MAINHAND, new rdn_3(rdy_3.WQ));
               var3--;
            }

            if (var3 > 0) {
               xd_3.id_class((rYB)this.id_private.id_throws[7], this.id_throws, new rdn_3(rdy_3.WQ, var3));
            }

            this.id_private.id_class(rqn_3.dE, 1.0F, 1.0F);
            ((rYB)this.id_private.id_throws[7]).id_class(this.id_throws, var1.id_class(zz_3.id_volatile, Integer.valueOf(1)), 2);
         }
      }
   }
}
