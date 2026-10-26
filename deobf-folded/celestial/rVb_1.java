package celestial;

import java.util.function.Predicate;

public class rVb_1<T> implements rVE<T> {
   private final rqE_2<T> id_class;
   private final T id_break;

   public rVb_1(rqE_2<T> var1, T var2) {
      this.id_class = var1;
      this.id_break = (T)var2;
   }

   @Override
   public void id_class(ruu_3 var1) {
   }

   @Override
   public int id_class() {
      return ruu_3.id_class(0);
   }

   @Override
   public void id_class(rcy_3 var1) {
   }

   @Override
   public int id_class(T var1) {
      int var2 = this.id_class.id_class((T)var1);
      return var2 == -1 ? 0 : var2;
   }

   @Override
   public boolean id_class(Predicate<T> var1) {
      return true;
   }

   @Override
   public T id_class(int var1) {
      Object var2 = this.id_class.id_class(var1);
      return (T)(var2 == null ? this.id_break : var2);
   }

   @Override
   public void id_break(ruu_3 var1) {
   }
}
