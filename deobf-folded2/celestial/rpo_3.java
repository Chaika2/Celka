package celestial;

import java.util.function.Supplier;

public class rpo_3<T> {
   private Supplier<T> id_class;
   private T id_break;

   public rpo_3(Supplier<T> var1) {
      this.id_class = var1;
   }

   public T id_class() {
      Supplier var1 = this.id_class;
      if (var1 != null) {
         this.id_break = (T)var1.get();
         this.id_class = null;
      }

      return this.id_break;
   }
}
