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
   private final Map<Class<?>, List<T>> id_class = Maps.newHashMap();
   private final Class<T> id_break;
   private final List<T> id_byte = Lists.newArrayList();

   public ryI_2(Class<T> var1) {
      this.id_break = var1;
      this.id_class.put(var1, this.id_byte);
   }

   @Override
   public boolean remove(Object var1) {
      boolean var2 = false;

      for (Entry var4 : this.id_class.entrySet()) {
         if (((Class)var4.getKey()).isInstance(var1)) {
            List var5 = (List)var4.getValue();
            var2 |= var5.remove(var1);
         }
      }

      return var2;
   }

   @Override
   public int size() {
      return this.id_byte.size();
   }

   @Override
   public boolean add(T var1) {
      boolean var2 = false;

      for (Entry var4 : this.id_class.entrySet()) {
         if (((Class)var4.getKey()).isInstance(var1)) {
            var2 |= ((List)var4.getValue()).add(var1);
         }
      }

      return var2;
   }

   @Override
   public Iterator<T> iterator() {
      return (Iterator<T>)(this.id_byte.isEmpty() ? Collections.emptyIterator() : Iterators.unmodifiableIterator(this.id_byte.iterator()));
   }

   @Override
   public boolean contains(Object var1) {
      return this.id_class(var1.getClass()).contains(var1);
   }

   public List<T> id_class() {
      return ImmutableList.copyOf(this.id_byte);
   }

   public <S> Collection<S> id_class(Class<S> var1) {
      if (!this.id_break.isAssignableFrom(var1)) {
         throw new IllegalArgumentException("Don't know how to search for " + var1);
      } else {
         List var2 = this.id_class.computeIfAbsent(var1, var1x -> this.id_byte.stream().filter(var1x::isInstance).collect(Collectors.toList()));
         return Collections.unmodifiableCollection(var2);
      }
   }
}
