package celestial;

import java.util.Iterator;

class rrbr_3 implements Iterable {
   rrbr_3(rfH_2 var1, rfH_2 var2) {
      this.id_class = var1;
      this.id_break = var2;
   }

   @Override
   public Iterator iterator() {
      return new rrbP_2(this);
   }
}
