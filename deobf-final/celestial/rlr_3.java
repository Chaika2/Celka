package celestial;

import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;

public class rlr_3<T> implements Iterable<rCi_1<T>> {
   private final rVL<T> class_;
   private final Map<T, rCi_1<T>> break_ = new IdentityHashMap<>();
   private rgP_2 byte_;

   public rgP_2 byte_() {
      if (this.byte_ == null) {
         this.byte_ = new rgn_3(this.break_());
      }

      return this.byte_;
   }

   public rlr_3(rVL<T> var1) {
      this.class_ = var1;
   }

   @Override
   public Iterator<rCi_1<T>> iterator() {
      return this.break_.values().iterator();
   }

   public boolean class_(T var1) {
      return this.break_.containsKey(var1);
   }

   public rVL<T> class_() {
      return this.class_;
   }

   public rCi_1<T> class_(T var1, rCe_1 var2) {
      return this.break_.computeIfAbsent((T)var1, var2x -> new rCi_1<>(this, (T)var2x, var2));
   }

   public String break_() {
      return "stat_type." + rVL.h.break_(this).toString().replace(':', '.');
   }

   public rCi_1<T> break_(T var1) {
      return this.class_((T)var1, rCe_1.break_);
   }
}
