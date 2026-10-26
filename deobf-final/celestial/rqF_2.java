package celestial;

import java.util.Iterator;
import java.util.NoSuchElementException;

class rqF_2 implements Iterator<T> {
   private int break_;
   private int byte_;

   rqF_2(rqv_3 var1) {
      this.class_ = var1;
      this.byte_ = -1;
   }

   @Override
   public void remove() {
      if (this.byte_ == -1) {
         throw new IllegalStateException();
      } else {
         this.class_.protected_(this.byte_);
         this.break_--;
         this.byte_ = -1;
      }
   }

   @Override
   public boolean hasNext() {
      return this.break_ < this.class_.byte_;
   }

   @Override
   public T next() {
      if (this.break_ >= this.class_.byte_) {
         throw new NoSuchElementException();
      } else {
         this.byte_ = this.break_++;
         return this.class_.break_[this.byte_];
      }
   }
}
