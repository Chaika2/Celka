package celestial;

import java.util.Iterator;

class rrbr_3 implements Iterable {
   rrbr_3(rfH_2 var1, rfH_2 var2) {
      this.class_ = var1;
      this.break_ = var2;
   }

   @Override
   public Iterator iterator() {
      return new rrbP_2(this);
   }
}
