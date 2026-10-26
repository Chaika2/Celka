package celestial;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.Supplier;

public class rYF {
   private Optional<Supplier<rrSR<?>>> id_class = Optional.empty();
   private final Map<rKu_1, List<Supplier<rDM<?>>>> id_break = Maps.newLinkedHashMap();
   private final List<List<Supplier<rDg_1<?, ?>>>> id_byte = Lists.newArrayList();
   private final List<Supplier<reP_2<?, ?>>> id_protected = Lists.newArrayList();

   public rYv_1 id_class() {
      return new rYv_1(
         this.id_class.orElseThrow(() -> new IllegalStateException("Missing surface builder")),
         this.id_break.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, var0 -> ImmutableList.copyOf((Collection)var0.getValue()))),
         this.id_byte.stream().map(ImmutableList::copyOf).collect(ImmutableList.toImmutableList()),
         ImmutableList.copyOf(this.id_protected)
      );
   }

   private void id_class(int var1) {
      while (this.id_byte.size() <= var1) {
         this.id_byte.add(Lists.newArrayList());
      }
   }

   public rYF id_class(rKm_1 var1, rDg_1<?, ?> var2) {
      return this.id_class(var1.ordinal(), () -> var2);
   }

   public rYF id_class(rrSR<?> var1) {
      return this.id_class(() -> var1);
   }

   public rYF id_class(Supplier<rrSR<?>> var1) {
      this.id_class = Optional.of(var1);
      return this;
   }

   public rYF id_class(reP_2<?, ?> var1) {
      this.id_protected.add(() -> var1);
      return this;
   }

   public <C extends rDX> rYF id_class(rKu_1 var1, rDM<C> var2) {
      this.id_break.computeIfAbsent(var1, var0 -> Lists.newArrayList()).add(() -> var2);
      return this;
   }

   public rYF id_class(int var1, Supplier<rDg_1<?, ?>> var2) {
      this.id_class(var1);
      this.id_byte.get(var1).add(var2);
      return this;
   }
}
