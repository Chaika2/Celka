package celestial;

class rOx_1 extends rBk_1 {
   private int id_break;

   @Override
   public void id_byte() {
      this.id_break = 0;
   }

   rOx_1(rOJ var1) {
      this.id_class = var1;
   }

   @Override
   public boolean id_class() {
      iB_2 var1 = this.id_class.Sr();
      return this.id_class.rT() && var1 != null ? this.id_class.id_int(var1) < 100.0 : false;
   }

   @Override
   public void id_throws() {
      this.id_break++;
      iB_2 var1 = this.id_class.Sr();
      if (var1 != null) {
         rjU_2 var2 = new rjU_2(this.id_class.rx() - var1.rx(), this.id_class.re() - var1.re(), this.id_class.BO() - var1.BO());
         xc_3 var3 = ((rYB)this.id_class.id_throws[7])
            .id_byte(new rfH_2(this.id_class.rx() + var2.id_break, this.id_class.re() + var2.id_byte, this.id_class.BO() + var2.id_protected));
         rXE var4 = ((rYB)this.id_class.id_throws[7])
            .id_break(new rfH_2(this.id_class.rx() + var2.id_break, this.id_class.re() + var2.id_byte, this.id_class.BO() + var2.id_protected));
         if (var4.id_class(rlG_2.id_break) || var3.id_catch()) {
            double var5 = var2.id_case();
            if (var5 > 0.0) {
               var2.id_protected();
               float var7 = 3.0F;
               if (var5 > 5.0) {
                  var7 = (float)((double)var7 - (var5 - 5.0) / 5.0);
               }

               if (var7 > 0.0F) {
                  var2 = var2.id_class((double)var7);
               }
            }

            if (var3.id_catch()) {
               var2 = var2.id_class(0.0, var2.id_byte, 0.0);
            }

            this.id_class.id_byte((float)var2.id_break / 20.0F, (float)var2.id_byte / 20.0F, (float)var2.id_protected / 20.0F);
         }

         if (this.id_break % 10 == 5) {
            ((rYB)this.id_class.id_throws[7]).id_class(rLQ.id_throws, this.id_class.rx(), this.id_class.re(), this.id_class.BO(), 0.0, 0.0, 0.0);
         }
      }
   }
}
