package celestial;

import it.unimi.dsi.fastutil.doubles.DoubleList;

public final class rjy_3 extends rjC_2 {
   protected rjy_3(rjp_3 var1) {
      super(var1);
   }

   @Override
   protected DoubleList class_(rpB_2 var1) {
      return new rjW_2(this.class_.byte_(var1));
   }

   @Override
   protected int class_(rpB_2 var1, double var2) {
      int var4 = this.class_.byte_(var1);
      return rfU_2.class_(rfU_2.byte_(var2 * (double)var4), -1, var4);
   }
}
