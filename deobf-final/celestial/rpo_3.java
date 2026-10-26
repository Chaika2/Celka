package celestial;

import java.util.function.Supplier;

public class rpo_3<T> {
   private Supplier<T> class_;
   private T break_;

   public rpo_3(Supplier<T> var1) {
      this.class_ = var1;
   }

   public T class_() {
      Supplier var1 = this.class_;
      if (var1 != null) {
         this.break_ = (T)var1.get();
         this.class_ = null;
      }

      return this.break_;
   }
}
