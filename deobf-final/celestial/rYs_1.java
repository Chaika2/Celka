package celestial;

import java.util.function.Function;

public class rYs_1<T> implements rRV<T> {
   private final Function<rfH_2, rRV<T>> class_;

   public rYs_1(Function<rfH_2, rRV<T>> var1) {
      this.class_ = var1;
   }

   @Override
   public void class_(rfH_2 var1, T var2, int var3, rYr_1 var4) {
      this.class_.apply(var1).class_(var1, (T)var2, var3, var4);
   }

   @Override
   public boolean class_(rfH_2 var1, T var2) {
      return this.class_.apply(var1).class_(var1, (T)var2);
   }

   @Override
   public boolean break_(rfH_2 var1, T var2) {
      return false;
   }
}
