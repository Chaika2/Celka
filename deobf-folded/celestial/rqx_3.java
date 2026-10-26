package celestial;

import java.util.Spliterators.AbstractSpliterator;
import java.util.function.Consumer;

class rqx_3 extends AbstractSpliterator<T> {
   private int id_break;

   rqx_3(rqJ_2 var1, long var2, int var4) {
      super(var2, var4);
      this.id_class = var1;
   }

   @Override
   public boolean tryAdvance(Consumer<? super T> var1) {
      while (this.id_break >= this.id_class.id_class.size()) {
         if (!this.id_class.id_break.tryAdvance(this.id_class.id_class::add)) {
            return false;
         }
      }

      var1.accept(this.id_class.id_class.get(this.id_break++));
      return true;
   }
}
