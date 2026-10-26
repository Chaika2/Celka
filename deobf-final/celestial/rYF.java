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
   private Optional<Supplier<rrSR<?>>> class_ = Optional.empty();
   private final Map<rKu_1, List<Supplier<rDM<?>>>> break_ = Maps.newLinkedHashMap();
   private final List<List<Supplier<rDg_1<?, ?>>>> byte_ = Lists.newArrayList();
   private final List<Supplier<reP_2<?, ?>>> protected_ = Lists.newArrayList();

   public rYv_1 class_() {
      return new rYv_1(
         this.class_.orElseThrow(() -> new IllegalStateException("Missing surface builder")),
         this.break_.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, var0 -> ImmutableList.copyOf((Collection)var0.getValue()))),
         this.byte_.stream().map(ImmutableList::copyOf).collect(ImmutableList.toImmutableList()),
         ImmutableList.copyOf(this.protected_)
      );
   }

   private void class_(int var1) {
      while (this.byte_.size() <= var1) {
         this.byte_.add(Lists.newArrayList());
      }
   }

   public rYF class_(rKm_1 var1, rDg_1<?, ?> var2) {
      return this.class_(var1.ordinal(), () -> var2);
   }

   public rYF class_(rrSR<?> var1) {
      return this.class_(() -> var1);
   }

   public rYF class_(Supplier<rrSR<?>> var1) {
      this.class_ = Optional.of(var1);
      return this;
   }

   public rYF class_(reP_2<?, ?> var1) {
      this.protected_.add(() -> var1);
      return this;
   }

   public <C extends rDX> rYF class_(rKu_1 var1, rDM<C> var2) {
      this.break_.computeIfAbsent(var1, var0 -> Lists.newArrayList()).add(() -> var2);
      return this;
   }

   public rYF class_(int var1, Supplier<rDg_1<?, ?>> var2) {
      this.class_(var1);
      this.byte_.get(var1).add(var2);
      return this;
   }
}
