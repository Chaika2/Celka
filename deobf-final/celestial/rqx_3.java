package celestial;

import java.util.Spliterators.AbstractSpliterator;
import java.util.function.Consumer;

class rqx_3 extends AbstractSpliterator<T> {
   private int break_;

   rqx_3(rqJ_2 var1, long var2, int var4) {
      super(var2, var4);
      this.class_ = var1;
   }

   @Override
   public boolean tryAdvance(Consumer<? super T> var1) {
      while (this.break_ >= this.class_.class_.size()) {
         if (!this.class_.break_.tryAdvance(this.class_.class_::add)) {
            return false;
         }
      }

      var1.accept(this.class_.class_.get(this.break_++));
      return true;
   }
}
