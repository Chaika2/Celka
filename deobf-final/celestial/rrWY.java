package celestial;

import java.util.Iterator;

class rrWY implements Iterator<rrWo_1<T>> {
   rrWo_1<T> class_;

   rrWY(rrWR var1) {
      this.break_ = var1;
      this.class_ = this.break_.break_();
   }

   @Override
   public boolean hasNext() {
      return this.class_ != null;
   }

   public rrWo_1<T> class_() {
      rrWo_1 var1 = this.class_;
      if (this.class_ != null) {
         this.class_ = this.class_.byte_;
      }

      return var1;
   }
}
