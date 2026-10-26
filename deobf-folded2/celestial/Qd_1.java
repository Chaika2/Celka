package celestial;

import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Predicate;

public class Qd_1 implements Predicate<xc_3> {
   public static final Predicate<xc_3> id_class = var0 -> true;
   private final rCF<xd_3, xc_3> id_break;
   private final Map<rCZ<?>, Predicate<Object>> id_byte = Maps.newHashMap();

   private Qd_1(rCF<xd_3, xc_3> var1) {
      this.id_break = var1;
   }

   public <V extends Comparable<V>> Qd_1 id_class(rCZ<V> var1, Predicate<Object> var2) {
      if (!this.id_break.id_protected().contains(var1)) {
         throw new IllegalArgumentException(this.id_break + " cannot support property " + var1);
      } else {
         this.id_byte.put(var1, var2);
         return this;
      }
   }

   public boolean id_class(xc_3 var1) {
      if (var1 != null && var1.id_break().equals(this.id_break.id_byte())) {
         if (this.id_byte.isEmpty()) {
            return true;
         } else {
            for (Entry var3 : this.id_byte.entrySet()) {
               if (!this.id_class(var1, (rCZ)var3.getKey(), (Predicate<Object>)var3.getValue())) {
                  return false;
               }
            }

            return true;
         }
      } else {
         return false;
      }
   }

   public static Qd_1 id_class(xd_3 var0) {
      return new Qd_1(var0.id_new());
   }

   protected <T extends Comparable<T>> boolean id_class(xc_3 var1, rCZ<T> var2, Predicate<Object> var3) {
      Comparable var4 = var1.id_byte(var2);
      return var3.test(var4);
   }
}
