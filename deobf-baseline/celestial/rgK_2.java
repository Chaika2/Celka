package celestial;

import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.util.UUID;
import java.util.function.Predicate;
import java.util.stream.Stream;

class rgK_2 {
   final Object2IntMap<rgD_2> id_class = new Object2IntOpenHashMap();

   public void id_class(rgD_2 var1) {
      int var2 = this.id_class.getInt(var1);
      if (var2 > var1.max) {
         this.id_class.put(var1, var1.max);
      }

      if (var2 < 2) {
         this.id_break(var1);
      }
   }

   public Stream<rgo_3> id_class(UUID var1) {
      return this.id_class.object2IntEntrySet().stream().map(var1x -> new rgo_3(var1, (rgD_2)var1x.getKey(), var1x.getIntValue()));
   }

   public int id_class(Predicate<rgD_2> var1) {
      return this.id_class
         .object2IntEntrySet()
         .stream()
         .filter(var1x -> var1.test((rgD_2)var1x.getKey()))
         .mapToInt(var0 -> var0.getIntValue() * ((rgD_2)var0.getKey()).weight)
         .sum();
   }

   public void id_class() {
      ObjectIterator var1 = this.id_class.object2IntEntrySet().iterator();

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

   public void id_break(rgD_2 var1) {
      this.id_class.removeInt(var1);
   }

   public boolean id_break() {
      return this.id_class.isEmpty();
   }
}
