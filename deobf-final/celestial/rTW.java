package celestial;

import java.util.Queue;

public final class rTW<T> implements rTx_1<T, T> {
   private final Queue<T> class_;

   public rTW(Queue<T> var1) {
      this.class_ = var1;
   }

   @Override
   public boolean class_(T var1) {
      return this.class_.add((T)var1);
   }

   @Override
   public T class_() {
      return this.class_.poll();
   }

   @Override
   public boolean break_() {
      return this.class_.isEmpty();
   }
}
