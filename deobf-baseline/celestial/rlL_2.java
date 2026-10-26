package celestial;

import java.util.List;
import java.util.function.Function;

class rlL_2<T> implements rlO_2<T> {
   private rlb_3<T> id_break;
   protected final rqO_2 id_class;

   private rlb_3<T> id_byte() {
      if (this.id_break == null) {
         throw new IllegalStateException("Tag " + this.id_class + " used before it was bound");
      } else {
         return this.id_break;
      }
   }

   rlL_2(rqO_2 var1) {
      this.id_class = var1;
   }

   @Override
   public List<T> id_class() {
      return this.id_byte().id_class();
   }

   @Override
   public boolean id_class(T var1) {
      return this.id_byte().id_class((T)var1);
   }

   void id_class(Function<rqO_2, rlb_3<T>> var1) {
      this.id_break = (rlb_3<T>)var1.apply(this.id_class);
   }

   @Override
   public rqO_2 id_break() {
      return this.id_class;
   }
}
