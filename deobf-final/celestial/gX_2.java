package celestial;

import com.google.common.collect.AbstractIterator;
import com.google.common.collect.Iterators;
import com.google.common.collect.PeekingIterator;
import java.util.Comparator;
import java.util.Iterator;

class gX_2<T> extends AbstractIterator<T> {
   private final PeekingIterator<T> class_;
   private final PeekingIterator<T> break_;
   private final Comparator<T> byte_;

   public gX_2(Iterator<T> var1, Iterator<T> var2, Comparator<T> var3) {
      this.class_ = Iterators.peekingIterator(var1);
      this.break_ = Iterators.peekingIterator(var2);
      this.byte_ = var3;
   }

   protected T computeNext() {
      boolean var1 = !this.class_.hasNext();
      boolean var2 = !this.break_.hasNext();
      if (var1 && var2) {
         return (T)this.endOfData();
      } else if (var1) {
         return (T)this.break_.next();
      } else if (var2) {
         return (T)this.class_.next();
      } else {
         int var3 = this.byte_.compare((T)this.class_.peek(), (T)this.break_.peek());
         if (var3 == 0) {
            this.break_.next();
         }

         return (T)(var3 <= 0 ? this.class_.next() : this.break_.next());
      }
   }
}
