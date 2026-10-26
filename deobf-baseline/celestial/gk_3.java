package celestial;

import com.google.common.collect.AbstractIterator;
import com.google.common.collect.Iterators;
import com.google.common.collect.PeekingIterator;
import java.util.Comparator;
import java.util.Iterator;

public class gk_3<T> extends AbstractIterator<T> {
   private final PeekingIterator<T> id_class;
   private final PeekingIterator<T> id_break;
   private final Comparator<T> id_byte;

   public gk_3(Iterator<T> var1, Iterator<T> var2, Comparator<T> var3) {
      this.id_class = Iterators.peekingIterator(var1);
      this.id_break = Iterators.peekingIterator(var2);
      this.id_byte = var3;
   }

   protected T computeNext() {
      while (this.id_class.hasNext() && this.id_break.hasNext()) {
         int var1 = this.id_byte.compare((T)this.id_class.peek(), (T)this.id_break.peek());
         if (var1 == 0) {
            this.id_break.next();
            return (T)this.id_class.next();
         }

         if (var1 < 0) {
            this.id_class.next();
         } else {
            this.id_break.next();
         }
      }

      return (T)this.endOfData();
   }
}
