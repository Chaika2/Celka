package celestial;

import java.util.EnumSet;

class rGQ extends rBk_1 {
   private int id_break;

   @Override
   public void id_byte() {
      this.id_break = 20;
      this.id_class.id_class(100);
   }

   public rGQ(rGz_1 var1) {
      this.id_class = var1;
      this.id_class(EnumSet.of(rBW.MOVE, rBW.LOOK));
   }

   @Override
   public boolean id_class() {
      iB_2 var1 = this.id_class.I_();
      return var1 != null && var1.BM() ? ((rYB)this.id_class.id_throws[7]).id_abstract() != rRO.PEACEFUL : false;
   }

   @Override
   public void id_throws() {
      if (((rYB)this.id_class.id_throws[7]).id_abstract() != rRO.PEACEFUL) {
         this.id_break--;
         iB_2 var1 = this.id_class.I_();
         this.id_class.id_continue().id_class(var1, 180.0F, 180.0F);
         double var2 = this.id_class.id_int(var1);
         if (var2 < 400.0) {
            if (this.id_break <= 0) {
               this.id_break = 20 + rGz_1.id_class(this.id_class).nextInt(10) * 20 / 2;
               ((rYB)this.id_class.id_throws[7]).a_(new rhg_3((rYB)this.id_class.id_throws[7], this.id_class, var1, this.id_class.n().id_final()));
               this.id_class.id_class(rqn_3.JQ, 2.0F, (rGz_1.id_break(this.id_class).nextFloat() - rGz_1.id_byte(this.id_class).nextFloat()) * 0.2F + 1.0F);
            }
         } else {
            this.id_class.id_byte((iB_2)null);
         }

         super.id_throws();
      }
   }

   @Override
   public void id_protected() {
      this.id_class.id_class(0);
   }
}
