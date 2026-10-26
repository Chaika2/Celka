package celestial;

import java.util.EnumSet;

class rse_3 extends rBk_1 {
   final rsU_2 id_class;
   final double id_break;
   final double id_byte;

   rse_3(rsU_2 var1, rsU_2 var2, double var3, double var5) {
      this.id_protected = var1;
      this.id_class = var2;
      this.id_break = var3;
      this.id_byte = var5;
      this.id_class(EnumSet.of(rBW.MOVE));
   }

   private boolean id_class(rfH_2 var1, double var2) {
      return !var1.id_class(this.id_class.Ps(), var2);
   }

   @Override
   public boolean id_class() {
      rfH_2 var1 = this.id_class.sQ();
      return var1 != null && this.id_class(var1, this.id_break);
   }

   @Override
   public void id_throws() {
      rfH_2 var1 = this.id_class.sQ();
      if (var1 != null && rsU_2.id_break(this.id_protected).id_native()) {
         if (this.id_class(var1, 10.0)) {
            rjU_2 var2 = new rjU_2((double)var1.b_() - this.id_class.rx(), (double)var1.c_() - this.id_class.re(), (double)var1.d_() - this.id_class.BO())
               .id_protected();
            rjU_2 var3 = var2.id_class(10.0).id_break(this.id_class.rx(), this.id_class.re(), this.id_class.BO());
            rsU_2.id_byte(this.id_protected).id_class(var3.id_break, var3.id_byte, var3.id_protected, this.id_byte);
         } else {
            rsU_2.id_protected(this.id_protected).id_class((double)var1.b_(), (double)var1.c_(), (double)var1.d_(), this.id_byte);
         }
      }
   }

   @Override
   public void id_protected() {
      this.id_class.id_implements((rfH_2)null);
      rsU_2.id_class(this.id_protected).id_final();
   }
}
