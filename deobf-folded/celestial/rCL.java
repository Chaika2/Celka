package celestial;

import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.Map;
import java.util.function.Function;

public class rCL<O, S extends rCn_1<O, S>> {
   private final O id_class;
   private final Map<String, rCZ<?>> id_break = Maps.newHashMap();

   public rCL(O var1) {
      this.id_class = (O)var1;
   }

   public rCF<O, S> id_class(Function<O, S> var1, rCA<O, S> var2) {
      return new rCF<>(var1, this.id_class, var2, this.id_break);
   }

   private <T extends Comparable<T>> void id_class(rCZ<T> var1) {
      String var2 = var1.id_throws();
      if (!rCF.id_class.matcher(var2).matches()) {
         throw new IllegalArgumentException(this.id_class + " has invalidly named property: " + var2);
      } else {
         Collection var3 = var1.id_class();
         if (var3.size() <= 1) {
            throw new IllegalArgumentException(this.id_class + " attempted use property " + var2 + " with <= 1 possible values");
         } else {
            for (Comparable var5 : var3) {
               String var6 = var1.id_class((T)var5);
               if (!rCF.id_class.matcher(var6).matches()) {
                  throw new IllegalArgumentException(this.id_class + " has property: " + var2 + " with invalidly named value: " + var6);
               }
            }

            if (this.id_break.containsKey(var2)) {
               throw new IllegalArgumentException(this.id_class + " has duplicate property: " + var2);
            }
         }
      }
   }

   public rCL<O, S> id_class(rCZ<?>... var1) {
      for (rCZ var5 : var1) {
         this.id_class(var5);
         this.id_break.put(var5.id_throws(), var5);
      }

      return this;
   }
}
