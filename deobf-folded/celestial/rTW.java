package celestial;

import java.util.Queue;

public final class rTW<T> implements rTx_1<T, T> {
   private final Queue<T> id_class;

   public rTW(Queue<T> var1) {
      this.id_class = var1;
   }

   @Override
   public boolean id_class(T var1) {
      return this.id_class.add((T)var1);
   }

   @Override
   public T id_class() {
      return this.id_class.poll();
   }

   @Override
   public boolean id_break() {
      return this.id_class.isEmpty();
   }
}
