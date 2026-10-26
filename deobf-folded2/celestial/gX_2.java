package celestial;

import com.google.common.collect.AbstractIterator;
import com.google.common.collect.Iterators;
import com.google.common.collect.PeekingIterator;
import java.util.Comparator;
import java.util.Iterator;

class gX_2<T> extends AbstractIterator<T> {
   private final PeekingIterator<T> id_class;
   private final PeekingIterator<T> id_break;
   private final Comparator<T> id_byte;

   public gX_2(Iterator<T> var1, Iterator<T> var2, Comparator<T> var3) {
      this.id_class = Iterators.peekingIterator(var1);
      this.id_break = Iterators.peekingIterator(var2);
      this.id_byte = var3;
   }

   protected T computeNext() {
      boolean var1 = !this.id_class.hasNext();
      boolean var2 = !this.id_break.hasNext();
      if (var1 && var2) {
         return (T)this.endOfData();
      } else if (var1) {
         return (T)this.id_break.next();
      } else if (var2) {
         return (T)this.id_class.next();
      } else {
         int var3 = this.id_byte.compare((T)this.id_class.peek(), (T)this.id_break.peek());
         if (var3 == 0) {
            this.id_break.next();
         }

         return (T)(var3 <= 0 ? this.id_class.next() : this.id_break.next());
      }
   }
}
