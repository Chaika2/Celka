package celestial;

import java.util.List;

public class rrWw_1 implements rrWI<Object> {
   private List<Object> class_;
   private int break_;
   private boolean byte_;

   @Override
   public boolean hasNext() {
      if (!this.byte_) {
         rrWt_1.class_(this);
         return false;
      } else {
         return this.byte_;
      }
   }

   @Override
   public Object next() {
      if (!this.byte_) {
         return null;
      } else {
         Object var1 = this.class_.get(this.break_);
         this.break_++;
         this.byte_ = this.break_ < this.class_.size();
         return var1;
      }
   }

   @Override
   public void class_(List<Object> var1) {
      if (this.byte_) {
         throw new RuntimeException("Iterator still used, oldList: " + this.class_ + ", newList: " + var1);
      } else {
         this.class_ = var1;
         this.break_ = 0;
         this.byte_ = var1 != null && this.break_ < var1.size();
      }
   }
}
