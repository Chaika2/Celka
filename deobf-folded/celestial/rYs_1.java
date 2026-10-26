package celestial;

import java.util.function.Function;

public class rYs_1<T> implements rRV<T> {
   private final Function<rfH_2, rRV<T>> id_class;

   public rYs_1(Function<rfH_2, rRV<T>> var1) {
      this.id_class = var1;
   }

   @Override
   public void id_class(rfH_2 var1, T var2, int var3, rYr_1 var4) {
      this.id_class.apply(var1).id_class(var1, (T)var2, var3, var4);
   }

   @Override
   public boolean id_class(rfH_2 var1, T var2) {
      return this.id_class.apply(var1).id_class(var1, (T)var2);
   }

   @Override
   public boolean id_break(rfH_2 var1, T var2) {
      return false;
   }
}
