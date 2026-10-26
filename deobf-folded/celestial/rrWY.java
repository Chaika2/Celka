package celestial;

import java.util.Iterator;

class rrWY implements Iterator<rrWo_1<T>> {
   rrWo_1<T> id_class;

   rrWY(rrWR var1) {
      this.id_break = var1;
      this.id_class = this.id_break.id_break();
   }

   @Override
   public boolean hasNext() {
      return this.id_class != null;
   }

   public rrWo_1<T> id_class() {
      rrWo_1 var1 = this.id_class;
      if (this.id_class != null) {
         this.id_class = this.id_class.id_byte;
      }

      return var1;
   }
}
