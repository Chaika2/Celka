package celestial;

import it.unimi.dsi.fastutil.doubles.DoubleList;

public final class rjy_3 extends rjC_2 {
   protected rjy_3(rjp_3 var1) {
      super(var1);
   }

   @Override
   protected DoubleList id_class(rpB_2 var1) {
      return new rjW_2(this.id_class.id_byte(var1));
   }

   @Override
   protected int id_class(rpB_2 var1, double var2) {
      int var4 = this.id_class.id_byte(var1);
      return rfU_2.id_class(rfU_2.id_byte(var2 * (double)var4), -1, var4);
   }
}
