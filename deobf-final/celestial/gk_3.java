package celestial;

import com.google.common.collect.AbstractIterator;
import com.google.common.collect.Iterators;
import com.google.common.collect.PeekingIterator;
import java.util.Comparator;
import java.util.Iterator;

public class gk_3<T> extends AbstractIterator<T> {
   private final PeekingIterator<T> class_;
   private final PeekingIterator<T> break_;
   private final Comparator<T> byte_;

   public gk_3(Iterator<T> var1, Iterator<T> var2, Comparator<T> var3) {
      this.class_ = Iterators.peekingIterator(var1);
      this.break_ = Iterators.peekingIterator(var2);
      this.byte_ = var3;
   }

   protected T computeNext() {
      while (this.class_.hasNext() && this.break_.hasNext()) {
         int var1 = this.byte_.compare((T)this.class_.peek(), (T)this.break_.peek());
         if (var1 == 0) {
            this.break_.next();
            return (T)this.class_.next();
         }

         if (var1 < 0) {
            this.class_.next();
         } else {
            this.break_.next();
         }
      }

      return (T)this.endOfData();
   }
}
