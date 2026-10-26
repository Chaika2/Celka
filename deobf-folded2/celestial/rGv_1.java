package celestial;

import java.util.EnumSet;
import java.util.Random;

class rGv_1 extends rBU {
   private rpr_3 id_private;
   private boolean id_implements;

   @Override
   public void id_byte() {
      if (!this.id_implements) {
         super.id_byte();
      } else {
         rYB var1 = (rYB)this.id_class.id_throws[7];
         rfH_2 var2 = new rfH_2(this.id_class.rx(), this.id_class.re() + 0.5, this.id_class.BO()).id_break(this.id_private);
         xc_3 var3 = var1.id_byte(var2);
         if (WT.id_private(var3)) {
            var1.id_class(var2, WT.id_class(var3.id_break()), 3);
            this.id_class.id_float();
            this.id_class.PD();
         }
      }
   }

   public rGv_1(rGZ var1) {
      super(var1, 1.0, 10);
      this.id_class(EnumSet.of(rBW.MOVE));
   }

   @Override
   public boolean id_class() {
      if (this.id_class.I_() != null) {
         return false;
      } else if (!this.id_class.id_public().id_native()) {
         return false;
      } else {
         Random var1 = this.id_class.Sa();
         if (((rYB)this.id_class.id_throws[7]).B().id_break(rRu_1.id_break) && var1.nextInt(10) == 0) {
            this.id_private = rpr_3.id_class(var1);
            rfH_2 var2 = new rfH_2(this.id_class.rx(), this.id_class.re() + 0.5, this.id_class.BO()).id_break(this.id_private);
            xc_3 var3 = ((rYB)this.id_class.id_throws[7]).id_byte(var2);
            if (WT.id_private(var3)) {
               this.id_implements = true;
               return true;
            }
         }

         this.id_implements = false;
         return super.id_class();
      }
   }

   @Override
   public boolean id_break() {
      return this.id_implements ? false : super.id_break();
   }
}
