package celestial;

import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Predicate;

public class Qd_1 implements Predicate<xc_3> {
   public static final Predicate<xc_3> class_ = var0 -> true;
   private final rCF<xd_3, xc_3> break_;
   private final Map<rCZ<?>, Predicate<Object>> byte_ = Maps.newHashMap();

   private Qd_1(rCF<xd_3, xc_3> var1) {
      this.break_ = var1;
   }

   public <V extends Comparable<V>> Qd_1 class_(rCZ<V> var1, Predicate<Object> var2) {
      if (!this.break_.protected_().contains(var1)) {
         throw new IllegalArgumentException(this.break_ + " cannot support property " + var1);
      } else {
         this.byte_.put(var1, var2);
         return this;
      }
   }

   public boolean class_(xc_3 var1) {
      if (var1 != null && var1.break_().equals(this.break_.byte_())) {
         if (this.byte_.isEmpty()) {
            return true;
         } else {
            for (Entry var3 : this.byte_.entrySet()) {
               if (!this.class_(var1, (rCZ)var3.getKey(), (Predicate<Object>)var3.getValue())) {
                  return false;
               }
            }

            return true;
         }
      } else {
         return false;
      }
   }

   public static Qd_1 class_(xd_3 var0) {
      return new Qd_1(var0.new_());
   }

   protected <T extends Comparable<T>> boolean class_(xc_3 var1, rCZ<T> var2, Predicate<Object> var3) {
      Comparable var4 = var1.byte_(var2);
      return var3.test(var4);
   }
}
