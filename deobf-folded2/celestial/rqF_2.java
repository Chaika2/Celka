package celestial;

import java.util.Iterator;
import java.util.NoSuchElementException;

class rqF_2 implements Iterator<T> {
   private int id_break;
   private int id_byte;

   rqF_2(rqv_3 var1) {
      this.id_class = var1;
      this.id_byte = -1;
   }

   @Override
   public void remove() {
      if (this.id_byte == -1) {
         throw new IllegalStateException();
      } else {
         this.id_class.id_protected(this.id_byte);
         this.id_break--;
         this.id_byte = -1;
      }
   }

   @Override
   public boolean hasNext() {
      return this.id_break < this.id_class.id_byte;
   }

   @Override
   public T next() {
      if (this.id_break >= this.id_class.id_byte) {
         throw new NoSuchElementException();
      } else {
         this.id_byte = this.id_break++;
         return this.id_class.id_break[this.id_byte];
      }
   }
}
