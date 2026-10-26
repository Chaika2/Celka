package celestial;

import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.Map;
import java.util.function.Function;

public class rCL<O, S extends rCn_1<O, S>> {
   private final O class_;
   private final Map<String, rCZ<?>> break_ = Maps.newHashMap();

   public rCL(O var1) {
      this.class_ = (O)var1;
   }

   public rCF<O, S> class_(Function<O, S> var1, rCA<O, S> var2) {
      return new rCF<>(var1, this.class_, var2, this.break_);
   }

   private <T extends Comparable<T>> void class_(rCZ<T> var1) {
      String var2 = var1.throws_();
      if (!rCF.class_.matcher(var2).matches()) {
         throw new IllegalArgumentException(this.class_ + " has invalidly named property: " + var2);
      } else {
         Collection var3 = var1.class_();
         if (var3.size() <= 1) {
            throw new IllegalArgumentException(this.class_ + " attempted use property " + var2 + " with <= 1 possible values");
         } else {
            for (Comparable var5 : var3) {
               String var6 = var1.class_((T)var5);
               if (!rCF.class_.matcher(var6).matches()) {
                  throw new IllegalArgumentException(this.class_ + " has property: " + var2 + " with invalidly named value: " + var6);
               }
            }

            if (this.break_.containsKey(var2)) {
               throw new IllegalArgumentException(this.class_ + " has duplicate property: " + var2);
            }
         }
      }
   }

   public rCL<O, S> class_(rCZ<?>... var1) {
      for (rCZ var5 : var1) {
         this.class_(var5);
         this.break_.put(var5.throws_(), var5);
      }

      return this;
   }
}
