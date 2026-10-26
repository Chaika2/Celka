package celestial;

import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;

public class rlr_3<T> implements Iterable<rCi_1<T>> {
   private final rVL<T> id_class;
   private final Map<T, rCi_1<T>> id_break = new IdentityHashMap<>();
   private rgP_2 id_byte;

   public rgP_2 id_byte() {
      if (this.id_byte == null) {
         this.id_byte = new rgn_3(this.id_break());
      }

      return this.id_byte;
   }

   public rlr_3(rVL<T> var1) {
      this.id_class = var1;
   }

   @Override
   public Iterator<rCi_1<T>> iterator() {
      return this.id_break.values().iterator();
   }

   public boolean id_class(T var1) {
      return this.id_break.containsKey(var1);
   }

   public rVL<T> id_class() {
      return this.id_class;
   }

   public rCi_1<T> id_class(T var1, rCe_1 var2) {
      return this.id_break.computeIfAbsent((T)var1, var2x -> new rCi_1<>(this, (T)var2x, var2));
   }

   public String id_break() {
      return "stat_type." + rVL.h.id_break(this).toString().replace(':', '.');
   }

   public rCi_1<T> id_break(T var1) {
      return this.id_class((T)var1, rCe_1.id_break);
   }
}
