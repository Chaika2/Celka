package celestial;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class ryI_2<T> extends AbstractCollection<T> {
   private final Map<Class<?>, List<T>> class_ = Maps.newHashMap();
   private final Class<T> break_;
   private final List<T> byte_ = Lists.newArrayList();

   public ryI_2(Class<T> var1) {
      this.break_ = var1;
      this.class_.put(var1, this.byte_);
   }

   @Override
   public boolean remove(Object var1) {
      boolean var2 = false;

      for (Entry var4 : this.class_.entrySet()) {
         if (((Class)var4.getKey()).isInstance(var1)) {
            List var5 = (List)var4.getValue();
            var2 |= var5.remove(var1);
         }
      }

      return var2;
   }

   @Override
   public int size() {
      return this.byte_.size();
   }

   @Override
   public boolean add(T var1) {
      boolean var2 = false;

      for (Entry var4 : this.class_.entrySet()) {
         if (((Class)var4.getKey()).isInstance(var1)) {
            var2 |= ((List)var4.getValue()).add(var1);
         }
      }

      return var2;
   }

   @Override
   public Iterator<T> iterator() {
      return (Iterator<T>)(this.byte_.isEmpty() ? Collections.emptyIterator() : Iterators.unmodifiableIterator(this.byte_.iterator()));
   }

   @Override
   public boolean contains(Object var1) {
      return this.class_(var1.getClass()).contains(var1);
   }

   public List<T> class_() {
      return ImmutableList.copyOf(this.byte_);
   }

   public <S> Collection<S> class_(Class<S> var1) {
      if (!this.break_.isAssignableFrom(var1)) {
         throw new IllegalArgumentException("Don't know how to search for " + var1);
      } else {
         List var2 = this.class_.computeIfAbsent(var1, var1x -> this.byte_.stream().filter(var1x::isInstance).collect(Collectors.toList()));
         return Collections.unmodifiableCollection(var2);
      }
   }
}
