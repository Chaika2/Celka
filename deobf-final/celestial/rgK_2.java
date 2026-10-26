package celestial;

import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.util.UUID;
import java.util.function.Predicate;
import java.util.stream.Stream;

class rgK_2 {
   final Object2IntMap<rgD_2> class_ = new Object2IntOpenHashMap();

   public void class_(rgD_2 var1) {
      int var2 = this.class_.getInt(var1);
      if (var2 > var1.max) {
         this.class_.put(var1, var1.max);
      }

      if (var2 < 2) {
         this.break_(var1);
      }
   }

   public Stream<rgo_3> class_(UUID var1) {
      return this.class_.object2IntEntrySet().stream().map(var1x -> new rgo_3(var1, (rgD_2)var1x.getKey(), var1x.getIntValue()));
   }

   public int class_(Predicate<rgD_2> var1) {
      return this.class_
         .object2IntEntrySet()
         .stream()
         .filter(var1x -> var1.test((rgD_2)var1x.getKey()))
         .mapToInt(var0 -> var0.getIntValue() * ((rgD_2)var0.getKey()).weight)
         .sum();
   }

   public void class_() {
      ObjectIterator var1 = this.class_.object2IntEntrySet().iterator();

      while (var1.hasNext()) {
         Entry var2 = (Entry)var1.next();
         int var3 = var2.getIntValue() - ((rgD_2)var2.getKey()).decayPerDay;
         if (var3 < 2) {
            var1.remove();
         } else {
            var2.setValue(var3);
         }
      }
   }

   public void break_(rgD_2 var1) {
      this.class_.removeInt(var1);
   }

   public boolean break_() {
      return this.class_.isEmpty();
   }
}
