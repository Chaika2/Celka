package celestial;

import com.google.common.base.Predicates;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;

public class rqE_2<T> implements rpn_3<T> {
   private int class_;
   private final IdentityHashMap<T, Integer> break_;
   private final List<T> byte_;

   public rqE_2() {
      this(512);
   }

   public rqE_2(int var1) {
      this.byte_ = Lists.newArrayListWithExpectedSize(var1);
      this.break_ = new IdentityHashMap<>(var1);
   }

   @Override
   public Iterator<T> iterator() {
      return Iterators.filter(this.byte_.iterator(), Predicates.notNull());
   }

   @Override
   public final T class_(int var1) {
      return var1 >= 0 && var1 < this.byte_.size() ? this.byte_.get(var1) : null;
   }

   public int class_() {
      return this.break_.size();
   }

   @Override
   public int class_(T var1) {
      Integer var2 = this.break_.get(var1);
      return var2 == null ? -1 : var2;
   }

   public void class_(T var1, int var2) {
      this.break_.put((T)var1, var2);

      while (this.byte_.size() <= var2) {
         this.byte_.add(null);
      }

      this.byte_.set(var2, (T)var1);
      if (this.class_ <= var2) {
         this.class_ = var2 + 1;
      }
   }

   public void break_(T var1) {
      this.class_((T)var1, this.class_);
   }
}
