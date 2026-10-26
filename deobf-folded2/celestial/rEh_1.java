package celestial;

import java.util.EnumSet;

class rEh_1 extends rBk_1 {
   private final rEO id_class;
   private int id_break;
   private int id_byte;
   private int id_protected;

   @Override
   public void id_byte() {
      this.id_break = 0;
   }

   public rEh_1(rEO var1) {
      this.id_class = var1;
      this.id_class(EnumSet.of(rBW.MOVE, rBW.LOOK));
   }

   @Override
   public boolean id_class() {
      iB_2 var1 = this.id_class.I_();
      return var1 != null && var1.BM() && this.id_class.id_catch(var1);
   }

   @Override
   public void id_throws() {
      this.id_byte--;
      iB_2 var1 = this.id_class.I_();
      if (var1 != null) {
         boolean var2 = this.id_class.id_goto().id_class(var1);
         if (var2) {
            this.id_protected = 0;
         } else {
            this.id_protected++;
         }

         double var3 = this.id_class.id_int(var1);
         if (var3 < 4.0) {
            if (!var2) {
               return;
            }

            if (this.id_byte <= 0) {
               this.id_byte = 20;
               this.id_class.id_public(var1);
            }

            this.id_class.id_super().id_class(var1.rx(), var1.re(), var1.BO(), 1.0);
         } else if (var3 < this.id_catch() * this.id_catch() && var2) {
            double var5 = var1.rx() - this.id_class.rx();
            double var7 = var1.id_byte(0.5) - this.id_class.id_byte(0.5);
            double var9 = var1.BO() - this.id_class.BO();
            if (this.id_byte <= 0) {
               this.id_break++;
               if (this.id_break == 1) {
                  this.id_byte = 60;
                  this.id_class.id_this(true);
               } else if (this.id_break <= 4) {
                  this.id_byte = 6;
               } else {
                  this.id_byte = 100;
                  this.id_break = 0;
                  this.id_class.id_this(false);
               }

               if (this.id_break > 1) {
                  float var11 = rfU_2.id_byte(rfU_2.id_class(var3)) * 0.5F;
                  if (!this.id_class.BF()) {
                     ((rYB)this.id_class.id_throws[7]).id_class((rhd_3)null, 1018, this.id_class.Bs(), 0);
                  }

                  for (int var12 = 0; var12 < 1; var12++) {
                     rhR_2 var13 = new rhR_2(
                        (rYB)this.id_class.id_throws[7],
                        this.id_class,
                        var5 + this.id_class.Sa().nextGaussian() * (double)var11,
                        var7,
                        var9 + this.id_class.Sa().nextGaussian() * (double)var11
                     );
                     var13.id_new(var13.rx(), this.id_class.id_byte(0.5) + 0.5, var13.BO());
                     ((rYB)this.id_class.id_throws[7]).a_(var13);
                  }
               }
            }

            this.id_class.id_continue().id_class(var1, 10.0F, 10.0F);
         } else if (this.id_protected < 5) {
            this.id_class.id_super().id_class(var1.rx(), var1.re(), var1.BO(), 1.0);
         }

         super.id_throws();
      }
   }

   private double id_catch() {
      return this.id_class.id_class(iQ_2.id_break);
   }

   @Override
   public void id_protected() {
      this.id_class.id_this(false);
      this.id_protected = 0;
   }
}
