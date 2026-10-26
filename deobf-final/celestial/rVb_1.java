package celestial;

import java.util.function.Predicate;

public class rVb_1<T> implements rVE<T> {
   private final rqE_2<T> class_;
   private final T break_;

   public rVb_1(rqE_2<T> var1, T var2) {
      this.class_ = var1;
      this.break_ = (T)var2;
   }

   @Override
   public void class_(ruu_3 var1) {
   }

   @Override
   public int class_() {
      return ruu_3.class_(0);
   }

   @Override
   public void class_(rcy_3 var1) {
   }

   @Override
   public int class_(T var1) {
      int var2 = this.class_.class_((T)var1);
      return var2 == -1 ? 0 : var2;
   }

   @Override
   public boolean class_(Predicate<T> var1) {
      return true;
   }

   @Override
   public T class_(int var1) {
      Object var2 = this.class_.class_(var1);
      return (T)(var2 == null ? this.break_ : var2);
   }

   @Override
   public void break_(ruu_3 var1) {
   }
}
