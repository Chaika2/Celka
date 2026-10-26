package celestial;

import com.google.common.base.Predicates;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;

public class rqE_2<T> implements rpn_3<T> {
   private int id_class;
   private final IdentityHashMap<T, Integer> id_break;
   private final List<T> id_byte;

   public rqE_2() {
      this(512);
   }

   public rqE_2(int var1) {
      this.id_byte = Lists.newArrayListWithExpectedSize(var1);
      this.id_break = new IdentityHashMap<>(var1);
   }

   @Override
   public Iterator<T> iterator() {
      return Iterators.filter(this.id_byte.iterator(), Predicates.notNull());
   }

   @Override
   public final T id_class(int var1) {
      return var1 >= 0 && var1 < this.id_byte.size() ? this.id_byte.get(var1) : null;
   }

   public int id_class() {
      return this.id_break.size();
   }

   @Override
   public int id_class(T var1) {
      Integer var2 = this.id_break.get(var1);
      return var2 == null ? -1 : var2;
   }

   public void id_class(T var1, int var2) {
      this.id_break.put((T)var1, var2);

      while (this.id_byte.size() <= var2) {
         this.id_byte.add(null);
      }

      this.id_byte.set(var2, (T)var1);
      if (this.id_class <= var2) {
         this.id_class = var2 + 1;
      }
   }

   public void id_break(T var1) {
      this.id_class((T)var1, this.id_class);
   }
}
